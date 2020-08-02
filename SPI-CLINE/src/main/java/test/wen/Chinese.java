package test.wen;

import spi.People;

public class Chinese implements People {
    @Override
    public String speak() {
        return "Chinese speak Chinese.";
    }
}
