package com.example.dhakametrorailoperations.TasniahBashraat;

public class u4_g8_SecurityIncidentAnalysisResult {
    private String securityIncidentType;
    private Integer incidentCount;
    private Integer rank;

    public u4_g8_SecurityIncidentAnalysisResult(String securityIncidentType, Integer incidentCount, Integer rank) {
        this.securityIncidentType = securityIncidentType;
        this.incidentCount = incidentCount;
        this.rank = rank;
    }

    public String getSecurityIncidentType() {
        return securityIncidentType;
    }

    public Integer getIncidentCount() {
        return incidentCount;
    }

    public Integer getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "SecurityIncidentAnalysisResult{" +
                "securityIncidentType='" + securityIncidentType + '\'' +
                ", incidentCount=" + incidentCount +
                ", rank=" + rank +
                '}';
    }

}
