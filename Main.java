import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    //1.    Faça um programa que receba dois numeros inteiros e gere os números inteiros que estão no intervalo compreendido por eles.

   System.out.println("-----Questão 1-----");

    int valor1 =0;
    int valor2 =0;

   System.out.println("\n Digite dois valores");
   System.out.println("\n Insira um valor");
   Scanner sc = new Scanner(System.in);
   valor1 = sc.nextInt();
   
   System.out.println("\n Insira outro valor");
   Scanner v2 = new Scanner(System.in);
   valor2 = v2.nextInt();

   System.out.println("\n_________________________");

   while(valor1 <= valor2){
     System.out.println(valor1);
     valor1++;

   }

   System.out.println("_________________________");

   
   //2.    Faça um programa (usando IF) que peça um valor entre 0 e 10. Mostre uma mensagem caso valor seja inválido e continue pedindo até que o usuário informe um valor válido.

   System.out.println("\n \n -----Questão 2-----");
    
   int v3;
   
   System.out.println("\n Digite um valor entre 0 e 10");
   Scanner questao2 = new Scanner(System.in);
   v3 = questao2.nextInt();

    
   if(v3 > 11){
      System.out.println("Seu valor é invalido");
    }else{
      System.out.println("Valor valido !");
   }
  
   

   //3.    Escreva um algoritmo  que imprima na tela os números de 1 até 20, um ao lado do outro. Depois modifique o programa para que ele mostre os números uma abaixo do outro.


   System.out.println("\n \n -----Questão 3-----");
 
   int valor3=1;
   int valor4=20;
   System.out.println("1-2-3-4-5-6-7-8-9-10-11-12-13-14-15-16-17-18-19-20");

   while(valor3 <= valor4){
     System.out.println(valor3);
     valor3++;
   } 

   /*4.    Escreva um algoritmo que seja capaz de gerar a tabuada de multiplicar de qualquer número inteiro entre 1 e 10. O usuário deve  digitar qual número ele deseja ver a tabuada. Deve ser exibido assim: 
   Tabuada de 5:
   5 x 1 = 5
   5 x 2 = 10
   ...
   5 x 10 = 50

   */
   System.out.println("\n \n -----Questão 4-----");

   int funcionando;
   System.out.println("Escolha a Tabuada de 1 a 10");
   Scanner q4 = new Scanner(System.in);
   funcionando = q4.nextInt();

   for (int t = 0; t <= 10; t++){
      System.out.println(funcionando + "x" + t + "=" + (funcionando*t));
    }

   //5.    Faça um programa que leia um nome de usuário e sua senha, e não aceite a senha igual ao nome do usuário, mostrando mensagem de erro e solicite novamente.

   /*
   System.out.println("\n \n -----Questão 5-----");
   
   char == 'oi';
   System.out.println("Insira seu usuario: ");
   Scanner user = usuario.nextChar(System.in);
   user=usuario.nextChar;

   System.out.println("Insira seu usuario");
   int pass;
   Scanner q5 = new Scanner(System.in);
   pass = q5.nextInt();
   
   System.out.println("Digite a senha");
   int se


   TENTEI FAZER A 5 QUESTAO MAS NAO CONSEGUIR DESENVOLVER POR CAUSA DO COMANDO STRING / CHAR QUE NAO ESTAVA INDO.
   

  

   





   */

  }
}