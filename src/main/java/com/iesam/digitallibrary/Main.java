package com.iesam.digitallibrary;

import java.util.Scanner;
import com.iesam.digitallibrary.features.user.domain.User;
import com.iesam.digitallibrary.features.user.presentation.UserPresentation;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
       do {
           System.out.println("MENÚ PRINCIPAL");

        System.out.println("1. Registrar usuario");

        option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Introduce el nombre del usuario");
                String name = scanner.nextLine();
                System.out.println("Introduce el email del usuario");
                String email = scanner.nextLine();
                System.out.println("Introduce el DNI del usuario");
                String DNI = scanner.nextLine();
                User user = new User(name, email, DNI);
                UserPresentation userPresentation = new UserPresentation();
                userPresentation.create(user);
                System.out.println("Usuario registrado correctamente");
                break;
        }
         } while (option != 0);
        scanner.close();
    }
}