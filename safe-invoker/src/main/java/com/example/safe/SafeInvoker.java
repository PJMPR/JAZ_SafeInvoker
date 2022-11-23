package com.example.safe;


import com.example.safe.repeaters.IRepeater;

public class SafeInvoker implements SafeInvoking{
    private final IRepeater repeater;

    public SafeInvoker(IRepeater repeater) {
        this.repeater = repeater;
    }


    @Override
    public InvokerResult SafeInvoke(NotSafeAction action) {
        /*
            Tutaj Twoim zadaniem jest napisanie odpowiedniego algorytmu
         */
        return null;
    }
}
