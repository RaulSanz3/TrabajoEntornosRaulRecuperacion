/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para cambiar esta licencia
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java para editar esta plantilla
 */
package trabajoentornosfinal;

/**
 * Autor: Raúl Sanz
 * Versión: 1.0
 */

public abstract class Telefono {
    
    // Código PUK del teléfono, único y aleatorio
    private final String pug;
    // Precio del teléfono
    private double precio;
    // Color del teléfono
    private String color;
    // Batería del teléfono (de 0 a 100)
    protected int bateria;
    // Marca del teléfono
    private String marca;
    // Número de llamadas realizadas con este teléfono
    private int llamadas;
    // Total de llamadas hechas entre todos los teléfonos
    private static int llamadasTotales;
    // Linterna asociada al teléfono
    private Linterna linternita;

    // Constructor
    public Telefono(String color, double precio, String marca) {
        this.pug = "" + (int) (Math.random() * 100000000);
        this.color = color;
        this.precio = precio;
        this.marca = marca;
        this.llamadas = 0;
        this.linternita = new Linterna();
        this.bateria = 0;
    }

    // Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPug() {
        return pug;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    // Métodos
    /**
     * Método para hacer una llamada
     */
    public void llamar() {
        System.out.println("Piiii-PIii...");
        this.esperar(4);
        System.out.println("---**CONVERSACIÓN FINALIZADA**--");
        System.out.println("pi pi pi pi pi...");
        this.setLlamadas(this.getLlamadas() + 1);
        Telefono.setLlamadasTotales(Telefono.getLlamadasTotales() + 1);
    }

    public static int getLlamadasTotales() {
        return llamadasTotales;
    }

    public static void setLlamadasTotales(int llamadasTotales) {
        Telefono.llamadasTotales = llamadasTotales;
    }

    public int getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(int llamadas) {
        this.llamadas = llamadas;
    }

    /**
     * Método para esperar unos segundos
     *
     * @param segundos Tiempo de espera en segundos
     */
    public void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Método para encender la linterna
     */
    public void encenderLinterna() {
        linternita.encender();
    }

    /**
     * Método para apagar la linterna
     */
    public void apagarLinterna() {
        linternita.apagar();
    }

    /**
     * Método abstracto para cargar el teléfono (cada tipo de teléfono lo hará de manera distinta)
     */
    public abstract void cargar();

    public Linterna getLinternita() {
        return linternita;
    }

    public void setLinternita(Linterna linternita) {
        this.linternita = linternita;
    }
}
