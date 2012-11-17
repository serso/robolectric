package com.xtremelabs.robolectric.bytecode;

public class Vars {
    public static final ThreadLocal<Vars> ALL_VARS = new ThreadLocal<Vars>() {
        @Override protected Vars initialValue() {
            return new Vars();
        }
    };

    public Object callDirectly;

    Vars() {
    }
}