import java.util.Scanner;
/**
 * This program will prompt the user to enter in a positive integer. It will then calculate the sum from 1 up to that number.
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for a number 
    System.out.println("Please enter an integer to count down to");

    // declare a variable for users input
    int number = input.nextInt();

    // create a variable to keep track of what number we are on
    int count = 1;

    // the accumulator to add the count into
    int total = 0;

    while(count <= number){

      // add the numbers as we go into total
      total = total + count;
      
      // add 1 tp out count to increase it
      count = count + 1;
    }
    // print the sum to the screen
    System.out.println("The sum from 1 - " + number + " is " + total);
  }
}
