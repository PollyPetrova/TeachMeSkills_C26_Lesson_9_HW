package com.teachmeskills.lesson_9.task_1;

/**
 * Усовершенствовать задание с фигурами
 * Использовать модификатор Sealed для класса "Фигура".
 */

public class Runner {

    public static void main(String[] args) {

        Figure triangle=new Triangle(2,5,9);
        Figure triangle1=new Triangle(15,20,25);
        Figure rectangle=new Rectangle(7,12);
        Figure rectangle1=new Rectangle(20,18);
        Figure circle=new Circle(25);

        Figure[] figures=new Figure[5];
        figures[0]=triangle;
        figures[1]=triangle1;
        figures[2]=rectangle;
        figures[3]=rectangle1;
        figures[4]=circle;

        double sum=0;
        int k=1;
        for (Figure array:figures) {
            System.out.println("Information about "+k+" figure: ");
            System.out.println("Calculate perimeter= "+array.calculatePerimeter());
            System.out.println("Calculate area= "+array.calculateTheArea());
            sum+=array.calculatePerimeter();
            System.out.println();
            k++;
        }
        System.out.println("Sum of perimeter of all figures = "+sum);

    }

}
