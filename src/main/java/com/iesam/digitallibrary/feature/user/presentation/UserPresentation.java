package com.iesam.digitallibrary.feature.user.presentation;

import com.iesam.digitallibrary.feature.user.data.UserDataRepository;
import com.iesam.digitallibrary.feature.user.data.local.UserFileLocalDataSource;
import com.iesam.digitallibrary.feature.user.domain.NewUserUseCase;
import com.iesam.digitallibrary.feature.user.domain.User;

import java.util.Scanner;

public class UserPresentation {
    static Scanner sc = new Scanner(System.in);


    public static void showNewUserForm() {
        System.out.print("Introduce el DNI:");
        String dni = sc.nextLine();
        System.out.print("Introduce el nombre:");
        String name = sc.nextLine();
        System.out.print("Introduce los apellidos:");
        String surname = sc.nextLine();
        System.out.print("Introduce el teléfono:");
        String phone = sc.nextLine();
        System.out.print("Introduce el email:");
        String email = sc.nextLine();
        System.out.print("Introduce la fecha de nacimiento:");
        String dateBorn = sc.nextLine();

        User newUser = new User(dni, name, surname, phone, email, dateBorn);
        NewUserUseCase newUserUseCase = new NewUserUseCase(new UserDataRepository(new UserFileLocalDataSource()));
        newUserUseCase.execute(newUser);
    }

}
