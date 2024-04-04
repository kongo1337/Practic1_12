/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practical1_12_individual;

import java.util.Scanner;

/**
 *
 * @author KonGo
 */
public class Practical1_12_Individual {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Работа выполненан Быстровым К.В.  ");

        System.out.println("Введите данные о враче:");

        System.out.println("Имя: ");
        String name = scanner.nextLine();

        System.out.println("Возраст: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Специализация: ");
        String specialization = scanner.nextLine();

        System.out.println("Больница: ");
        String hospital = scanner.nextLine();

        System.out.println("Зарплата: ");
        int salary = Integer.parseInt(scanner.nextLine());

        Doctor doctor = new Doctor(name, age, specialization, hospital, salary);   
        SaveRunnable sr = new SaveRunnable(doctor);
        Thread th = new Thread(sr);
        th.start();
        
    }
}
