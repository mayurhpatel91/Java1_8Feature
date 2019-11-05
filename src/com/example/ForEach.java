package com.saba;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        //creating sample Collection from ArrayList
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0; i<10; i++) myList.add(i);


        System.out.println("Traverse Using Iterator");
        //traversing using Iterator
        Iterator<Integer> integerIterator = myList.iterator();
        while(integerIterator.hasNext()){
            Integer i = integerIterator.next();
            System.out.println(" Value::"+i);
        }

        System.out.println("Traverse Using forEach method of Iterable with anonymous class");
        myList.forEach(new Consumer<Integer>() {
            public void accept(Integer t) {
                System.out.println("Anonymous Inner Class Value::"+t);
            }
        });
        System.out.println("Traverse Using Consumer interface implementation");

        MyConsumer action = new MyConsumer();
        myList.forEach(action);
    }
}
//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{
    public void accept(Integer t) {
        System.out.println("Consumer impl Value::"+t);
    }
}
