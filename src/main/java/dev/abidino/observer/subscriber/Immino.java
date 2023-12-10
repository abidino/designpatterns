package dev.abidino.observer.subscriber;

import dev.abidino.observer.publisher.Publisher;

public class Immino implements Subscriber {
    @Override
    public void receive(String message) {
        System.out.println("immino receive a new message :  " + message);
    }

    @Override
    public void subscribe(Publisher publisher) {
        publisher.addSubscriber(this);
    }
}
