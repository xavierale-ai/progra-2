/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;


public class JavaApplication4 
{
    String nombre;
    String fecha;
    int pasaporte;
    String nacionalidad;
    String origen;
    String destino;
    String servicio;
    
    public JavaApplication4()
    {
        
    }
    
    public JavaApplication4(String pNombre, String pFecha,int pPasaporte,String pNacionalidad,String pOrigen,String pDestino,String pServicio)
    {
        this.nombre = pNombre;
        this.fecha = pFecha;
        this.pasaporte = pPasaporte;
        this.nacionalidad = pNacionalidad;
        this.origen = pOrigen;
        this.destino = pDestino;
        this.servicio = pServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }
}
