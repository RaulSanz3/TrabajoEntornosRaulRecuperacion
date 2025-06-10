/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para cambiar esta licencia
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java para editar esta plantilla
 */
package trabajoentornosfinal;

/**
 * Autor: Raúl Sanz
 * Versión: 1.0
 */

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear objetos
        Linterna lin1 = new Linterna();
        Gps gps1 = new Gps();
        Android and1 = new Android("amarillo");
        PI_jiphone myphone = new PI_jiphone("Rojo");

        // Asignar objetos
        and1.setLinternita(lin1);
        myphone.setLinternita(lin1);
        myphone.setGpsConcreto(gps1);

        // Probar el Android (&-roid)
        System.out.println(and1.getMarca().toUpperCase());
        System.out.println(and1.getPug());
        System.out.println(and1.getBateria());
        and1.cargar();
        and1.llamar();
        System.out.println(and1.getLlamadas());
        and1.pintar();
        and1.encenderLinterna();
        and1.apagarLinterna();

        // Probar el PI_jiphone
        System.out.println(myphone.getMarca().toUpperCase());
        System.out.println(myphone.getPug());
        System.out.println(myphone.getBateria());
        myphone.cargar();
        myphone.llamar();
        myphone.actualizarUbicacion("Madrid");
        myphone.obtenerUbicacion();
        System.out.println(myphone.getLlamadas());
        myphone.encenderLinterna();
        myphone.apagarLinterna();
    }
}
