package com.github.airsaid.accountbook.data.source;

import com.github.airsaid.accountbook.data.Error;
import com.github.airsaid.accountbook.data.User;

/**
 * @author Airsaid
 * @Date 2017/2/22 22:50
 * @Blog http://blog.csdn.net/airsaid
 * @Desc
 */
public interface UserDataSource {

    interface RegisterCallback{
        void registerSuccess();
        void registerFail(Error e);
    }

    void register(User user, RegisterCallback callback);

    interface LoginCallback{
        void loginSuccess();
        void loginFail(Error e);
    }

    void login(User user, LoginCallback callback);

    interface VerifyPhoneCallback{
        void verifySuccess();
        void verifyFail(Error e);
    }

    void verifyPhone(String code, VerifyPhoneCallback callback);

    interface SendVerifyCodeCallback {
        void sendVerifyCodeSuccess();
        void sendVerifyCodeFail(Error e);
    }

    void requestPhoneVerify(String phone, SendVerifyCodeCallback callback);


    interface RequestMobileCodeCallback {
        void requestSuccess();
        void requestFail(Error e);
    }

    void requestPasswordResetBySmsCode(String phone, RequestMobileCodeCallback callback);

    interface UpdatePasswordCallback {
        void updateSuccess();
        void updateFail(Error e);
    }

    void resetPasswordBySmsCode(String phone, String code, UpdatePasswordCallback callback);

}