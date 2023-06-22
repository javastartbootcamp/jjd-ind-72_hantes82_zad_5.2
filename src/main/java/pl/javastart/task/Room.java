package pl.javastart.task;

import java.util.Scanner;

public class Room {
    private int area;
    private double actualTemp;
    private boolean airCond;

    private double minTemp;

    public Room(int area, double actualTemp, boolean airCond) {
        this.area = area;
        this.actualTemp = actualTemp;
        this.airCond = airCond;
    }

    public int getArea() {
        return area;
    }

    public double getActualTemp() {
        return actualTemp;
    }

    public boolean isAirCond() {
        return airCond;
    }

    public double getMinTemp() {
        return minTemp;
    }

    boolean tempDecrease() {
        if (isAirCond()) {
            if (actualTemp >= minTemp + 1) {
                actualTemp = actualTemp - 1;
                return true;
            } else if (actualTemp == minTemp) {
                return false;
            } else {
                actualTemp = minTemp;
                return true;
            }
        } else {
            return false;
        }
    }

    boolean tempMin(double minTemp) {
        if (!isAirCond()) {
            return false;
        } else {
            this.minTemp = minTemp;
            return true;
        }
    }
}

