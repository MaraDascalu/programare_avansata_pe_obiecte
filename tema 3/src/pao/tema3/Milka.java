package pao.tema3;

import java.util.Objects;

public class Milka extends CandyBox{
    private int radius;
    private int height;

    public Milka(String flavour, String origin, int radius, int height) {
        super(flavour, origin);
        this.radius = radius;
        this.height = height;
    }

    public Milka(){
    }

    @Override
    public int getVolume() {
        return radius * height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Milka)) return false;
        if (!super.equals(o)) return false;
        Milka milka = (Milka) o;
        return getRadius() == milka.getRadius() && getHeight() == milka.getHeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRadius(), getHeight());
    }

    @Override
    public String toString() {
        return "Milka{" +
                "flavour='" + flavour + '\'' +
                ", origin='" + origin + '\'' +
                ", radius=" + radius +
                ", height=" + height +
                ", volume=" + getVolume() +
                '}';
    }
}
