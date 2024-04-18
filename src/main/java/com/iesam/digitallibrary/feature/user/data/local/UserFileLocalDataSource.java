package com.iesam.digitallibrary.feature.user.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.digitallibrary.feature.user.domain.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Scanner;

/**
 * Esta es la clase que me permite guardar los datos en un fichero.
 */
public class UserFileLocalDataSource {

    private String nameFile = "users.txt";

    private Gson gson = new Gson();

    private final Type type = new TypeToken<User>() {
    }.getType();

    public void save(User model) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(model));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
        }
    }

    public User obtain() {
        try {
            File myObj = new File(nameFile);
            if (!myObj.exists()) {
                myObj.createNewFile();
            }
            Scanner myReader = new Scanner(myObj);
            if (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, type);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el fichero.");
            throw new RuntimeException(e);
        }
        return null;
    }

    public void clear() {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write("");
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
        }
    }

}
