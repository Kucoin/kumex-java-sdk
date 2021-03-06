/*
 * Copyright 2019 Mek Global Limited
 */
package com.kucoin.futures.core.rest.adapter;

import com.kucoin.futures.core.rest.impl.retrofit.AuthRetrofitAPIImpl;
import com.kucoin.futures.core.rest.interceptor.FuturesApiKey;
import com.kucoin.futures.core.rest.interfaces.WebsocketAPI;
import com.kucoin.futures.core.rest.response.WebsocketTokenResponse;
import com.kucoin.futures.core.rest.interfaces.retrofit.WebsocketAuthAPIRetrofit;

import java.io.IOException;

/**
 * Created by chenshiwei on 2019/1/18.
 */
public class WebsocketPrivateAPIAdaptor extends AuthRetrofitAPIImpl<WebsocketAuthAPIRetrofit>
        implements WebsocketAPI {

    public WebsocketPrivateAPIAdaptor(String baseUrl, FuturesApiKey apiKey) {
        this.baseUrl = baseUrl;
        this.apiKey = apiKey;
    }

    @Override
    public WebsocketTokenResponse getToken() throws IOException {
        return super.executeSync(getAPIImpl().getPrivateToken());
    }
}
