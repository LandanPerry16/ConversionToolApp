package ldp.e.programmingassignment01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button helpbutton;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helpbutton = (Button) findViewById(R.id.helpbutton);
        helpbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this, Activity2.class);
               startActivity(intent);
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity3.class);
                startActivity(intent);
            }
        });



        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.length, android.R.layout.simple_spinner_item);

        final EditText textNum = (EditText) findViewById(R.id.textnumb);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        final TextView mmtext = (TextView) findViewById(R.id.mmtextview);
        final TextView cmtext = (TextView) findViewById(R.id.cmtextview);
        final TextView mtext = (TextView) findViewById(R.id.mtextview);
        final TextView kmtext = (TextView) findViewById(R.id.kmtextview);
        final TextView fttext = (TextView) findViewById(R.id.fttextview);
        final TextView ydtext = (TextView) findViewById(R.id.ydtextview);
        final TextView miletext = (TextView) findViewById(R.id.miletextview);
        final TextView inchtext = (TextView) findViewById(R.id.inchtextview);





        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                double mm = 0;
                double cm = 0;
                double m = 0;
                double km = 0;
                double inch = 0;
                double ft = 0;
                double yd = 0;
                double mile = 0;

                String num = textNum.getText().toString();
                int option = spinner.getSelectedItemPosition();

                if(option == 0){   //mm
                    if(! num.equals("")) {

                        mm = Float.valueOf(num);
                        String update = mm + " mm";
                        ////////////////////////////////////////////////////////// calculations

                        cm  = (1/10.0) * mm;
                        inch = (1/2.54) * cm;
                        m = (1/1000.0) * mm;
                        km = (1/1000000.0) * mm;
                        ft = (1/30.48) * cm;
                        yd = (1/0.9144) * m;
                        mile = (1/1609.344) * m;



                        ////////////////////////////////////////////////////////////////////////

                        String inchupdate = inch + " inch";
                        String mmupdate = update;
                        String cmupdate = cm + " cm";
                        String mupdate = m + " m";
                        String kmupdate = km + " km";
                        String ftupdate = ft + " ft";
                        String ydupdate = yd + " yd";
                        String mileupdate = mile + " mile";

                        inchtext.setText(inchupdate);
                        mmtext.setText(mmupdate);
                        cmtext.setText(cmupdate);
                        mtext.setText(mupdate);
                        kmtext.setText(kmupdate);
                        fttext.setText(ftupdate);
                        ydtext.setText(ydupdate);
                        miletext.setText(mileupdate);

                    }else{
                        String inchupdate = 0 + " inch";
                        String mmupdate = 0 + " mm";
                        String cmupdate = 0 + " cm";
                        String mupdate = 0 + " m";
                        String kmupdate = 0 + " km";
                        String ftupdate = 0 + " ft";
                        String ydupdate = 0 + " yd";
                        String mileupdate = 0 + " mile";
                        inchtext.setText(inchupdate);
                        mmtext.setText(mmupdate);
                        cmtext.setText(cmupdate);
                        mtext.setText(mupdate);
                        kmtext.setText(kmupdate);
                        fttext.setText(ftupdate);
                        ydtext.setText(ydupdate);
                        miletext.setText(mileupdate);
                    }


                }else if(option ==1){ //cm

                    if(! num.equals("")) {



                        cm = Float.valueOf(num);
                        String update = cm + " cm";
                        mm = (cm*10.0);

                        /////////////////////////////////////calcs
                        cm  = (1/10.0) * mm;
                        inch = (1/2.54) * cm;
                        m = (1/1000.0) * mm;
                        km = (1/1000000.0) * mm;
                        ft = (1/30.48) * cm;
                        yd = (1/0.9144) * m;
                        mile = (1/1609.344) * m;



                        ////////////////////////////////////////////////////////////////////////

                        String inchupdate = inch + " inch";
                        String mmupdate = mm + " mm";
                        String cmupdate = update;
                        String mupdate = m + " m";
                        String kmupdate = km + " km";
                        String ftupdate = ft + " ft";
                        String ydupdate = yd + " yd";
                        String mileupdate = mile + " mile";

                        inchtext.setText(inchupdate);
                        mmtext.setText(mmupdate);
                        cmtext.setText(cmupdate);
                        mtext.setText(mupdate);
                        kmtext.setText(kmupdate);
                        fttext.setText(ftupdate);
                        ydtext.setText(ydupdate);
                        miletext.setText(mileupdate);
                    }else{
                        String inchupdate = 0 + " inch";
                        String mmupdate = 0 + " mm";
                        String cmupdate = 0 + " cm";
                        String mupdate = 0 + " m";
                        String kmupdate = 0 + " km";
                        String ftupdate = 0 + " ft";
                        String ydupdate = 0 + " yd";
                        String mileupdate = 0 + " mile";
                        inchtext.setText(inchupdate);
                        mmtext.setText(mmupdate);
                        cmtext.setText(cmupdate);
                        mtext.setText(mupdate);
                        kmtext.setText(kmupdate);
                        fttext.setText(ftupdate);
                        ydtext.setText(ydupdate);
                        miletext.setText(mileupdate);
                    }

                }else if(option ==2){  //m
                    if(! num.equals("")) {



                        m = Float.valueOf(num);
                        String update = m + " m";
                        mm = m * 1000.0;
                        ////////////////////////////////////////////////////////// calculations

                        cm  = (1/10.0) * mm;
                        inch = (1/2.54) * cm;
                        m = (1/1000.0) * mm;
                        km = (1/1000000.0) * mm;
                        ft = (1/30.48) * cm;
                        yd = (1/0.9144) * m;
                        mile = (1/1609.344) * m;



                        ////////////////////////////////////////////////////////////////////////

                        String inchupdate = inch + " inch";
                        String mmupdate = mm + " mm";
                        String cmupdate = cm + " cm";
                        String mupdate = update;
                        String kmupdate = km + " km";
                        String ftupdate = ft + " ft";
                        String ydupdate = yd + " yd";
                        String mileupdate = mile + " mile";

                        inchtext.setText(inchupdate);
                        mmtext.setText(mmupdate);
                        cmtext.setText(cmupdate);
                        mtext.setText(mupdate);
                        kmtext.setText(kmupdate);
                        fttext.setText(ftupdate);
                        ydtext.setText(ydupdate);
                        miletext.setText(mileupdate);


                    }else{
                        String inchupdate = 0 + " inch";
                        String mmupdate = 0 + " mm";
                        String cmupdate = 0 + " cm";
                        String mupdate = 0 + " m";
                        String kmupdate = 0 + " km";
                        String ftupdate = 0 + " ft";
                        String ydupdate = 0 + " yd";
                        String mileupdate = 0 + " mile";
                        inchtext.setText(inchupdate);
                        mmtext.setText(mmupdate);
                        cmtext.setText(cmupdate);
                        mtext.setText(mupdate);
                        kmtext.setText(kmupdate);
                        fttext.setText(ftupdate);
                        ydtext.setText(ydupdate);
                        miletext.setText(mileupdate);
                    }

                }else if(option ==3){ //km
                    if(! num.equals("")) {


                        km = Float.valueOf(num);
                        String update = km + " km";
                        mm = km * 1000000;
                        ////////////////////////////////////////////////////////// calculations

                        cm  = (1/10.0) * mm;
                        inch = (1/2.54) * cm;
                        m = (1/1000.0) * mm;
                        km = (1/1000000.0) * mm;
                        ft = (1/30.48) * cm;
                        yd = (1/0.9144) * m;
                        mile = (1/1609.344) * m;



                        ////////////////////////////////////////////////////////////////////////

                        String inchupdate = inch + " inch";
                        String mmupdate = mm + " mm";
                        String cmupdate = cm + " cm";
                        String mupdate = m + " m";
                        String kmupdate = update;
                        String ftupdate = ft + " ft";
                        String ydupdate = yd + " yd";
                        String mileupdate = mile + " mile";

                        inchtext.setText(inchupdate);
                        mmtext.setText(mmupdate);
                        cmtext.setText(cmupdate);
                        mtext.setText(mupdate);
                        kmtext.setText(kmupdate);
                        fttext.setText(ftupdate);
                        ydtext.setText(ydupdate);
                        miletext.setText(mileupdate);

                    }else{
                        String inchupdate = 0 + " inch";
                        String mmupdate = 0 + " mm";
                        String cmupdate = 0 + " cm";
                        String mupdate = 0 + " m";
                        String kmupdate = 0 + " km";
                        String ftupdate = 0 + " ft";
                        String ydupdate = 0 + " yd";
                        String mileupdate = 0 + " mile";
                        inchtext.setText(inchupdate);
                        mmtext.setText(mmupdate);
                        cmtext.setText(cmupdate);
                        mtext.setText(mupdate);
                        kmtext.setText(kmupdate);
                        fttext.setText(ftupdate);
                        ydtext.setText(ydupdate);
                        miletext.setText(mileupdate);
                    }

                }else if(option ==4){ //inch
                    if(! num.equals("")) {



                        inch = Float.valueOf(num);
                        String update = inch + " inch";
                        mm = 25.4 * inch;
                        ////////////////////////////////////////////////////////// calculations

                        cm  = (1/10.0) * mm;
                        inch = (1/2.54) * cm;
                        m = (1/1000.0) * mm;
                        km = (1/1000000.0) * mm;
                        ft = (1/30.48) * cm;
                        yd = (1/0.9144) * m;
                        mile = (1/1609.344) * m;



                        ////////////////////////////////////////////////////////////////////////

                        String inchupdate = update;
                        String mmupdate = mm + " mm";
                        String cmupdate = cm + " cm";
                        String mupdate = m + " m";
                        String kmupdate = km + " km";
                        String ftupdate = ft + " ft";
                        String ydupdate = yd + " yd";
                        String mileupdate = mile + " mile";

                        inchtext.setText(inchupdate);
                        mmtext.setText(mmupdate);
                        cmtext.setText(cmupdate);
                        mtext.setText(mupdate);
                        kmtext.setText(kmupdate);
                        fttext.setText(ftupdate);
                        ydtext.setText(ydupdate);
                        miletext.setText(mileupdate);

                    }else{
                        String inchupdate = 0 + " inch";
                        String mmupdate = 0 + " mm";
                        String cmupdate = 0 + " cm";
                        String mupdate = 0 + " m";
                        String kmupdate = 0 + " km";
                        String ftupdate = 0 + " ft";
                        String ydupdate = 0 + " yd";
                        String mileupdate = 0 + " mile";
                        inchtext.setText(inchupdate);
                        mmtext.setText(mmupdate);
                        cmtext.setText(cmupdate);
                        mtext.setText(mupdate);
                        kmtext.setText(kmupdate);
                        fttext.setText(ftupdate);
                        ydtext.setText(ydupdate);
                        miletext.setText(mileupdate);
                    }

                }else if(option ==5){ //foot
                    if(! num.equals("")) {



                        ft = Float.valueOf(num);
                        String update = ft + " ft";
                        mm = ft*304.8;
                        ////////////////////////////////////////////////////////// calculations

                        cm  = (1/10.0) * mm;
                        inch = (1/2.54) * cm;
                        m = (1/1000.0) * mm;
                        km = (1/1000000.0) * mm;
                        ft = (1/30.48) * cm;
                        yd = (1/0.9144) * m;
                        mile = (1/1609.344) * m;



                        ////////////////////////////////////////////////////////////////////////

                        String inchupdate = inch + " inch";
                        String mmupdate = mm + " mm";
                        String cmupdate = cm + " cm";
                        String mupdate = m + " m";
                        String kmupdate = km + " km";
                        String ftupdate = update;
                        String ydupdate = yd + " yd";
                        String mileupdate = mile + " mile";

                        inchtext.setText(inchupdate);
                        mmtext.setText(mmupdate);
                        cmtext.setText(cmupdate);
                        mtext.setText(mupdate);
                        kmtext.setText(kmupdate);
                        fttext.setText(ftupdate);
                        ydtext.setText(ydupdate);
                        miletext.setText(mileupdate);

                    }else{
                        String inchupdate = 0 + " inch";
                        String mmupdate = 0 + " mm";
                        String cmupdate = 0 + " cm";
                        String mupdate = 0 + " m";
                        String kmupdate = 0 + " km";
                        String ftupdate = 0 + " ft";
                        String ydupdate = 0 + " yd";
                        String mileupdate = 0 + " mile";
                        inchtext.setText(inchupdate);
                        mmtext.setText(mmupdate);
                        cmtext.setText(cmupdate);
                        mtext.setText(mupdate);
                        kmtext.setText(kmupdate);
                        fttext.setText(ftupdate);
                        ydtext.setText(ydupdate);
                        miletext.setText(mileupdate);
                    }

                }else if(option ==6){ //yard
                    if(! num.equals("")) {



                        yd = Float.valueOf(num);
                        String update = yd + " yd";
                        mm = 914.4*yd;
                        ////////////////////////////////////////////////////////// calculations

                        cm  = (1/10.0) * mm;
                        inch = (1/2.54) * cm;
                        m = (1/1000.0) * mm;
                        km = (1/1000000.0) * mm;
                        ft = (1/30.48) * cm;
                        yd = (1/0.9144) * m;
                        mile = (1/1609.344) * m;



                        ////////////////////////////////////////////////////////////////////////

                        String inchupdate = inch + " inch";
                        String mmupdate = mm + " mm";
                        String cmupdate = cm + " cm";
                        String mupdate = m + " m";
                        String kmupdate = km + " km";
                        String ftupdate = ft + " ft";
                        String ydupdate = update;
                        String mileupdate = mile + " mile";

                        inchtext.setText(inchupdate);
                        mmtext.setText(mmupdate);
                        cmtext.setText(cmupdate);
                        mtext.setText(mupdate);
                        kmtext.setText(kmupdate);
                        fttext.setText(ftupdate);
                        ydtext.setText(ydupdate);
                        miletext.setText(mileupdate);

                    }else{
                        String inchupdate = 0 + " inch";
                        String mmupdate = 0 + " mm";
                        String cmupdate = 0 + " cm";
                        String mupdate = 0 + " m";
                        String kmupdate = 0 + " km";
                        String ftupdate = 0 + " ft";
                        String ydupdate = 0 + " yd";
                        String mileupdate = 0 + " mile";
                        inchtext.setText(inchupdate);
                        mmtext.setText(mmupdate);
                        cmtext.setText(cmupdate);
                        mtext.setText(mupdate);
                        kmtext.setText(kmupdate);
                        fttext.setText(ftupdate);
                        ydtext.setText(ydupdate);
                        miletext.setText(mileupdate);
                    }
                }else{ //mile
                    if(! num.equals("")) {



                        mile = Float.valueOf(num);
                        String update = mile + " mile";
                        mm = mile * 1609344;
                        ////////////////////////////////////////////////////////// calculations

                        cm  = (1/10.0) * mm;
                        inch = (1/2.54) * cm;
                        m = (1/1000.0) * mm;
                        km = (1/1000000.0) * mm;
                        ft = (1/30.48) * cm;
                        yd = (1/0.9144) * m;
                        mile = (1/1609.344) * m;



                        ////////////////////////////////////////////////////////////////////////

                        String inchupdate = inch + " inch";
                        String mmupdate = mm + " mm";
                        String cmupdate = cm + " cm";
                        String mupdate = m + " m";
                        String kmupdate = km + " km";
                        String ftupdate = ft + " ft";
                        String ydupdate = yd + " yd";
                        String mileupdate = update;

                        inchtext.setText(inchupdate);
                        mmtext.setText(mmupdate);
                        cmtext.setText(cmupdate);
                        mtext.setText(mupdate);
                        kmtext.setText(kmupdate);
                        fttext.setText(ftupdate);
                        ydtext.setText(ydupdate);
                        miletext.setText(mileupdate);

                    }else{
                        String inchupdate = 0 + " inch";
                        String mmupdate = 0 + " mm";
                        String cmupdate = 0 + " cm";
                        String mupdate = 0 + " m";
                        String kmupdate = 0 + " km";
                        String ftupdate = 0 + " ft";
                        String ydupdate = 0 + " yd";
                        String mileupdate = 0 + " mile";
                        inchtext.setText(inchupdate);
                        mmtext.setText(mmupdate);
                        cmtext.setText(cmupdate);
                        mtext.setText(mupdate);
                        kmtext.setText(kmupdate);
                        fttext.setText(ftupdate);
                        ydtext.setText(ydupdate);
                        miletext.setText(mileupdate);
                    }
                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });





        textNum.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                double mm = 0;
                double cm = 0;
                double m = 0;
                double km = 0;
                double inch = 0;
                double ft = 0;
                double yd = 0;
                double mile = 0;

               String num = textNum.getText().toString();
               int option = spinner.getSelectedItemPosition();

               if(option == 0){   //mm
                   if(! num.equals("")) {

                       mm = Float.valueOf(num);
                       String update = mm + " mm";
                       ////////////////////////////////////////////////////////// calculations

                       cm  = (1/10.0) * mm;
                       inch = (1/2.54) * cm;
                       m = (1/1000.0) * mm;
                       km = (1/1000000.0) * mm;
                       ft = (1/30.48) * cm;
                       yd = (1/0.9144) * m;
                       mile = (1/1609.344) * m;



                       ////////////////////////////////////////////////////////////////////////

                       String inchupdate = inch + " inch";
                       String mmupdate = update;
                       String cmupdate = cm + " cm";
                       String mupdate = m + " m";
                       String kmupdate = km + " km";
                       String ftupdate = ft + " ft";
                       String ydupdate = yd + " yd";
                       String mileupdate = mile + " mile";

                       inchtext.setText(inchupdate);
                       mmtext.setText(mmupdate);
                       cmtext.setText(cmupdate);
                       mtext.setText(mupdate);
                       kmtext.setText(kmupdate);
                       fttext.setText(ftupdate);
                       ydtext.setText(ydupdate);
                       miletext.setText(mileupdate);

                   }else{
                       String inchupdate = 0 + " inch";
                       String mmupdate = 0 + " mm";
                       String cmupdate = 0 + " cm";
                       String mupdate = 0 + " m";
                       String kmupdate = 0 + " km";
                       String ftupdate = 0 + " ft";
                       String ydupdate = 0 + " yd";
                       String mileupdate = 0 + " mile";
                       inchtext.setText(inchupdate);
                       mmtext.setText(mmupdate);
                       cmtext.setText(cmupdate);
                       mtext.setText(mupdate);
                       kmtext.setText(kmupdate);
                       fttext.setText(ftupdate);
                       ydtext.setText(ydupdate);
                       miletext.setText(mileupdate);
                   }


               }else if(option ==1){ //cm

                   if(! num.equals("")) {



                       cm = Float.valueOf(num);
                       String update = cm + " cm";
                       mm = (cm*10.0);

                       /////////////////////////////////////calcs
                      cm  = (1/10.0) * mm;
                       inch = (1/2.54) * cm;
                       m = (1/1000.0) * mm;
                       km = (1/1000000.0) * mm;
                       ft = (1/30.48) * cm;
                       yd = (1/0.9144) * m;
                       mile = (1/1609.344) * m;



                       ////////////////////////////////////////////////////////////////////////

                       String inchupdate = inch + " inch";
                       String mmupdate = mm + " mm";
                       String cmupdate = update;
                       String mupdate = m + " m";
                       String kmupdate = km + " km";
                       String ftupdate = ft + " ft";
                       String ydupdate = yd + " yd";
                       String mileupdate = mile + " mile";

                       inchtext.setText(inchupdate);
                       mmtext.setText(mmupdate);
                       cmtext.setText(cmupdate);
                       mtext.setText(mupdate);
                       kmtext.setText(kmupdate);
                       fttext.setText(ftupdate);
                       ydtext.setText(ydupdate);
                       miletext.setText(mileupdate);
                   }else{
                       String inchupdate = 0 + " inch";
                       String mmupdate = 0 + " mm";
                       String cmupdate = 0 + " cm";
                       String mupdate = 0 + " m";
                       String kmupdate = 0 + " km";
                       String ftupdate = 0 + " ft";
                       String ydupdate = 0 + " yd";
                       String mileupdate = 0 + " mile";
                       inchtext.setText(inchupdate);
                       mmtext.setText(mmupdate);
                       cmtext.setText(cmupdate);
                       mtext.setText(mupdate);
                       kmtext.setText(kmupdate);
                       fttext.setText(ftupdate);
                       ydtext.setText(ydupdate);
                       miletext.setText(mileupdate);
                   }

               }else if(option ==2){  //m
                   if(! num.equals("")) {



                       m = Float.valueOf(num);
                       String update = m + " m";
                       mm = m * 1000.0;
                       ////////////////////////////////////////////////////////// calculations

                       cm  = (1/10.0) * mm;
                       inch = (1/2.54) * cm;
                       m = (1/1000.0) * mm;
                       km = (1/1000000.0) * mm;
                       ft = (1/30.48) * cm;
                       yd = (1/0.9144) * m;
                       mile = (1/1609.344) * m;



                       ////////////////////////////////////////////////////////////////////////

                       String inchupdate = inch + " inch";
                       String mmupdate = mm + " mm";
                       String cmupdate = cm + " cm";
                       String mupdate = update;
                       String kmupdate = km + " km";
                       String ftupdate = ft + " ft";
                       String ydupdate = yd + " yd";
                       String mileupdate = mile + " mile";

                       inchtext.setText(inchupdate);
                       mmtext.setText(mmupdate);
                       cmtext.setText(cmupdate);
                       mtext.setText(mupdate);
                       kmtext.setText(kmupdate);
                       fttext.setText(ftupdate);
                       ydtext.setText(ydupdate);
                       miletext.setText(mileupdate);


                   }else{
                       String inchupdate = 0 + " inch";
                       String mmupdate = 0 + " mm";
                       String cmupdate = 0 + " cm";
                       String mupdate = 0 + " m";
                       String kmupdate = 0 + " km";
                       String ftupdate = 0 + " ft";
                       String ydupdate = 0 + " yd";
                       String mileupdate = 0 + " mile";
                       inchtext.setText(inchupdate);
                       mmtext.setText(mmupdate);
                       cmtext.setText(cmupdate);
                       mtext.setText(mupdate);
                       kmtext.setText(kmupdate);
                       fttext.setText(ftupdate);
                       ydtext.setText(ydupdate);
                       miletext.setText(mileupdate);
                   }

               }else if(option ==3){ //km
                   if(! num.equals("")) {


                       km = Float.valueOf(num);
                       String update = km + " km";
                       mm = km * 1000000;
                       ////////////////////////////////////////////////////////// calculations

                       cm  = (1/10.0) * mm;
                       inch = (1/2.54) * cm;
                       m = (1/1000.0) * mm;
                       km = (1/1000000.0) * mm;
                       ft = (1/30.48) * cm;
                       yd = (1/0.9144) * m;
                       mile = (1/1609.344) * m;



                       ////////////////////////////////////////////////////////////////////////

                       String inchupdate = inch + " inch";
                       String mmupdate = mm + " mm";
                       String cmupdate = cm + " cm";
                       String mupdate = m + " m";
                       String kmupdate = update;
                       String ftupdate = ft + " ft";
                       String ydupdate = yd + " yd";
                       String mileupdate = mile + " mile";

                       inchtext.setText(inchupdate);
                       mmtext.setText(mmupdate);
                       cmtext.setText(cmupdate);
                       mtext.setText(mupdate);
                       kmtext.setText(kmupdate);
                       fttext.setText(ftupdate);
                       ydtext.setText(ydupdate);
                       miletext.setText(mileupdate);

                   }else{
                       String inchupdate = 0 + " inch";
                       String mmupdate = 0 + " mm";
                       String cmupdate = 0 + " cm";
                       String mupdate = 0 + " m";
                       String kmupdate = 0 + " km";
                       String ftupdate = 0 + " ft";
                       String ydupdate = 0 + " yd";
                       String mileupdate = 0 + " mile";
                       inchtext.setText(inchupdate);
                       mmtext.setText(mmupdate);
                       cmtext.setText(cmupdate);
                       mtext.setText(mupdate);
                       kmtext.setText(kmupdate);
                       fttext.setText(ftupdate);
                       ydtext.setText(ydupdate);
                       miletext.setText(mileupdate);
                   }

               }else if(option ==4){ //inch
                   if(! num.equals("")) {



                       inch = Float.valueOf(num);
                       String update = inch + " inch";
                       mm = 25.4 * inch;
                       ////////////////////////////////////////////////////////// calculations

                       cm  = (1/10.0) * mm;
                       inch = (1/2.54) * cm;
                       m = (1/1000.0) * mm;
                       km = (1/1000000.0) * mm;
                       ft = (1/30.48) * cm;
                       yd = (1/0.9144) * m;
                       mile = (1/1609.344) * m;



                       ////////////////////////////////////////////////////////////////////////

                       String inchupdate = update;
                       String mmupdate = mm + " mm";
                       String cmupdate = cm + " cm";
                       String mupdate = m + " m";
                       String kmupdate = km + " km";
                       String ftupdate = ft + " ft";
                       String ydupdate = yd + " yd";
                       String mileupdate = mile + " mile";

                       inchtext.setText(inchupdate);
                       mmtext.setText(mmupdate);
                       cmtext.setText(cmupdate);
                       mtext.setText(mupdate);
                       kmtext.setText(kmupdate);
                       fttext.setText(ftupdate);
                       ydtext.setText(ydupdate);
                       miletext.setText(mileupdate);

                   }else{
                       String inchupdate = 0 + " inch";
                       String mmupdate = 0 + " mm";
                       String cmupdate = 0 + " cm";
                       String mupdate = 0 + " m";
                       String kmupdate = 0 + " km";
                       String ftupdate = 0 + " ft";
                       String ydupdate = 0 + " yd";
                       String mileupdate = 0 + " mile";
                       inchtext.setText(inchupdate);
                       mmtext.setText(mmupdate);
                       cmtext.setText(cmupdate);
                       mtext.setText(mupdate);
                       kmtext.setText(kmupdate);
                       fttext.setText(ftupdate);
                       ydtext.setText(ydupdate);
                       miletext.setText(mileupdate);
                   }

               }else if(option ==5){ //foot
                   if(! num.equals("")) {



                       ft = Float.valueOf(num);
                       String update = ft + " ft";
                       mm = ft*304.8;
                       ////////////////////////////////////////////////////////// calculations

                       cm  = (1/10.0) * mm;
                       inch = (1/2.54) * cm;
                       m = (1/1000.0) * mm;
                       km = (1/1000000.0) * mm;
                       ft = (1/30.48) * cm;
                       yd = (1/0.9144) * m;
                       mile = (1/1609.344) * m;



                       ////////////////////////////////////////////////////////////////////////

                       String inchupdate = inch + " inch";
                       String mmupdate = mm + " mm";
                       String cmupdate = cm + " cm";
                       String mupdate = m + " m";
                       String kmupdate = km + " km";
                       String ftupdate = update;
                       String ydupdate = yd + " yd";
                       String mileupdate = mile + " mile";

                       inchtext.setText(inchupdate);
                       mmtext.setText(mmupdate);
                       cmtext.setText(cmupdate);
                       mtext.setText(mupdate);
                       kmtext.setText(kmupdate);
                       fttext.setText(ftupdate);
                       ydtext.setText(ydupdate);
                       miletext.setText(mileupdate);

                   }else{
                       String inchupdate = 0 + " inch";
                       String mmupdate = 0 + " mm";
                       String cmupdate = 0 + " cm";
                       String mupdate = 0 + " m";
                       String kmupdate = 0 + " km";
                       String ftupdate = 0 + " ft";
                       String ydupdate = 0 + " yd";
                       String mileupdate = 0 + " mile";
                       inchtext.setText(inchupdate);
                       mmtext.setText(mmupdate);
                       cmtext.setText(cmupdate);
                       mtext.setText(mupdate);
                       kmtext.setText(kmupdate);
                       fttext.setText(ftupdate);
                       ydtext.setText(ydupdate);
                       miletext.setText(mileupdate);
                   }

               }else if(option ==6){ //yard
                   if(! num.equals("")) {



                       yd = Float.valueOf(num);
                       String update = yd + " yd";
                       mm = 914.4*yd;
                       ////////////////////////////////////////////////////////// calculations

                       cm  = (1/10.0) * mm;
                       inch = (1/2.54) * cm;
                       m = (1/1000.0) * mm;
                       km = (1/1000000.0) * mm;
                       ft = (1/30.48) * cm;
                       yd = (1/0.9144) * m;
                       mile = (1/1609.344) * m;



                       ////////////////////////////////////////////////////////////////////////

                       String inchupdate = inch + " inch";
                       String mmupdate = mm + " mm";
                       String cmupdate = cm + " cm";
                       String mupdate = m + " m";
                       String kmupdate = km + " km";
                       String ftupdate = ft + " ft";
                       String ydupdate = update;
                       String mileupdate = mile + " mile";

                       inchtext.setText(inchupdate);
                       mmtext.setText(mmupdate);
                       cmtext.setText(cmupdate);
                       mtext.setText(mupdate);
                       kmtext.setText(kmupdate);
                       fttext.setText(ftupdate);
                       ydtext.setText(ydupdate);
                       miletext.setText(mileupdate);

                   }else{
                       String inchupdate = 0 + " inch";
                       String mmupdate = 0 + " mm";
                       String cmupdate = 0 + " cm";
                       String mupdate = 0 + " m";
                       String kmupdate = 0 + " km";
                       String ftupdate = 0 + " ft";
                       String ydupdate = 0 + " yd";
                       String mileupdate = 0 + " mile";
                       inchtext.setText(inchupdate);
                       mmtext.setText(mmupdate);
                       cmtext.setText(cmupdate);
                       mtext.setText(mupdate);
                       kmtext.setText(kmupdate);
                       fttext.setText(ftupdate);
                       ydtext.setText(ydupdate);
                       miletext.setText(mileupdate);
                   }
               }else{ //mile
                   if(! num.equals("")) {



                       mile = Float.valueOf(num);
                       String update = mile + " mile";
                       mm = mile * 1609344;
                       ////////////////////////////////////////////////////////// calculations

                       cm  = (1/10.0) * mm;
                       inch = (1/2.54) * cm;
                       m = (1/1000.0) * mm;
                       km = (1/1000000.0) * mm;
                       ft = (1/30.48) * cm;
                       yd = (1/0.9144) * m;
                       mile = (1/1609.344) * m;



                       ////////////////////////////////////////////////////////////////////////

                       String inchupdate = inch + " inch";
                       String mmupdate = mm + " mm";
                       String cmupdate = cm + " cm";
                       String mupdate = m + " m";
                       String kmupdate = km + " km";
                       String ftupdate = ft + " ft";
                       String ydupdate = yd + " yd";
                       String mileupdate = update;

                       inchtext.setText(inchupdate);
                       mmtext.setText(mmupdate);
                       cmtext.setText(cmupdate);
                       mtext.setText(mupdate);
                       kmtext.setText(kmupdate);
                       fttext.setText(ftupdate);
                       ydtext.setText(ydupdate);
                       miletext.setText(mileupdate);

                   }else{
                       String inchupdate = 0 + " inch";
                       String mmupdate = 0 + " mm";
                       String cmupdate = 0 + " cm";
                       String mupdate = 0 + " m";
                       String kmupdate = 0 + " km";
                       String ftupdate = 0 + " ft";
                       String ydupdate = 0 + " yd";
                       String mileupdate = 0 + " mile";
                       inchtext.setText(inchupdate);
                       mmtext.setText(mmupdate);
                       cmtext.setText(cmupdate);
                       mtext.setText(mupdate);
                       kmtext.setText(kmupdate);
                       fttext.setText(ftupdate);
                       ydtext.setText(ydupdate);
                       miletext.setText(mileupdate);
                   }
               }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }
}