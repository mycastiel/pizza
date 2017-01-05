package qishipeng.ipizza.CustomWidgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import qishipeng.ipizza.R;

/**
 * Created by Shipeng Qi on 2017/1/4.
 */
public class BottomBar extends LinearLayout {

    private Context mContext;
    private RelativeLayout mUnsolvedCell, mSolvedCell, mStatisticCell, mShopCell;
    private Button mUnsolvedBtn, mSolvedBtn, mStatisticBtn, mShopBtn;

    public BottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mContext = context;
        initBottomBar();
    }

    public BottomBar(Context context) {
        super(context);
        mContext = context;
        initBottomBar();
    }

    private void initBottomBar(){
        LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.bottom_bar,null);

        layout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f));

        this.mUnsolvedCell = (RelativeLayout)layout.findViewById(R.id.cell_unsolved);
        this.mSolvedCell = (RelativeLayout)layout.findViewById(R.id.cell_solved);
        this.mStatisticCell = (RelativeLayout)layout.findViewById(R.id.cell_statistic);
        this.mShopCell = (RelativeLayout)layout.findViewById(R.id.cell_shop);

        this.mUnsolvedBtn = (Button)layout.findViewById(R.id.bottombar_unsolved_btn);
        this.mSolvedBtn = (Button)layout.findViewById(R.id.bottombar_solved_btn);
        this.mStatisticBtn = (Button)layout.findViewById(R.id.bottombar_statistic_btn);
        this.mShopBtn = (Button)layout.findViewById(R.id.bottombar_shop_btn);

        mUnsolvedBtn.setBackgroundResource(R.drawable.bottombar_green_device);

        this.addView(layout);
    }

    public void setOnItemClickListener(View.OnClickListener onItemClickListener){
        mUnsolvedCell.setOnClickListener(onItemClickListener);
        mSolvedCell.setOnClickListener(onItemClickListener);
        mStatisticCell.setOnClickListener(onItemClickListener);
        mShopCell.setOnClickListener(onItemClickListener);

        mUnsolvedBtn.setOnClickListener(onItemClickListener);
        mSolvedBtn.setOnClickListener(onItemClickListener);
        mStatisticBtn.setOnClickListener(onItemClickListener);
        mShopBtn.setOnClickListener(onItemClickListener);
    }

    public void onClickChangeColor(int index){
        switch (index){
            case 1:
                mUnsolvedBtn.setBackgroundResource(R.drawable.bottombar_green_device);
                mSolvedBtn.setBackgroundResource(R.drawable.bottombar_grey_status);
                mStatisticBtn.setBackgroundResource(R.drawable.bottombar_grey_video);
                mShopBtn.setBackgroundResource(R.drawable.bottom_grey_account);
                break;
            case 2:
                mUnsolvedBtn.setBackgroundResource(R.drawable.bottombar_grey_device);
                mSolvedBtn.setBackgroundResource(R.drawable.bottombar_green_status);
                mStatisticBtn.setBackgroundResource(R.drawable.bottombar_grey_video);
                mShopBtn.setBackgroundResource(R.drawable.bottom_grey_account);
                break;
            case 3:
                mUnsolvedBtn.setBackgroundResource(R.drawable.bottombar_grey_device);
                mSolvedBtn.setBackgroundResource(R.drawable.bottombar_grey_status);
                mStatisticBtn.setBackgroundResource(R.drawable.bottombar_green_video);
                mShopBtn.setBackgroundResource(R.drawable.bottom_grey_account);
                break;
            case 4:
                mUnsolvedBtn.setBackgroundResource(R.drawable.bottombar_grey_device);
                mSolvedBtn.setBackgroundResource(R.drawable.bottombar_grey_status);
                mStatisticBtn.setBackgroundResource(R.drawable.bottombar_grey_video);
                mShopBtn.setBackgroundResource(R.drawable.bottom_green_account);
                break;
            default:break;
        }
    }
}
