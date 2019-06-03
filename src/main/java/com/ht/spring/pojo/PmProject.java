package com.ht.spring.pojo;

import java.util.Date;

public class PmProject {
    private Integer id;

    private String number;

    private String name;

    private Integer type;

    private Integer constructionid;

    private Integer designid;

    private Integer supervisorid;

    private Integer powersupplycontractid;

    private Date numberdate;

    private String source;

    private Double pactmoney;

    private Double settleaccounts;

    private Double receipt;

    private Double geld;

    private String details;

    private String site;

    private Date startdate;

    private Date completiondate;

    private Integer clientprincipal;

    private Integer bidderid;

    private Integer managerid;

    private Integer supervisorsupervisionid;

    private Integer asidesupervisionid;

    private Integer roadworkdeptid;

    private Double substationcapacity;

    private Double linellength;

    private Double area;

    private Double quality;

    private String progressofworks;

    private String progressofworksstate;

    private String remark;

    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getConstructionid() {
        return constructionid;
    }

    public void setConstructionid(Integer constructionid) {
        this.constructionid = constructionid;
    }

    public Integer getDesignid() {
        return designid;
    }

    public void setDesignid(Integer designid) {
        this.designid = designid;
    }

    public Integer getSupervisorid() {
        return supervisorid;
    }

    public void setSupervisorid(Integer supervisorid) {
        this.supervisorid = supervisorid;
    }

    public Integer getPowersupplycontractid() {
        return powersupplycontractid;
    }

    public void setPowersupplycontractid(Integer powersupplycontractid) {
        this.powersupplycontractid = powersupplycontractid;
    }

    public Date getNumberdate() {
        return numberdate;
    }

    public void setNumberdate(Date numberdate) {
        this.numberdate = numberdate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Double getPactmoney() {
        return pactmoney;
    }

    public void setPactmoney(Double pactmoney) {
        this.pactmoney = pactmoney;
    }

    public Double getSettleaccounts() {
        return settleaccounts;
    }

    public void setSettleaccounts(Double settleaccounts) {
        this.settleaccounts = settleaccounts;
    }

    public Double getReceipt() {
        return receipt;
    }

    public void setReceipt(Double receipt) {
        this.receipt = receipt;
    }

    public Double getGeld() {
        return geld;
    }

    public void setGeld(Double geld) {
        this.geld = geld;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getCompletiondate() {
        return completiondate;
    }

    public void setCompletiondate(Date completiondate) {
        this.completiondate = completiondate;
    }

    public Integer getClientprincipal() {
        return clientprincipal;
    }

    public void setClientprincipal(Integer clientprincipal) {
        this.clientprincipal = clientprincipal;
    }

    public Integer getBidderid() {
        return bidderid;
    }

    public void setBidderid(Integer bidderid) {
        this.bidderid = bidderid;
    }

    public Integer getManagerid() {
        return managerid;
    }

    public void setManagerid(Integer managerid) {
        this.managerid = managerid;
    }

    public Integer getSupervisorsupervisionid() {
        return supervisorsupervisionid;
    }

    public void setSupervisorsupervisionid(Integer supervisorsupervisionid) {
        this.supervisorsupervisionid = supervisorsupervisionid;
    }

    public Integer getAsidesupervisionid() {
        return asidesupervisionid;
    }

    public void setAsidesupervisionid(Integer asidesupervisionid) {
        this.asidesupervisionid = asidesupervisionid;
    }

    public Integer getRoadworkdeptid() {
        return roadworkdeptid;
    }

    public void setRoadworkdeptid(Integer roadworkdeptid) {
        this.roadworkdeptid = roadworkdeptid;
    }

    public Double getSubstationcapacity() {
        return substationcapacity;
    }

    public void setSubstationcapacity(Double substationcapacity) {
        this.substationcapacity = substationcapacity;
    }

    public Double getLinellength() {
        return linellength;
    }

    public void setLinellength(Double linellength) {
        this.linellength = linellength;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getQuality() {
        return quality;
    }

    public void setQuality(Double quality) {
        this.quality = quality;
    }

    public String getProgressofworks() {
        return progressofworks;
    }

    public void setProgressofworks(String progressofworks) {
        this.progressofworks = progressofworks == null ? null : progressofworks.trim();
    }

    public String getProgressofworksstate() {
        return progressofworksstate;
    }

    public void setProgressofworksstate(String progressofworksstate) {
        this.progressofworksstate = progressofworksstate == null ? null : progressofworksstate.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}