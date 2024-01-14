package in.thbd.admobadsauto.AdsAdapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.nativead.NativeAd;
import in.thbd.admobadsauto.R;
import in.thbd.admobadsauto.Utils.TemplateView;

public class NativeAdsAdapter {


    private static AdLoader adLoader;
    private static LinearLayout smallAdView;
    public static int counter = 0;

   /*
   * String big = big native ads
   * String small = small native ads
    */
    public static void LoadNativeAdmob(Activity activity, RelativeLayout adLayout, String idNative,String size) {


         adLoader = new AdLoader.Builder(activity, idNative)
                .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                    @Override
                    public void onNativeAdLoaded(NativeAd nativeAd) {

                        TemplateView view = null;
                        if (size.contains("big")){
                            view = (TemplateView) LayoutInflater.from(activity)
                                    .inflate(R.layout.ads_native_med_ads_layout, adLayout, false);
                        }else{
                            view = (TemplateView) LayoutInflater.from(activity)
                                    .inflate(R.layout.ads_native_ads_layout, adLayout, false);
                        }


//                     view.setVisibility(View.VISIBLE);
//                        NativeTemplateStyle styles = new
//                                NativeTemplateStyle.Builder().withMainBackgroundColor().build();
//                            TemplateView template = findViewById(R.id.my_template);
//                        view.setStyles(styles);
                        view.setNativeAd(nativeAd);
                        adLayout.setVisibility(View.VISIBLE);
                        adLayout.removeAllViews();
                        adLayout.addView(view);

                    }
                }
                ).withAdListener(new AdListener() {
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        super.onAdFailedToLoad(loadAdError);



                    }
                }).build();


        adLoader.loadAd(new AdRequest.Builder().build());

//        adLoader.loadAd(new AdRequest.Builder().addKeyword(Hpk1).addKeyword(Hpk2).addKeyword(Hpk3).addKeyword(Hpk4).build());


    }



}
