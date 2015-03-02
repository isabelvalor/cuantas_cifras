/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuantas_cifras;



/**
 *
 * @author usuario
 */
import java.lang.Math;
import java.util.Scanner;
public class Cuantas_cifras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner introducir= new Scanner(System.in);
       int num,cont;
       System.out.println ("introduce numero:");
       num=introducir.nextInt();
       num=Math.abs(num);
       cont=0;
       if(num==0){
           System.out.println ("1 cifra");
       }else{
           while(num>0){
               num=num/10;
               cont=cont+1;
           }if(cont==1){
               System.out.println (+cont+" cifra");
           }else{
               System.out.println (+cont+" cifras");
           }
       }
       
        
    }
    
}
