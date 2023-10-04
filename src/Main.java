public class Main {

    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        double weight = 54; // вес в кг
        double height = 1.70; // рост в метрах

        int bmi = bmiService.calculate(weight, height);

        System.out.println("BMI: " + bmi); // BMI: 18
    }

}