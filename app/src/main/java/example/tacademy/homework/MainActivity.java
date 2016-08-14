package example.tacademy.homework;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Tacademy on 2016-08-02.
 */
public class MainActivity extends AppCompatActivity {

    FragmentTabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost = (FragmentTabHost) findViewById(R.id.tabhost);
        tabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("", getResources().getDrawable(R.drawable.sample_1)),
                OneFragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("", getResources().getDrawable(R.drawable.sample_2)),
                TwoFragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("", getResources().getDrawable(R.drawable.sample_3)),
                ThreeFragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab4").setIndicator("", getResources().getDrawable(R.drawable.sample_4)),
                FourFragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab5").setIndicator("", getResources().getDrawable(R.drawable.sample_5)),
                FiveFragment.class, null);


        tabHost.setCurrentTabByTag("tab1");

    }

    public void moveFragment() {
        tabHost.setCurrentTabByTag("tab1");
    }

}



