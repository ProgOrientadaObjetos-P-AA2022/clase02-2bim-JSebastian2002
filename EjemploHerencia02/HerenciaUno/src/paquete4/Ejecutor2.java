/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author E.N.D
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,apellido,identificacion,edad);
        estPresencial.establecerCostoCredito(50.5);
        estPresencial.establecerNumeroCreditos(5);
        estPresencial.calcularMatriculaPresencial();
        
        
        System.out.println(estPresencial);
   
    }
    
}
