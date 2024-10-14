

package orientacaoObjetos;

import java.util.Scanner;

public class Repete {
    
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        Contar conta = new Contar(); 
        
        for (int pegaValor = 0; pegaValor < 20; pegaValor++) { 
            System.out.println("Digite a sua idade: ");
            int idade = obj.nextInt();
            
            System.out.println("Qual o seu gênero (M/F)? ");
            String genero = obj.next();
           
            if (idade >= 18) {
                conta.totalMaioresIdade++;
            }if (genero.equals("M")) {
                conta.numHomens(); 
            } else if (genero.equals("F")) {
                conta.numMulheres();
            } else {
                System.out.println("Este gênero é inválido!");
            }
        }
        System.out.println("------------------");
        System.out.println("Total de homens: " + conta.totalHomens);
        System.out.println("Total de mulheres: " + conta.totalMulheres);
        System.out.println("Total de maiores de idade: " + conta.totalMaioresIdade);
       
    }
}
