# iOS Style Date time picker
Date time picker will appear from bottom in any activity.


<img src="http://kkrmobility.com/data/project_gif/iOS_date_picker.gif"/>

<h2><b> How to use Date Time picker in activity <b></h2>
	
	
	// Create new object on picker<br/>
	IOSStyleSateTimePicker bottomSheetSpinnerDateTimePicker = new IOSStyleSateTimePicker(WelcomeActivity.this, new Date()); 
	
	// Set date select listener<br/>
	bottomSheetSpinnerDateTimePicker.setDateTimeSelectListener(new OnDateTimeSelectListener() { 
	    @Override 
	    public void onDateTimeSet(Date date) { 

	    } 
	}); 
	
	// set date change listener<br/>
	bottomSheetSpinnerDateTimePicker.setDateTimeChangeListener(new OnDateTimeSelectListener() { 
	    @Override 
	    public void onDateTimeSet(Date date) { 

	    } 
	}); 
	
	// required only if you want to display date in specific formate.<br/>
	bottomSheetSpinnerDateTimePicker.setDateDisplayPattern("dd:mmm:yy HH"); 
	
	// Show dateTime picker<br/>
	bottomSheetSpinnerDateTimePicker.show();
