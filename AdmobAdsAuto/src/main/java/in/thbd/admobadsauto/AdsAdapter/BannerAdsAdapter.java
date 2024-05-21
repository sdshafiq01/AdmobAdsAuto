package in.thbd.admobadsauto.AdsAdapter;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

public class BannerAdsAdapter {

    public static void SmallBannerAdmob(Activity activity, RelativeLayout layAds, String idBanner) {

        AdRequest request = new AdRequest.Builder()
                .build();

        AdView adView;
        adView = new AdView(activity);
        adView.setAdUnitId(idBanner);
        layAds.removeAllViews();
        layAds.addView(adView);
        adView.setAdSize(AdSize.BANNER);
//        AdSize adSize = getAdSize(activity, layAds);
//        adView.setAdSize(adSize);
        adView.loadAd(request);
        adView.setAdListener(new AdListener() {

            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
               // ads loading fail
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }

        });

    }


//    private static AdSize getAdSize(Activity activity, RelativeLayout layAds) {

//        // Determine the screen width (less decorations) to use for the ad width.
//        Display display = activity.getWindowManager().getDefaultDisplay();
//        DisplayMetrics outMetrics = new DisplayMetrics();
//        display.getMetrics(outMetrics);
//
//        float density = outMetrics.density;
//        float adWidthPixels = layAds.getWidth();
//
//        // If the ad hasn't been laid out, default to the full screen width.
//        if (adWidthPixels == 0) { adWidthPixels = outMetrics.widthPixels; }
//
//        int adWidth = (int) (adWidthPixels / density);
//
//        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(activity, adWidth);

//    }

}
