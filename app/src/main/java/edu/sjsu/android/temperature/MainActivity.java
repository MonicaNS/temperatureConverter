package edu.sjsu.android.temperature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.editText);
    }

    public void onClick(View view){

        switch (view.getId()){
            case R.id.button:
                RadioButton celsiusButton = findViewById(R.id.radioButton2);
                RadioButton fahrenheitButton = findViewById(R.id.radioButton3);
                if(text.getText().length() == 0){
                    Toast.makeText(this, "Entered number was not valid", Toast.LENGTH_LONG).show();
                    return;
                }
                float inputValue = Float.parseFloat(text.getText().toString());

                if(celsiusButton.isChecked()){
                    text.setText(String.valueOf(ConverterUtil.converFahrenheitToCelsius(inputValue)));
                    celsiusButton.setChecked(false);
                    fahrenheitButton.setChecked(true);

                }
                else{
                    text.setText(String.valueOf(String.valueOf(ConverterUtil.convertCelsiusToFahrenheit(inputValue))));
                    celsiusButton.setChecked(true);
                    fahrenheitButton.setChecked(false);
                }
                break;
        }
    }
}
