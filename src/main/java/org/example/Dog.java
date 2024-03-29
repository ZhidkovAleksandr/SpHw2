package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Dog {
    private int paws;
    private String name;
    private boolean hasLongTail;
    private int ears;
    private String eyesColor;

    public Dog(int paws, int ears, boolean hasLongTail){
        this.ears = ears;
        this.hasLongTail = true;
        this.paws = paws;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    @Autowired
    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "paws=" + paws +
                ", name='" + name + '\'' +
                ", hasLongTail=" + hasLongTail +
                ", ears=" + ears +
                ", eyesColor='" + eyesColor + '\'' +
                '}';
    }
}
