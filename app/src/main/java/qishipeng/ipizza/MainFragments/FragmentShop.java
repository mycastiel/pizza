package qishipeng.ipizza.MainFragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

import qishipeng.ipizza.Activity.LoginActivity;
import qishipeng.ipizza.R;
import android.view.ViewGroup;
import android.widget.ImageView;

import qishipeng.ipizza.R;

/**
 * Created by Shipeng Qi on 2017/1/5.
 */
public class FragmentShop extends Fragment{
    private View view;
    private ImageView user;
    private FragmentManager mFragmentManager;
    public TextView mAccount;
    public TextView mPassword;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        mFragmentManager = getFragmentManager();
        view =  inflater.inflate(R.layout.fragment_shop, container, false);
        //Toast.makeText(view.getContext(),"ready",Toast.LENGTH_SHORT).show();
        user = (ImageView) view.findViewById(R.id.fragshop_avatar);
        mAccount = (TextView) view.findViewById(R.id.fragshop_accountname);
        mPassword = (TextView) view.findViewById(R.id.fragshop_shopname);
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(view.getContext(),"click",Toast.LENGTH_SHORT).show();
                Intent it = new Intent(view.getContext(),LoginActivity.class);
                startActivity(it);
            }
        });
        return view;
    }



}
