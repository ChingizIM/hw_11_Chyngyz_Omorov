package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         boolean True = true;
         while (True) {
             User user = new User();

             Scanner scName = new Scanner(System.in);

             try {
                 System.out.println("Ввeдите ваше имя ");
                 user.setName(scName.nextLine());
             }catch (IllegalNameLengthException e){
                 System.out.println("ВВедите коректное имя ");
             }

                 Scanner scAge = new Scanner(System.in);
                 try {

                     System.out.println("Введите ваш возвраст: ");
                     user.setAge(scAge.nextInt());
                 } catch (IllegalAgeException e) {
                     System.out.println("Вы ввели не правильный возраст ");
                 }
             }
             }
}