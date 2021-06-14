package misc;

import java.util.Scanner;

public class QuickMethod {
    private final double conversionRateKgToPound;
    private enum ActivityLevel {LIGHT,MODERATE,VERY}

    public QuickMethod() {
        conversionRateKgToPound = 2.205;
    }

    public void quickMethodTerminalWizard(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight in kg.");
        double weight = scanner.nextDouble();

        ActivityLevel activityLevel;
        System.out.println("Please enter your activity Level.");
        System.out.println(
                  " 1 : " + ActivityLevel.LIGHT.name()
                + " 2 : " + ActivityLevel.MODERATE.name()
                + " 3 : " + ActivityLevel.VERY.name()
                );
        switch (scanner.nextInt()){
            case 2 -> activityLevel = ActivityLevel.MODERATE;
            case 3 -> activityLevel = ActivityLevel.VERY;
            default -> activityLevel = ActivityLevel.LIGHT;
        }
        double[] result = calculateCalorieGoal(weight, activityLevel);
        System.out.println("Results for kg: " + weight + " and " + activityLevel.name() + " activity." );
        System.out.println("Daily calorie need for fat loss: " + result[0]);
        System.out.println("Daily calorie need for maintenance: " + result[1]);

        scanner.close();
    }

    public double[] calculateCalorieGoal(double weight, ActivityLevel activityLevel){
        /*
        Fat Loss11–13 calories per pound of body weight
        Maintenance14–16 calories per pound of body weight
         */
        double weightPound = convertKgToPound(weight);
        double caloriesFatLoss = -1;
        double caloriesMaintenance = -1;
        switch (activityLevel) {
            case LIGHT -> {
                caloriesFatLoss = 11 * weightPound;
                caloriesMaintenance = 14 * weightPound;
            }
            case MODERATE -> {
                caloriesFatLoss = 12 * weightPound;
                caloriesMaintenance = 15 * weightPound;
            }
            case VERY -> {
                caloriesFatLoss = 13 * weightPound;
                caloriesMaintenance = 16 * weightPound;
            }
        }
        return new double[]{caloriesFatLoss,caloriesMaintenance};
    }

    private double convertKgToPound(double weight) {
        return weight * conversionRateKgToPound;
    }
}
