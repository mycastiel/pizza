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
 * Created by Castiel on 2017/1/10.
 */
public class SolvedBar extends LinearLayout {

    private Context mContext;
    private RelativeLayout mSolvedFinished, mSolvedCanceled, mSolvedAdvices;
    private TextView mSolvedFinishedTxt, mSolvedCanceledTxt, mSolvedAdvicesTxt;
    public SolvedBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mContext = context;
        initSolvedBar();
    }

    public SolvedBar(Context context) {
        super(context);
        mContext = context;
        initSolvedBar();
    }

    private void initSolvedBar(){
        LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.solved_bar,null);

        layout.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 1.0f));

        this.mSolvedFinished = (RelativeLayout)layout.findViewById(R.id.cell_finished);
        this.mSolvedCanceled = (RelativeLayout)layout.findViewById(R.id.cell_canceled);
        this.mSolvedAdvices = (RelativeLayout)layout.findViewById(R.id.cell_advices);

        this.mSolvedFinishedTxt = (TextView) layout.findViewById(R.id.solvedbar_finished_txt);
        this.mSolvedCanceledTxt = (TextView) layout.findViewById(R.id.solvedbar_canceled_txt);
        this.mSolvedAdvicesTxt = (TextView) layout.findViewById(R.id.solvedbar_advices_txt);
        this.addView(layout);
    }

    public void setOnItemClickListener(OnClickListener onItemClickListener){
        mSolvedFinished.setOnClickListener(onItemClickListener);
        mSolvedCanceled.setOnClickListener(onItemClickListener);
        mSolvedAdvices.setOnClickListener(onItemClickListener);

        mSolvedFinishedTxt.setOnClickListener(onItemClickListener);
        mSolvedCanceledTxt.setOnClickListener(onItemClickListener);
        mSolvedAdvicesTxt.setOnClickListener(onItemClickListener);
    }

}
