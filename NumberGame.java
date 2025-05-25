import java.util.Scanner;

public class NumberGame {
    public static void guessTheNumber()
    {
        Scanner sc = new Scanner(System.in);

        int totalRoundsWon = 0;
        int round = 1;
        final int MAX_ATTEMPTS = 5;

        System.out.println("----------WELCOME TO THE NUMBER GUESSING GAME!----------");
        System.out.println("RULES: ");
        System.out.println("1.You have to guess a number between 1 to 100.");
        System.out.println("2.You will get "+ MAX_ATTEMPTS + " attempts in each round.\n");


        boolean playAgain = true;

        while(playAgain)
        {
            int number = 1 + (int)(100*Math.random());
            int attempts = 0;
            boolean guessedCorrect = false;

            System.out.println("-----ROUND "+ round + " -----");

             for(int i = 0; i < MAX_ATTEMPTS; i++){

                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if(guess == number){
                    System.out.println(" YAYY!! YOU GOT IT IN "+ attempts + " attempt(S)!");
                    totalRoundsWon++;
                    guessedCorrect = true;
                    break;
                }

                else if (guess < number){
                    System.out.println("Your guess is too low.");

                }
                else {
                    System.out.println("Your guess is too high.");
                }
                
            }
            if(!guessedCorrect){
                System.out.println("You have used all " + MAX_ATTEMPTS + " attempts");
                System.out.println("The correct answer was: "+ number);
            }

                System.out.print("Do you want to play again? (yes/no): ");
                String response = sc.next();

                if(!response.equalsIgnoreCase("yes")) {
                    playAgain = false;
                    System.out.println("\nGAME OVER!");
                    System.out.println("Total Rounds played: " + round);
                    System.out.println("Rounds you won: "+ totalRoundsWon);
                    System.out.println("----------Thanks for playing----------");
                    
                }
                else {
                    round++;
                }
        }


        sc.close();
    }       

       
    public static void main(String[] args) {
        guessTheNumber();
    }
        
    
    
}
