package in.thbd.admobadsauto;

import android.app.Activity;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

public class RewardsAdsAdapter {

    private static final String TAG = "Loading Rewards Ads";
    private static RewardedAd rewardedAd_admob;

    public static void loadRewardsAdmob(Activity activity, String idAds) {

        AdRequest request = new AdRequest.Builder()
                .build();

        RewardedAd.load(activity, idAds, request, new RewardedAdLoadCallback() {
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error.
                Log.d(TAG, loadAdError.toString());
                rewardedAd_admob = null;


            }

            @Override
            public void onAdLoaded(@NonNull RewardedAd ad) {
                rewardedAd_admob = ad;
                Log.d(TAG, "Ad was loaded.");

            }

        });


    }


    public static void showAds(Activity activity) {

        if (rewardedAd_admob != null) {
            rewardedAd_admob.show(activity, null);
            rewardedAd_admob = null;

        }


    }

    public static boolean isAdsAvailable() {
        Log.e(TAG, "isAdsAvailable: checking!");
        if (rewardedAd_admob != null) return true;
        else return false;


    }


}
