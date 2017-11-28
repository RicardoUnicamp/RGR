package sistemarh;


import Interface.TelaLogin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Giovana
 */
public class SistemaRH extends TelaLogin{ {
    initComponents();

}
    public static void main(String[] args) {
                String arq = "teste.txt";
    String texto =("Salario-2000 ");
        
     /*   if(Arquivo.Write(arq, texto))
            System.out.println("Arquivo salvo com sucesso!");
        else
            System.out.println("Erro ao salvar o arquivo!");*/
        
    Gerente funcionario1 = new Gerente(0,"José",60);
    funcionario1.setSalario("5000.0");
    System.out.println("O funcionário " + funcionario1.getNome() + " tem o seguinte salário: ");
    System.out.println("Salario "+funcionario1.getSalario());
    System.out.println("Promocao "+funcionario1.getPromocao());
    
    Funcionario funcionario2 = new Funcionario(1,"Giovana",22);
    funcionario2.setSalario("1000.0");
    System.out.println("\nSalario "+funcionario2.getSalario());
    System.out.println("Promocao "+funcionario2.getPromocao());
    
    Funcionario funcionario3 = new Funcionario(2,"Antonio",18);
    funcionario3.setSalario("2000.0");
    System.out.println("\nSalario "+funcionario3.getSalario());
    System.out.println("Promocao "+funcionario3.getPromocao());
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
