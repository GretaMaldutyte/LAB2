package com.example.lab2_greta_maldutyte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.lab2_greta_maldutyte.ElementCalculator.getCharsCount;
public class MainActivity extends AppCompatActivity {

    Spinner ddSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.ddSelection = (Spinner) findViewById(R.id.ddSelection);
   /*    ArrayList<String> selectionOptionsList = new ArrayList<>();
        selectionOptionsList.add("Letters");
        selectionOptionsList.add("Characters"); */

        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(this, R.array.calculation_options, android.R.layout.simple_spinner_item);
       // ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, selectionOptionsList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.ddSelection.setAdapter(arrayAdapter);
    }

    public void btnCalculateOnClick(View view) {
        EditText edUserInput = findViewById(R.id.edUserInput);
        TextView tvOutput = findViewById(R.id.tvOutput);
        String userInputText = edUserInput.getText().toString();

        String selection = this.ddSelection.getSelectedItem().toString();
        //int resID = R.string.char_selection;
        //String char_SelectionOption = getResources().getString(R.string.char_selection);
        //Toast.makeText(this, String.valueOf(resID), Toast.LENGTH_SHORT).show();

        String resValue = getResources().getString(R.string.char_selection);
        Toast.makeText(this, String.valueOf(resValue), Toast.LENGTH_SHORT).show();

        if(selection.equalsIgnoreCase(resValue)){
            int count = ElementCalculator.getCharsCount(userInputText);
            tvOutput.setText(String.valueOf(count));
        }

        if(selection.equalsIgnoreCase( getResources().getString(R.string.word_selection))){
            tvOutput.setText(String.valueOf(ElementCalculator.getWordsCount(userInputText)));
        }
    }
}