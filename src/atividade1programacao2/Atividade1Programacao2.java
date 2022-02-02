
package atividade1programacao2;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Atividade1Programacao2 {

    public static void main(String[] args) {
        int a , b, c , delta , d = -4, b2,v2;
        double r1,r2;
        
         Scanner ler = new Scanner(System.in);
         
         System.out.println("Insira o valor de 'a': ");
         a = ler.nextInt();
         while(a== 0){
        
          System.out.println("Valor de 'A' n pode ser igual a '0'!");
          System.out.println("Insira um Novo valor");
          a = ler.nextInt();
    }
        
          System.out.println("Insira o valor de 'b': ");
          b = ler.nextInt();
         
          System.out.println("Insira o valor de 'c': ");
          c = ler.nextInt();
         
          System.out.println("FOMULA DELTA - B² -4*A*C ");
          System.out.println("SUBSTITUINDO -  "+ b +"²"+d+"*"+a+"*"+c);
          
          b2= b*b;
          v2 = ((d)* (a)* (c));
          delta = (b2)+(v2);
          System.out.println("");
          System.out.println("VALOR DE DELTA:"+delta);
          
          if(delta < 0){            
             try{
               throw new ResultadoException();
             }catch(ResultadoException r){
              System.out.println(r.getMessage());
             }          
        
          }else if (delta >0){
              r1 = (-b + Math.sqrt(delta))/(2*a);
              r2 =(-b -  Math.sqrt(delta))/(2*a);
              
          System.out.println(" ");
          System.out.println("RAIZES DIFERENTE\n");
          System.out.println("A Raiz 1 de x :"+ r1);
          System.out.println("A Raiz 1 de x :" + r2);
          }
           if(delta == 0){
            double x;
            
            x = -b/(2*a);
            System.out.println("RAIZES IGUAIS \n");
            System.out.print("x' e x'' = " + x+"\n");
        }
          
    }
    
}
