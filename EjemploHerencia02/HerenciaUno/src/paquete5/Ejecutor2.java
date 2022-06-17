/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author E.N.D
 */
public class Ejecutor2 {
    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        int numCreditos = 5;
        double costoCreditos = 50.5;
        
                
        EstudiantePresencial estDistancia = new EstudiantePresencial(nombre,
                apellido, identificacion, edad, numCreditos, costoCreditos);
        
        estDistancia.calcularMatriculaDistancia();
        
        System.out.println(estDistancia);
    }
}
