package cc.somkiat.basicunittesting.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import cc.somkiat.basicunittesting.R;
import cc.somkiat.basicunittesting.validation.FactoryValidation;
import cc.somkiat.basicunittesting.validation.Validation;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_save;
    private EditText et_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindWidget();
        setEvent();
    }

    private void bindWidget(){

        btn_save = findViewById(R.id.saveButton);

        et_email = findViewById(R.id.emailInput);
    }

    private void setEvent(){

        btn_save.setOnClickListener(this);
    }

    public void onSaveClick(View view) {

        FactoryValidation factoryValidation = new FactoryValidation();
        ArrayList<Validation> factory = factoryValidation.getFactory();

        for (Validation validation : factory){
            validation.validation(et_email.getText().toString());
            if(!validation.isResult()){
                Toast.makeText(this, "Error : " + validation.getErrorMessage(), Toast.LENGTH_SHORT).show();
                break;
            }
        }

    }

    public void onRevertClick(View view) {
        //TODO
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.saveButton){
            onSaveClick(et_email);
        }
    }
}
