package com.aarpcare.aarpcare.services.usbank.api_client;

import com.aarpcare.aarpcare.services.usbank.interfaces.IApiService;

/**
 * Created by adam on 10/8/17.
 */

public class ApiClient {

    private ApiClient() {}

    public static final String BASE_URL = "http://api119521live.gateway.akana.com/api/v1/";

    public static IApiService getAPIService() {

        return ApiRetrofitFactory.getClient(BASE_URL).create(IApiService.class);
    }
}