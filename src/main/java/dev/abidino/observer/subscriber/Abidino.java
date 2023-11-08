package dev.abidino.observer.subscriber;

import dev.abidino.observer.publisher.Publisher;

public class Abidino implements Subscriber {
    @Override
    public void receive(Publisher publisher) {
        System.out.println("abidino receive a new message :  " + publisher.getMessage());
    }
}
