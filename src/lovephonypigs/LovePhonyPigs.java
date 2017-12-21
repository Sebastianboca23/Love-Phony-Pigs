/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lovephonypigs;
import java.util.Scanner;
/**
 *
 * @author 18442
 */
public class LovePhonyPigs {

    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
        System.out.println("Name a characters/persons > ");
        String person = in.nextLine();
        
        System.out.println("Name the second character/person > ");
        String person2 = in.nextLine();
        
        int count = 0;
        for (int i = 0; i < person.length(); i++) {
            if(person.charAt(i) == 'l' 
                    || person.charAt(i)=='o' 
                    || person.charAt(i)=='v' 
                    || person.charAt(i)=='e') {
               
                count ++;
            }
        
        }
        
        for (int i = 0; i < person2.length(); i++) {
            if(person2.charAt(i) == 'l' 
                    || person2.charAt(i)=='o' 
                    || person2.charAt(i)=='v' 
                    || person2.charAt(i)=='e') {
               
                count ++;
            }
        
        }
        
        if(count % 2 == 0){
            System.out.println("NO LOVE");
        }
        else{
            System.out.println("LOVE");
        }
        
        
       
    
    }
   
}  

        
        
    
    

