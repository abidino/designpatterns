package dev.abidino.observer.subscriber;

import dev.abidino.observer.publisher.Publisher;

public class Abidino implements Subscriber {
    @Override
    public void receive(String message) {
        System.out.println("abidino receive a new message :  " + message);
    }

    @Override
    public void subscribe(Publisher publisher) {
        publisher.addSubscriber(this);
    }
}
