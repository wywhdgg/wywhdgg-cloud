package com.lingzhi.zuul.ribbon.futrue;

public interface Command<T> {
    T run();

    T fallBack();
}
