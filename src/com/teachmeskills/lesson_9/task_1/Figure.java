package com.teachmeskills.lesson_9.task_1;

public abstract sealed class Figure permits Circle, Rectangle, Triangle {

    public abstract double calculateTheArea();

    public abstract double calculatePerimeter();


}