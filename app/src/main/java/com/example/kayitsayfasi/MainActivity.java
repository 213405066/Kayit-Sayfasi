package com.example.kayitsayfasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private EditText editTxtAd, editTxtSoyad, editTxtYas, editTxtOkul;
    private CheckBox checkBox1, checkBox2, checkBox3;
    private RadioButton radioBtnK, radioBtnE;

    private String editAd, editSoyad, editYas, editOkul;
    private String checkText1, checkText2, checkText3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTxtAd = (EditText)findViewById(R.id.editTxtAd);
        editTxtSoyad = (EditText)findViewById(R.id.editTxtSoyad);
        editTxtYas = (EditText)findViewById(R.id.editTxtYas);
        editTxtOkul = (EditText) findViewById(R.id.editTxtOkul);

        checkBox1 = (CheckBox)findViewById(R.id.checkBoxHobi1);
        checkBox2 = (CheckBox)findViewById(R.id.checkBoxHobi2);
        checkBox3 = (CheckBox)findViewById(R.id.checkBoxHobi3);

        radioBtnK = (RadioButton)findViewById(R.id.radioBtnK);
        radioBtnE = (RadioButton)findViewById(R.id.radioBtnE);

    }

    public void btnKayitOl(View v){
        editAd = editTxtAd.getText().toString();
        editSoyad = editTxtSoyad.getText().toString();
        editYas = editTxtYas.getText().toString();
        editOkul = editTxtOkul.getText().toString();

        if(!TextUtils.isEmpty(editAd) && !TextUtils.isEmpty(editSoyad) && !TextUtils.isEmpty(editYas) && !TextUtils.isEmpty(editOkul)){
            System.out.println("*****BİLGİLERİNİZ*****");
            System.out.println("Adınız: " + editAd);
            System.out.println("Soyadınız: " + editSoyad);
            System.out.println("yaşınız: " + editYas);
            System.out.println("Okulunuz: " + editOkul);





            System.out.println("*****HOBİLERİNİZ*****");

           if(checkBox1.isChecked())
             System.out.println(checkBox1.getText().toString());
           if(checkBox2.isChecked())
               System.out.println(checkBox2.getText().toString());
            if(checkBox3.isChecked())
                System.out.println(checkBox3.getText().toString());



            if(radioBtnK.isChecked())
                System.out.println("cinsiyetiniz: " + radioBtnK.getText().toString());
            else
                System.out.println("cinsiyetiniz: " + radioBtnE.getText().toString());

        }else
            System.out.println("Bilgiler Boş Olamaz");


    }
}