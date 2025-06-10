/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para cambiar esta licencia
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar esta plantilla
 */
package trabajoentornosfinal;

/**
 * Autor: Raúl Sanz
 * Versión: 1.0
 */

public class Gps {
    private String ubicacionActual;

    // Método para cambiar la ubicación
    public void actualizarUbicacion(String nuevaUbicacion) {
        this.ubicacionActual = nuevaUbicacion;
    }

    // Devuelve la ubicación que tienes ahora mismo
    public String getUbicacionActual() {
        return ubicacionActual;
    }
}
