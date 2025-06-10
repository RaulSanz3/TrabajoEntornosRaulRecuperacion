/*
 * Click nbfs://nbhost/SystemFileTemplates/Licenses/license-default.txt para cambiar esta licencia
 * Click nbfs://nbhost/SystemFileTemplates/Classes/Class.java para editar esta plantilla
 */
package trabajoentornosfinal;

/**
 * Autor: Raúl Sanz
 * Versión: 1.0
 */

public class Android extends Telefono {

    // Constructor
    public Android(String color) {
        super(color, 200, "&-roid");
    }

    /**
     * Método para cargar la batería, viene de la clase Telefono.
     */
    /**
     * Método que abre el Paint para poder dibujar.
     */
    public void pintar() {
        try {
            ProcessBuilder proceso = new ProcessBuilder("mspaint.exe");
            proceso.start();
        } catch (Exception e) {
            System.out.println("No se ha podido abrir el Paint.");
        }
    }

    public void cargar() {
        this.bateria += (int) (bateria / 3.0 + 20);
        if (bateria > 100) {
            bateria = 100;
        }
        System.out.println("Cargando...");
        this.esperar(5);
        System.out.println("Batería actual: " + bateria);
    }
}
