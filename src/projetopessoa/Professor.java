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
public class Professor extends Pessoa {
    private String especialiddade;
    private float salario;
    
    public void receberAum (float aum){
        this.salario+= aum;
    }

    public String getEspecialiddade() {
        return especialiddade;
    }

    public void setEspecialiddade(String especialiddade) {
        this.especialiddade = especialiddade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
