package com.hamza.loanhandler.dto;

public class LoanDTO {

    private String dealName;
    private String dealId;
    private String caseId;
    private String rId;

    public LoanDTO(String dealName, String dealId, String caseId, String rId) {
        this.dealName = dealName;
        this.dealId = dealId;
        this.caseId = caseId;
        this.rId = rId;
    }


    public String getDealName() {
        return dealName;
    }

    public void setDealName(String dealName) {
        this.dealName = dealName;
    }

    public String getDealId() {
        return dealId;
    }

    public void setDealId(String dealId) {
        this.dealId = dealId;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }
}
