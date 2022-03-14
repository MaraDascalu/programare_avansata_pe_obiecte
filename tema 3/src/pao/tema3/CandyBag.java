package pao.tema3;

public class CandyBag {
    CandyBox[] candyBoxes;
    private int noOfCandyBoxes;

    public CandyBag(int noOfCandyBoxes) {
        this.candyBoxes = new CandyBox[noOfCandyBoxes];
        this.noOfCandyBoxes = noOfCandyBoxes;
    }

    public CandyBag(CandyBox[] candyBoxes, int noOfCandyBoxes) {
        this.candyBoxes = candyBoxes;
        this.noOfCandyBoxes = noOfCandyBoxes;
    }
}
