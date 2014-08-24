package com.example.volenteerinfo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class PoliceTopic extends Activity
{

	public int current_F_T_Number = PoliceTrainingList.Police_Trainging_num;
	public int current_F_Tech_Number = PoliceTechList.Police_T_num;
	public int current_F_P_Number = PolicePhyList.Police_P_num;
	public int current_F_M_Number = PoliceMentalList.Police_M_num;
	private TextView edit_title;
	//private TextView edit_info;

	
	@Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.part_layout);
        
        editTextforAll();
        setDoneButtonListener();
        
    }
	//Set up the Done button to initialize intent and finish
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
					finish();
				}
			}
		);//END setOnClickListener
	}//END setDoneButtonListener
	
	
	
	private void editTextforAll()
	{
		if (current_F_T_Number == 1)
		{
			if (current_F_M_Number == 1)
			{
				edit_title = (TextView)findViewById(R.id.part_title);           
				edit_title.setText(R.string.Police_Mental_1);				
			}
			else if (current_F_M_Number == 2)
			{
				edit_title = (TextView)findViewById(R.id.part_title);           
				edit_title.setText(R.string.Police_Mental_2);  
			}
			else if (current_F_M_Number == 3)
			{
				edit_title = (TextView)findViewById(R.id.part_title);           
				edit_title.setText(R.string.Police_Mental_3);
			}
		}
		else if (current_F_T_Number == 2)
		{
			if (current_F_Tech_Number == 1)
			{
				edit_title = (TextView)findViewById(R.id.part_title);           
				edit_title.setText(R.string.Police_Tech_1);				
			}
			else if (current_F_Tech_Number == 2)
			{
				edit_title = (TextView)findViewById(R.id.part_title);           
				edit_title.setText(R.string.Police_Tech_2);  
			}
			else if (current_F_Tech_Number == 3)
			{
				edit_title = (TextView)findViewById(R.id.part_title);           
				edit_title.setText(R.string.Police_Tech_3);
			}
		}
		else if (current_F_T_Number == 3)
		{
			if (current_F_Tech_Number == 1)
			{
				edit_title = (TextView)findViewById(R.id.part_title);           
				edit_title.setText(R.string.Police_Phys_1);				
			}
			else if (current_F_Tech_Number == 2)
			{
				edit_title = (TextView)findViewById(R.id.part_title);           
				edit_title.setText(R.string.Police_Phys_2);  
			}
			else if (current_F_Tech_Number == 3)
			{
				edit_title = (TextView)findViewById(R.id.part_title);           
				edit_title.setText(R.string.Police_Phys_3);
			}
		}
	}
}
