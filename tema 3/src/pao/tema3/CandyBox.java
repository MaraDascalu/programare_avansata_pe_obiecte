package pao.tema3;

import java.util.Objects;

public abstract class CandyBox {
     String flavour;
     String origin;

     public CandyBox() {}

    public CandyBox(String flavour, String origin) {
        this.flavour = flavour;
        this.origin = origin;
    }

    public abstract int getVolume();

    @Override
    public String toString() {
        return "CandyBox{" +
                "flavour='" + flavour + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CandyBox)) return false;
        CandyBox candyBox = (CandyBox) o;
        return flavour.equals(candyBox.flavour) && origin.equals(candyBox.origin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavour, origin);
    }
}
