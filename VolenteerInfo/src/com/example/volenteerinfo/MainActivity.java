package com.example.volenteerinfo;



import android.os.Bundle;
import android.view.Menu;
import android.app.ListActivity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity 
{

	static final String[] CHOICES = new String[]
			{
				"Fire",
				"Police",
				"EMS",
				"Quit"
			};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		 //found this part on an example
		 //Set up ArrayAdaptor for the options
        setListAdapter(new ArrayAdapter<String>
        	(this, android.R.layout.simple_list_item_1, CHOICES));
        getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        getListView().setTextFilterEnabled(true);
        
		
        //part of example  
        //Set up the listener for user clicks on the list
        setListClickListener();
        
        //this toast is for when it opens
        Toast.makeText(this, "I see you want to help", Toast.LENGTH_LONG).show();
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
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
	    				switch(arg2)
	    				{
	    					case 0:	launchFireTrainingPage();
	    							break;
	    					case 1:launchPoliceTrainingPage();
	    							break;
	    					case 2: launchEmsTrainingPage();
	    							break;
	    					case 3: finish();
	    							break;
	    					default: break;
	    				}
	    			}
	    		}//END OnItemClickListener
	    	);//END setOnItemClickListener
		}//END setListClickListener

//	 //goes to Fire page
	 protected void launchFireTrainingPage()
	    {
	    	//Set up Intent
	    	Intent launchFire = new Intent(this, FireTrainingList.class);
	    	startActivity(launchFire);
	    	
	    }//END launchFirePage
//	  
//	 //goes to EMS page
	 protected void launchEmsTrainingPage()
	 	{
	    	//Set up Intent
	    	Intent launchemstraining = new Intent(this, EmsTrainingList.class);
	    	startActivity(launchemstraining);
	    	
	 	}//END launchEMSPage
//	 
//	 //goes to Amy's Nightmare
	 protected void launchPoliceTrainingPage()
	 	{
		 	//Set up Intent
		 	Intent launchpolicetraining = new Intent(this, PoliceTrainingList.class);
		 	startActivity(launchpolicetraining);
		    	
	 	}//END launchPolicePage 
//		 

//	}

}
