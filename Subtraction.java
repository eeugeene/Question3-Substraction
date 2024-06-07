import java.util.Scanner;
import java.util.Random;

public class Subtraction {
    
    public static void main(String[] args) {
        //scanner object for user input
        Scanner input = new Scanner(System.in);
        
        //generating random numbers
        Random rand = new Random();
        
        //generate two random single digit numbers
        int number1 = rand.nextInt(10); //random number between 0 and 9
        int number2 = rand.nextInt(10); 
        
        //number1 >= number2, swap if necessary
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        
        //prompt to student
        System.out.print("What is " + number1 + " - " + number2 + "? \n= ");
        
        //get student's answer
        int studentAnswer = input.nextInt();
        
        //calculate the correct answer
        int correctAnswer = number1 - number2;
        
        //check if the student's answer is correct and display the result
        if (studentAnswer == correctAnswer) {
            System.out.println("\nCorrect answer!\n");
        } else {
            System.out.println("\nIncorrect answer\n");
        }
        
        //close the scanner object
        input.close();
    }
}
