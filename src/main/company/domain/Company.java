package main.company.domain;

import main.phoneline.domain.PhoneLine;;

public class Company {
    private PhoneLine line1;
    private PhoneLine line2;
    private PhoneLine line3;

    public PhoneLine getLine1() {
        return line1;
    }

    public PhoneLine getLine2() {
        return line2;
    }

    public PhoneLine getLine3() {
        return line3;
    }

    public void addLocalCallToLine1(int minutes) {
        line1.addLocalCall(minutes);
    }

    public void addLocalCallToLine2(int minutes) {
        line2.addLocalCall(minutes);
    }

    public void addLocalCallToLine3(int minutes) {
        line3.addLocalCall(minutes);
    }

    public double getTotalCallCost() {
        return line1.getCallCost() + line2.getCallCost() + line3.getCallCost();
    }

    public double getTotalCall() {
        return line1.getCallDuration() + line2.getCallDuration() + line3.getCallDuration();
    }

    public double getCallCostAverageByMinutes() {
        return getTotalCallCost() / getTotalCall();
    }

    public void initialization() {
        line1 = new PhoneLine();
        line1.initialization();
        line2 = new PhoneLine();
        line2.initialization();
        line3 = new PhoneLine();
        line3.initialization();
    }
}