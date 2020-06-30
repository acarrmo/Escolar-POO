import java.util.ArrayList;

public class Main {
    public Main() {
    }

    public static void main(String[] arg) {
        Persona angelica = new Persona("Angelica", 29);
        angelica.nombre = "jose";
        System.out.println(angelica.nombre);
        angelica.Saludar();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        PersonaEncapsulamiento angel = new PersonaEncapsulamiento("Ángel", 18);
        System.out.println(angel.getNombre());
        System.out.println(angel.getEdad());
        angel.setNombre("Juanito");
        System.out.println(angel.getNombre());
        angel.setEdad(23);
        System.out.println(angel.getEdad());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        PersonaEncapsulamiento estudianteUno = new PersonaEncapsulamiento("Ali", 40);
        PersonaEncapsulamiento estudianteDos = new PersonaEncapsulamiento("Angélica", 50);
        PersonaEncapsulamiento estudianteTres = new PersonaEncapsulamiento("Sandra", 18);
        PersonaEncapsulamiento estudianteCuatro = new PersonaEncapsulamiento("Alejandra", 35);
        PersonaEncapsulamiento estudianteCinco = new PersonaEncapsulamiento("Tere", 28);
        PersonaEncapsulamiento estudianteSeis = new PersonaEncapsulamiento("Caro", 49);
        PersonaEncapsulamiento estudianteSiete = new PersonaEncapsulamiento("Citle", 52);
        PersonaEncapsulamiento estudianteOcho = new PersonaEncapsulamiento("Héctor", 67);
        PersonaEncapsulamiento estudianteNueve = new PersonaEncapsulamiento("Valeria", 67);
        PersonaEncapsulamiento estudianteDiez = new PersonaEncapsulamiento("Dan", 67);
        ArrayList<PersonaEncapsulamiento> estudiantes = new ArrayList();
        estudiantes.add(estudianteUno);
        estudiantes.add(estudianteDos);
        estudiantes.add(estudianteTres);
        estudiantes.add(estudianteCuatro);
        estudiantes.add(estudianteCinco);
        estudiantes.add(estudianteSeis);
        estudiantes.add(estudianteSiete);
        estudiantes.add(estudianteOcho);
        estudiantes.add(estudianteNueve);
        estudiantes.add(estudianteDiez);

        for(int i = 0; i < estudiantes.size(); ++i) {
            PersonaEncapsulamiento personas = (PersonaEncapsulamiento)estudiantes.get(i);
            personas.Saludar();
        }

    }
}