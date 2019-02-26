package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите рассход топлива на 100 км");
        int consuptionPetrol = scanner.nextInt();

        System.out.println("Введите оставшийся объем бензина в баке");
        int HavePetrol = scanner.nextInt();

        int calcHavePetrol = 100 * HavePetrol / consuptionPetrol;

        System.out.println("Топлива осталось на = " + calcHavePetrol + " км");
    }
}