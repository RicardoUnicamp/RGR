/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh;

/**
 *
 * @author Giovana
 */
public class Funcionario extends PessoaFisica {

    private String funcao;

    //Departamento;
    //cargo
    
    double salario;

    public Funcionario(int cod, String name, int age) {
        super(cod, name, age);
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getPromocao() {
        return this.salario*2;
}

}
