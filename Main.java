/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oopjava.enkapsulasi;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        double a = input.nextDouble();
        System.out.print("Masukkan nilai b: ");
        double b = input.nextDouble();
        System.out.print("Masukkan nilai c: ");
        double c = input.nextDouble();
        System.out.print("Masukkan nilai d: ");
        double d = input.nextDouble();
        System.out.print("Masukkan nilai e: ");
        double e = input.nextDouble();
        System.out.print("Masukkan nilai f: ");
        double f = input.nextDouble();

        Enkapsulasi persamaan = new Enkapsulasi(a, b, c, d, e, f);

  
        if (persamaan.isSolvable()) {
            System.out.println("Nilai x = " + persamaan.getX());
            System.out.println("Nilai y = " + persamaan.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi.");
        }
    }
}

