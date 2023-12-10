package dev.abidino.observer.publisher;

import dev.abidino.observer.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class AbstractPublisher implements Publisher {
    protected List<Subscriber> subscriberList = new ArrayList<>();
    private final List<String> messageList = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void publish(String message) {
        messageList.add(message);
        try (ExecutorService executorService = Executors.newCachedThreadPool()) {
            for (Subscriber subscriber : subscriberList) {
                executorService.submit(() -> subscriber.receive(message));
            }
        }
    }
}
