package com.company;
import java.util.Random;
import java.util.Scanner;

class Game
{
    private int generatedNo;
    private int userGuess;
    private int totalGuesses;
    Scanner sc = new Scanner(System.in);

    Game()
    {
        Random rand = new Random();
        generatedNo = rand.nextInt(11);
    }
    void takeUserInput()
    {
        System.out.print("Enter Your Guess : ");
        userGuess = sc.nextInt();
    }
    void setGuess()
    {
        totalGuesses++;
    }
    boolean isCorrectNumber()
    {
        if(generatedNo == userGuess)
        {
            System.out.println("You Guess it Correctly");
            System.out.println("Your Total Guesses : "+totalGuesses);
            return false;
        }
        else if(generatedNo > userGuess)
        {
            System.out.println("Your Guess is Smaller than Actual Number");
            setGuess();
            return true;
        }
        else if(generatedNo < userGuess)
        {
            System.out.println("Your Guess is Larger than Actual Number");
            setGuess();
            return true;
        }
        else {
            return true;
        }
    }
}

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Game game = new Game();
        boolean a = true;
        System.out.println("Guess the Number between 0-10");
        System.out.println("------------------------------");
        while (a) {
            game.takeUserInput();
            a = game.isCorrectNumber();
        }
    }
}
