/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para cambiar esta licencia
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar esta plantilla
 */
package trabajoentornosfinal;

/**
 * Autor: Raúl Sanz
 * Versión: 1.0
 */

public class Linterna {
    private boolean encendido;

    // Método para encender la linterna
    public void encender() {
        System.out.println("Mucha Luz!");
        this.setEncendido(true);
    }

    // Método para apagar la linterna
    public void apagar() {
        System.out.println("Se va la luz");
        this.setEncendido(false);
    }

    // Devuelve si está encendida o no
    public boolean isEncendido() {
        return encendido;
    }

    // Cambia el estado de encendido
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
}
