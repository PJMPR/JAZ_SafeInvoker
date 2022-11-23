package com.example.safe.repeaters;


public class Repeater implements IRepeater{
    String exceptionName;
    int counter;
    int retryCount;
    long delayTime;
    private final IRepeaterExceptionRegistry exceptionRegistry;

    public Repeater(IRepeaterExceptionRegistry exceptionRegistry) {
        this.exceptionRegistry = exceptionRegistry;
    }

    @Override
    public IRepeater For(Throwable exception) {
        /*
            Tutaj Twoim zadaniem jest napisanie odpowiedniego algorytmu
         */
        return null;
    }

    @Override
    public void retry() {
        counter++;
    }

    @Override
    public boolean shouldRetry() {
        return counter<=retryCount;
    }

    @Override
    public IRepeater waiting() {
        try {
            wait(delayTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }
}
