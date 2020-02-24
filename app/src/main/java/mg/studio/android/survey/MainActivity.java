package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button  mButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        mButton1 =(Button)findViewById(R.id.button1);
        mButton1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.button1:
                setContentView(R.layout.question_one);
                mButton1=(Button)findViewById(R.id.button2);
                mButton1.setOnClickListener(this);
                break;
            case R.id.button2:
                setContentView(R.layout.question_two);
                mButton1=(Button)findViewById(R.id.button3);
                mButton1.setOnClickListener(this);
                break;
            case R.id.button3:
                setContentView(R.layout.question_three);
                mButton1=(Button)findViewById(R.id.button4);
                mButton1.setOnClickListener(this);
                break;
            case R.id.button4:
                setContentView(R.layout.question_four);
                mButton1=(Button)findViewById(R.id.button5);
                mButton1.setOnClickListener(this);
                break;
            case R.id.button5:
                setContentView(R.layout.question_five);
                mButton1=(Button)findViewById(R.id.button6);
                mButton1.setOnClickListener(this);
                break;
            case R.id.button6:
                setContentView(R.layout.question_six);
                mButton1=(Button)findViewById(R.id.button7);
                mButton1.setOnClickListener(this);
                break;
            case R.id.button7:
                setContentView(R.layout.question_seven);
                mButton1=(Button)findViewById(R.id.button8);
                mButton1.setOnClickListener(this);
                break;
            case R.id.button8:
                setContentView(R.layout.question_eight);
                mButton1=(Button)findViewById(R.id.button9);
                mButton1.setOnClickListener(this);
                break;
            case R.id.button9:
                setContentView(R.layout.question_nine);
                mButton1=(Button)findViewById(R.id.button10);
                mButton1.setOnClickListener(this);
                break;
            case R.id.button10:
                setContentView(R.layout.question_ten);
                mButton1=(Button)findViewById(R.id.button11);
                mButton1.setOnClickListener(this);
                break;
            case R.id.button11:
                setContentView(R.layout.question_eleven);
                mButton1=(Button)findViewById(R.id.button12);
                mButton1.setOnClickListener(this);
                break;
            case R.id.button12:
                setContentView(R.layout.question_twelve);
                mButton1=(Button)findViewById(R.id.button13);
                mButton1.setOnClickListener(this);
                break;
            case R.id.button13:
                setContentView(R.layout.finish_survey);
                mButton1=(Button)findViewById(R.id.button14);
                mButton1.setOnClickListener(this);
                break;
            case R.id.button14:
                setContentView(R.layout.welcome);
                mButton1=(Button)findViewById(R.id.button1);
                mButton1.setOnClickListener(this);
                break;

        }
    }
}
