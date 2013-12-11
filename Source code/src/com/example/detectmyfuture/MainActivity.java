package com.example.detectmyfuture;
import java.lang.reflect.Method;

import android.view.*;
import android.view.View.OnLongClickListener;
import android.os.Bundle;

import android.app.Activity;

import android.content.Intent;


import android.view.Menu;


import android.widget.DatePicker;
import android.widget.EditText;

import android.widget.TextView;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE="com.example.detectmyfuture.MESSAGE";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        EditText name=(EditText) findViewById(R.id.name);
        name.setOnLongClickListener(lclick2);
        int currentApiVersion=android.os.Build.VERSION.SDK_INT;
        if(currentApiVersion>=11)
        {
        	try
        	{
        		DatePicker dob=(DatePicker) findViewById(R.id.dob);
            	Method m=dob.getClass().getMethod("setCalendarViewShown", boolean.class);
            	m.invoke(dob, false);	
        	}
        	catch(Exception ec)
        	{
        		
        	}
        	
        }
        
        
    }
    Integer bn=0,fn=0,nn=0,nv=0,bv=0,fv=0;
    public void dm_click(View v)
    {
    	nn=0;
    	String ss;
    	
    	EditText n= (EditText) findViewById(R.id.name);
    	ss=(String)n.getText().toString();
    	
    	for(int x=0;x<ss.length();x++)
    	{
            switch (ss.charAt(x))
            {
                case 'a':
                case 'i':
                case 'j':
                case 'q':
                case 'y':
                case 'A':
                case 'I':
                case 'J':
                case 'Q':
                case 'Y':
                    nn += 1;
                    break;
                case 'b':
                case 'k':
                case 'r':
                case 'B':
                case 'K':
                case 'R':
                    nn += 2;
                    break;
                case 'c':
                case 'l':
                case 'g':
                case 's':
                case 'C':
                case 'L':
                case 'G':
                case 'S':
                    nn += 3;
                    break;
                case 'd':
                case 'm':
                case 't':
                case 'D':
                case 'M':
                case 'T':
                    nn += 4;
                    break;
                case 'e':
                case 'n':
                case 'h':
                case 'x':
                case 'E':
                case 'N':
                case 'H':
                case 'X':
                    nn += 5;
                    break;
                case 'u':
                case 'v':
                case 'w':
                case 'U':
                case 'V':
                case 'W':
                    nn += 6;
                    break;
                case 'o':
                case 'z':
                case 'O':
                case 'Z':
                    nn += 7;
                    break;
                case 'f':
                case 'p':
                case 'F':
                case 'P':
                    nn += 8;
                    break;
            }
 
    	}
    	while (nn > 9)
        {
            nv = nn / 10;
            nn = nn % 10 + nv;
        }
    	TextView nt=(TextView)findViewById(R.id.TextView03);
    	
    	nt.setText("Your Name Equivalent Number: "+nn.toString());
    	DatePicker d=(DatePicker) findViewById(R.id.dob);
    	bn=d.getDayOfMonth();
    	while(bn>9)
    	{
    		bv=bn/10;
    		bn=bn%10+bv;
    	}
    	TextView bt=(TextView)findViewById(R.id.TextView01);
    	bt.setText("Your Birth Number: "+bn.toString());
    	
    	fn=d.getDayOfMonth()+d.getMonth()+d.getYear()+1;
    	while(fn>9)
    	{
    		fv=fn/10;
    		fn=fn%10+fv;
    	}
    	
    	TextView ft=(TextView)findViewById(R.id.textView2);
    	ft.setText("Your Fate Number: "+fn.toString());
    }
    public void nn_click(View v)
    {
    	Intent i=new Intent(this,Activity2.class);
    	i.putExtra(EXTRA_MESSAGE, nn.toString()+bn.toString()+fn.toString()+"1");
    	startActivity(i);
    	
    }
    public void bn_click(View v)
    {
    	Intent i=new Intent(this,Activity2.class);
    	i.putExtra(EXTRA_MESSAGE, nn.toString()+bn.toString()+fn.toString()+"2");
    	startActivity(i);
    	
    }
    public void fn_click(View v)
    {
    	Intent i=new Intent(this,Activity2.class);
    	i.putExtra(EXTRA_MESSAGE, nn.toString()+bn.toString()+fn.toString()+"3");
    	startActivity(i);
    	
    }
    public OnLongClickListener lclick2=new OnLongClickListener()
    {
    public boolean onLongClick(View v)
    {
    	
    	EditText name=(EditText) findViewById(R.id.name);
    	name.setText("");
		return true;
    	
    }
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
