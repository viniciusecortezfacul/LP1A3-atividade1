/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca.ifsp.classes;

import heranca.ifsp.superclasse.Mamifero;

/**
 *
 * @author IFSP
 */
public abstract class Aquatico extends Mamifero {
    private boolean nada;
    private float profundidadeAtingida;
    
    public Aquatico(){
        this.nada = true;
    }

    public boolean isNada() {
        return nada;
    }

    public void setNada(boolean nada) {
        this.nada = nada;
    }

    public float getProfundidadeAtingida() {
        return profundidadeAtingida;
    }

    public void setProfundidadeAtingida(float profundidadeAtingida) {
        this.profundidadeAtingida = profundidadeAtingida;
    }
    
    
    
    
    
}
