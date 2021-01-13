package com.example.checkboxuygulamas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    CheckBox cay,kahve,tost,gozleme,ayran;
    EditText tutar;
    int ToplamFiyat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimlama();
        fiyathesapla();
    }
    public void fiyathesapla()
    {
        cay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cay.isChecked())
                {
                    ToplamFiyat+=5;
                    tutar.setText(ToplamFiyat+" TL");
                }
                else
                {
                    ToplamFiyat-=5;
                    tutar.setText(ToplamFiyat+" TL");
                }
                }
        });
        kahve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kahve.isChecked())
                {
                    ToplamFiyat+=10;
                    tutar.setText(ToplamFiyat+" TL");
                }
                else
                {
                    ToplamFiyat-=10;
                    tutar.setText(ToplamFiyat+" TL");
                }
            }
        });
        tost.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (tost.isChecked())
            {
                ToplamFiyat+=15;
                tutar.setText(ToplamFiyat+" TL");
            }
            else
            {
                ToplamFiyat-=15;
                tutar.setText(ToplamFiyat+" TL");
            }
        }
    });
        gozleme.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (gozleme.isChecked())
            {
                ToplamFiyat+=20;
                tutar.setText(ToplamFiyat+" TL");
            }
            else
            {
                ToplamFiyat-=20;
                tutar.setText(ToplamFiyat+" TL");
            }
        }
    });
        cay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cay.isChecked())
                {
                    ToplamFiyat+=5;
                    tutar.setText(ToplamFiyat+" TL");
                }
                else
                {
                    ToplamFiyat-=5;
                    tutar.setText(ToplamFiyat+" TL");
                }
            }
        });
        ayran.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (ayran.isChecked())
            {
                ToplamFiyat+=4;
                tutar.setText(ToplamFiyat+" TL");
            }
            else
            {
                ToplamFiyat-=4;
                tutar.setText(ToplamFiyat+" TL");
            }
        }
    });
    }

    public void tanimlama()
    {
        cay=findViewById(R.id.CayChb);
        kahve=findViewById(R.id.KahveChb);
        tost=findViewById(R.id.TostChb);
        gozleme=findViewById(R.id.GozlemeChb);
        ayran=findViewById(R.id.AyranChb);
        tutar=findViewById(R.id.txtTutar);

    }
}