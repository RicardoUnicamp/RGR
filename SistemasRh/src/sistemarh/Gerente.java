/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh;

public class Gerente extends Funcionario {

    public Gerente(int cod, String name, int age) {
        super(cod, name, age);
    }
    
    @Override
    public double getPromocao() {
        return this.salario*5;
}
    
    
}
