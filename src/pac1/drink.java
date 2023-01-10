package pac1;

import java.util.Scanner;

public class drink {
    public String drink_type;
    public float drink_volume;
    public float drink_price;
    //ПРОТЕКТЕД//
    protected static String cofType;
    protected static String cofSugar;

    public drink() {
        this.drink_type = "type";
        this.drink_volume = 0;
        this.drink_price = 0;
    }

    public drink(String type, String sugar) {
        this.drink_type = "кофе";
        this.drink_volume = 180;
        this.drink_price = 60;
        cofType = type;
        cofSugar = sugar;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        while (!drink_type.equalsIgnoreCase("кофе") && !drink_type.equalsIgnoreCase("кола") && !drink_type.equalsIgnoreCase("-")) {
            System.out.println("Введите вид напитка(кофе/кола/-)");
            drink_type = in.nextLine();
        }

        if (drink_type.equalsIgnoreCase("кофе")) {
            Coffee cof = new Coffee();
            cof.Input();
        }
        else {
            System.out.println("Введите объем напитка");
            drink_volume = in.nextFloat();
            System.out.println("Введите цену напитка");
            drink_price = in.nextFloat();
        }
    }

    public void output() {
        Coffee.cofDisplay(cofType, cofSugar);
    }
}
