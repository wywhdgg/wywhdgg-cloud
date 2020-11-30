package com.lingzhi.ribbon.futrue;

public interface Command<T> {
    T run();

    T fallBack();
}
