/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/license/default.txt para cambiar esta licencia
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar esta plantilla
 */
package trabajoentornosfinal;

/**
 * Autor: Raúl Sanz
 * Versión: 1.0
 */

public class PI_jiphone extends Telefono {

    // Relación de composición con la clase Gps
    private Gps gpsConcreto;

    public PI_jiphone(String color) {
        super(color, 700, "Pijiphone");
        this.gpsConcreto = new Gps();
    }

    /**
     * Método para llamar, añade algo más al de la madre (Telefono)
     */
    @Override
    public void llamar() {
        super.llamar();
        System.out.println("Esta llamada va a ser grabada");
    }

    /**
     * Método para cargar la batería, viene del abstracto de Telefono
     */
    @Override
    public void cargar() {
        bateria += 70;
        if (bateria > 100) {
            bateria = 100;
        }
        System.out.println("Cargando...");
        this.esperar(5);
        System.out.println("Batería actual: " + bateria);
    }

    public void setGpsConcreto(Gps gpsConcreto) {
        this.gpsConcreto = gpsConcreto;
    }

    /**
     * Cambia la ubicación actual
     * @param nuevaUbicacion 
     */
    public void actualizarUbicacion(String nuevaUbicacion) {
        gpsConcreto.actualizarUbicacion(nuevaUbicacion);
    }

    /**
     * Muestra dónde estás ahora mismo
     */
    public void obtenerUbicacion() {
        System.out.println("Ahora mismo estás en: " + gpsConcreto.getUbicacionActual());
    }
}
