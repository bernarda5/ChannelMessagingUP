package com.example.bernard5.channelmessaging;

/**
 * Created by bernard5 on 22/01/2018.
 */
public interface OnDownloadListener {

    void onDownloadComplete(String downloadedContent);
    void onDownloadError(String error);
}
