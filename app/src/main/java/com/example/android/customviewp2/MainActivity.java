package com.example.android.customviewp2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LineChartView lineChart = (LineChartView) findViewById(R.id.linechart);
        lineChart.setChartData(getRandomData());
    }

    private float[] getRandomData() {
        return new float[] { 10, 12, 7, 14, 15, 19, 13, 2, 10, 13, 13, 10, 15, 14 };
    }
}
