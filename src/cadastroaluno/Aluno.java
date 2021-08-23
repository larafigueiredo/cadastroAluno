/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroaluno;

import java.util.ArrayList;

/**
 *
 * @author Lara
 */
public class Aluno {
    
    String nome, cpf, situacao = "reprovado";
    ArrayList<Float>notasAluno = new ArrayList<>();
    float total;
    public Aluno(){
    }
    
    public Aluno (String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
       
    }
    void insereNotas (float nota){
        notasAluno.add(nota);
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    void listar (){
        System.out.println("\n Nome " + this.nome);
        System.out.println("\n Cpf " + this.cpf);
            for (int i =0; i <notasAluno.size();i++){
                System.out.println("Nota " + (i + 1) + ":" + this.notasAluno.get(i));
                
        
        }
        
    }
    
    void mostraSituacoes (){
        System.out.println("Nome " + this.nome);
        System.out.println("Total" + this.total);
        System.out.println("Situacoes" + this.situacao);
        
    
    }
    
    void calculaNotas(){
        for (float n:notasAluno){
            total += n;
            
        }
        if (total >=70){
            this.situacao = "aprovado";       
        
        }else{
            this.situacao = "reprovado";
        
        
        }
    
    }
}
