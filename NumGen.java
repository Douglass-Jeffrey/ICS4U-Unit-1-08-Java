/*
* Generates random numbers from user inputted parameters and stores them in an
* an array before outputting them.
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2020-11-30
* Class NumGen.
*/


// Import the Scanner
import java.util.Scanner;  

public class NumGen {

  /**
   * Function finds the min number in an array.
   */
  static int minFinder(int[] numArray) {

    //Defines the base minimum number
    int currentMin = numArray[0];

    // calculates the min by comparing them with eachother
    for (int minCounter = 0; minCounter < 10; minCounter++) {
      if (numArray[minCounter] < currentMin) {
        currentMin = numArray[minCounter];
      }
    }
    return currentMin;
  }

  /**
   * Function finds the max number in an array.
   */
  static int maxFinder(int[] numArray) {
    
    //Defines the base maximum number
    int currentMax = numArray[0];
    
    // calculates the max by comparing them with eachother
    for (int maxCounter = 0; maxCounter < 10; maxCounter++) {
      if (numArray[maxCounter] > currentMax) {
        currentMax = numArray[maxCounter];
      }
    }
    return currentMax;
  }

  /**
   * Creates the array of random numbers and prints them as well as the 
   * generated random numbers.
   */
  public static void main(String[] args) {

    // defines list of random numbers
    int[] numArray = new int[10];

    // generates random numbers and places them in the array
    for (int counter = 0; counter < 10; counter++) {
      numArray[counter] = (int) (Math.random() * 99 + 1);
    }

    // Calls maxNum function and minNum function to find max and min values
    int foundMin = minFinder(numArray);
    int foundMax = maxFinder(numArray);

    // Outputing the rolled number.
    for (int rollCounter = 0; rollCounter < 10; rollCounter++) {
      System.out.println(numArray[rollCounter]);
    }

    // Outputing the max and min numbers.
    System.out.println("Max number: " + foundMax);
    System.out.println("Min number: " + foundMin);
  }
}
