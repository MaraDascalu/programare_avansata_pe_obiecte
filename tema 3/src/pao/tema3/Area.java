package pao.tema3;

public class Area {
    private CandyBag candyBag;
    private int number;
    private String street;

    public Area() {
    }

    public Area(CandyBag candyBag, int number, String street) {
        this.candyBag = candyBag;
        this.number = number;
        this.street = street;
    }

    public void printAddress() {
        System.out.println(street + " " + number);
        for(CandyBox candyBox : candyBag.candyBoxes)
        {
            System.out.println(candyBox.toString());
        }

    }
}
