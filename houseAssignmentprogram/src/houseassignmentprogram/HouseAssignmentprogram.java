/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houseassignmentprogram;
import javax.swing.*;//import the swing package
import java.util.*;//import the utility package
/**
 *
 * @author ngazani
 */
public class HouseAssignmentprogram {
    

    public static void main(String[] args) {
       
       
        String input1,input2,input3, colour[]={"Blue","Red","White"}; //declaring input for each student and an array of colours
        Random ran = new Random();//declaring a random variable
       
        int randomColour1=ran.nextInt(colour.length); //declaring and assigning a variable to choose a random index within the color array
        int randomColour2=ran.nextInt(colour.length);//declaring and assigning a variable to choose a random index within the color array
        int randomColour3=ran.nextInt(colour.length);//declaring and assigning a variable to choose a random index within the color array
        int randomNumber1= ran.nextInt(9999); //declaring and assigning a variable to choose a random number from 0 - 9999
        int randomNumber2= ran.nextInt(9999); //declaring and assigning a variable to choose a random number from 0 - 9999
        int randomNumber3= ran.nextInt(9999); //declaring and assigning a variable to choose a random number from 0 - 9999
        
        input1=JOptionPane.showInputDialog(null,"Please enter the first students name"); //prompting for the first students name
        input2=JOptionPane.showInputDialog(null,"Please enter the seccond students name"); //prompting for the second students name
        input3=JOptionPane.showInputDialog(null,"Please enter the third students name"); //prompting for the third students name
        
        
        
        JOptionPane.showMessageDialog(null,"Students Belong to the following houses\n"
        +input1+" assigned to the " +colour[randomColour1]+ " house with student number " +colour[randomColour1]+randomNumber1+"\n" // display students name,random house and the random student number
        +input2+" assigned to the " +colour[randomColour2]+ " housewith student number " +colour[randomColour2]+randomNumber2+"\n"// display students name,random house and the random student number
        +input3+" assigned to the " +colour[randomColour3]+ " housewith student number " +colour[randomColour3]+randomNumber3+".");// display students name,random house and the random student number
        
    }
    
}
