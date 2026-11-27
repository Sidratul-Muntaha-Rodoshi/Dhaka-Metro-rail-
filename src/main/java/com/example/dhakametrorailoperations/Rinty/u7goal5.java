package com.example.dhakametrorailoperations.Rinty;

public class u7goal5 {
    private String train;
    private String messageType;
    private String messagePreview;

    public u7goal5() {
    }

    public u7goal5(String train, String messageType, String messagePreview) {
        this.train = train;
        this.messageType = messageType;
        this.messagePreview = messagePreview;
    }

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getMessagePreview() {
        return messagePreview;
    }

    public void setMessagePreview(String messagePreview) {
        this.messagePreview = messagePreview;
    }

    @Override
    public String toString() {
        return "u7goal5{" +
                "train='" + train + '\'' +
                ", messageType='" + messageType + '\'' +
                ", messagePreview='" + messagePreview + '\'' +
                '}';
    }
}
