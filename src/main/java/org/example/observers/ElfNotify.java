package org.example.observers;

import org.example.interfaces.IObserver;

public class ElfNotify implements IObserver {
    @Override
    public void notify(String message) {
        System.out.println("Les elfs on reçu la notification: " + message);
    }
}
