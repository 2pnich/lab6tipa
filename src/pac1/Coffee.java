//НАСДНИК

package pac1;

import java.util.Scanner;

public class Coffee extends drink  {

    public Coffee() {
        drink cof = new drink("американо", "нет");
    }

    protected void Input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите вид кофе");
        cofType = in.nextLine();
        System.out.println("Нужен сахар?да/нет");
        cofSugar = in.nextLine();
        System.out.println(cofType + " " + cofSugar);
    }

    static void cofDisplay(String type, String sugar) {
        //ВЫЗОВ БАЗОВОГО КОНСТРУКТОРА//
        drink cof = new drink(cofType, cofSugar);
        System.out.println("\nВид напитка: " + cof.drink_type + " объем: " + cof.drink_volume + " цена: " + cof.drink_price);
//        System.out.println("Вид кофе:" + type + " Сахар: " + sugar);
    }
}
