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
 * Created by Castiel on 2017/1/9.
 */
public class UnsolvedBar extends LinearLayout {

    private Context mContext;
    private RelativeLayout mUnsolvedNewIntent, mUnsolvedUndistributed, mUnsolvedReminder, mUnsolvedComments;
    private TextView mUnsolvedNewIntentTxt, mUnsolvedUndistributedTxt, mUnsolvedReminderTxt, mUnsolvedCommentsTxt;
    public UnsolvedBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mContext = context;
        initUnsolvedBar();
    }

    public UnsolvedBar(Context context) {
        super(context);
        mContext = context;
        initUnsolvedBar();
    }

    private void initUnsolvedBar(){
        LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.unsolved_bar,null);

        layout.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 1.0f));

        this.mUnsolvedNewIntent = (RelativeLayout)layout.findViewById(R.id.cell_new_intent);
        this.mUnsolvedUndistributed = (RelativeLayout)layout.findViewById(R.id.cell_undistributed);
        this.mUnsolvedReminder = (RelativeLayout)layout.findViewById(R.id.cell_reminder);
        this.mUnsolvedComments = (RelativeLayout)layout.findViewById(R.id.cell_comments);

        this.mUnsolvedNewIntentTxt = (TextView) layout.findViewById(R.id.unsolvedbar_newintent_txt);
        this.mUnsolvedUndistributedTxt = (TextView) layout.findViewById(R.id.unsolvedbar_undistributed_txt);
        this.mUnsolvedReminderTxt = (TextView) layout.findViewById(R.id.unsolvedbar_reminder_txt);
        this.mUnsolvedCommentsTxt = (TextView) layout.findViewById(R.id.unsolvedbar_comments_txt);

        this.addView(layout);
    }

    public void setOnItemClickListener(OnClickListener onItemClickListener){
        mUnsolvedNewIntent.setOnClickListener(onItemClickListener);
        mUnsolvedUndistributed.setOnClickListener(onItemClickListener);
        mUnsolvedReminder.setOnClickListener(onItemClickListener);
        mUnsolvedComments.setOnClickListener(onItemClickListener);

        mUnsolvedNewIntentTxt.setOnClickListener(onItemClickListener);
        mUnsolvedUndistributedTxt.setOnClickListener(onItemClickListener);
        mUnsolvedReminderTxt.setOnClickListener(onItemClickListener);
        mUnsolvedCommentsTxt.setOnClickListener(onItemClickListener);
    }

}
