/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class cliente extends Persona {
    public String nombre;
    public String telefono;
    public Date edad; 

    public cliente() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEdad(Date edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public Date getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Los datos del cliente son: \n"
                + "Nombre: "+getNombre ()+"\n"
                + "Telefono: "+getTelefono ()+"\n"
                +"Edad: "+getEdad();
                
        
    }

    public void setNombre2(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCorreo(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDireccion(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   }
        