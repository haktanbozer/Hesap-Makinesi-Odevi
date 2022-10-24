package com.haktanbozer.hesapmakinesiodevi;

import androidx.appcompat.app.AppCompatActivity;
import org.mariuszgromada.math.mxparser.*;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

  private EditText usersInputBox;
  private Button btnSil;
  private Button btnSifir;
  private Button btnBir;
  private Button btniki;
  private Button btnUc;
  private Button btnDort;
  private Button btnBes;
  private Button btnAlti;
  private Button btnYedi;
  private Button btnSekiz;
  private Button btnDokuz;
  private Button btnNokta;
  private Button btnTopla;
  private Button btnCikar;
  private Button btnCarp;
  private Button btnGeri;
  private Button btnEsittir;
  private Button btnBol;
  private Button btnisaret;
  private Button btnParantez;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    setupUI();
    usersInputBox.setText("");

    btnGeri.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int cursorPosEnd = usersInputBox.getSelectionEnd();
        int textLength = usersInputBox.getText().length();

        if (cursorPosEnd != 0 && textLength != 0){
          SpannableStringBuilder selection = (SpannableStringBuilder) usersInputBox.getText();
          selection.replace(cursorPosEnd - 1, cursorPosEnd, "");
          usersInputBox.setText(selection);
          usersInputBox.setSelection(cursorPosEnd - 1);
        }
      }
    });

    btnSifir.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int pos = usersInputBox.getSelectionStart();
        usersInputBox.setText(updateText("0", usersInputBox.getText().toString(), pos));
        usersInputBox.setSelection(pos + 1);
      }
    });

    btnBir.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int pos = usersInputBox.getSelectionStart();
        usersInputBox.setText(updateText("1", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
        usersInputBox.setSelection(pos + 1);
      }
    });

    btniki.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int pos = usersInputBox.getSelectionStart();
        usersInputBox.setText(updateText("2", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
        usersInputBox.setSelection(pos + 1);
      }
    });

    btnUc.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int pos = usersInputBox.getSelectionStart();
        usersInputBox.setText(updateText("3", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
        usersInputBox.setSelection(pos + 1);
      }
    });

    btnDort.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int pos = usersInputBox.getSelectionStart();
        usersInputBox.setText(updateText("4", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
        usersInputBox.setSelection(pos + 1);
      }
    });

    btnBes.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int pos = usersInputBox.getSelectionStart();
        usersInputBox.setText(updateText("5", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
        usersInputBox.setSelection(pos + 1);
      }
    });

    btnAlti.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int pos = usersInputBox.getSelectionStart();
        usersInputBox.setText(updateText("6", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
        usersInputBox.setSelection(pos + 1);
      }
    });

    btnYedi.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int pos = usersInputBox.getSelectionStart();
        usersInputBox.setText(updateText("7", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
        usersInputBox.setSelection(pos + 1);
      }
    });

    btnSekiz.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int pos = usersInputBox.getSelectionStart();
        usersInputBox.setText(updateText("8", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
        usersInputBox.setSelection(pos + 1);
      }
    });

    btnDokuz.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int pos = usersInputBox.getSelectionStart();
        usersInputBox.setText(updateText("9", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
        usersInputBox.setSelection(pos + 1);
      }
    });

    btnSil.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        usersInputBox.setText("");
      }
    });



    btnisaret.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int pos = usersInputBox.getSelectionStart();
        usersInputBox.setText(updateText("-", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
        usersInputBox.setSelection(pos + 1);
      }
    });

    btnNokta.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int pos = usersInputBox.getSelectionStart();
        usersInputBox.setText(updateText(".", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
        usersInputBox.setSelection(pos + 1);
      }
    });

    btnEsittir.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        String userExp = usersInputBox.getText().toString();

        userExp = userExp.replaceAll("÷", "/");
        userExp = userExp.replaceAll("×", "*");

        Expression exp = new Expression(userExp);

        String result = String.valueOf(exp.calculate());

        usersInputBox.setText(result);
        usersInputBox.setSelection(result.length());

      }
    });

    btnBol.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int pos = usersInputBox.getSelectionStart();
        usersInputBox.setText(updateText("÷", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
        usersInputBox.setSelection(pos + 1);
      }
    });

    btnCarp.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int pos = usersInputBox.getSelectionStart();
        usersInputBox.setText(updateText("×", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
        usersInputBox.setSelection(pos + 1);
      }
    });

    btnCikar.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int pos = usersInputBox.getSelectionStart();
        usersInputBox.setText(updateText("-", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
        usersInputBox.setSelection(pos + 1);
      }
    });

    btnTopla.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int pos = usersInputBox.getSelectionStart();
        usersInputBox.setText(updateText("+", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
        usersInputBox.setSelection(pos + 1);
      }
    });

    btnParantez.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int pos = usersInputBox.getSelectionStart();
        int openPar = 0;
        int closedPar = 0;
        int inboxLength = usersInputBox.getText().toString().length();

        for (int i = 0; i < usersInputBox.getSelectionStart(); i++){
          if (usersInputBox.getText().toString().substring(i, i+1).equals("(")){
            openPar += 1;
          }
          else if (usersInputBox.getText().toString().substring(i, i+1).equals(")")){
            closedPar += 1;
          }
        }

        if (openPar == closedPar || usersInputBox.getText().toString().substring(
                inboxLength - 1, inboxLength).equals("(")){
          //usersInputBox.setText(String.format("%s%s", usersInputBox.getText().toString(), "("));
          usersInputBox.setText(updateText("(", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
        }
        else if (closedPar < openPar && !usersInputBox.getText().toString().substring(
                inboxLength - 1, inboxLength).equals("(")){
          //usersInputBox.setText(String.format("%s%s", usersInputBox.getText().toString(), ")"));
          usersInputBox.setText(updateText(")", usersInputBox.getText().toString(), usersInputBox.getSelectionStart()));
        }
        usersInputBox.setSelection(pos + 1);
      }
    });

  }

  private void setupUI(){
    usersInputBox = findViewById(R.id.display);
    usersInputBox.setShowSoftInputOnFocus(false);

    btnGeri = findViewById(R.id.btnGeri);
    btnSifir = findViewById(R.id.btnSifir);
    btnBir= findViewById(R.id.btnBir);
    btniki = findViewById(R.id.btniki);
    btnUc = findViewById(R.id.btnUc);
    btnDort = findViewById(R.id.btnDort);
    btnBes = findViewById(R.id.btnBes);
    btnAlti = findViewById(R.id.btnAlti);
    btnYedi = findViewById(R.id.btnYedi);
    btnSekiz = findViewById(R.id.btnSekiz);
    btnDokuz = findViewById(R.id.btnDokuz);
    btnSil = findViewById(R.id.btnSil);
    btnCikar = findViewById(R.id.btnCikar);
    btnTopla = findViewById(R.id.btnTopla);
    btnNokta = findViewById(R.id.bntNokta);
    btnCarp = findViewById(R.id.btnCarp);
    btnParantez = findViewById(R.id.btnParantez);
    btnBol = findViewById(R.id.btnBol);
    btnisaret = findViewById(R.id.btnisaret);
    btnEsittir = findViewById(R.id.btnEsittir);
  }

  private String updateText(String stringToAdd, String oldString, int cursorPos){
    String leftOfCursor = oldString.substring(0, cursorPos);
    String rightOfCursor = oldString.substring(cursorPos);

    return leftOfCursor + stringToAdd + rightOfCursor;

  }
}
