import java.util.Random;
import java.util.Scanner;

class Game{
    private int number;
    private int userInput;
    private int noOfGuesses = 0;
    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
    Game(){
        Random r = new Random();
        number = r.nextInt(101);
    }
    public void takeUserInput(){
        Scanner s = new Scanner(System.in);
        userInput = s.nextInt();
    }
    boolean isCorrectNumber() {
        noOfGuesses++;
        if (number == userInput) {
            System.out.format("You Guessed Right, the number is %d\n You Guessed in %d Attempts", number, noOfGuesses);
            return true;
        } else if (number < userInput) {
            System.out.println("Try a Number smaller then this!");
        } else if (number > userInput) {
            System.out.println("Try a Number bigger then this!");
        } return false;
    }
}
public class guessthenumber {
   
    public static void main(String[] args) {
        System.out.println("Guess the number between 1 to 100");
        Game g = new Game();
        boolean b = false;
        while(!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}