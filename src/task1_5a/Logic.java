package task1_5a;

import java.util.ArrayList;
import java.util.List;

public class Logic {
    private ArrayList<Flowers> flowersArrayList = new ArrayList<>();
    private ArrayList<Boxes> packingList = new ArrayList<>();

    void addFlowers(Flowers flowers) {
        flowersArrayList.add(flowers);
    }

    void addBoxes(Boxes boxes) {
        packingList.add(boxes);
    }

    public List<Flowers> getFlowersList() {
        List<Flowers> flowersList = new ArrayList<>(flowersArrayList);
        return flowersList;
    }

    public List<Boxes> getPackingList() {
        List<Boxes> packList = new ArrayList<>(packingList);
        return packList;
    }

    public List<Flowers> getNecessaryFlowers(String finder1) {
        List<Flowers> list1 = new ArrayList<>(flowersArrayList);
        for (Flowers c : flowersArrayList) {
            if (c.getFlowers().equals(finder1)) {
                list1.add(c);
                System.out.println("\nYour choice: \n" + c.getFlowers() + "!\t Color: " + c.getColor() + ",\t prise: " + c.getPrise()+"руб");
            }
        }
        return list1;
    }

    public List<Boxes> getNecessaryPacking(String finder2) {
        List<Boxes> list2 = new ArrayList<>(packingList);
        for (Boxes c : packingList) {
            if (c.getPacking().equals(finder2)) {
                list2.add(c);
                System.out.println("Packing will be: " + c.getPacking());
            }
        }
        return list2;
    }
}
