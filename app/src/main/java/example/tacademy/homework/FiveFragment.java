package example.tacademy.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Tacademy on 2016-08-02.
 */
public class FiveFragment extends Fragment {

    ListView listView;
    ArrayAdapter<String> mAdapter;

    public FiveFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_five, container, false);
        listView = (ListView) view.findViewById(R.id.list_setting);
        String[] items = new String[]{"은지", "프로필 확인 및 수정", "친구 초대하기", "위시리스트", "환경설정", "도움말과 지원", "호스팅을 해야하는 이유", "숙소를 등록하세요", "피드백 남기기"};
        mAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(mAdapter);
        return view;
    }


}
