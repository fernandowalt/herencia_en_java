package ejemplo;

import org.walter.pooherencia.*;

public class EjemploHerenciaConstructores {

    public static void main(String[] args) {

        System.out.println("==================Creando la instancia de la clase Alumno");
        Alumno alumno = new Alumno("Walter", "Gomez", 20, "Eduardo Umaña Mendosa");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("walterg@gmail.com");


        System.out.println("==================Creando la instancia de la clase alumno internacional");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInternacional.setEdad(15);
        alumnoInternacional.setInstritucion("eduardo umaña mendoza");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaCastellano(6.2);
        alumnoInternacional.setNotaHistoria(5.8);
        alumnoInternacional.setNotaMatematica(6.5);
        alumnoInternacional.setEmail("peter@correo.com");

        System.out.println("==================Creando la instancia de la clase profesor");
        Profesor profesor = new Profesor("Deyanira", "Saray", "Matematicas");
        profesor.setEdad(35);
        profesor.setEmail("profesor@correo.com");


//        imprimir(alumno);
        imprimir(alumnoInternacional);
//        imprimir(profesor);


    }

    public static void imprimir(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre()
                + ", Apellido:  " + persona.getApellido()
                + ", Edad: " + persona.getEdad()
                + ", Email: " + persona.getEmail());


        if (persona instanceof Alumno) {
            System.out.println("Imprimir los datos del tipo Alumno");
            System.out.println("Institucion: " + ((Alumno) persona).getInstritucion());
            System.out.println("Nota matematicas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota Castellano: " + ((Alumno) persona).getNotaCastellano());




            if (persona instanceof AlumnoInternacional) {
                System.out.println("Imprimir los datos del tipo Alumno internacional");
                System.out.println("Nota idioma: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("País: " + ((AlumnoInternacional) persona).getPais());

            }

            System.out.println("==========================Promedio================================");
            System.out.println(((Alumno) persona).calcularPromedio());
            System.out.println("==================================================================");


        }
        if (persona instanceof Profesor) {
            System.out.println("Imprmir datos del tipo Profesor");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());

        }
        System.out.println("===========================Sobre estritura de metodos===================================");
        System.out.println(persona.saludar());
        System.out.println("==============================================================");


    }
}
