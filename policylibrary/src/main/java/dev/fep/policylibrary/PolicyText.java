package dev.fep.policylibrary;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class PolicyText extends android.support.v7.widget.AppCompatTextView {
    public PolicyText(Context context, AttributeSet attr) {
        super(context,attr);



    }

    @Override
    public void onFinishInflate() {

        this.setText("Using this app you accept the following terms and conditions. Click here to read more.");
        this.setTextSize(14f);
this.setTextColor(Color.parseColor("#000000"));
this.setAlpha(0.5f);
       // this.setTypeface(this.getTypeface(), Typeface.BOLD);

        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://91.134.193.166/Policies/"));
                getContext().startActivity(browserIntent);
            }
        });
        // this is the right point to do some things with View objects,
        // as example childs of THIS View object
        super.onFinishInflate();
    }
}