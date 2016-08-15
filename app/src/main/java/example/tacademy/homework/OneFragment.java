package example.tacademy.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import example.tacademy.homework.adapter.ViewPagerAdapter;

/**
 * Created by Tacademy on 2016-08-02.
 */
public class OneFragment extends Fragment {
    RecyclerView listView;
    ViewPagerAdapter mAdapter;

    public OneFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        listView =(RecyclerView)view.findViewById(R.id.rv_list);
        mAdapter = new ViewPagerAdapter();
        listView.setAdapter(mAdapter);

        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        listView.setLayoutManager(manager);
        return view;
    }
}
