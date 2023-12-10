package dev.abidino.observer.subscriber;

import dev.abidino.observer.publisher.Publisher;

public interface Subscriber {
    void receive(String message);

    void subscribe(Publisher publisher);
}
