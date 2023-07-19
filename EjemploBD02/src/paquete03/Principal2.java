/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.sql.SQLException;
import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author Italo
 */
public class Principal2 {

    public static void main(String[] args) {

        String[][] autos = {
            {"LBC0001", "230.2"},
            {"LBC0002", "330.2"},
            {"LBC0003", "430.2"},
            {"LBC0004", "530.1"},
            {"LBC0005", "130.2"},};

        // 1. guardar en la tabla autos de la base de datos
        Enlace e = new Enlace();
        Auto a = new Auto();
        for (int i = 0; i < autos.length; i++) {

            String placa = autos[i][0];
            Strign valor = autos[i][1];
            a.establecerPlaca(placa);
            a.establecerValorMatricula(valor);
            e.insertarAuto(autos);
            
        }
       
        // 2. presentar todos los registros de la tabla autos de la base de 
        // datos
        for (int i = 0; i < e.obtenerDataAuto().size(); i++) {
            System.out.printf("%s", e.obtenerDataAuto().get(i));
        }
    }
}
