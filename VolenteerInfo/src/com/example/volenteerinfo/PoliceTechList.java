package com.example.volenteerinfo;

import android.app.ListActivity;
import android.content.Intent;
//import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class PoliceTechList extends ListActivity
{
	//Array of choices for user
			static final String[] CHOICES = new String[]
			{
				"Topic 1",
				"Topic 2",
				"Topic 3"
			};

			//position number
			public static int Police_T_num;	
			
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
			    Toast.makeText(this, "Will you find them in the dark?", Toast.LENGTH_LONG).show();
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
									Police_T_num = 1;
									launchTopic();
										break;
								case 1: 
									Police_T_num = 2;
									launchTopic();
										break;
								case 2: 
									Police_T_num = 3;
									launchTopic();
										break;
								
							}
						}
					}//END OnItemClickListener
				);//END setOnItemClickListener
			}//END setListClickListener

			protected void launchTopic()
		    {
		    	//Set up Intent
		    	Intent launchTopic = new Intent(this, PoliceTopic.class);
		    	startActivity(launchTopic);
		    	
		    }//END launchDirectionsPage
}