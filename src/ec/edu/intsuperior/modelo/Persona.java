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
   private String Numerotelefonico;
   private Date edad;
  
   
   public Persona (){
   
   }

    public Persona(String nombre1, String nombre2, String apellido1, String apellido2, String Numerotelefonico, Date edad) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.Numerotelefonico = Numerotelefonico;
        this.edad = edad;
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



    public void setNumerotelefonico(String Numerotelefonico) {
        this.Numerotelefonico = Numerotelefonico;
    }


    public void setFechadenacimiento(Date Fechadenacimiento) {
        this.edad = Fechadenacimiento;
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



    public String getNumerotelefonico() {
        return Numerotelefonico;
    }

    public Date getFechadenacimiento() {
        return edad;
    }

    @Override
      public String toString() {
        return "los datos de la persona son: \n"
                + "Apellido y Nombre: "+getApellido1()+ " "+getApellido2()+ "\n"
                +getNombre1()+" "+getNombre2()+"\n"
                        + "celular:"+getNumerotelefonico()+"\n"
                + "Edad: "+getFechadenacimiento();
    }
   
 
    
}
