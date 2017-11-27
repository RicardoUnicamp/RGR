/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh;


public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String tipo;//ltda,sa micro empresa...

    public PessoaJuridica(int cod, String name, int age) {
        super(cod, name, age);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
