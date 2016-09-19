package com.droidit.domain.basicExample;


import com.droidit.domain.BaseContract;

/**
 * Created by JohannesC on 05-Sep-16.
 * This makes it easier to understand how your application modules work
 */
public interface BasicExampleContract {

    interface Presenter extends BaseContract.Presenter<View> {
        void onConnectionButtonClicked();

        void onGetPostsBtnClicked();
    }

    interface View extends BaseContract.View {

        void displaySinglePostTitle(String title);

        void displayConnectionError(String message);
    }

    interface WireFrame {
        void onConnectionButtonClicked();
    }
}
