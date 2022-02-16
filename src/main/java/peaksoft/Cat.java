package peaksoft;

import org.springframework.beans.factory.annotation.Value;

public class Cat {
    @Value("${cat.color}")
    private  String color;
    @Value("${cat.parody}")
    private String parody;
    @Value("${cat.mass}")
    private int mass ;

    public Cat() {
    }

    public Cat(String color, String parody, int mass) {
        this.color = color;
        this.parody = parody;
        this.mass = mass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getParody() {
        return parody;
    }

    public void setParody(String parody) {
        this.parody = parody;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", parody='" + parody + '\'' +
                ", mass=" + mass +
                '}';
    }
}


