/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giovana
 */
public class Funcionario extends PessoaFisica {

    private String funcao;

    //Departamento;
    //cargo
    
    String salario;

    public Funcionario(int cod, String nome, int age) {
        super(cod, nome, age);
    }
  

    /**
     *
     * @return
     */
    public String getFuncao() {
        return funcao;
    }
    /**
     *
     * @param funcao
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    /**
     *
     * @return
     */
    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
    
    public double getPromocao() {
        int sal = Integer.parseInt(salario);
        return sal*2;
}
    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }
   
    public String salvar(){
        try {
            FileWriter fw = new FileWriter("funcionarios.txt", true); //true: o conteudo será acrescentado e não substituido
            PrintWriter pw = new PrintWriter(fw); //escreve o conteudo num arquivo
            pw.println("Nome: " + this.getNome());
            pw.println("RG: " + this.getRg());
            pw.println("CPF: " + this.getCpf());
            pw.println("Estado Civil: " + this.getEstadoCivil());
            pw.println("Função: " + this.funcao);
            pw.println("Salario: " + this.salario);
            
            pw.flush();
            pw.close();
            
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Funcionario.class.getName()).log(Level.SEVERE,null, ex);
        }
        
        
        return null;
    }

}
