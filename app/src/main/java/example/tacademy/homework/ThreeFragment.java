package example.tacademy.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Tacademy on 2016-08-02.
 */
public class ThreeFragment extends Fragment {

    public ThreeFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

 //   FragmentTabHost tabHost;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three, container, false);
//        tabHost = (FragmentTabHost)view.findViewById(R.id.tabhost);
//        tabHost.setup(getContext(), getChildFragmentManager(), android.R.id.tabcontent);
        return view;

    }
}
