//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.PrintStream;

public class PersonaEncapsulamiento {
    private String nombre;
    private int edad;

    public PersonaEncapsulamiento(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void Saludar() {
        PrintStream var10000 = System.out;
        this.nombre.println(this.edad);
    }
}
