package com.shemyakin;
/*
Трехмерное пространство содержит три точки - точка x, точка y и точка z. В данном классе инициализируются эти точки,
создается конструктор, а также вводятся методы сравнения равенства точек и рассчета расстояния между ними.
 */
public class Point3d{
    // Координаты x,y,z
    private double xCoord;
    private double yCoord;
    private double zCoord;

    // Инициализация
    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    // Конструктор
    public Point3d() {
        this(0, 0, 0);
    }

    // Получение координат x,y,z
    public double getX() {
        return xCoord;
    }
    public double getY() {
        return yCoord;
    }
    public double getZ() {
        return zCoord;
    }

    // Изменение координат x,y,z
    public void setX(double val) {
        xCoord = val;
    }
    public void setY(double val) {
        yCoord = val;
    }
    public void setZ(double val) {
        zCoord = val;
    }

    // Метод сравнения равенства точек. В случае равенства расчет площали не производится
    public boolean compareTo(Point3d p) {
        if((p.getX() == this.getX()) & (p.getY() == this.getY()) & (p.getZ() == this.getZ()))
            return true;
        else
            return false;
    }

    // Метод расчета расстояния между точками
    public double distanceTo(Point3d p) {
        double distance = Math.sqrt(
                Math.pow(p.getX() - this.getX(),2) +
                        Math.pow(p.getY() - this.getY(),2) +
                        Math.pow(p.getZ() - this.getZ(),2));
        return Math.round(distance * 100) / 100.0;
    }
}