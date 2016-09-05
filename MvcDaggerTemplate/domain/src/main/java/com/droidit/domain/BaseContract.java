package com.droidit.domain;

/**
 * Created by JohannesC on 05-Sep-16.
 * Template for Contract based MVC structure. Each module should have a contract which implements this class
 */
public interface BaseContract {

    interface Presenter<T extends View> {
        void onCreate(T view);
    }

    interface View {
    }
}
