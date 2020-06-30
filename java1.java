//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.PrintStream;

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void Saludar() {
        PrintStream var10000 = System.out;
        this.nombre.println(this.edad);
    }
}
