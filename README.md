﻿# Admob-Ads-Implements

Recent Updated Version: [![](https://jitpack.io/v/sdshafiq01/AdmobAdsAuto.svg)](https://jitpack.io/#sdshafiq01/AdmobAdsAuto)

1> Add 

  	dependencyResolutionManagement {
  		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  		repositories {
  			mavenCentral()
  			maven { url 'https://jitpack.io' }
  		}
  	}
 
2> Add 

   	dependencies {
  	        implementation 'com.github.sdshafiq01:AdmobAdsAuto:Tag'
  	}

3> Add Banner layout into XML

    <RelativeLayout
          android:id="@+id/asdLayout"
          android:layout_width="match_parent"
          android:layout_height="wrap_content"
          app:layout_constraintBottom_toBottomOf="parent" />

4> Add into java

       // init ads 
        InitAds.SelectAds(act);

        // init banner ads layout
        RelativeLayout asdLayout = findViewById(R.id.asdLayout);

        // load banner ads layout
        BannerAdsAdapter.SmallBannerAdmob(act,asdLayout, bannerID);

        // load intertitial ads layout
        InterstitialAdsAdapter.LoadInterstitialAdmob(act, intertitialID);
