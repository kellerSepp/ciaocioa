package chapter.three;

import java.util.Scanner;

public class BootySharer {
    int bottles;
    int crewSize;
    int captainShare;

    public static void main(String[] args) {
        BootySharer bootySharer = new BootySharer();
        bootySharer.countShare();
    }

    public BootySharer() {

    }

    public void countShare(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ayyyyyy, how many bottles of treasure did we found Captain?");
        bottles = scanner.nextInt();
        captainShare = bottles / 2;
        System.out.println("So your share is: " + captainShare);
        System.out.println("Ayyyyy okay. And how many crew members are still alive, Captain?");
        crewSize = scanner.nextInt();
        int remainingBottles = bottles-captainShare;
        System.out.println("So if we want to share the remaining " + remainingBottles + " between our crew evenly, there'll be " + remainingBottles % crewSize + " bottles left.");
        if (remainingBottles % crewSize == 0){
            System.out.println("So we can all have an even share!");
        }
        else {
            System.out.println("So we won't have an even share. The remaining bottles will go into our trust funding system, Captain.");
        }
    }
}
