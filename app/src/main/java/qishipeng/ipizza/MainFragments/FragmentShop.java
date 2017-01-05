package qishipeng.ipizza.MainFragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import qishipeng.ipizza.R;

/**
 * Created by Shipeng Qi on 2017/1/5.
 */
public class FragmentShop extends Fragment{
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        view =  inflater.inflate(R.layout.fragment_shop, container, false);
        return view;
    }
}
