/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectovacunaslemus;


import java.io.*;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EncriptadorTabla {

    // Método para encriptar los datos de la tabla y guardarlos en un archivo
    public static void encriptarYGuardarTabla(JTable tabla, String rutaArchivo, String clave) {
        try {
            // Obtener el modelo de la tabla
            DefaultTableModel model = (DefaultTableModel) tabla.getModel();

            // Crear el escritor para el archivo
            BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo));

            // Obtener y escribir los nombres de las columnas
            for (int j = 0; j < model.getColumnCount(); j++) {
                String columnName = model.getColumnName(j);
                String columnNameEncrypted = encriptarVigenere(columnName, clave);
                writer.write(columnNameEncrypted);
                writer.write(";");
            }
            writer.newLine();

            // Recorrer cada fila de la tabla
            for (int i = 0; i < model.getRowCount(); i++) {
                // Recorrer cada columna de la fila
                for (int j = 0; j < model.getColumnCount(); j++) {
                    // Obtener el dato de la celda y encriptarlo usando Vigenère
                    String datoOriginal = String.valueOf(model.getValueAt(i, j));
                    String datoEncriptado = encriptarVigenere(datoOriginal, clave);

                    // Escribir el dato encriptado en el archivo
                    writer.write(datoEncriptado);

                    // Separar los datos con un carácter especial (puedes cambiarlo según tu preferencia)
                    writer.write(";"); // Por ejemplo, usando punto y coma como separador
                }
                // Agregar un salto de línea al final de cada fila
                writer.newLine();
            }

            // Cerrar el escritor
            writer.close();

            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(null, "Tabla encriptada y guardada exitosamente en " + rutaArchivo, "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar la tabla encriptada.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para desencriptar los datos de un archivo y mostrarlos en una tabla
    public static void desencriptarYMostrarTabla(JTable tabla, String rutaArchivo, String clave) {
        try {
            // Crear el lector para el archivo
            BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));

            // Crear un modelo de tabla vacío
            DefaultTableModel model = new DefaultTableModel();

            // Leer la primera línea del archivo para determinar el número de columnas
            String primeraLinea = reader.readLine();
            String[] columnasEncriptadas = primeraLinea.split(";"); // Suponiendo que usaste punto y coma como separador
            String[] columnas = new String[columnasEncriptadas.length];

            // Desencriptar los nombres de las columnas
            for (int i = 0; i < columnasEncriptadas.length; i++) {
                columnas[i] = desencriptarVigenere(columnasEncriptadas[i], clave);
            }

            // Agregar las columnas al modelo de la tabla
            model.setColumnIdentifiers(columnas);

            // Leer el resto de las líneas para obtener los datos
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datosEncriptados = linea.split(";");
                String[] datosDesencriptados = new String[datosEncriptados.length];

                // Desencriptar cada dato
                for (int i = 0; i < datosEncriptados.length; i++) {
                    String datoDesencriptado = desencriptarVigenere(datosEncriptados[i], clave);
                    datosDesencriptados[i] = datoDesencriptado.equals("null") ? "" : datoDesencriptado;
                }

                // Agregar la fila al modelo de la tabla
                model.addRow(datosDesencriptados);
            }

            // Asignar el modelo de tabla creado a la tabla proporcionada
            tabla.setModel(model);

            // Cerrar el lector
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al leer el archivo encriptado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para encriptar un texto utilizando el cifrado Vigenère
    private static String encriptarVigenere(String texto, String clave) {
        StringBuilder textoEncriptado = new StringBuilder();

        // Repetir la clave hasta que tenga la misma longitud que el texto
        while (clave.length() < texto.length()) {
            clave += clave;
        }

        // Recorrer cada carácter del texto original
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            // Obtener el desplazamiento para este carácter según la clave
            int desplazamiento = clave.charAt(i) - 'A';
            // Aplicar el desplazamiento al carácter y agregarlo al texto encriptado
            textoEncriptado.append((char) ((caracter + desplazamiento) % 256));
        }

        return textoEncriptado.toString();
    }

    // Método para desencriptar un texto utilizando el cifrado Vigenère
    private static String desencriptarVigenere(String textoEncriptado, String clave) {
        StringBuilder textoDesencriptado = new StringBuilder();

        // Repetir la clave hasta que tenga la misma longitud que el texto encriptado
        while (clave.length() < textoEncriptado.length()) {
            clave += clave;
        }

        // Recorrer cada carácter del texto encriptado
        for (int i = 0; i < textoEncriptado.length(); i++) {
            char caracter = textoEncriptado.charAt(i);
            // Obtener el desplazamiento para este carácter según la clave
            int desplazamiento = clave.charAt(i) - 'A';
            // Restar el desplazamiento al carácter para deshacer la encriptación y agregarlo al texto desencriptado
            textoDesencriptado.append((char) ((caracter - desplazamiento + 256) % 256));
        }

        return textoDesencriptado.toString();
    }
}
