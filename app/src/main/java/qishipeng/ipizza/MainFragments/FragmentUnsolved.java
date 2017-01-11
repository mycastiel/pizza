package qishipeng.ipizza.MainFragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import qishipeng.ipizza.CustomWidgets.UnsolvedBar;
import qishipeng.ipizza.R;
import qishipeng.ipizza.UnsolvedFragments.FragmentUnsolvedComments;
import qishipeng.ipizza.UnsolvedFragments.FragmentUnsolvedNewIntent;
import qishipeng.ipizza.UnsolvedFragments.FragmentUnsolvedReminder;
import qishipeng.ipizza.UnsolvedFragments.FragmentUnsolvedUndistributed;

/**
 * Created by Shipeng Qi on 2017/1/5.
 */
public class FragmentUnsolved extends Fragment{
    private View view;
    static UnsolvedBar mUnsolvedBar;
    private FragmentUnsolvedComments mFragmentUnsolvedComments;
    private FragmentUnsolvedNewIntent mFragmentUnsolvedNewIntent;
    private FragmentUnsolvedReminder mFragmentUnsolvedReminder;
    private FragmentUnsolvedUndistributed mFragmentUnsolvedUndistributed;
    private FragmentManager mFragmentManager;
    View.OnClickListener mUnsolvedBarClickListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){

        view =  inflater.inflate(R.layout.fragment_unsolved, container, false);
        mFragmentManager = getFragmentManager();
        mUnsolvedBar = (UnsolvedBar) view.findViewById(R.id.unsolved_bar);


        mFragmentUnsolvedNewIntent = new FragmentUnsolvedNewIntent();
        mFragmentUnsolvedComments = new FragmentUnsolvedComments();
        mFragmentUnsolvedReminder = new FragmentUnsolvedReminder();
        mFragmentUnsolvedUndistributed = new FragmentUnsolvedUndistributed();
        FragmentTransaction transaction = mFragmentManager.beginTransaction();
        transaction.replace(R.id.unsolved_content, mFragmentUnsolvedNewIntent);
        transaction.commit();

        initUnsolvedBarClickListener();
        mUnsolvedBar.setOnItemClickListener(mUnsolvedBarClickListener);
        return view;
    }

    private void initUnsolvedBarClickListener() {
        mUnsolvedBarClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();

                FragmentTransaction transaction = mFragmentManager.beginTransaction();
                switch (id)
                {
                    case R.id.unsolvedbar_newintent_txt:
//                        bottomBar.onClickChangeColor(1);
                        transaction.replace(R.id.unsolved_content, mFragmentUnsolvedNewIntent);
                        break;
                    case R.id.unsolvedbar_undistributed_txt:
//                        bottomBar.onClickChangeColor(2);
                        transaction.replace(R.id.unsolved_content, mFragmentUnsolvedUndistributed);
                        break;
                    case R.id.unsolvedbar_reminder_txt:
//                        bottomBar.onClickChangeColor(3);
                        transaction.replace(R.id.unsolved_content, mFragmentUnsolvedReminder);
                        break;
                    case R.id.unsolvedbar_comments_txt:
//                        bottomBar.onClickChangeColor(4);
                        transaction.replace(R.id.unsolved_content, mFragmentUnsolvedComments);
                        break;
                    default:break;
                }
                transaction.commit();
            }
        };
    }



}
