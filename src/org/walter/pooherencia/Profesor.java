package org.walter.pooherencia;

public class Profesor extends Persona {
    private String asignatura;


    public Profesor() {
        System.out.println("inicializando constructor Profesor");
    }

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);

    }

    public Profesor(String nombre, String apellido, String asignatura) {
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "Hola que tal soy el profesor y mi nombre es " + getNombre() + " dicto la clase de  " + getAsignatura();
    }
}
