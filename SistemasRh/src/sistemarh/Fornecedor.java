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
public class Fornecedor{
    private int codigoFornedor;
    private char nomeFisico, nomeJuridico;
    
    public int getCodigoFornedor() {
        return codigoFornedor;
    }

    public void setCodigoFornedor(int codigoFornedor) {
        this.codigoFornedor = codigoFornedor;
    }

    public char getNomeFisico() {
        return nomeFisico;
    }

    public void setNomeFisico(char nomeFisico) {
        this.nomeFisico = nomeFisico;
    }

    public char getNomeJuridico() {
        return nomeJuridico;
    }

    public void setNomeJuridico(char nomeJuridico) {
        this.nomeJuridico = nomeJuridico;
    }
  
}
