package com.easy.ai.model;

import java.util.Date;

public class ProjectVersionInfo {
    private Integer id;

    private Integer projectId;

    private Integer bugNum;

    private Integer notSlove;

    private Integer highst;

    private Integer high;

    private Integer medium;

    private Integer lower;

    private Integer optimize;

    private Integer caseNum;

    private Integer executedNum;

    private String version;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getBugNum() {
        return bugNum;
    }

    public void setBugNum(Integer bugNum) {
        this.bugNum = bugNum;
    }

    public Integer getNotSlove() {
        return notSlove;
    }

    public void setNotSlove(Integer notSlove) {
        this.notSlove = notSlove;
    }

    public Integer getHighst() {
        return highst;
    }

    public void setHighst(Integer highst) {
        this.highst = highst;
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public Integer getMedium() {
        return medium;
    }

    public void setMedium(Integer medium) {
        this.medium = medium;
    }

    public Integer getLower() {
        return lower;
    }

    public void setLower(Integer lower) {
        this.lower = lower;
    }

    public Integer getOptimize() {
        return optimize;
    }

    public void setOptimize(Integer optimize) {
        this.optimize = optimize;
    }

    public Integer getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(Integer caseNum) {
        this.caseNum = caseNum;
    }

    public Integer getExecutedNum() {
        return executedNum;
    }

    public void setExecutedNum(Integer executedNum) {
        this.executedNum = executedNum;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}