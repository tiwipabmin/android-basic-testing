package cc.somkiat.basicunittesting.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import cc.somkiat.basicunittesting.R;
import cc.somkiat.basicunittesting.validation.factory.FactoryEmailValidation;
import cc.somkiat.basicunittesting.validation.factory.FactoryNameValidation;
import cc.somkiat.basicunittesting.validation.factory.FactoryValidation;
import cc.somkiat.basicunittesting.validation.Validation;

public class MainActivity extends AppCompatActivity {

    private EditText et_email, et_username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_email = findViewById(R.id.emailInput);
        et_username = findViewById(R.id.userNameInput);
    }

    public void onSaveClick(View view) {

        boolean saveSuccess = true;

        FactoryEmailValidation factoryEmailValidation = new FactoryEmailValidation();
        ArrayList<Validation> factory = factoryEmailValidation.getFactory();

        for (Validation validation : factory){
            validation.validation(et_email.getText().toString());
            if(!validation.isResult()){
                saveSuccess = false;
                Toast.makeText(this, "Error : " + validation.getErrorMessage(), Toast.LENGTH_SHORT).show();
                break;
            }
        }

        FactoryNameValidation factoryNameValidation = new FactoryNameValidation();
        factory = factoryNameValidation.getFactory();

        for (Validation validation : factory){
            validation.validation(et_username.getText().toString());
            if(!validation.isResult()){
                saveSuccess = false;
                Toast.makeText(this, "Error : " + validation.getErrorMessage(), Toast.LENGTH_SHORT).show();
                break;
            }
        }

        if(saveSuccess){
            Toast.makeText(this, "Error : " + "Save successful.", Toast.LENGTH_SHORT).show();
        }

    }

    public void onRevertClick(View view) {
        et_email.setText("");
        et_username.setText("");
    }
}
