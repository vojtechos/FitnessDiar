package com.company;

public enum TimeLine {
    MORNING(0, ""),
    FORENOON(0, ""),
    NOON(0,""),
    AFTERNOON(0,""),
    EVENING(0,"");


    int cal;
    String name;

    TimeLine(int cal, String name) {
        this.cal = cal;
        this.name = name;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "název: " + name +
                ", cal: " + cal;
    }
}
