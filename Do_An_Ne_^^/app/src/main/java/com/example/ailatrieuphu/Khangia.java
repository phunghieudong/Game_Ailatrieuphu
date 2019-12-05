package com.example.ailatrieuphu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import java.util.Random;

import com.example.ailatrieuphu.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class Khangia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khangia);

        int a, b, c,d;
        Random random = new Random();
        a= random.nextInt(100);
        b = random.nextInt(100-a);
        c = random.nextInt(100-a-b);
        d = 100-a-b-c;
        BarChart barChart = findViewById(R.id.barchart);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(a, 0));
        entries.add(new BarEntry(b, 1));
        entries.add(new BarEntry(c, 2));
        entries.add(new BarEntry(d, 3));

        BarDataSet bardataset = new BarDataSet(entries, "");

        ArrayList<String> labels = new ArrayList();
        labels.add("A");
        labels.add("B");
        labels.add("C");
        labels.add("D");

        BarData data = new BarData(labels, bardataset);
        data.setValueTextSize(30);
        XAxis xAxis = barChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextSize(30);

        //Khong ve luoi tren bieu do
        xAxis.setDrawGridLines(false);
        barChart.getAxisLeft().setEnabled(false);
        barChart.getAxisRight().setEnabled(false);

        //Zoom bieu do
        barChart.setDoubleTapToZoomEnabled(true);

        // set the data and list of labels into chart
        barChart.setData(data);
        // set the description
        barChart.setDescription("");
        bardataset.setColors(ColorTemplate.COLORFUL_COLORS);
        barChart.animateY(3000);

    }

   /* public void viewDialog(View view) {
        final Dialog dialog = new Dialog(this);

        dialog.setContentView(R.layout.activity_main);

        dialog.setCanceledOnTouchOutside(false);

        dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);

        Button button = dialog.findViewById(R.id.button);
        button.setOnclickListener(new View.OnClickListener(){
         public void OnClick(View view){dialog.dissmiss();}
          )};
        dialog.show();
    }*/
}
