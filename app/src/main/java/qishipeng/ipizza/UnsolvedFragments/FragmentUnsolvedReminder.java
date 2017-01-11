package qishipeng.ipizza.UnsolvedFragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import qishipeng.ipizza.R;

/**
 * Created by Castiel on 2017/1/9.
 */

public class FragmentUnsolvedReminder extends Fragment{
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view =  inflater.inflate(R.layout.fragment_unsolved_reminder, container, false);
        return view;
    }
}
