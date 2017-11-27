/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh;

/**
 *
 * @author Ricardo  
 */
public class ControleBonificacao extends Exception {
    
    private float bonificacao;
    private float salario;

    public ControleBonificacao(float bonificacao, float salario) {
        this.bonificacao = bonificacao;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "O valor da " +bonificacao+ "é maior que o permitido!";
    }
    
    
    
}
