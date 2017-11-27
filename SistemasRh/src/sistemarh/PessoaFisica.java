/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh;


public class PessoaFisica extends Pessoa {
    private String rg;
    private String cpf;
    private String estadoCivil;

    public String getCpf() {
        return cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica(int cod, String name, int age) {
        super(cod, name, age);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
}
