public class BmiService {

    public int calculate(int weight, double height) {
        double bmI = weight / (height * height);

        return (int) bmI;
    }
}
