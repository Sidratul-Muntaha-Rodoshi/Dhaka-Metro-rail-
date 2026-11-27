package com.example.dhakametrorailoperations.Rinty;

public class u7goal8 {
    private String shift;
    private String condition;
    private String note;

    public u7goal8() {
    }

    public u7goal8(String shift, String condition, String note) {
        this.shift = shift;
        this.condition = condition;
        this.note = note;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "u7goal8{" +
                "shift='" + shift + '\'' +
                ", condition='" + condition + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
