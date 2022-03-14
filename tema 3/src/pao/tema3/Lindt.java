package pao.tema3;

import java.util.Objects;

public class Lindt extends CandyBox {
    private int length;
    private int width;
    private int height;

    public Lindt(String flavour, String origin, int length, int width, int height) {
        super(flavour, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Lindt() {
    }

    @Override
    public int getVolume() {
        return length * width * height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
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
        if (!(o instanceof Lindt)) return false;
        if (!super.equals(o)) return false;
        Lindt lindt = (Lindt) o;
        return getLength() == lindt.getLength() && getWidth() == lindt.getWidth() && getHeight() == lindt.getHeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLength(), getWidth(), getHeight());
    }

    @Override
    public String toString() {
        return "Lindt{" +
                "flavour='" + flavour + '\'' +
                ", origin='" + origin + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", volume=" + getVolume() +
                '}';
    }
}
