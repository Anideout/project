
package model;

import controller.Persona;
import java.util.ArrayList;

/**
 *
 * @author Fernando Sierra
 */
public class GestionPersona {
    //crear un atributo tipo ArrayList
    private ArrayList<Persona> personas = new ArrayList();

    //crear getter and setter del array
    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
    
    //metodos customer
    
    //metodo para agregar personas
    public void agregarPersona(Persona persona){
        personas.add(persona);
        System.out.println("persona " + persona.getNombre() + " ha sido agregada");
    }
    
    //metodo para listar personas
    public void listarPersonas(){
        for(Persona p : personas){
            System.out.println(p);
        }
    }
    
    //metodo para eliminar personas
    public void eliminarPersona(Persona persona){
        personas.remove(persona);
        System.out.println("se ha eliminado exitosamente");
    }
    
}
