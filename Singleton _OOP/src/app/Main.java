/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author lisbe
 */
public class Main {
     public static void main(String[] args) {
        Aplicacion app1 = new Aplicacion();
        app1.iniciar();

        Aplicacion app2 = new Aplicacion();
        app2.actualizarConfiguracion("Configuración personalizada");

        app1.iniciar();  // Esto mostrará la configuración actualizada, ya que ambas clases usan la misma instancia de Configuración
    }
    
}
