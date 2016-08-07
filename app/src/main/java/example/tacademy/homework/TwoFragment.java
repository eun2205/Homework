package example.tacademy.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-08-02.
 */
public class TwoFragment extends Fragment {
    public TwoFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    EditText whereView;
    ListView listView;
    ArrayAdapter<String> mAdapter;
    //  FragmentTabHost tabHost;


    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_two, container, false);
        whereView = (EditText) view.findViewById(R.id.edit_where);
        //   whereView.setOnEditorActionListener(this);
        Button btn = (Button) view.findViewById(R.id.btn_clear);
        btn.setVisibility(View.GONE);
        whereView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                switch (i) {
                    case EditorInfo.IME_ACTION_SEARCH:
                        return true;
                    default:
                        return false;
                }
            }
        });
        whereView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String input = whereView.getText().toString();
                if (input.length() > 0) {
                    Button btn = (Button) view.findViewById(R.id.btn_clear);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            whereView.setText(null);
                        }
                    });
                    btn.setVisibility(View.VISIBLE);
                    btn.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                return;
            }
        });
        listView = (ListView) view.findViewById(R.id.listView);
        String[] items = new String[]{"로마", "베니스", "도쿄", "런던", "밀라노", "마드리드", "서울", "두브로브니크", "파리",
                "오사카", "방콕", "자다르"};
        mAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(mAdapter);
        return view;
    }
}
