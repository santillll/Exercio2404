import java.util.Scanner;

public class ValidadorTriangulo {

    public static void main(String[] args) {
        //Declaração de variáveis
        int a, b, c; //Lados de um triângulo

        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação
        System.out.println("\n\t\t\t - - Validador de Triângulo - - \n");

       //Entradas
       System.out.print("Informe o lado a:");
       a = entrada.nextInt();
       System.out.print("Informe o lado b:");
       b = entrada.nextInt();
       System.out.print("Informe o lado c:");
       c = entrada.nextInt();

       //Processamento
       if ((a < (b+c))&&(b <(a+c))&&(c <(a+b))){
              //É triângulo
              System.out.printf("\n%d, %d e %d formam triângulo!\n", a, b, c);
       
       
              if((a == b) || (b == c) || (a == c)){
               System.out.println("Triângulo Equilátero!");
            } else if((a == b) &&  (b == c)){
               System.out.println("Triângulo Isóceles!");
            }else {
                System.out.println("Triângulo Escaleno!");

            }
            } else 



              //Não é triângulo
            System.out.printf("\n%d, %d e %d Não formam triângulo! \n", a,  b, c);
        
                        
        }


    
    
    
    }




