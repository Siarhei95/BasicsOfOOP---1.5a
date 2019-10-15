package task1_5a;

public class Flowers {
    private String flowers;
    private String color;
    private int prise;

    private String nameShop;

    public Flowers(String nameShop) {
        this.nameShop = nameShop;
    }

    public Flowers(String flowers, String color, int prise) {
        this.flowers = flowers;
        this.color = color;
        this.prise = prise;

    }

    public String getFlowers() {
        return flowers;
    }

    public String getColor() {
        return color;
    }

    public int getPrise() {
        return prise;
    }

    public String toString() {
        return String.format("Flowers: " + flowers + "\t color: " + color + "\t  prise: " + prise + "\n");
    }
}