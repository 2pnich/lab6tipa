import java.util.Scanner;

public class shaurma extends dish implements Inout{

    private float sh_price;

    public shaurma() {
        this.setType("type");
        this.setWeight(0);
        this.setPrice(0);
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Введите вид шаурмы(пролетарская/студенческая/-)");
            String set = in.nextLine();
            setType(set);
        } while (!getType().equalsIgnoreCase("пролетарская") && !getType().equalsIgnoreCase("студенческая") && !getType().equalsIgnoreCase("-"));

        System.out.println("Введите вес шаурмы");
        float weight = in.nextFloat();
        setWeight(weight);
        System.out.println("Введите цену шаурмы");
        float price = in.nextFloat();
        setPrice(price);
    }

    @Override
    public void output() {

    }

    public String toString() {
        return "Вид фри: " + getType() + " количества: " + getWeight()  + " цена: " + getPrice() ;
    }

    public float getPrice() {
        return sh_price;
    }

}
