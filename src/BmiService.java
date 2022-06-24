public class BmiService {

    public double calculate(double mass, double height) {
        double powHeight = 2;
        double bmi = mass / (double) Math.pow(height, powHeight);
        return bmi;
    }

}
