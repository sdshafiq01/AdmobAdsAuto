package in.thbd.admobadsauto;

import static android.content.ContentValues.TAG;

import android.app.Activity;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class InterstitialAdsAdapter {
    public static InterstitialAd mInterstitialAd;

    public static void LoadInterstitialAdmob(Activity activity, String idIntertitial ) {

        AdRequest request = new AdRequest.Builder()
                .build();

        InterstitialAd.load(activity, idIntertitial, request,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                        Log.i(TAG, "onAdLoaded");

                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.i(TAG, loadAdError.getMessage());
                        mInterstitialAd = null;


                    }
                });


    }

    public static void ShowInterstitial(Activity activity) {

            if (mInterstitialAd != null) {
                mInterstitialAd.show(activity);
            }

    }


}