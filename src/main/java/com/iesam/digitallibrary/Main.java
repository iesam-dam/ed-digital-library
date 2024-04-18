package com.iesam.digitallibrary;

import com.iesam.digitallibrary.feature.user.presentation.UserPresentation;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initMainMenu();
    }

    private static void initMainMenu() {
        int optionMenuSelected = -1;
        do {
            System.out.println("0. Salir.");
            System.out.println("1. Dar de alta un usuario.");
            System.out.print("\nSelecciona una opción:");
            optionMenuSelected = sc.nextInt();
            if (optionMenuSelected > 0) {
                menuHandler(optionMenuSelected);
            }
        } while (optionMenuSelected != 0);
    }

    private static void menuHandler(int optionMenuSelected) {
        switch (optionMenuSelected) {
            case 1:
                UserPresentation.showNewUserForm();
                return;
            default:
                return;
        }
    }
}