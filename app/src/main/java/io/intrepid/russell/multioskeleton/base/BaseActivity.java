package io.intrepid.russell.multioskeleton.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import io.intrepid.russell.multioskeleton.MultioskeletonApplication;
import timber.log.Timber;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Timber.v("Lifecycle onCreate: %s", this);
        super.onCreate(savedInstanceState);

        setContentView(getLayoutResourceId());
        ButterKnife.bind(this);
    }

    @Override
    @CallSuper
    protected void onNewIntent(Intent intent) {
        Timber.v("Lifecycle onNewIntent: %s", this);
        super.onNewIntent(intent);
    }

    @Override
    @CallSuper
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Timber.v("Lifecycle onActivityResult: %s", this);
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    @CallSuper
    protected void onStart() {
        Timber.v("Lifecycle onStart: %s", this);
        super.onStart();
    }

    @Override
    @CallSuper
    protected void onResume() {
        Timber.v("Lifecycle onResume: %s", this);
        super.onResume();
    }

    @Override
    @CallSuper
    protected void onPause() {
        Timber.v("Lifecycle onPause: %s", this);
        super.onPause();
    }

    @Override
    @CallSuper
    protected void onStop() {
        Timber.v("Lifecycle onStop: %s", this);
        super.onStop();
    }

    @Override
    @CallSuper
    protected void onDestroy() {
        Timber.v("Lifecycle onDestroy: %s", this);
        super.onDestroy();
    }

    @Override
    @CallSuper
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    protected abstract int getLayoutResourceId();

    protected final MultioskeletonApplication getMultioskeletonApplication() {
        return (MultioskeletonApplication) getApplication();
    }
}
