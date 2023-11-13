package dev.abidino.memento;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class CopyClip {
    private State state;
    private final String deviceId;
    private final Memento memento = new Memento(this);

    public CopyClip(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setState(State state) {
        synchronized (this) {
            this.state = state;
        }
        memento.addState(this);
    }

    public void undo() {
        memento.undo();
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return "CopyClip{" +
                "state=" + state +
                ", deviceId='" + deviceId + '\'' +
                '}';
    }

    private class Memento {
        public final Map<Integer, State> stateMap;
        private final AtomicInteger index = new AtomicInteger(0);
        private final CopyClip copyClip;

        private Memento(CopyClip copyClip) {
            this.copyClip = copyClip;
            this.stateMap = new HashMap<>();
        }

        private synchronized void addState(CopyClip copyClip) {
            int i = this.index.incrementAndGet();
            stateMap.put(i, copyClip.getState());
            System.out.println(stateMap);
        }

        private synchronized void undo() {
            int currentIndex = index.get();
            if (currentIndex == 0) {
                return;
            }
            State lastState = stateMap.get(currentIndex - 1);
            System.out.println("undo time");
            copyClip.setState(lastState);
        }
    }
}
