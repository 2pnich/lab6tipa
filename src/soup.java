import java.util.Scanner;

public class soup extends dish implements Inout{
    public soup() {
        this.setType("type");
        this.setPrice(0);
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        while (!getType().equalsIgnoreCase("борщ") && !getType().equalsIgnoreCase("харча") && !getType().equalsIgnoreCase("-")) {
            System.out.println("Введите вид супа(борщ/харча/-");
            String type = in.nextLine();
            setType(type);
        }
        System.out.println("Введите цену супа");
        float price = in.nextFloat();
        setPrice(price);
    }

    public void output() {
        System.out.println("Вид супа: " + getType() + " цена: " + getType());
    }
}
