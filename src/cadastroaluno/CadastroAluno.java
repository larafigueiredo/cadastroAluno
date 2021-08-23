/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroaluno;
import java.util.Scanner;
public class CadastroAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int opc, qtdNotas;
       float nota = 0;
       Scanner input;
       String nome, cpf;
       Aluno novoAluno = new Aluno();
       Sala novaSala = new Sala();
       
       input = new Scanner(System.in);
       
        do {
            
            System.out.println("\n-----------------");
            System.out.println("MENU");
            System.out.println("1- Inserir aluno:");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Situações");
            System.out.println("4 - Sair");
            
            opc = input.nextInt();
            input.nextLine();
            
            switch (opc){
                case 1:
                    System.out.println("nome: ");
                    nome = input.nextLine();
                    System.out.println("cpf: ");
                   
                    cpf = input.nextLine();
                   
                    novoAluno = new Aluno(nome, cpf);
                    
                    System.out.println("Quantas notas você quer inserir");
                    qtdNotas = input.nextInt();
                    
                    for (int i=0; i < qtdNotas; i++){
                        System.out.println("\n Nota" + i);
                        nota = input.nextFloat();
                        novoAluno.insereNotas(nota);
                    }
                    novaSala.inserirAluno(novoAluno);
                    
                    break;
                case 2:
                    novaSala.listarAlunos();
                    
                    break;
                case 3:
                    novaSala.listarSituacoes();
                    break;
                default:
                    System.out.println("Opção inválida");
            
            
            }
            
        
        
        
        }while(opc!=0);
        
    }
    
}
