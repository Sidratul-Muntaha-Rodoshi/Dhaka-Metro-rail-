package com.example.dhakametrorailoperations.TasniahBashraat;

public class u4_g3_PaymentMethodAnalysisResult {
    private String paymentMethod;
    private Integer transactionCount;
    private Integer rank;

    public u4_g3_PaymentMethodAnalysisResult(String paymentMethod, Integer transactionCount, Integer rank) {
        this.paymentMethod = paymentMethod;
        this.transactionCount = transactionCount;
        this.rank = rank;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public Integer getTransactionCount() {
        return transactionCount;
    }

    public Integer getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "PaymentMethodAnalysisResult{" +
                "paymentMethod='" + paymentMethod + '\'' +
                ", transactionCount=" + transactionCount +
                ", rank=" + rank +
                '}';
    }
}
