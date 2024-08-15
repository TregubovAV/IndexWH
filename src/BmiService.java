public class BmiService {

    public double calculate(double mass, double height) {
        double bmI = mass / (height * height);

        return (int) bmI;
    }
}