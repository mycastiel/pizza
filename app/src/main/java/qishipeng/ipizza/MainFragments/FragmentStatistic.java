package qishipeng.ipizza.MainFragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import qishipeng.ipizza.CustomWidgets.StatisticBar;
import qishipeng.ipizza.R;
import qishipeng.ipizza.StatisticFragments.FragmentStatisticAllcomments;
import qishipeng.ipizza.StatisticFragments.FragmentStatisticFood;
import qishipeng.ipizza.StatisticFragments.FragmentStatisticTotal;

/**
 * Created by Shipeng Qi on 2017/1/5.
 */
public class FragmentStatistic extends Fragment{

    private View view;
    static StatisticBar mStatisticBar;
    private FragmentStatisticAllcomments mFragmentStatisticAllcomments;
    private FragmentStatisticTotal mFragmentStatisticTotal;
    private FragmentStatisticFood mFragmentStatisticFood;
    private FragmentManager mFragmentManager;
    View.OnClickListener mUnsolvedBarClickListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){

        view =  inflater.inflate(R.layout.fragment_statistic, container, false);
        mFragmentManager = getFragmentManager();
        mStatisticBar = (StatisticBar) view.findViewById(R.id.statistic_bar);


        mFragmentStatisticTotal = new FragmentStatisticTotal();
        mFragmentStatisticFood = new FragmentStatisticFood();
        mFragmentStatisticAllcomments = new FragmentStatisticAllcomments();
        FragmentTransaction transaction = mFragmentManager.beginTransaction();
        transaction.replace(R.id.statisitc_content, mFragmentStatisticTotal);
        transaction.commit();

        initUnsolvedBarClickListener();
        mStatisticBar.setOnItemClickListener(mUnsolvedBarClickListener);
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
                    case R.id.statisticbar_total_txt:
//                        bottomBar.onClickChangeColor(1);
                        transaction.replace(R.id.statisitc_content, mFragmentStatisticTotal);
                        break;
                    case R.id.statisticbar_food_txt:
//                        bottomBar.onClickChangeColor(2);
                        transaction.replace(R.id.statisitc_content, mFragmentStatisticFood);
                        break;
                    case R.id.statisticbar_allcomments_txt:
//                        bottomBar.onClickChangeColor(3);
                        transaction.replace(R.id.statisitc_content, mFragmentStatisticAllcomments);
                        break;
                    default:break;
                }
                transaction.commit();
            }
        };
    }

}
