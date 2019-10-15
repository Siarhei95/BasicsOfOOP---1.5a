//Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
//(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы
//и упаковка.

package task1_5a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logic logic = new Logic();
        Flowers flowers = new Flowers("Цветочница");
        logic.addFlowers(new Flowers("Розы","белые",5));
        logic.addFlowers(new Flowers("Тюльпаны","красные",3));
        logic.addFlowers(new Flowers("Лилии","белые",7));
        logic.addFlowers(new Flowers("Архидеи","бордовые",6));

        System.out.println("Flowers that are on sale: \n"); //выведем информацию о цветах
        System.out.println(logic.getFlowersList());

        Boxes boxes = new Boxes("Виды упоковок",4);
        logic.addBoxes(new Boxes("Пленка"));
        logic.addBoxes(new Boxes("Бумага"));
        logic.addBoxes(new Boxes("Лента"));
        logic.addBoxes(new Boxes("нет"));

        System.out.println("\nTypes of packaging: \n"); //выведем информацию об упаковке
        System.out.println(logic.getPackingList());

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the required flowers: "); //выбрать требуемые цветы с кансоли
        String finder1 = scanner.next();
        System.out.print("\nEnter the required packing: "); //выбрать требуемую упаковку с кансоли
        String finder2 = scanner.next();
        logic.getNecessaryFlowers(finder1);
        logic.getNecessaryPacking(finder2);
    }
}
