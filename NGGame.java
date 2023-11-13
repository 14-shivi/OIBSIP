import java.util.Scanner; 

public class NGGame {
     
        public static void main(String[] args) 
        {
           System.out.println("\nLet's play a game.  I'll pick a number between 1 and 100, and you try to guess it.");
            playGame();  
          
        }         
        
        static void playGame()
        {
            int computersNumber; 
            int usersGuess;      
            int guessCount;      
            computersNumber = (int)(100 * Math.random()) + 1;
            guessCount = 0;
            System.out.println();
            System.out.println("What is your first guess?");
            Scanner sc= new Scanner(System.in);   
            
            while (true) {
               usersGuess = sc.nextInt();  
               guessCount++;
              
                if (usersGuess == computersNumber) {
                  System.out.println("\nYou got it in " + guessCount + " guesses!  My number was " + computersNumber);
                          System.out.println("Your score is "+((10-guessCount)*10)+" out of 100");
                          System.out.println("Thankyou for playing");
                  break;  
               }
                if (guessCount == 10) {
                  System.out.println("You didn't get the number in 10 guesses.");
                  System.out.println("You lose.  My number was " + computersNumber);
                  System.out.println("Your score is "+((10-guessCount)*10)+" out of 100");
                  System.out.println("\n Thankyou for playing");
                  break;  
               }
              
                if (usersGuess < computersNumber)
                  System.out.println("That's too low.  Try again:");
              
                else if (usersGuess > computersNumber)
                System.out.println("That's too high.  Try again:");
            }
           
            System.out.println();
        
        } 
                    
     } 