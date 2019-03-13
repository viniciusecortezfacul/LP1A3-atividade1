/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca.ifsp.classes;

/**
 *
 * @author IFSP
 */
public class Homem extends Terrestre{
    private boolean trabalha;
    private boolean raciocina;
    public Homem(){
        this.trabalha = true;
        this.raciocina = true;
    }

    public boolean isTrabalha() {
        return trabalha;
    }

    public boolean isRaciocina() {
        return raciocina;
    }
    
}
