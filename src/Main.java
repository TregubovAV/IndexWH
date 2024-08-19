public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 84;
        double height = 1.78;
        double bmi = service.calculate(weight, height);
        System.out.println("Ваш вес на сегодня:" + weight + " кг");
        System.out.println("Ваш рост на сегодня:" + height + " м");
        System.out.println("Ваш индекс массы теле: " + bmi);
    }
}