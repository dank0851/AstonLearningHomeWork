package com.dank0851;

public interface GeometricFigure {

    // Метод для подсчета периметра фигуры (но для разных фигур формула подсчёта разная?..)
    default double perimeter() {

        System.out.println("Используется метод по умолчанию, нужна конкретная фигура!");
        return 0;
    }
    // Метод для подсчета площади фигуры (но для разных фигур формула подсчёта разная?..)
    default double area(){
        System.out.println("Используется метод по умолчанию, нужна конкретная фигура!");
        return 0;
    }
}
