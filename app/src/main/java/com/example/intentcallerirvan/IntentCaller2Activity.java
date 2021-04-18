package com.example.intentcallerirvan;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentCaller2Activity extends Activity implements View.OnClickListener {

    public Button button2;
    public EditText editT;
    public String ACTION_CHECK="com.example.intentcallerirvan.ACTION_CHECK";

    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_intent);
        button2=(Button)findViewById(R.id.button1);
        editT=(EditText)findViewById(R.id.editText1);
        button2.setOnClickListener(this);
    }
    @Override
    public void onClick(View arg0) {
        int startSelection, andSelection;
        if (arg0==button2) {
            startSelection=editT.getSelectionStart();
            andSelection=editT.getSelectionEnd();
            //String selectedText = editT.getText().toString().substring(startSelection,andSelection);
            //Intent intent=new Intent();
            //intent.setAction(ACTION_CHECK);
            //intent.putExtra("word",selectedText);
            //startActivity(intent);
            //String url = "http://www.shopee.co.id/dtautocare.bekasi";
            //Intent web = new Intent(Intent.ACTION_VIEW);
            //web.setData(Uri.parse(url));
            //startActivity(web);

            Intent callintent = new Intent(Intent.ACTION_DIAL);
            callintent.setData(Uri.parse("tel:" + "089649489480"));
            startActivity(callintent);
        }
    }
}
