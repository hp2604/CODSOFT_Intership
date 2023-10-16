 
    import java.util.*;

   class GuessGame {
    private int number, score[],turn[],i, attems;
    Random rc = new Random();
    Scanner sc = new Scanner(System.in);
    boolean gameOver = false;

    //initalize the turn and score.
    public GuessGame(int n) {

    score = new int[n];
    attems = 3 * n;

    }
    //Generate Random number .
    public void setNumber() {
    number = rc.nextInt(100);
    int rem = number / 10;
    int lowerLimit = rem * 10;
    int highLimit = lowerLimit + 20;
    System.out.println("Random Number Lies between " + lowerLimit + " to  " + highLimit);
    }

    //check Game Over 
    public boolean game(int number, int player) {

    if (attems > 0) {
        attems--;

        if (this.number == number) {

            score[player] = score[player] + 1;
            System.out.println("Correct Answer");
            setNumber();
        } else {

            if (this.number < number) {
                System.out.println("Number is too high");
            } else {
                System.out.println("Number is loo low");
            }

        }

    }
    if (attems == 0) {
        System.out.println("Random Number is : " + this.number);
        printScore();
        return true;
    }

    return false;

    }

    // Start the Game
    public void startGame(int n)
    {
    turn = new int[n];
    for (i = 0; i < n; i++) {
        turn[i] = 3;

    }
        while (!gameOver) {
            for (i = 0; i < n; i++) {
                if (turn[i] > 0) {

                    System.out.print(i + 1 + " player  your guess : ");
                    int guess = sc.nextInt();
                    gameOver = game(guess, i);

                }

            }
            if (gameOver == false && i < n) {
                turn[i] = turn[i] - 1;
            }

        }
    }

    // Print Scroe Board 
    public void printScore() {

    for (int i = 0; i < 20; i++) {
        System.out.print("---");
    }
    System.out.println();
    System.out.println("Score Board");
    for (int i = 0; i < score.length; i++) {

        System.out.println(i+1  + " player score " + score[i]);

    }
    for (int i = 0; i < 20; i++) {
        System.out.print("---");
    }
    System.out.println();
    }

    }

    public class NumberGame {

    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    int noPlayer,ch=1;
    System.out.println("Guess Number Game");

    do {
            System.out.print("Enter the number of player: ");
            noPlayer = sc.nextInt();
            GuessGame rn = new GuessGame(noPlayer);
            rn.setNumber();
            rn.startGame(noPlayer);
            System.out.println("1. Restart \n 2.Exist ");
            ch = sc.nextInt();                                                
        } while (ch != 2);
    System.out.println("Thank You");
    sc.close();

    }
    }