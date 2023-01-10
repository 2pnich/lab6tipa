import pac1.drink;

import java.util.Scanner;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        int option = 0, i = 0;

        Basket[] bas_one = new Basket[20];
        while (option != 5) {
            System.out.println("\nВвести заказ - 1");
            System.out.println("Вывести все заказы - 2");
            System.out.println("Выход - 3");
            Scanner in = new Scanner(System.in);

            /////TRY БЛОК/////
            try {
                option = in.nextInt();
                if (option > 5 || option < 1)
                    throw new OptionException("invalid range");
            } catch (InputMismatchException e) {
                System.err.println("Нужно вводить цифру!!!");
            } catch (OptionException e) {
                System.err.println("Диапазон 1-3");
            }
            ////////////////



            help res = new help();
            switch (option) {
                case (1):
                    // ОДНОМЕРНЫЙ МАССИВ ОБЪЕКТОВ //
                    bas_one[i] = new Basket();
                    bas_one[i].input();
                    bas_one[i].output();

                    Basket basket = new Basket();
                    basket = (Basket)bas_one[i].clone();
                    System.out.println("\n\nКЛОН\n");
                    basket.output();
//                    bas_one[i].sum(res);
//                    basket.payment(res);
                    i++;
                    Basket.counter_one++;
                    break;
                case (2):
                    for (int j = 0; j < Basket.counter_one; j++) {
                        bas_one[j].output();
//                        bas_one[j].sum(res);
                        System.out.println("\n");
                    }
                    break;
                case (3):
                    System.exit(0);
            }
        }
    }
}