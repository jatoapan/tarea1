/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author lisbe
 */
public class Configuracion {
     private static Configuracion instance;
    private String configuracionApp;

    private Configuracion() {
        configuracionApp = "Configuración predeterminada";
    }

    public static Configuracion getInstance() {
        if (instance == null) {
            instance = new Configuracion();
        }
        return instance;
    }

    public String getConfiguracion() {
        return configuracionApp;
    }

    public void setConfiguracion(String configuracionApp) {
        this.configuracionApp = configuracionApp;
    }
}
