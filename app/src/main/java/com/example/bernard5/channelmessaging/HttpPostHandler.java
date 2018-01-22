package com.example.bernard5.channelmessaging;

import android.os.AsyncTask;

import java.util.ArrayList;

/**
 * Created by bernard5 on 22/01/2018.
 */
public class HttpPostHandler extends AsyncTask<Void, Integer, Double>
{

    private ArrayList<OnDownloadListener> listeners = new ArrayList<OnDownloadListener> ();
    public void addOnDownloadListener (OnDownloadListener listener)
    {this.listeners.add(listener);}

    @Override
    protected void onProgressUpdate(Integer... values){
        super.onProgressUpdate(values);

    }
    @Override
    protected Double doInBackground(Void... params)

    {
        return ;
    }
    @Override
    protected void onPostExecute(double result) {
        super.onPostExecute(result);
    }

}
