package inc.jjohn.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button sum;
    private Button minus;
    private Button product;
    private Button equal;
    private Button division;
    private Button clear;
    private TextView info;
    private TextView result;
    private final char Add = '+';
    private final char Sub = '-';
    private final char Muti='*';
    private final char Equal='0';
    private final char Div='/';
    private double val1 = Double.NaN;
    private double val2;
    private char action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        info.setText(info.getText().toString() + "1");
                    }
                });
                two.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        info.setText(info.getText().toString() + "2");
                    }
                });
                        three.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                info.setText(info.getText().toString() + "3");
                            }
                        });

                                four.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        info.setText(info.getText().toString() + "4");
                                    }
                                });
                                        five.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                info.setText(info.getText().toString() + "5");
                                            }
                                        });
                                                six.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        info.setText(info.getText().toString() + "6");
                                                    }
                                                });
                                                        seven.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                info.setText(info.getText().toString() + "7");
                                                            }
                                                        });
                                                                eight.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        info.setText(info.getText().toString() + "8");
                                                                    }
                                                                });
                                                                        nine.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                info.setText(info.getText().toString() + "9");
                                                                            }
                                                                        });
        sum.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                compute();
                action =Add;
                result.setText(String.valueOf(val1)+ "+");
                info.setText(null);
            }
        });
        minus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                compute();
                action =Sub;
                result.setText(String.valueOf(val1)+ "-");
                info.setText(null);
            }
        });
        product.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                compute();
                action =Muti;
                result.setText(String.valueOf(val1)+ "*");
                info.setText(null);
            }
        });
        division.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                compute();
                action =Div;
                result.setText(String.valueOf(val1)+ "/");
                info.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                compute();
                action =Equal;
                result.setText(result.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                info.setText(null);
            }
        });
clear.setOnClickListener(new View.OnClickListener(){
    @Override
    public void onClick(View v)
    {
        if(info.getText().length()>0)
        {
            CharSequence name = info.getText().toString();
            info.setText(name.subSequence(0,name.length()-1));
        }
        else
        {
            val1=Double.NaN;
            val2=Double.NaN;
            info.setText(null);
            result.setText(null);
        }
    }
});

    }

    public void setupUIViews() {
        one = (Button) findViewById(R.id.but1);
        two = (Button) findViewById(R.id.but2);
        three = (Button) findViewById(R.id.but3);
        four = (Button) findViewById(R.id.but4);
        five = (Button) findViewById(R.id.but5);
        six = (Button) findViewById(R.id.but6);
        seven = (Button) findViewById(R.id.but7);
        eight = (Button) findViewById(R.id.but8);
        nine = (Button) findViewById(R.id.but9);
        zero = (Button) findViewById(R.id.but0);
        sum = (Button) findViewById(R.id.butplus);
        minus = (Button) findViewById(R.id.butminus);
        product = (Button) findViewById(R.id.butproduct);
        division =(Button)findViewById(R.id.butdivision);
        info=(TextView)findViewById(R.id.tv1);
        result =(TextView)findViewById(R.id.tv2);
        equal = (Button)findViewById(R.id.butequals);
        clear = (Button)findViewById(R.id.butc);
    }
    private void compute()
    {
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(info.getText().toString());
            switch(action)
            {
                case Add:
                {
                    val1=val1+val2;
                    break;
                }
                case Sub:
                {
                    val1=val1-val2;
                    break;
                }
                case Muti:
                {
                    val1=val1*val2;
                    break;
                }
                case Div:
                {
                    val1=val1/val2;
                }
                case Equal:
                {
                    break;
                }
            }
        }
        else
        {
            val1=Double.parseDouble(info.getText().toString());
        }
    }
}
