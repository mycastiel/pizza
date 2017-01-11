package qishipeng.ipizza.StatisticFragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import qishipeng.ipizza.R;

/**
 * Created by Castiel on 2017/1/11.
 */

public class FragmentStatisticFood extends Fragment {
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view =  inflater.inflate(R.layout.fragment_statistic_food, container, false);
        return view;
    }
}
