package com.balashanti.rushi.onroad;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

/**
 * Created by Rushikesh Kotule on 09-Feb-18.
 * DatePicker Dialogue box
 */

public class DatePick extends AppCompatActivity {
    DatePicker datep;
   public long date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date_layout);

        datep = findViewById(R.id.datePicker);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        date=calendar.getTimeInMillis();


    }              @Override
                    public boolean onOptionsItemSelected(MenuItem item) {
                        if (item.getItemId() == android.R.id.home) {
                            Intent intent = new Intent();
                            intent.putExtra("date", date);
                            setResult(Activity.RESULT_OK, intent);
                            finish();
                            return true;
                        }
                        return super.onOptionsItemSelected(item);
                    }
    }

/* protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview1=(TextView)findViewById(R.id.textView1);
        displayDate=(Button)findViewById(R.id.button1);

        displayDate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // custom dialog
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.datepickerview);
                dialog.setTitle("");

                DatePicker datePicker = (DatePicker) dialog.findViewById(R.id.datePicker1);
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                selectedDate=calendar.get(Calendar.DAY_OF_MONTH);
                selectedMonth=calendar.get(Calendar.MONTH);
                selectedYear=calendar.get(Calendar.YEAR);
                datePicker.init(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {

                    @Override
                    public void onDateChanged(DatePicker datePicker, int year, int month, int dayOfMonth) {
                        Log.e("Date", "Year=" + year + " Month=" + (month + 1) + " day=" + dayOfMonth);

                        Log.e("selected date", selectedDate+"");
                        Log.e("selected date", dayOfMonth+"");
                        Log.e("selected month", selectedMonth+"");
                        Log.e("selected month", month+"");

                        Log.e("selected year", selectedYear+"");
                        Log.e("selected year", year+"");
                        if(selectedDate ==dayOfMonth && selectedMonth==month && selectedYear==year) {

                            textview1.setText("Year=" + year + " Month=" + (month + 1) + " day=" + dayOfMonth);
                            dialog.dismiss();
                        }else {

                            if(selectedDate !=dayOfMonth){
                                textview1.setText("Year=" + year + " Month=" + (month + 1) + " day=" + dayOfMonth);
                                dialog.dismiss();
                            }else {
                                if(selectedMonth !=month){
                                        textview1.setText("Year=" + year + " Month=" + (month + 1) + " day=" + dayOfMonth);
                                        dialog.dismiss();
                                }
                            }
                        }
                        selectedDate=dayOfMonth;
                        selectedMonth=(month);
                        selectedYear=year;
                    }
                });


                dialog.show();
            }

        });
    }

}*/