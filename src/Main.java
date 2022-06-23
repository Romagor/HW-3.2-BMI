public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 85.5; // кг
        double height = 1.83; // м
        double bmi = service.calculate(mass, height);
        System.out.println(bmi);
    }
}
