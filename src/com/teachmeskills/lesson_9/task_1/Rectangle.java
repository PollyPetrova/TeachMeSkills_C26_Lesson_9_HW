package com.teachmeskills.lesson_9.task_1;

public final class Rectangle extends Figure{

    public int width;
    public int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateTheArea() {
        return width*length;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(width+length);
    }

}
