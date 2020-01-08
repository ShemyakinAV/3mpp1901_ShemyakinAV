package com.shemyakin;

public class Palindrome {
    public static void main(String[] args) {
/*Цикл перебирает указанные аргументы и применяет к ним булевую isPalindrome.
  В случае соответствия, программа выведет каждый встречающийся палиндром.
 */
        for (int i = 0; i < args.length; i++) {
            if(isPalindrome(args[i]))
            System.out.println("Слово " + args[i] + " палиндром!");
        }
    }
    /*
    Статичная строка reverseString принимает входной параметр s строкового типа.
    Выполняемые шаги:
    1. Создается пустая строка result, куда будет добавляться по одной букве строки s;
    2. Цикл перебирает буквы строки s и добавляет их в строку result;
    3. После завершения цикла reverseString возвращает обновленную строку result.
     */
    public static String reverseString(String s) {
        String result = "";

        for(int i = s.length() - 1; i >= 0; i--){
            result += s.charAt(i);
        }
        return result;
    }
/*
Статичная булевая isPalindrome принимает входной параметр s строкового типа.
Выполняемые шаги:
1. К полученной строке применяется метод reverseString. Запись идет в переменную reverseS
2. Возвращается результат сравнивания входной строки s и реверсированной строки reverseS
 */
    public static boolean isPalindrome(String s) {
        String reverseS = reverseString(s);
        return s.equals(reverseS);
    }
}
