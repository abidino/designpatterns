package dev.abidino.memento;


public class MementoTest {
    public static void main(String[] args) {
        CopyClip copyClip = new CopyClip("mac-os-1");

        Client1 client1 = new Client1(copyClip);
        Client2 client2 = new Client2(copyClip);

        Thread thread1 = new Thread(client1);
        Thread thread2 = new Thread(client2);

        thread1.start();
        thread2.start();
    }
}

class Client1 implements Runnable {
    private final CopyClip copyClip;

    public Client1(CopyClip copyClip) {
        this.copyClip = copyClip;
    }

    @Override
    public void run() {
        copyClip.setState(new State("1.client --> 1. state"));
        copyClip.setState(new State("1.client --> 2. state"));
        copyClip.undo();
        copyClip.setState(new State("1.client --> 3. state"));
        copyClip.setState(new State("1.client --> 4. state"));
        copyClip.undo();
    }
}

class Client2 implements Runnable {
    private final CopyClip copyClip;

    public Client2(CopyClip copyClip) {
        this.copyClip = copyClip;
    }

    @Override
    public void run() {
        copyClip.setState(new State("2.client --> 1. state"));
        copyClip.undo();
        copyClip.setState(new State("2.client --> 2. state"));
        copyClip.undo();
        copyClip.setState(new State("2.client --> 3. state"));
        copyClip.setState(new State("2.client --> 4. state"));
        copyClip.setState(new State("2.client --> 5. state"));
    }

}