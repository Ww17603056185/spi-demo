package test.wen;

import spi.People;

public class Dog implements People {
    @Override
    public String speak() {
        return "=============DOG=================";
    }
}
