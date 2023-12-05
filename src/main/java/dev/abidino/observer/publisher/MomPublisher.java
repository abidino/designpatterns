package dev.abidino.observer.publisher;

public class MomPublisher extends AbstractPublisher {

    private final String message;

    public MomPublisher(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
