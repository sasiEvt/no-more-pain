package evt.co.il.nomorepain;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class contactActivity extends AppCompatActivity {

    WebView wbContact;
    Button btnrrr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);


        initlayout();

        initevent();
    }

    private void initevent() {

        btnrrr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(contactActivity.this,beforeQActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initlayout() {

        wbContact = (WebView) findViewById(R.id.webContact);
        btnrrr = (Button) findViewById(R.id.btnrrr);


        wbContact.getSettings().setJavaScriptEnabled(true);
        wbContact.getSettings().setDisplayZoomControls(true);



        wbContact.loadUrl("http://www.evt.co.il/%D7%AA%D7%A7%D7%A0%D7%95%D7%9F-%D7%90%D7%A4%D7%9C%D7%99%D7%A7%D7%A6%D7%99%D7%94-%D7%A4%D7%99%D7%96%D7%99%D7%95%D7%98%D7%A8%D7%A4%D7%99%D7%94/");
    }
}
