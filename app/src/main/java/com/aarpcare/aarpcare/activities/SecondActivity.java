package com.aarpcare.aarpcare.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;
import com.aarpcare.aarpcare.R;
import com.aarpcare.aarpcare.services.usbank.api_client.ApiClient;
import com.aarpcare.aarpcare.services.usbank.api_request_models.GetAccountDetailsRequest;
import com.aarpcare.aarpcare.services.usbank.interfaces.IApiService;
import com.aarpcare.aarpcare.services.usbank.models.AccountDetails;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class SecondActivity extends AppCompatActivity {

    private LetsGoTask mLetsGoTask = null;
    private View mProgressView;
    private String mRoleName = "caregiver";
    private IApiService mAPIService;
    private String TAG = "AARP_APP";

    // static TabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final WebView wv = (WebView) findViewById(R.id.webview01);


        final Button buttonPay = (Button) findViewById(R.id.buttonPay);
        buttonPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SecondActivity.this, SummaryActivity.class);
                startActivity(i);
                finish();
            }
        });

        wv.getSettings().setAllowUniversalAccessFromFileURLs(true);
        wv.getSettings().setAllowFileAccessFromFileURLs(true);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("file:///android_asset/currentmonth.html");
        wv.setVisibility(View.VISIBLE);
        buttonPay.setVisibility(View.VISIBLE);

        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {


                switch (tab.getPosition()) {
                    case 0:
                        // Toast.makeText(getApplicationContext(),"Tab " + tab.getPosition(), Toast.LENGTH_SHORT).show();
                        wv.getSettings().setAllowUniversalAccessFromFileURLs(true);
                        wv.getSettings().setAllowFileAccessFromFileURLs(true);
                        wv.getSettings().setJavaScriptEnabled(true);

                        wv.loadUrl("file:///android_asset/currentmonth.html");
                        wv.setVisibility(View.VISIBLE);
                        buttonPay.setVisibility(View.VISIBLE);
                        getAccountDetailsAsync();
                        break;
                    case 1:
                        // Toast.makeText(getApplicationContext(),"Tab " + tab.getPosition(), Toast.LENGTH_SHORT).show();
                        wv.setVisibility(View.INVISIBLE);
                        buttonPay.setVisibility(View.INVISIBLE);
                        break;
                    case 2:
                        wv.loadUrl("file:///android_asset/tiles.html");
                        wv.setVisibility(View.VISIBLE);
                        buttonPay.setVisibility(View.INVISIBLE);
                        break;
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        mProgressView = findViewById(R.id.summary_progress);

    }

    public void getAccountDetails() {

        GetAccountDetailsRequest getAccountDetailsRequest = new GetAccountDetailsRequest();

        getAccountDetailsRequest.setOperatingCompanyIdentifier("815");
        getAccountDetailsRequest.setProductCode("DDA");
        getAccountDetailsRequest.setPrimaryIdentifier("00000000000000822943114");


       // mAPIService.getAccountDetails(getAccountDetailsRequest).execute(Call<Post>)  {


    }


    public void getAccountDetailsAsync(){

        GetAccountDetailsRequest getAccountDetailsRequest = new GetAccountDetailsRequest();

        getAccountDetailsRequest.setOperatingCompanyIdentifier("815");
        getAccountDetailsRequest.setProductCode("DDA");
        getAccountDetailsRequest.setPrimaryIdentifier("00000000000000822943114");
        // RxJava
        mAPIService = ApiClient.getAsyncAPIService();
        mAPIService.getAccountDetailsAsync(getAccountDetailsRequest).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<AccountDetails>() {
                    @Override
                    public void onCompleted() {
                        Log.d(TAG, "Completed");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG, e.toString());
                    }

                    @Override
                    public void onNext(AccountDetails accountDetails) {
                        Log.d(TAG, "onNext");
                        showResponse(accountDetails.toString());
                    }
                });

    }


    public void showResponse(String response) {
        Log.d(TAG, response);
    }


    private void letsGo() {
        if (mLetsGoTask != null) {
            return;
        }

        boolean cancel = false;
        View focusView = null;

        if (cancel) {
            // There was an error; don't attempt login and focus the activity_first
            // form field with an error.
            focusView.requestFocus();
        } else {
            // Show a progress spinner, and kick off a background task to
            // perform the user login attempt.
            showProgress(true);
            mLetsGoTask = new LetsGoTask(mRoleName);
            mLetsGoTask.execute((Void) null);
        }
    }

    /**
     * Shows the progress UI and hides the login form.
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
    private void showProgress(final boolean show) {
        // On Honeycomb MR2 we have the ViewPropertyAnimator APIs, which allow
        // for very easy animations. If available, use these APIs to fade-in
        // the progress spinner.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
            int shortAnimTime = getResources().getInteger(android.R.integer.config_shortAnimTime);

//            mLoginFormView.setVisibility(show ? View.GONE : View.VISIBLE);
//            mLoginFormView.animate().setDuration(shortAnimTime).alpha(
//                    show ? 0 : 1).setListener(new AnimatorListenerAdapter() {
//                @Override
//                public void onAnimationEnd(Animator animation) {
//                    mLoginFormView.setVisibility(show ? View.GONE : View.VISIBLE);
//                }
//            });

            mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
            mProgressView.animate().setDuration(shortAnimTime).alpha(
                    show ? 1 : 0).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
                }
            });
        } else {
            // The ViewPropertyAnimator APIs are not available, so simply show
            // and hide the relevant UI components.
            mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
            // mLoginFormView.setVisibility(show ? View.GONE : View.VISIBLE);
        }
    }

    /**
     * Represents an asynchronous login/registration task used to authenticate
     * the user.
     */
    public class LetsGoTask extends AsyncTask<Void, Void, Boolean> {

        private final String mRoleName;


        LetsGoTask(String roleName) {
            mRoleName = roleName;
        }

        @Override
        protected Boolean doInBackground(Void... params) {
            // TODO: attempt authentication against a network service.

            try {
                // Simulate network access.
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                return false;
            }


            // TODO: register the new account here.
            return true;
        }

        @Override
        protected void onPostExecute(final Boolean success) {
            mLetsGoTask = null;
            showProgress(false);

            if (success) {
//                Intent i = new Intent(FirstActivity.this, SecondActivity.class);
//                startActivity(i);
                finish();
            } else {

            }
        }

        @Override
        protected void onCancelled() {
            mLetsGoTask = null;
            showProgress(false);
        }
    }


}
