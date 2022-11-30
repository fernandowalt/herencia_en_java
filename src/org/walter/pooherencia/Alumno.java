package org.walter.pooherencia;

public class Alumno extends Persona {
    private String institucion;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHistoria;


    public Alumno() {

        System.out.println("Inicializando constructor Alumno");
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);


    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);

    }

    public Alumno(String nombre, String apellido, int edad, String institucion) {
        super(nombre, apellido, edad);
        this.institucion = institucion;

    }

    public Alumno(String nombre, String apellido, int edad, String institucion, double notaMatematica, double notaCastellano, double notaHistoria) {
        this(nombre, apellido, edad, institucion);
        this.institucion = institucion;
        this.notaMatematica = notaMatematica;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
    }

    public String getNombreAlumno() {
        return getNombre();
    }

    public String getInstritucion() {
        return institucion;
    }

    public void setInstritucion(String instritucion) {
        this.institucion = instritucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    public double calcularPromedio() {
        return (notaCastellano + notaHistoria + notaMatematica) / 3;

    }

    @Override
    public String saludar() {

        return "hola que tal, soy un alumno y mi nombre es: " + getNombre();
    }

    @Override
    public String toString() {
        return
                super.toString() + "institucion='" + institucion + '\n' +
                        ", notaMatematica=" + notaMatematica + "\n" +
                        ", notaCastellano=" + notaCastellano + "\n" +
                        ", notaHistoria=" + notaHistoria + "\n" +
                        ", Promedio " + this.calcularPromedio();
    }
}
