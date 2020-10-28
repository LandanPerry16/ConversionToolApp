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

public class Activity3 extends AppCompatActivity {

    private Button helpbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        final TextView tf = (TextView) findViewById(R.id.textView4);
        final TextView tc = (TextView) findViewById(R.id.textView3);
        final TextView tk = (TextView) findViewById(R.id.textView2);

        final Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.temperature, android.R.layout.simple_spinner_item);

        final EditText textNum = (EditText) findViewById(R.id.textnumb);

        helpbutton = (Button) findViewById(R.id.helpbutton);
        helpbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3.this, Activity2.class);
                startActivity(intent);
            }
        });

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

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

                int option = spinner2.getSelectedItemPosition();

                if(!textNum.equals("")){
                    tf.setText(0 + " F");
                    tc.setText(0 + " C");
                    tk.setText(0 + " K");
                }




            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



    }
}