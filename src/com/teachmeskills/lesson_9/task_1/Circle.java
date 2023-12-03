package com.teachmeskills.lesson_9.task_1;

public final class Circle extends Figure{

    public int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double calculateTheArea() {
        return Math.PI*r*r;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI*r*2;
    }

}
