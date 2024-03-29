package com.example.demoo.domain;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity(name = "DefUser")
public class DefUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false)

    private Long user_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id", referencedColumnName = "client_id")
    private DefClient client;

    @Column(nullable = false, unique = true)
    private String username;

    private String email;

    @Column(nullable = false, unique = true)
    private String password;

    @Column(nullable = false)
    private boolean isActive;

    @Column
    private boolean isNotLocked;

    @Column
    private Date lastLoginDate;

    @Column
    private Date lastLoginDateDisplay;

    @Column
    private Date joinDate;

    @Column
    private String role;

    @Column
    private String[] authorities;

    public DefUser(Long user_id, DefClient client_id, String username, String email, String password,
                   boolean isActive, boolean isNotLocked, Date lastLoginDate, Date lastLoginDateDisplay,
                   Date joinDate, String role, String[] authorities) {
        this.user_id = user_id;
        this.client = client_id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.isActive = isActive;
        this.isNotLocked = isNotLocked;
        this.lastLoginDate = lastLoginDate;
        this.lastLoginDateDisplay = lastLoginDateDisplay;
        this.joinDate = joinDate;
        this.role = role;
        this.authorities = authorities;
    }

    public DefUser() {

    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isNotLocked() {
        return isNotLocked;
    }

    public void setNotLocked(boolean notLocked) {
        isNotLocked = notLocked;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getLastLoginDateDisplay() {
        return lastLoginDateDisplay;
    }

    public void setLastLoginDateDisplay(Date lastLoginDateDisplay) {
        this.lastLoginDateDisplay = lastLoginDateDisplay;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String[] getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String[] authorities) {
        this.authorities = authorities;
    }

    public DefClient getDefClient() {
        return client;
    }

    public void setDefClient(DefClient client) {
        this.client = client;
    }
}