package dev.abidino.observer.subscriber;

import dev.abidino.observer.publisher.Publisher;

public class Immino implements Subscriber {
    @Override
    public void receive(Publisher publisher) {
        System.out.println("immino receive a new message :  " + publisher.getMessage());
    }
}
