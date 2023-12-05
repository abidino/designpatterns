package dev.abidino.observer;

import dev.abidino.observer.publisher.MomPublisher;
import dev.abidino.observer.subscriber.Abidino;
import dev.abidino.observer.subscriber.Immino;

public class ObserverTest {
    public static void main(String[] args) {
        MomPublisher momPublisher = new MomPublisher("Tomato paste bread is ready");
        Abidino abidino = new Abidino();
        Immino immino = new Immino();
        abidino.subscribe(momPublisher);
        immino.subscribe(momPublisher);
        momPublisher.publish();
    }
}
