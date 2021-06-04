/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopessoa;

/**
 *
 * @author pzapata
 */
public class ProjetoPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Joao");
        p1.setIdade(20);
        p1.setSexo("M");
        
        p2.setNome("Maria");
        p2.setIdade(22);
        p2.setSexo("F");
        
        
        p3.setNome("Jose");
        p4.setNome("Manoel");
                
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
    
}
