package com.example.volenteerinfo;



import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class FireTrainingList extends ListActivity
{
	//Array of choices for user
		static final String[] CHOICES = new String[]
		{
			"Mental",
			"Technical",
			"Physical"
		};

		//position number
		public static int Fire_Trainging_num;	
		
		@Override
		public void onCreate(Bundle savedInstanceState)
		{
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.test);
		    
		    //Set up ArrayAdaptor for the options
		    setListAdapter(new ArrayAdapter<String>
		    	(this, android.R.layout.simple_list_item_1, CHOICES));
		    getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		    getListView().setTextFilterEnabled(true);
			
		    //part of example  
		    //Set up the listener for user clicks on the list
		    setListClickListener();
		    
		    //Set Back button listener
		    setDoneButtonListener();
		    
		    //this toast is for when it opens
		    Toast.makeText(this, "Courage", Toast.LENGTH_LONG).show();
		}

		private void setDoneButtonListener()
		{
			Button doneButton = (Button) findViewById(R.id.back_button);
			doneButton.setOnClickListener
			(
				new View.OnClickListener()
				{
					@Override
					public void onClick(View v)
					{
						close();
					}
		
					private void close() 
					{
						finish();
					}
				}
			);//END setOnClickListener
		}//END setDoneButtonListener

		private void setListClickListener()
		{
			//Set up the click listener for the options
			getListView().setOnItemClickListener
			(
				new OnItemClickListener()
				{
					//@Override
					public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3)
					{
						switch(arg2) //only 8 positions this time
						{
							case 0:	
								Fire_Trainging_num = 1;
								launchFireMentalPage();
									break;
							case 1: 
								Fire_Trainging_num = 2;
								launchFireTechPage();
									break;
							case 2: 
								Fire_Trainging_num = 3;
								launchFirePhyPage();
									break;
							
						}
					}
				}//END OnItemClickListener
			);//END setOnItemClickListener
		}//END setListClickListener
			protected void launchFirePhyPage()
		    {
		    	//Set up Intent
		    	Intent FirePhyPage = new Intent(this, FirePhyList.class);
		    	startActivity(FirePhyPage);
		    	
		    }//END launchDirectionsPage
			
			protected void launchFireTechPage()
		    {
		    	//Set up Intent
		    	Intent FireTechPage = new Intent(this, FireTechList.class);
		    	startActivity(FireTechPage);
		    	
		    }//END launchDirectionsPage
			
			protected void launchFireMentalPage()
		    {
		    	//Set up Intent
		    	Intent FireMentalPage = new Intent(this, FireMentalList.class);
		    	startActivity(FireMentalPage);
		    	
		    }//END launchDirectionsPage

}
