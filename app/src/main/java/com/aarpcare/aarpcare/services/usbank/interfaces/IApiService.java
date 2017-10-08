package com.aarpcare.aarpcare.services.usbank.interfaces;

/**
 * Created by adam on 10/7/17.
 */

import com.aarpcare.aarpcare.services.usbank.models.AccountDetails;
import com.aarpcare.aarpcare.services.usbank.api_request_models.GetAccountDetailsRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface IApiService {

    @POST("/account/details")
    @FormUrlEncoded
    Call<AccountDetails> getAccountDetails(@Body GetAccountDetailsRequest getAccountDetailsRequest);

}
