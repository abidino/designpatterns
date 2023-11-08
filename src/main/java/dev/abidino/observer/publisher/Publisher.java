package dev.abidino.observer.publisher;

import dev.abidino.observer.subscriber.Subscriber;

public interface Publisher {
    void publish();

    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    String getMessage();
}
