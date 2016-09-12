package com.droidit.domain;

/**
 * Created by JohannesC on 12-Sep-16.
 * Just a callback helper to make the callback structure of MVP a bit easier
 */
public interface DefaultCallback<T> {

    void onSuccess(T success);

    void onFailure(Throwable throwable);

}
