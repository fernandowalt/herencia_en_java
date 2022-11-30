package ejemplo;

import org.walter.pooherencia.Alumno;
import org.walter.pooherencia.AlumnoInternacional;
import org.walter.pooherencia.Persona;
import org.walter.pooherencia.Profesor;

public class EjemploHerenciaTostring {

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


        imprimir(alumno);
        imprimir(alumnoInternacional);
        imprimir(profesor);


    }

    public static void imprimir(Persona persona) {
        System.out.println(persona);



    }
}
