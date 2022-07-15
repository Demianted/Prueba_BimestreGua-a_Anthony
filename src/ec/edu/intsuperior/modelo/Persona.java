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
public class Persona {
   private String nombre1;
   private String nombre2;
   private String apellido1;
   private String apellido2;
   private int ci;
   private String Numerotelefonico;
   private String correoelectronico;
   private Date Fechadenacimiento;
  
   
   public Persona (){
   
   }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public void setNumerotelefonico(String Numerotelefonico) {
        this.Numerotelefonico = Numerotelefonico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public void setFechadenacimiento(Date Fechadenacimiento) {
        this.Fechadenacimiento = Fechadenacimiento;
    }
   
   
   
   

    public String getNombre1() {
        return nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public int getCi() {
        return ci;
    }

    public String getNumerotelefonico() {
        return Numerotelefonico;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public Date getFechadenacimiento() {
        return Fechadenacimiento;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
   
 
    
}
