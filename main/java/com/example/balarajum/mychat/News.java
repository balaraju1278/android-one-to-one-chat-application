package com.example.balarajum.mychat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;

/**
 * Created by balaraju.m on 9/13/2017.
 */

public class News extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void  onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.myone);
        webView = (WebView) findViewById(R.id.web);
        webView.loadUrl("http://m.dailyhunt.in/news/india/telugu");
    }
    private void logout(){startActivity(new Intent(News.this,MainActivity.class));}
    private void show_list(){startActivity(new Intent(News.this,Users.class));}
    private void show_google(){startActivity(new Intent(News.this,Google.class));}
    private void show_youtube(){startActivity(new Intent(News.this,Youtube.class));}
    private void showme_one(){startActivity(new Intent(News.this,Myone.class));}
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.logout:
                logout();
                return true;
            case R.id.user_list:
                show_list();
                return true;
            case R.id.onetel:
                showme_one();
                return true;
            case R.id.google:
                show_google();
                return true;
            case R.id.youtube:
                show_youtube();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options,menu);
        return true;
    }
}
