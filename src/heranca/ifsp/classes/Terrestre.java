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
public abstract class Terrestre extends Mamifero{
    private boolean anda;
    private boolean temPatas;
   public Terrestre(){
       
   }

    public boolean isAnda() {
        return anda;
    }

    public void setAnda(boolean anda) {
        this.anda = anda;
    }

    public boolean isTemPatas() {
        return temPatas;
    }

    public void setTemPatas(boolean temPatas) {
        this.temPatas = temPatas;
    }
    
}
