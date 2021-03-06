package com.hoasen.studio.dailymailfeed.Inject.Interceptor;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * Created by Harry Nguyen on 09-Mar-16.
 */
public class NormalInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Response response = chain.proceed(chain.request());
        return response;
    }
}
