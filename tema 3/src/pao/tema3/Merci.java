package pao.tema3;

import java.util.Objects;

public class Merci extends CandyBox{
    private int length;

    public Merci(String flavour, String origin, int length) {
        super(flavour, origin);
        this.length = length;
    }

    public Merci() {}

    @Override
    public int getVolume() {
        return length * length * length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Merci{" +
                "flavour='" + flavour + '\'' +
                ", origin='" + origin + '\'' +
                ", length=" + length +
                ", volume=" + getVolume() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Merci)) return false;
        if (!super.equals(o)) return false;
        Merci merci = (Merci) o;
        return getLength() == merci.getLength();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLength());
    }
}
