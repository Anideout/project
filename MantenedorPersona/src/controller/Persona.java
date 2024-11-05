
package controller;

/**
 *
 * @author Fernando Sierra
 */
public class Persona {
    //atributos de la clase
    private String rut, nombre, apellido;
    private int edad;

    public Persona() {
    }

    public Persona(String rut, String nombre, String apellido, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\n rut: " + rut + 
               "\n nombre: " + nombre + 
               "\n apellido: " + apellido + 
               "\n edad: " + edad;
    }
    
    
    
    
}
