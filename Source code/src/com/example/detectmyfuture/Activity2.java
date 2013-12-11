package com.example.detectmyfuture;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;

public class Activity2 extends Activity {
	static char s3='1';
	static String s=new String();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity2);
		// Show the Up button in the action bar.
		setupActionBar();
		Intent i=getIntent();
		
		s=i.getStringExtra(MainActivity.EXTRA_MESSAGE);
		set_text(s.charAt(3));		
		if(s.charAt(3)=='3')
		{
			Button b=(Button) findViewById(R.id.Button01);
			b.setVisibility(View.INVISIBLE);
		}
		}
		
	

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity2, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public void back_click(View v)
	{
		switch(s.charAt(3))
		{
		case '1':
			Intent i=new Intent(this,MainActivity.class);
			startActivity(i);
			
			break;
		case '2':
			set_text('1');
			s=s.substring(0,3)+"1";
			break;
		case '3':
			set_text('2');
			s=s.substring(0, 3)+"2";
			Button b=(Button) findViewById(R.id.Button01);
			b.setVisibility(View.VISIBLE);
			break;
		}
	}
	public void forward_click(View v)
	{
		switch(s.charAt(3))
		{
		case '1':
			set_text('2');
			s=s.substring(0,3)+"2";
			break;
		case '2':
			set_text('3');
			s=s.substring(0,3)+"3";
			Button b=(Button) findViewById(R.id.Button01);
			b.setVisibility(View.INVISIBLE);
			break;
		
		}
	}
	public void set_text(char c)
	{
		
		String s2=new String();
		switch(c)
		{
		case '1':
			s3=s.charAt(0);
			
			break;
		case '2':
			s3=s.charAt(1);
			break;
		case '3':
			s3=s.charAt(2);
			break;
		}
		ImageView img=(ImageView) findViewById(R.id.imageView1);
		switch(s3)
		{
		case '1':
            s2 = "Number: 1\nPlanet/Star/Satellite: Sun\nSpecial dates: 1,10,19,28\nDay: Sunday\nColour: Reddish Orange\nLucky Stone: Ruby\nCharacter: Courage, Administrative\nFamous People in this number: Alexander";
            
            img.setImageResource(R.drawable.alex);
            break;
        case '2':
            s2 = "Number: 2\nPlanet/Star/Satellite: Moon\nSpecial dates: 2,11,20,29\nDay: Monday\nColour: White\nLucky Stone: White Pearl\nCharacter: Calm, Charming\nFamous People in this number: Thomas Hardy";
            
            img.setImageResource(R.drawable.hardy);
            break;
        case '3':
            s2 = "Number: 3\nPlanet/Star/Satellite: Jupiter\nSpecial dates: 3,12,21,30\nDay: Thursday\nColour: Yellow, Rose, Violet\nLucky Stone: Yellow Topaz\nCharacter: Advisory\nFamous People in this number: Beethovan";
            img.setImageResource(R.drawable.bethov);
            break;
        case '4':
            s2 = "Number: 4\nPlanet/Star/Satellite: Uranus\nSpecial dates: 4,13,22,31\nDay: Tuesday\nColour: Red\nLucky Stone: Coral\nCharacter: Adomant\nFamous People in this number: Sir Arthur Conan Doyle";
            img.setImageResource(R.drawable.arthur);
            break;
        case '5':
            s2 = "Number: 5\nPlanet/Star/Satellite: Mercury\nSpecial dates: 5,14,23\nDay: Wednesday\nColour: Green\nLucky Stone: Emerald\nCharacter: Intelligent\nFamous People in this number: William Shakespeare, Farenheit, Karl Marx";
            img.setImageResource(R.drawable.shakes);
            break;
        case '6':
            s2 = "Number: 6\nPlanet/Star/Satellite: Venus\nSpecial dates: 6,15,24\nDay: Friday\nColour: Blue\nLucky Stone: Diamond\nCharacter: Beautiful, stylish\nFamous People in this number: Queen Victoria";
            img.setImageResource(R.drawable.victo);
            break;
        case '7':
            s2 = "Number: 7\nPlanet/Star/Satellite: Neptune\nSpecial dates: 7,16,25\nDay: Sunday\nColour: Milky White\nLucky Stone: Pearl, Moon stone, Catseye\nCharacter: Wavering mind\nFamous People in this number: Sir Isaac Newton";
            img.setImageResource(R.drawable.newton);
            break;
        case '8':
            s2 = "Number: 8\nPlanet/Star/Satellite: Saturn\nSpecial dates: 8,17,26\nDay: Saturday\nColour: Black, Grey\nLucky Stone: Blue Sapphire\nCharacter: Helping Tendency, Hospitality, Tries a lot for a job to get completed\nFamous People in this number: Charles Darwin";
            img.setImageResource(R.drawable.darwin);
            break;
        case '9':
            s2 = "Number: 9\nPlanet/Star/Satellite: Mars\nSpecial dates: 9,18,27\nDay: Tuesday\nColour: Red\nLucky Stone: Garnet, Bloodstone\nCharacter: Warrior like attitude, Ready for fights\nFamous People in this number: Nelson Mandela";
            img.setImageResource(R.drawable.mandela);
            break;

			
		}
		TextView t=(TextView) findViewById(R.id.nnt);
		t.setText(s2);

	}

}
