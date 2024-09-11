/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pildoras.es.jackson.pruebas;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class DriverJackson {

    public static void main(String[] args) {
        try {
            // Crear objeto ObjectMapper
            ObjectMapper mapper = new ObjectMapper();

            // Leer el archivo JSON desde el classpath y convertir a POJO
            InputStream inputStream = DriverJackson.class.getClassLoader().getResourceAsStream("data/datos_empleados.json");

            if (inputStream == null) {
                throw new FileNotFoundException("Archivo no encontrado en el classpath.");
            }

            // Mapea el JSON al objeto Empleado
            Empleado empleado = mapper.readValue(inputStream, Empleado.class);

            // Ver información en consola
            System.out.println("Nombre del empleado: " + empleado.getNombre());
            System.out.println("Apellido del empleado: " + empleado.getApellido());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
