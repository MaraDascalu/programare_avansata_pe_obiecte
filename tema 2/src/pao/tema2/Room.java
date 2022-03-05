package pao.tema2;

public class Room {

    private int number;
    private String type;
    private int floor;

    public Room( int number, String type, int floor){
        this.number = number;
        this.type = type;
        this.floor = floor;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String outputRoom(){
        return(" [numar sala]: " + this.getNumber() + " [tip sala]: " + this.getType() + " [etaj]: " + this.getFloor());
    }
}
