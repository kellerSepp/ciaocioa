package chapter.three;

import java.util.Scanner;

public class AncorDomino {
    int number1;
    int number2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AncorDomino ancorDomino = new AncorDomino();
        ancorDomino.start(scanner);
    }

    public void start(Scanner scanner) {
        System.out.println("Number 1 (0-99): ");
        number1 = scanner.nextInt() % 100;
        System.out.println("Number 2 (0-99): ");
        number2 = scanner.nextInt() % 100;

        if(sharesDigit(number1,number2)){
            System.out.println("Both numbers share at least one digit!");
            return;
        }
        else  {
            System.out.println("Both numbers don't share any digit.");
        }
    }

    public boolean sharesDigit(int a, int b){
        //first digit of a and b
        int aFirstDigit = a / 10;
        int bFirstDigit = b / 10;
        //second digit if a and b
        int aSecondDigit = a % 10;
        int bSecondDigit = b % 10;

        //compare digits
        boolean sharesDigit = aFirstDigit == bFirstDigit
                ||  aFirstDigit == bSecondDigit
                || aSecondDigit == bFirstDigit
                || aSecondDigit == bSecondDigit;

        return sharesDigit;
    }

    public AncorDomino() {

    }
}
