package ejemplo;

import org.walter.pooherencia.Alumno;
import org.walter.pooherencia.AlumnoInternacional;
import org.walter.pooherencia.Profesor;

public class EjemploHerencia {

    public static void main(String[] args) {


        System.out.println("==================Creando la instancia de la clase Alumno");
        Alumno alumno = new Alumno();
        alumno.setNombre("Walter");
        alumno.setApellido("Gomez");
        alumno.setInstritucion("Eduardo Umaña Mendosa");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);


        System.out.println("==================Creando la instancia de la clase alumno internacional");
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("Peter");
        alumnoInternacional.setApellido("Gosling");
        alumnoInternacional.setPais("Australia");
        alumnoInternacional.setEdad(15);
        alumnoInternacional.setInstritucion("eduardo umaña mendoza");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaCastellano(6.2);
        alumnoInternacional.setNotaHistoria(5.8);
        alumnoInternacional.setNotaMatematica(6.5);

        System.out.println("==================Creando la instancia de la clase profesor");
        Profesor profesor = new Profesor();
        profesor.setNombre("Deyanira");
        profesor.setApellido("Sarai");
        profesor.setAsignatura("Matematicas");

        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido() + "de la institución educativa " + alumno.getInstritucion());
        System.out.println(alumnoInternacional.getNombre() +
                "\n" + alumnoInternacional.getApellido() +
                "\n" + alumnoInternacional.getInstritucion() +
                "\n" + alumnoInternacional.getPais());
        System.out.println("Profesor " + profesor.getAsignatura() + ": " + profesor.getNombre() + " " + profesor.getApellido());


        Class clase = alumnoInternacional.getClass();

        while (clase.getSuperclass() != null) {

            String hija = clase.getName();
            String padre = clase.getSuperclass().getCanonicalName();

            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }


    }


}
