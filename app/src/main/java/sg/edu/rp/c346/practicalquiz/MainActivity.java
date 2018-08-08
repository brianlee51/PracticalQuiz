package sg.edu.rp.c346.practicalquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    WebView wbDisplay;
    Spinner spnMedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnMedia = findViewById(R.id.spinnerMedia);
        wbDisplay = findViewById(R.id.webView);
        wbDisplay.setWebViewClient(new WebViewClient());

        spnMedia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        wbDisplay.loadUrl("https://www.facebook.com/ '");
                        break;
                    case 1:
                        wbDisplay.loadUrl("https://www.twitter.com/");
                        wbDisplay.getSettings().setJavaScriptEnabled(true);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
