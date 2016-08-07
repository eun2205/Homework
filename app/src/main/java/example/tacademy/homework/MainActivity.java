package example.tacademy.homework;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Tacademy on 2016-08-02.
 */
public class MainActivity extends AppCompatActivity{

    FragmentTabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost = (FragmentTabHost)findViewById(R.id.tabhost);
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


//        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
//            @Override
//            public void onTabChanged(String s) {
//                if ("tab1".equals(s)) {
//                    Toast.makeText(MainActivity.this, "tab1 click", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

        tabHost.setCurrentTabByTag("tab1");
    }



//    public void receiveText(String text) {
//        Fragment f = getSupportFragmentManager()
//                .findFragmentByTag("tab3");
//        if (f != null) {
//            ((ThreeFragment)f).setMessage(text);
//        } else {
//            savedMessage = text;
//        }
//        tabHost.setCurrentTabByTag("tab3");
//    }
//
//    public String getSavedMessage() {
//        return savedMessage;
//    }
//
//    String savedMessage = null;

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_fragment_tab, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if( item.getItemId() == R.id.menu_am1) {
//            Toast.makeText(this, "AM1 click", Toast.LENGTH_SHORT).show();
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
//}

}


