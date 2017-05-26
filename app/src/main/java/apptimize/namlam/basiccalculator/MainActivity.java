package apptimize.namlam.basiccalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.apptimize.Apptimize;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Apptimize.setup(this, "C9ErhVDU6GbCbxmqiaxagkdqcrjh5ac");
        init();
    }

    private void init() {
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonRes = (Button) findViewById(R.id.buttonRes);
        buttonEq = (Button) findViewById(R.id.buttonEq);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        numberView = (TextView) findViewById(R.id.numberView);

        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonRes.setOnClickListener(this);
        buttonEq.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);

        reset();
    }
    
    private void reset() {
        toDisplay = "";
        numberView.setText(toDisplay);
        result = 0;
        op = -1;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.buttonRes:
                reset();
                break;
            case R.id.buttonAdd:
                num1 = numberView.getText().toString();
                toDisplay = "";
                numberView.setText(toDisplay);
                op = 0;
                break;
            case R.id.buttonSub:
                num1 = numberView.getText().toString();
                toDisplay = "";
                numberView.setText(toDisplay);
                op = 1;
                break;
            case R.id.buttonDiv:
                num1 = numberView.getText().toString();
                toDisplay = "";
                numberView.setText(toDisplay);
                op = 2;
                break;
            case R.id.buttonMul:
                num1 = numberView.getText().toString();
                toDisplay = "";
                numberView.setText(toDisplay);
                op = 3;
                break;
            case R.id.button0:
                toDisplay += "0";
                numberView.setText(toDisplay);
                break;
            case R.id.button1:
                toDisplay += "1";
                numberView.setText(toDisplay);
                break;
            case R.id.button2:
                toDisplay += "2";
                numberView.setText(toDisplay);
                break;
            case R.id.button3:
                toDisplay += "3";
                numberView.setText(toDisplay);
                break;
            case R.id.button4:
                toDisplay += "4";
                numberView.setText(toDisplay);
                break;
            case R.id.button5:
                toDisplay += "5";
                numberView.setText(toDisplay);
                break;
            case R.id.button6:
                toDisplay += "6";
                numberView.setText(toDisplay);
                break;
            case R.id.button7:
                toDisplay += "7";
                numberView.setText(toDisplay);
                break;
            case R.id.button8:
                toDisplay += "8";
                numberView.setText(toDisplay);
                break;
            case R.id.button9:
                toDisplay += "9";
                numberView.setText(toDisplay);
                break;
            case R.id.buttonDot:
                toDisplay += ".";
                numberView.setText(toDisplay);
                break;
            case R.id.buttonEq:
                num2 = numberView.getText().toString();
                if(op == 0) { result = Double.parseDouble(num1) + Double.parseDouble(num2); }
                else if(op == 1) { result = Double.parseDouble(num1) - Double.parseDouble(num2); }
                else if(op == 2) { result = Double.parseDouble(num1) / Double.parseDouble(num2); }
                else if(op == 3) { result = Double.parseDouble(num1) * Double.parseDouble(num2); }
                numberView.setText(Double.toString(result));
                break;
        }
    }

    private Button buttonAdd;
    private Button buttonSub;
    private Button buttonDiv;
    private Button buttonMul;
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonRes;
    private Button buttonEq;
    private Button buttonDot;
    private TextView numberView;
    String num1;
    String num2;
    String toDisplay;
    double result;
    int op;
}
