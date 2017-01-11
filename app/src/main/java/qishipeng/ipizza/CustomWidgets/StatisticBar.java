package qishipeng.ipizza.CustomWidgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import qishipeng.ipizza.R;

/**
 * Created by Castiel on 2017/1/11.
 */

public class StatisticBar extends LinearLayout {
    private Context mContext;
    private RelativeLayout mStatisticTotal, mStatisticFood, mStatisticAllcomments;
    private TextView mStatisticTotalTxt, mStatisticFoodTxt, mStatisticAllcommentsTxt;
    public StatisticBar(android.content.Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mContext = context;
        initStatisticBar();
    }

    public StatisticBar(Context context) {
        super(context);
        mContext = context;
        initStatisticBar();
    }

    private void initStatisticBar(){
        LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(android.content.Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.statistic_bar,null);

        layout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f));

        this.mStatisticTotal = (RelativeLayout)layout.findViewById(R.id.cell_total);
        this.mStatisticFood = (RelativeLayout)layout.findViewById(R.id.cell_food);
        this.mStatisticAllcomments = (RelativeLayout)layout.findViewById(R.id.cell_allcomments);

        this.mStatisticTotalTxt = (TextView) layout.findViewById(R.id.statisticbar_total_txt);
        this.mStatisticFoodTxt = (TextView) layout.findViewById(R.id.statisticbar_food_txt);
        this.mStatisticAllcommentsTxt = (TextView) layout.findViewById(R.id.statisticbar_allcomments_txt);
        this.addView(layout);
    }

    public void setOnItemClickListener(View.OnClickListener onItemClickListener){
        mStatisticTotal.setOnClickListener(onItemClickListener);
        mStatisticFood.setOnClickListener(onItemClickListener);
        mStatisticAllcomments.setOnClickListener(onItemClickListener);

        mStatisticTotalTxt.setOnClickListener(onItemClickListener);
        mStatisticFoodTxt.setOnClickListener(onItemClickListener);
        mStatisticAllcommentsTxt.setOnClickListener(onItemClickListener);
    }
}
