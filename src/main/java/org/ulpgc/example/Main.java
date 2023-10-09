package org.ulpgc.example;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) {

        Barco ship = new Barco(10, 9, "Libertad");
        Gson gson = new Gson();
        String json = gson.toJson(ship);

        // Imprimir JSON
        System.out.println(json);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\aadel\\Desktop\\Segundo\\DACD\\prueba.txt"))) {
            // Escribir JSON en el archivo
            writer.write(json);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
