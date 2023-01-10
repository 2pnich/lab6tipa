import java.util.Scanner;

public class fries extends dish implements Inout {
    private int fries_quantity;


    public fries() {
        this.setType("type");
        this.fries_quantity = 0;
        this.setPrice(0);
    }

    //////////TOSTRING////////////
    public String toString() {
        return "Вид фри: " + getType() + " количества: " + fries_quantity + " цена: " + getPrice() ;
    }
    /////////////////////////////

    public void input() {
        Scanner in = new Scanner(System.in);
        while (!getType().equalsIgnoreCase("фри") && !getType().equalsIgnoreCase("деревенская") && !getType().equalsIgnoreCase("-")) {
            System.out.println("Введите вид картошки(фри/деревенская)");
            String type = in.nextLine();
            setType(type);
        }
        System.out.println("Введите количество фри");
        fries_quantity = in.nextInt();
        System.out.println("Введите цену фри");
        float price = in.nextFloat();
        setPrice(price);
    }

    public void output() {
        System.out.println("Вид фри: " + getType() + " количества: " + fries_quantity + " цена:" + getPrice());
    }
}
