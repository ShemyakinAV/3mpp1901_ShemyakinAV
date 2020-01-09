package com.shemyakin;

import java.util.Scanner;
/*
Трехмерное пространство содержит три точки - точка x, точка y и точка z. При запуске программы пользователю следует
ввести данные для трех точек, согласно условию задачи лабораторной работы, используя класс Point3d.
 */
public class Lab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Для ввода пользователем значений точек

        String[] Point1_Coordinates, Point2_Coordinates, Point3_Coordinates; // Массив из координат точек
        double x, y, z, area;

        /*
        Дальнейший блок генерирует точки согласно введенным пользователем данным
         */
        // Данные точки 1
        System.out.println("Введите значения точек x, y и z соответсвенно, через знак ';' для построения первой точки");
        Point1_Coordinates = in.nextLine().split(";");
        x = Double.parseDouble(Point1_Coordinates[0]);
        y = Double.parseDouble(Point1_Coordinates[1]);
        z = Double.parseDouble(Point1_Coordinates[2]);
        Point3d point_1 = new Point3d(x, y, z);

        // Данные точки 2
        System.out.println("Введите значения точек x, y и z соответсвенно, через знак ';' для построения второй точки");
        Point2_Coordinates = in.nextLine().split(";");
        x = Double.parseDouble(Point2_Coordinates[0]);
        y = Double.parseDouble(Point2_Coordinates[1]);
        z = Double.parseDouble(Point2_Coordinates[2]);
        Point3d point_2 = new Point3d(x, y, z);

        // Данные точки 3
        System.out.println("Введите значения точек x, y и z соответсвенно, через знак ';' для построения третьей точки");
        Point3_Coordinates = in.nextLine().split(";");
        x = Double.parseDouble(Point3_Coordinates[0]);
        y = Double.parseDouble(Point3_Coordinates[1]);
        z = Double.parseDouble(Point3_Coordinates[2]);
        Point3d point_3 = new Point3d(x, y, z);

        in.close(); // Завершение работы со Scanner

        // Следующее условие проводит проверку на равенство точек. В случае равенства расчет площали не производится
        if(point_1.compareTo(point_2) || point_1.compareTo(point_3) || point_2.compareTo(point_3)) {
            System.out.println("Значения точек равны! Расчет невозможен.");
        } else {
            area = computeArea(point_1, point_2, point_3);
            System.out.println("Площадь равна " + area);
        }
    }

   /*
   Метод computeArea принимает входные параметры трех точек. Далее формируются стороны треугольника и производится
   расчет его площади с помощью формулы Герона.
    */
    public static double computeArea(Point3d point_1, Point3d point_2, Point3d point_3) {

        double a, b, c, p, area;

        // формирование сторон
        a = point_1.distanceTo(point_2);
        b = point_1.distanceTo(point_3);
        c = point_2.distanceTo(point_3);

        // Расчет полупериметра и площади треугольника
        p = (a + b + c) / 2;
        area = Math.sqrt(p*(p - a)*(p - b)*(p - c));

        return Math.round(area * 100) / 100.0; // Округление до двух знаков, согласно условиям лабораторной работы
    }
}