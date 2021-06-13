package chapter.two;

//https://www.w3schools.com/graphics/tryit.asp?filename=trysvg_circle

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SvgCircle1 {

    public static void main(String[] args) {
        int x = 100;
        int y = 100;
        double r = ThreadLocalRandom.current().nextDouble(10,20);
        System.out.println("<svg height =\"400\" width=\"1000\">");
        System.out.println("<circle cx=\"" + x + "\" cy=\"" + y + "\" r=\"" + r + "\" />");
        System.out.println("</svg>");

        System.out.println("\n######################################\n");

        System.out.println("Wertebereich bei int 1000000 * 1000000 = " + 1000000 * 1000000);

        System.out.println("\n######################################\n");

        System.out.println("Genauigkeit bei:");
        System.out.print("0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 - 0.1 = ");
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 - 0.1);

        System.out.println("\n######################################\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("cx (ganze Zahl bitte) = ");
        int cx = scanner.nextInt();
        System.out.println("cy (ganze Zahl bitte) = ");
        int cy = scanner.nextInt();
        System.out.println("<svg height =\"400\" width=\"1000\">");
        System.out.println("<circle cx=\"" + cx + "\" cy=\"" + cy + "\" r=\"" + r + "\" />");
        System.out.println("</svg>");

        System.out.println("\n######################################\n");


        System.out.println("\n######################################\n");





    }
}
