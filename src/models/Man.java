package models;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Man {
    private String name;
    private String position;
    private int age;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(final String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(final double height) {
        this.height = height;
    }

    public Man(final String name, final String position, final int age, final double height) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.height = height;
    }
}
