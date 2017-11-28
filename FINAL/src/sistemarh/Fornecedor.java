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
//import sun.util.logging.PlatformLogger;

/**
 *
 * @author Giovana
 */
public class Fornecedor{
    private String codigoFornedor;
    private String nomeFisico, nomeJuridico;
    
    public String getCodigoFornedor() {
        return codigoFornedor;
    }

    public void setCodigoFornedor(String codigoFornedor) {
        this.codigoFornedor = codigoFornedor;
    }

    public String getNomeFisico() {
        return nomeFisico;
    }

    public void setNomeFisico(String nomeFisico) {
        this.nomeFisico = nomeFisico;
    }

    public String getNomeJuridico() {
        return nomeJuridico;
    }

    public void setNomeJuridico(String nomeJuridico) {
        this.nomeJuridico = nomeJuridico;
    }
    
    public String salvar(){
        try {
            FileWriter fw = new FileWriter("fornecedores.txt", true); //true: o conteudo será acrescentado e não substituido
            PrintWriter pw = new PrintWriter(fw); //escreve o conteudo num arquivo
            pw.println("Nome Fisico: " + this.nomeFisico);
            pw.println("Nome Juridico: " + this.nomeJuridico);
            pw.println("CNPJ: " + this.codigoFornedor);
            
            pw.flush();
            pw.close();
            
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Funcionario.class.getName()).log(Level.SEVERE,null, ex);
        }
        
        
        return null;
    }
  
}
