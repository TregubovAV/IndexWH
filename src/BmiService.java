public class BmiService {

    public double calculate(int weight, double height) {
        double bmI = weight / (height * height);

        return (int) bmI;
    }
}