// Guess.java
// Jia-hui Ma
// jma289
// pa2
// game where user gets 3 guesses for random integer

import java.util.Scanner;

class Guess{

   public static void main( String[] args ){

   int randomnumber = (int) (Math.random() * 10) + 1;
   int  userguess1, userguess2, userguess3;
   Scanner sc = new Scanner(System.in);

   System.out.println("\n");
   System.out.println("I'm thinking of an integer in the range 1 to 10.  You have three guesses.");
   System.out.println("\n");
   System.out.print("Enter your first guess: ");

   userguess1 = sc.nextInt();
    if (userguess1 == randomnumber){
       System.out.println("You win!");
       System.out.println("\n");
       System.exit(0);}
       else if (userguess1 > randomnumber){
         System.out.println("Your guess is too high.");
         System.out.println("\n");}
       else if (userguess1 < randomnumber){
         System.out.println("Your guess is too low.");
         System.out.println("\n");}

   System.out.print("Enter your second guess: ");
   userguess2 = sc.nextInt();
     if (userguess2 == randomnumber){
        System.out.println("You win!");
        System.out.println("\n");
        System.exit(0);}
        else if (userguess2 > randomnumber){
          System.out.println("Your guess is too high.");
          System.out.println("\n");}
        else if (userguess2 < randomnumber){
          System.out.println("Your guess is too low.");
          System.out.println("\n");}

   System.out.print("Enter your third guess: ");
   userguess3 = sc.nextInt();
     if (userguess3 == randomnumber){
        System.out.println("You win!");
        System.out.println("\n");
        System.exit(0);}
        else if (userguess3 > randomnumber){
          System.out.println("Your guess is too high.");
          System.out.println("\n");}
        else if (userguess3 < randomnumber){
          System.out.println("Your guess is too low.");
          System.out.println("\n");}

   System.out.println("You lose.  The number was " + randomnumber + ".");
   System.out.println("\n");


   }

}
