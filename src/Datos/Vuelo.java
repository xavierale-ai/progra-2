/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author fioro
 */
public class Vuelo
{
    ColaPrioridad economico;
    ColaPrioridad oro;
    ColaPrioridad platino;
    ColaPrioridad especial;
    String destino;
    int cantidad;

    /**
     *
     * 
     * @param destino
     */
    public Vuelo(String destino) {
        this.economico = new ColaPrioridad();
        this.oro = new ColaPrioridad();
        this.platino = new ColaPrioridad();
        this.especial = new ColaPrioridad();
        this.destino = destino;
        int cantidad = 0;
    }

    public Vuelo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ColaPrioridad getEconomico() {
        return economico;
    }

    public void setEconomico(ColaPrioridad economico) {
        this.economico = economico;
    }

    public ColaPrioridad getOro() {
        return oro;
    }

    public void setOro(ColaPrioridad oro) {
        this.oro = oro;
    }

    public ColaPrioridad getPlatino() {
        return platino;
    }

    public void setPlatino(ColaPrioridad platino) {
        this.platino = platino;
    }

    public ColaPrioridad getEspecial() {
        return especial;
    }

    public void setEspecial(ColaPrioridad especial) {
        this.especial = especial;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    
    
    
    
}
