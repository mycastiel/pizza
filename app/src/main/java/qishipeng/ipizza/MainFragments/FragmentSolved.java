package qishipeng.ipizza.MainFragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import qishipeng.ipizza.CustomWidgets.SolvedBar;
import qishipeng.ipizza.R;
import qishipeng.ipizza.SolvedFragments.FragmentSolvedAdvices;
import qishipeng.ipizza.SolvedFragments.FragmentSolvedCanceled;
import qishipeng.ipizza.SolvedFragments.FragmentSolvedFinished;

/**
 * Created by Shipeng Qi on 2017/1/5.
 */
public class FragmentSolved extends Fragment{
    private View view;
    static SolvedBar mSolvedBar;
    private FragmentSolvedFinished mFragmentSolvedFinished;
    private FragmentSolvedCanceled mFragmentSolvedCanceled;
    private FragmentSolvedAdvices mFragmentSolvedAdvices;
    private FragmentManager mFragmentManager;
    View.OnClickListener mSolvedBarClickListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){

        view =  inflater.inflate(R.layout.fragment_solved, container, false);
        mFragmentManager = getFragmentManager();
        mSolvedBar = (SolvedBar) view.findViewById(R.id.solved_bar);


        mFragmentSolvedCanceled = new FragmentSolvedCanceled();
        mFragmentSolvedFinished = new FragmentSolvedFinished();
        mFragmentSolvedAdvices = new FragmentSolvedAdvices();

        FragmentTransaction transaction = mFragmentManager.beginTransaction();
        transaction.replace(R.id.solved_content, mFragmentSolvedFinished);
        transaction.commit();

        initSolvedBarClickListener();
        mSolvedBar.setOnItemClickListener(mSolvedBarClickListener);
        return view;
    }

    private void initSolvedBarClickListener() {
        mSolvedBarClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();

                FragmentTransaction transaction = mFragmentManager.beginTransaction();
                switch (id)
                {
                    case R.id.solvedbar_finished_txt:
//                        bottomBar.onClickChangeColor(1);
                        transaction.replace(R.id.solved_content, mFragmentSolvedFinished);
                        break;
                    case R.id.solvedbar_canceled_txt:
//                        bottomBar.onClickChangeColor(2);
                        transaction.replace(R.id.solved_content, mFragmentSolvedCanceled);
                        break;
                    case R.id.solvedbar_advices_txt:
//                        bottomBar.onClickChangeColor(3);
                        transaction.replace(R.id.solved_content, mFragmentSolvedAdvices);
                        break;
                    default:break;
                }
                transaction.commit();
            }
        };
    }



}
