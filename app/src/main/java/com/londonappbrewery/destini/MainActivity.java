package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
 private TextView mTextView;
 private Button mStoryButtonTop;
 private Button mStoryButtonBottom;
 private int counter;
 private int holder=3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView=(TextView)findViewById(R.id.storyTextView);
        mStoryButtonTop=(Button)findViewById(R.id.buttonTop);
        mStoryButtonBottom=(Button)findViewById(R.id.buttonBottom);
        mTextView.setText(R.string.T1_Story);
        mStoryButtonTop.setText(R.string.T1_Ans1);
        mStoryButtonBottom.setText(R.string.T1_Ans2);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mStoryButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    counter=holder;
                if (counter==3){
                    mStoryButtonTop.setText(R.string.T3_Ans1);
                    mStoryButtonBottom.setText(R.string.T3_Ans2);
                    mTextView.setText(R.string.T3_Story);
                    holder=1;
                }else if (counter==1){
                    mStoryButtonBottom.setVisibility(View.GONE);
                    mStoryButtonTop.setVisibility(View.GONE);
                    mTextView.setText(R.string.T6_End);
                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mStoryButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counter==1){
                  mStoryButtonBottom.setVisibility(View.GONE);
                  mStoryButtonTop.setVisibility(View.GONE);
                  mTextView.setText(R.string.T5_End);
                } else if (counter ==3){
                    mStoryButtonTop.setText(R.string.T3_Ans1);
                    mStoryButtonBottom.setText(R.string.T3_Ans2);
                    mTextView.setText(R.string.T3_Story);
                    counter=1;
                }else if (counter ==2){
                    mStoryButtonTop.setVisibility(View.GONE);
                    mStoryButtonBottom.setVisibility(View.GONE);
                    mTextView.setText(R.string.T4_End);
                }else if (counter==0){
                    mStoryButtonBottom.setText(R.string.T2_Ans2);
                    mStoryButtonTop.setText(R.string.T2_Ans1);
                    mTextView.setText(R.string.T2_Story);
                    counter=2;
                }
            }
        });

    }
}
