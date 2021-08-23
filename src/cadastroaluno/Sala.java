/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroaluno;
import java.util.ArrayList;

public class Sala {
    
    ArrayList<Aluno> listaDeAlunos;
    
    public Sala(){
        this.listaDeAlunos = new ArrayList<>();
        
    
    }
    void inserirAluno(Aluno novoAluno){
        novoAluno.calculaNotas();
        listaDeAlunos.add(novoAluno);
        
    
    }
    void listarAlunos (){
        System.out.println("\n Lista de alunos");
        for (Aluno a:listaDeAlunos){
            a.listar();
            
        
        }
        
    
    }
    
    void listarSituacoes (){
        System.out.println("\n Lista de situacoes");
        for (Aluno s:listaDeAlunos){
            s.mostraSituacoes();
       
    
    }
}
}
