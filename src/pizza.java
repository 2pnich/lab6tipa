import java.util.Scanner;

public class pizza extends dish {

    private float pizza_diameter;

    public pizza() {
        this.setType("type");
        this.pizza_diameter = 0;
        this.setPrice(0);
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        while (!getType().equalsIgnoreCase("гавайская") && !getType().equalsIgnoreCase("пепперони") && !getType().equalsIgnoreCase("-")) {
            System.out.println("Введите вид пиццы(пепперони/гавайская/-");
            String type = in.nextLine();
            setType(type);
        }
        System.out.println("Введите диаметр пиццы");
        pizza_diameter = in.nextFloat();
        System.out.println("Введите цену пиццы");
        float price = in.nextFloat();
        setPrice(price);
    }

    public void output() {
        System.out.println("Вид пиццы: " + getType() + " диаметр: " + pizza_diameter + " цена: " + getPrice());
    }
}
