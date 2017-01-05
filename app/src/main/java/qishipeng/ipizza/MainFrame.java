package qishipeng.ipizza;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

import qishipeng.ipizza.CustomWidgets.BottomBar;
import qishipeng.ipizza.MainFragments.FragmentShop;
import qishipeng.ipizza.MainFragments.FragmentSolved;
import qishipeng.ipizza.MainFragments.FragmentStatistic;
import qishipeng.ipizza.MainFragments.FragmentUnsolved;

public class MainFrame extends Activity {
    static BottomBar mBottomBar;

    private FragmentUnsolved mFragmentUnsolved;
    private FragmentSolved mFragmentSolved;
    private FragmentStatistic mFragmentStatistic;
    private FragmentShop mFragmentShop;

    private FragmentManager mFragmentManager;

    View.OnClickListener mBottomBarClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_frame);

        mBottomBar = (BottomBar)findViewById(R.id.main_bottombar);

        mFragmentManager = getFragmentManager();

        mFragmentUnsolved = new FragmentUnsolved();
        mFragmentSolved = new FragmentSolved();
        mFragmentStatistic = new FragmentStatistic();
        mFragmentShop = new FragmentShop();

        // set default fragment
        FragmentTransaction transaction = mFragmentManager.beginTransaction();
        transaction.replace(R.id.main_content, mFragmentUnsolved);
        transaction.commit();

        initBottomBarClickListener();
        mBottomBar.setOnItemClickListener(mBottomBarClickListener);
    }

    private void initBottomBarClickListener() {
        mBottomBarClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();

                FragmentTransaction transaction = mFragmentManager.beginTransaction();
                switch (id)
                {
                    case R.id.bottombar_unsolved_btn:
//                        bottomBar.onClickChangeColor(1);
                        transaction.replace(R.id.main_content, mFragmentUnsolved);
                        break;
                    case R.id.bottombar_unsolved_txt:
//                        bottomBar.onClickChangeColor(1);
                        transaction.replace(R.id.main_content, mFragmentUnsolved);
                        break;
                    case R.id.bottombar_solved_btn:
//                        bottomBar.onClickChangeColor(2);
                        transaction.replace(R.id.main_content, mFragmentSolved);
                        break;
                    case R.id.bottombar_solved_txt:
//                        bottomBar.onClickChangeColor(2);
                        transaction.replace(R.id.main_content, mFragmentSolved);
                        break;
                    case R.id.bottombar_statistic_btn:
//                        bottomBar.onClickChangeColor(3);
                        transaction.replace(R.id.main_content, mFragmentStatistic);
                        break;
                    case R.id.bottombar_statistic_txt:
//                        bottomBar.onClickChangeColor(3);
                        transaction.replace(R.id.main_content, mFragmentStatistic);
                        break;
                    case R.id.bottombar_shop_btn:
//                        bottomBar.onClickChangeColor(4);
                        transaction.replace(R.id.main_content, mFragmentShop);
                        break;
                    case R.id.bottombar_shop_txt:
//                        bottomBar.onClickChangeColor(4);
                        transaction.replace(R.id.main_content, mFragmentShop);
                        break;
                    default:break;
                }
                transaction.commit();
            }
        };
    }


}
