package com.kk.date_time_picker_ios_style;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.kk.iosstyledatetimepicker.CommonUtils;
import com.kk.iosstyledatetimepicker.IOSStyleSateTimePicker;
import com.kk.iosstyledatetimepicker.OnDateTimeSelectListener;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnDatePicker).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IOSStyleSateTimePicker bottomSheetSpinnerDateTimePicker = new IOSStyleSateTimePicker(MainActivity.this, new Date());
                bottomSheetSpinnerDateTimePicker.setDateTimeSelectListener(new OnDateTimeSelectListener() {
                    @Override
                    public void onDateTimeSet(Date date) {
                        ((TextView)findViewById(R.id.textView)).setText(CommonUtils.getDateInFormat(date,"MMM d,yyyy hh:mm a"));
                    }
                });
                bottomSheetSpinnerDateTimePicker.setDateTimeChangeListener(new OnDateTimeSelectListener() {
                    @Override
                    public void onDateTimeSet(Date date) {

                    }
                });
                bottomSheetSpinnerDateTimePicker.show();
            }
        });
    }
}
