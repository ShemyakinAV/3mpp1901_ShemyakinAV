package com.shemyakin;

public class Primes {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if(isPrime(i)){
                System.out.println("Число " + i + " простое!");
            }
        }
    }
/*
Статичная булевая определяет, является ли аргумент простым числом или нет. Входной параметр n при запуске программы
будет являться числом i из цикла метода main.
 */
    public static boolean isPrime(int n) {
        boolean prime = true; //флажок определения простое/не простое
        /*Цикл идет по заданным числам, и, если входной параметр n делится без остатка на i, флажок меняется, а
        цикл заканчивает работу с этим числом
        */
        for(int i=2; i<n ;i++)

        {
            if (n%i==0) {
                prime=false;
                break;
            }
        }
return prime;
        }
    }


