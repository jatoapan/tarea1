/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author lisbe
 */
public class Aplicacion {
    public void iniciar() {
        Configuracion config = Configuracion.getInstance();
        System.out.println("Iniciando la aplicación con: " + config.getConfiguracion());
    }

    public void actualizarConfiguracion(String nuevaConfig) {
        Configuracion config = Configuracion.getInstance();
        config.setConfiguracion(nuevaConfig);
        System.out.println("Configuración actualizada a: " + config.getConfiguracion());
    }
    
}
