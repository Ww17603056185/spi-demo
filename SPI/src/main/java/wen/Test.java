package wen;

import spi.People;
import java.util.Iterator;
import java.util.ServiceLoader;

public class Test {
    public void testSpi(){
        ServiceLoader<People> peoples = ServiceLoader.load(People.class);
        Iterator<People> iterator = peoples.iterator();
        while (iterator.hasNext()) {
            People people = iterator.next();
            System.out.println(people.speak());
        }
    }
}
