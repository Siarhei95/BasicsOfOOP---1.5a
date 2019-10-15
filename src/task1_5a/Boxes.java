package task1_5a;

public class Boxes {
    private String packing; //упаковка

    private String choiceBox;
    private int quantityChoice;

    public Boxes(String choiceBox, int quantityChoice) {
        this.choiceBox = choiceBox;
        this.quantityChoice = quantityChoice;
    }

    public Boxes(String packing){
        this.packing = packing;
    }
    public String getPacking() {
        return packing;
    }
    public String toString() {
        return String.format("Packing: " + packing+"\n");
    }
}