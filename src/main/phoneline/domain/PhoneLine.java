package main.phoneline.domain;

public class PhoneLine {
    private static final int LONG_DISTANCE_CALL = 380;
    private static final int LOCAL_CALL = 1;
    private double callCost;
    private int callQuantity;
    private int callDuration;

    public void initialization() {
        callCost = 0;
        callQuantity = 0;
        callDuration = 0;
    }

    public void restart() {
        initialization();
    }

    public double getCallCost() {
        return callCost;
    }

    public int getCallQuantity() {
        return callQuantity;
    }

    public double getCallDuration() {
        return callDuration;
    }

    public void addLongDistanceCall(int minutes) {
        callQuantity++;
        callDuration += minutes;
        callCost = callCost + minutes * LONG_DISTANCE_CALL;
    }

    public void addLocalCall(int minutes) {
        callQuantity++;
        callDuration += minutes;
        callCost += LOCAL_CALL*minutes;
    }
}