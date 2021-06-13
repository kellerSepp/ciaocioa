package chapter.three;

import java.util.Scanner;

public class CoinMachine {
    double money;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoinMachine coinMachine = new CoinMachine();
        coinMachine.start(scanner);
    }

    private void start(Scanner scanner) {
        System.out.println("Tell me the amount of money first please. e.g. 5.89");
        money = scanner.nextDouble();
        calculateCoins(money);
    }

    private void calculateCoins(double money) {
        int cents = (int)(money * 100);
        System.out.println("2€ : " + cents / 200);
        cents %= 200;
        System.out.println("1€ : " + cents / 100);
        cents %= 100;
        System.out.println("50 cents : " + cents / 50);
        cents %= 50;
        System.out.println("20 cents : " + cents / 20);
        cents %= 20;
        System.out.println("10 cents : " + cents / 10);
        cents %= 10;
        System.out.println("5 cents : " + cents / 5);
        cents %= 5;
        System.out.println("2 cents : " + cents / 2);
        cents %= 2;
        System.out.println("1 cent : " + cents / 1);
        cents %= 1;
    }

    public CoinMachine() {
    }
}
