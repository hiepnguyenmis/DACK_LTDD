/*
package com.example.dack_ltdd.WebService;

import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class GetService extends AsyncTask<String,Void,String> {
    String server_response;

    @Override
    protected String doInBackground(String... strings) {
       // http://www.ehotline.somee.com/api/USERs
        URL url;
        HttpsURLConnection urlConnection=null;
         try{
            url=new URL(strings[0]);
            urlConnection=(HttpsURLConnection) url.openConnection();
            int responseCode = urlConnection.getResponseCode();

             if(responseCode == HttpURLConnection.HTTP_OK){
                 server_response = readStream(urlConnection.getInputStream());
                // Log.v("CatalogClient", server_response);
             }

         } catch (MalformedURLException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
        return null;
    }

    private String readStream(InputStream inputStream) {
    }


    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }

}
*/
