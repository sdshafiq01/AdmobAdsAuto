# Admob-Ads-Implements

Recent Updated Version: [![](https://jitpack.io/v/sdshafiq01/AdmobAdsAuto.svg)](https://jitpack.io/#sdshafiq01/AdmobAdsAuto)

1> Add into settings.gradle

  	dependencyResolutionManagement {
  		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  		repositories {
  			mavenCentral()
  			maven { url 'https://jitpack.io' }
  		}
  	}
 
2> Add into build.gradle (Module :app)

   	dependencies {
  	        implementation 'com.github.sdshafiq01:AdmobAdsAuto:Tag'
  	}

3> Add Banner layout into XML

    <RelativeLayout
          android:id="@+id/adsLayout"
          android:layout_width="match_parent"
          android:layout_height="wrap_content"
          app:layout_constraintBottom_toBottomOf="parent" />

4> Add into java

       // init ads 
        InitAds.SelectAds(act);

        // init banner ads layout
        RelativeLayout adsLayout = findViewById(R.id.adsLayout);

load banner ads into the layout

    BannerAdsAdapter.SmallBannerAdmob(act,asdLayout, bannerID);

load interstitial ads

        InterstitialAdsAdapter.LoadInterstitialAdmob(act, interstitialID);
       
Show interstitial ads

        InterstitialAdsAdapter.ShowInterstitial(activity);


Load Rewards Ads

        RewardsAdsAdapter.loadRewardsAdmob(activity, "setup your reward ads id here");


Check out whether rewards ads are loaded or not
        
        if (RewardsAdsAdapter.isAdsAvailable()){
                RewardsAdsAdapter.showAds(activity);
            }
        else{
         //If reward ads are not loaded then again call to load ads
            RewardsAdsAdapter.loadRewardsAdmob(activity, "set up your reward ads id here");
        }

Show NaTive Ads With NativeAdsAdapter
         
          RelativeLayout adsLayout = findViewById(R.id.adsLayout);
          String size  = "big"; // big or small
          NativeAdsAdapter.LoadNativeAdmob( activity, adsLayout, idNative, size);

        
