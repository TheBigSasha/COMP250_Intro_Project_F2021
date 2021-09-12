import java.util.Random;
import java.util.Scanner;

public class MathGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Math Quiz! Prepare to learn! First, enter a difficulty [1-200]");
        int difficulty = s.nextInt();
        System.out.println("You've picked difficulty " + difficulty + ", now choose your game!");

        // Hard coded list of games
        String[] games = new String[]{"Multiplication", "Addition", "Subtraction", "Division"};
        for(int i = 0; i < games.length; i++) {
            System.out.println("[" + i + "] - " + games[i]);
        }
        int gameIDX = s.nextInt();
        System.out.println("Welcome to " + games[gameIDX]);
        
        int questionNumber = 1;
        Random rand = new Random();

        String operator = "";
         switch (games[gameIDX]) {
            case "Multiplication":
                operator = "x";
                break;
        
            case "Addition":
                operator = "+";
                break;
        
            case "Subtraction":
                operator = "-";
                break;

            case "Division":
                operator = "/";
                break;

            default:
                break;
        }

        while(questionNumber < 30){
            int numOne = rand.nextInt(difficulty / 2 + questionNumber * 2); //We add questionNumber so it gets harder each time. This is optional. Makes it more spicy.
            int numTwo = rand.nextInt(difficulty / 2 + questionNumber * 2 - 1) + 1;  //So that we don't divide by zero :)
            System.out.println("Question " + questionNumber + ":");
            System.out.println(numOne + operator + numTwo);
            long timeStart = System.currentTimeMillis();
            int userAnswer = s.nextInt();
            int answer = 0;
            switch (games[gameIDX]) {
                case "Multiplication":
                    answer = numOne * numTwo;
                    break;
            
                case "Addition":
                    answer = numOne + numTwo;
                    break;
            
                case "Subtraction":
                    answer = numOne - numTwo;
                    break;
    
                case "Division":
                    answer = numOne / numTwo;
                    break;
    
                default:
                    break;
            }

            long timeEnd = System.currentTimeMillis();
            if(answer == userAnswer){
                System.out.println("You're right! Onto question " + questionNumber +"!");
                System.out.println("You only took " + (timeEnd - timeStart) / 1000. + " seconds!");
            }else{
                System.out.println("You're wrong! The right answer is " + answer);
            }
            questionNumber ++;
        }
    }
    
}
