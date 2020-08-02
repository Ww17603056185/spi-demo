package test.wen;

import spi.People;

public class American implements People {
    @Override
    public String speak() {
        return "American speak English.";
    }
}
