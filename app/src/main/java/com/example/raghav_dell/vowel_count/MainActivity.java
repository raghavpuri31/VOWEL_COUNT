package com.example.raghav_dell.vowel_count;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{
    EditText e,e1;
    Button b;
    int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showp();

    }
    void showp()
    {
        e=(EditText)findViewById(R.id.editText);
        e1=(EditText)findViewById(R.id.editText2);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= String.valueOf(e.getText());
                char a[]=s.toCharArray();
                for(int i=0;i<s.length();++i)
                {
                    if((a[i]=='a') || (a[i]=='e') || (a[i]=='i') ||(a[i]=='o') || (a[i]=='u') ||(a[i]=='E') || (a[i]=='A') || (a[i]=='I') || (a[i]=='O') || (a[i]=='U'))
                        ++count;

                }
                e1.setText(Integer.valueOf(count).toString());

            }
        });
    }
}
