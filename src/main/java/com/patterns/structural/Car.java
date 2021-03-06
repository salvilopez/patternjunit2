package com.patterns.structural;

public class Car implements Movable{

    private double speed;

    @Override
    public void speedUp(double quantity) {
        this.speed += quantity;
    }

    @Override
    public void brake(double quantity) {
        this.speed -= quantity;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
