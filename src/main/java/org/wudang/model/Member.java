package org.wudang.model;

public class Member {
    private Integer uid;

    private String email;

    private String username;

    private String password;

    private Boolean status;

    private Boolean emailstatus;

    private Boolean avatarstatus;

    private Boolean adminid;

    private Short groupid;

    private Integer groupexpiry;

    private String extgroupids;

    private Integer regdate;

    private Integer credits;

    private Short newpm;

    private Short newprompt;

    private Boolean onlyacceptfriendpm;

    private Integer college;

    private Integer major;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getEmailstatus() {
        return emailstatus;
    }

    public void setEmailstatus(Boolean emailstatus) {
        this.emailstatus = emailstatus;
    }

    public Boolean getAvatarstatus() {
        return avatarstatus;
    }

    public void setAvatarstatus(Boolean avatarstatus) {
        this.avatarstatus = avatarstatus;
    }

    public Boolean getAdminid() {
        return adminid;
    }

    public void setAdminid(Boolean adminid) {
        this.adminid = adminid;
    }

    public Short getGroupid() {
        return groupid;
    }

    public void setGroupid(Short groupid) {
        this.groupid = groupid;
    }

    public Integer getGroupexpiry() {
        return groupexpiry;
    }

    public void setGroupexpiry(Integer groupexpiry) {
        this.groupexpiry = groupexpiry;
    }

    public String getExtgroupids() {
        return extgroupids;
    }

    public void setExtgroupids(String extgroupids) {
        this.extgroupids = extgroupids == null ? null : extgroupids.trim();
    }

    public Integer getRegdate() {
        return regdate;
    }

    public void setRegdate(Integer regdate) {
        this.regdate = regdate;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Short getNewpm() {
        return newpm;
    }

    public void setNewpm(Short newpm) {
        this.newpm = newpm;
    }

    public Short getNewprompt() {
        return newprompt;
    }

    public void setNewprompt(Short newprompt) {
        this.newprompt = newprompt;
    }

    public Boolean getOnlyacceptfriendpm() {
        return onlyacceptfriendpm;
    }

    public void setOnlyacceptfriendpm(Boolean onlyacceptfriendpm) {
        this.onlyacceptfriendpm = onlyacceptfriendpm;
    }

    public Integer getCollege() {
        return college;
    }

    public void setCollege(Integer college) {
        this.college = college;
    }

    public Integer getMajor() {
        return major;
    }

    public void setMajor(Integer major) {
        this.major = major;
    }
}