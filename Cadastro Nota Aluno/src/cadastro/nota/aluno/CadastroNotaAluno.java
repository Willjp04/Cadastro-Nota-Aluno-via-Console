/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.nota.aluno;

import java.util.Scanner;

/**
 *
 * @author PORTOMASTER
 */
public class CadastroNotaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do Aluno"); 
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do Aluno");
        float nota = teclado.nextFloat();
        System.out.printf("A nota do Aluno é %s %.1f \n",nome,nota);
   
    }
    
}
