package pl.javastart.task;

import java.util.Scanner;

public class Room {
    private int area;
    private double actualTemp;
    private boolean airCond;

    private double minTemp;

    Scanner scan = new Scanner(System.in);

    public Room(int area, double actualTemp, boolean airCond) {
        this.area = area;
        this.actualTemp = actualTemp;
        this.airCond = airCond;
    }

    public int getArea() {
        return area;
    }

    void setArea(int area) {
        this.area = area;
    }

    public double getActualTemp() {
        return actualTemp;
    }

    void setActualTemp(double actualTemp) {
        this.actualTemp = actualTemp;
    }

    public boolean isAirCond() {
        return airCond;
    }

    void setAirCond(boolean airCond) {
        this.airCond = airCond;
    }

    public double getMinTemp() {
        return minTemp;
    }

    private void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    boolean tempDecrease() {
        if (isAirCond()) {
            if (getActualTemp() >= getMinTemp() + 1) {
                setActualTemp(getActualTemp() - 1);
                return true;
            } else if (getActualTemp() == getMinTemp()) {
                return false;
            } else {
                setActualTemp(getMinTemp());
                return true;
            }
        } else {
            return false;
        }
    }

    void tempMin(double minTemp) {
        if (isAirCond()) {
            System.out.println("Podaj temp min dla pokoju: " );
            double temp  = scan.nextDouble();
            setMinTemp(temp);
        } else {
            System.out.println("Nie można ustawić temp minimalnej, ponieważ pokój nie posiada klimatyzacji");
        }
    }
}
