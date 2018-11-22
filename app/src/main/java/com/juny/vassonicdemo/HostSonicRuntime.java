package com.juny.vassonicdemo;

import android.content.Context;
import android.os.Environment;

import com.tencent.sonic.sdk.SonicRuntime;
import com.tencent.sonic.sdk.SonicSessionClient;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * SonicRuntime is a class which interacts with the overall running information in the system,
 * including Context, UA, ID (which is the unique identification for the saved data) and other information.
 *
 * @author ChenRunFang
 */
public class HostSonicRuntime extends SonicRuntime {
    public HostSonicRuntime(Context context) {
        super(context);
    }

    @Override
    public void log(String tag, int level, String message) {

    }

    @Override
    public String getCookie(String url) {
        return null;
    }

    @Override
    public boolean setCookie(String url, List<String> cookies) {
        return false;
    }

    /**
     * @return User's UA
     */
    @Override
    public String getUserAgent() {
        return "";
    }

    /**
     * @return the ID of user.
     */
    @Override
    public String getCurrentUserAccount() {
        return "sonic-demo-master";
    }

    @Override
    public boolean isSonicUrl(String url) {
        return true;
    }

    @Override
    public Object createWebResourceResponse(String mimeType, String encoding, InputStream data, Map<String, String> headers) {
        return null;
    }

    @Override
    public boolean isNetworkValid() {
        return true;
    }

    @Override
    public void showToast(CharSequence text, int duration) {

    }

    @Override
    public void postTaskToThread(Runnable task, long delayMillis) {

    }

    @Override
    public void notifyError(SonicSessionClient client, String url, int errorCode) {

    }

    /**
     * @return the file path which is used to save Sonic caches.
     */
    @Override
    public File getSonicCacheDir() {
        String path = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "sonic/";
        File file = new File(path.trim());
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }
}
