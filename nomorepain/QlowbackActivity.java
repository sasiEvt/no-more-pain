package evt.co.il.nomorepain;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static evt.co.il.nomorepain.R.id.rb1;

@SuppressWarnings("ALL")
public class QlowbackActivity extends AppCompatActivity {

    ImageView ivlogo;
    WebView wvQ;
    TextView tvSub,tvQ;
    RadioGroup radioAnswers;
    RadioButton A1,A2,A3,A4;
    Button btnNext,btnRew;
    String linkQ = "https://www.youtube.com/embed/0SianznASOc";

    String totalResult = "no result";
    int i= 0 ,iRew = 0,T;//what the q  T - the num of the result


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qlowback);

        initlayout();
        initevent();
    }

    private void initevent() {


        btnRew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                i = iRew;
                whatTheQ();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               switch (i){



                   case 0:   // ceack the answer and change the next i  after i have new i whattheQ()

                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=1;

                           }else if(A2.isChecked()){

                               i=2;
                       }else if (A3.isChecked()){

                               i=0;
                           }else if(A4.isChecked()){

                               i=0;
                           }

                           whatTheQ();
                       }

                       break;


                   case 1:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=4;
                           }else if(A2.isChecked()){

                               i=3;
                           }else if (A3.isChecked()){

                               i=5;
                           }else if(A4.isChecked()){

                               i=8;
                           }

                           whatTheQ();
                       }

                       break;

                   case 2:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=61;
                           }else if(A2.isChecked()){

                               i=62;
                           }else if (A3.isChecked()){

                               i=2;
                           }else if(A4.isChecked()){

                               i=2;
                           }

                           whatTheQ();
                       }

                       break;

                   case 3:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=17;
                           }else if(A2.isChecked()){

                               i=16;
                           }else if (A3.isChecked()){

                               i=3;
                           }else if(A4.isChecked()){

                               i=3;
                           }

                           whatTheQ();
                       }

                       break;

                   case 4:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=6;
                           }else if(A2.isChecked()){

                               i=7;
                           }else if (A3.isChecked()){

                               i=101;
                               totalResult ="no";
                           }else if(A4.isChecked()){

                               i=4;
                           }

                           whatTheQ();
                       }

                       break;

                   case 5:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=25;
                           }else if(A2.isChecked()){

                               i=26;
                           }else if (A3.isChecked()){

                               i=5;
                           }else if(A4.isChecked()){

                               i=5;
                           }

                           whatTheQ();
                       }

                       break;


                   case 6:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=10;
                           }else if(A2.isChecked()){

                               i=9;
                           }else if (A3.isChecked()){

                               i=101;
                               totalResult ="no";
                           }else if(A4.isChecked()){

                               i=6;
                           }

                           whatTheQ();
                       }

                       break;


                   case 7:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=12;
                           }else if(A2.isChecked()){

                               i=101;
                               totalResult = "no";
                           }else if (A3.isChecked()){

                               i=101;
                               totalResult = "no";
                           }else if(A4.isChecked()){

                               i=7;
                           }

                           whatTheQ();
                       }

                       break;


                   case 8:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=44;
                           }else if(A2.isChecked()){

                               i=101;
                               totalResult = "no";
                           }else if (A3.isChecked()){

                               i=8;
                           }else if(A4.isChecked()){

                               i=8;
                           }

                           whatTheQ();
                       }

                       break;


                   case 9:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=11;
                           }else if(A2.isChecked()){

                               i=101;
                               totalResult = "no";
                           }else if (A3.isChecked()){

                               i=101;
                               totalResult = "no";
                           }else if(A4.isChecked()){

                               i=9;
                           }

                           whatTheQ();
                       }

                       break;

                   case 10:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "post syn";
                               T = 1;
                           }else if(A2.isChecked()){

                               i=101;
                               totalResult = "no";
                           }else if (A3.isChecked()){

                               i=10;
                           }else if(A4.isChecked()){

                               i=10;
                           }

                           whatTheQ();
                       }

                       break;


                   case 11:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=101;
                               totalResult = "no";


                           }else if(A2.isChecked()){

                               i=100;
                               totalResult = "Ext Dys";
                               T = 2;
                           }else if (A3.isChecked()){

                               i=101;
                           }else if(A4.isChecked()){

                               i=11;
                           }

                           whatTheQ();
                       }

                       break;


                   case 12:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=13;


                           }else if(A2.isChecked()){

                               i=14;
                               totalResult = "Ext Dys";
                           }else if (A3.isChecked()){

                               i=101;
                               totalResult = "no";
                           }else if(A4.isChecked()){

                               i=12;
                           }

                           whatTheQ();
                       }

                       break;

                   case 13:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=80;


                           }else if(A2.isChecked()){

                               i=101;

                           }else if (A3.isChecked()){

                               i=101;
                               totalResult = "no";
                           }else if(A4.isChecked()){

                               i=13;
                           }

                           whatTheQ();
                       }

                       break;


                   case 80:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "ANR";
                               T = 3;


                           }else if(A2.isChecked()){

                               i=101;
                               totalResult = "no";

                           }else if (A3.isChecked()){

                               i=80;
                           }else if(A4.isChecked()){

                               i=80;
                           }

                           whatTheQ();
                       }

                       break;

                   case 14:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=81;


                           }else if(A2.isChecked()){

                               i=101;
                               totalResult = "Ext Dys";
                           }else if (A3.isChecked()){

                               i=101;
                           }else if(A4.isChecked()){

                               i=14;
                           }

                           whatTheQ();
                       }

                       break;

                   case 81:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "Flx Dys";
                               T = 4;


                           }else if(A2.isChecked()){

                               i=101;
                               totalResult = "no";

                           }else if (A3.isChecked()){

                               i=81;
                           }else if(A4.isChecked()){

                               i=81;
                           }

                           whatTheQ();
                       }

                       break;


                   case 16:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=24;


                           }else if(A2.isChecked()){

                               i=101;
                               totalResult = "no";

                           }else if (A3.isChecked()){

                               i=16;
                           }else if(A4.isChecked()){

                               i=16;
                           }

                           whatTheQ();
                       }

                       break;

                   case 17:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=18;


                           }else if(A2.isChecked()){

                               i=19;

                           }else if (A3.isChecked()){

                               i=17;
                           }else if(A4.isChecked()){

                               i=17;
                           }

                           whatTheQ();
                       }

                       break;

                   case 18:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=21;


                           }else if(A2.isChecked()){

                               i=20;

                           }else if (A3.isChecked()){

                               i=18;
                           }else if(A4.isChecked()){

                               i=18;
                           }

                           whatTheQ();
                       }

                       break;

                   case 19:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=23;


                           }else if(A2.isChecked()){

                               i=101;
                               totalResult = "no";

                           }else if (A3.isChecked()){

                               i=19;
                           }else if(A4.isChecked()){

                               i=19;
                           }

                           whatTheQ();
                       }

                       break;


                   case 20:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "Ant .Der";
                               T = 5;


                           }else if(A2.isChecked()){

                               i=101;
                               totalResult = "no";

                           }else if (A3.isChecked()){

                               i=20;
                           }else if(A4.isChecked()){

                               i=20;
                           }

                           whatTheQ();
                       }

                       break;


                   case 21:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=22;




                           }else if(A2.isChecked()){

                               i=100;
                               totalResult = "Post Der";
                               T = 6;
                           }else if (A3.isChecked()){

                               i=21;
                           }else if(A4.isChecked()){

                               i=21;
                           }

                           whatTheQ();
                       }

                       break;

                   case 22:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=101;
                               totalResult = "no";




                           }else if(A2.isChecked()){

                               i=100;
                               totalResult = "Ant Der fis";
                               T = 33;
                           }else if (A3.isChecked()){

                               i=22;
                           }else if(A4.isChecked()){

                               i=22;
                           }

                           whatTheQ();
                       }

                       break;


                   case 23:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=101;
                               totalResult = "no";




                           }else if(A2.isChecked()){

                               i=100;
                               totalResult = "Post Der";
                               T = 6;
                           }else if (A3.isChecked()){

                               i=23;
                           }else if(A4.isChecked()){

                               i=23;
                           }

                           whatTheQ();
                       }

                       break;

                   case 24:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=101;
                               totalResult = "no";




                           }else if(A2.isChecked()){

                               i=100;
                               totalResult = "Ant Der";
                               T = 5;
                           }else if (A3.isChecked()){

                               i=24;
                           }else if(A4.isChecked()){

                               i=24;
                           }

                           whatTheQ();
                       }

                       break;


                   case 25:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=27;




                           }else if(A2.isChecked()){

                               i=28;

                           }else if (A3.isChecked()){

                               i=25;
                           }else if(A4.isChecked()){

                               i=25;
                           }

                           whatTheQ();
                       }

                       break;


                   case 26:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=42;




                           }else if(A2.isChecked()){

                               i=101;
                               totalResult = "no";

                           }else if (A3.isChecked()){

                               i=26;
                           }else if(A4.isChecked()){

                               i=26;
                           }

                           whatTheQ();
                       }

                       break;


                   case 27:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=29;




                           }else if(A2.isChecked()){

                               i=30;

                           }else if (A3.isChecked()){

                               i=27;
                           }else if(A4.isChecked()){

                               i=27;
                           }

                           whatTheQ();
                       }

                       break;

                   case 28:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=41;




                           }else if(A2.isChecked()){

                               i=101;
                               totalResult = "no";

                           }else if (A3.isChecked()){

                               i=28;
                           }else if(A4.isChecked()){

                               i=28;
                           }

                           whatTheQ();
                       }

                       break;


                   case 29:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=31;




                           }else if(A2.isChecked()){

                               i=100;
                               totalResult = "post Der";
                               T = 6;
                           }else if (A3.isChecked()){

                               i=29;
                           }else if(A4.isChecked()){

                               i=29;
                           }

                           whatTheQ();
                       }

                       break;


                   case 30:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "Ant Der";
                               T = 5;




                           }else if(A2.isChecked()){

                               i=101;
                               totalResult = "no";

                           }else if (A3.isChecked()){

                               i=30;
                           }else if(A4.isChecked()){

                               i=30;
                           }

                           whatTheQ();
                       }

                       break;


                   case 31:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=85;




                           }else if(A2.isChecked()){

                               i=100;
                               totalResult = "S.G";
                               T = 7;
                           }else if (A3.isChecked()){

                               i=32;
                           }else if(A4.isChecked()){

                               i=31;
                           }

                           whatTheQ();
                       }

                       break;

                   case 85:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "S.G";
                               T = 7;




                           }else if(A2.isChecked()){

                               i=33;

                           }else if (A3.isChecked()){

                               i=85;
                           }else if(A4.isChecked()){

                               i=85;
                           }

                           whatTheQ();
                       }

                       break;

                   case 32:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;
                               totalResult = "S.G";
                               T = 7;




                           }else if(A2.isChecked()){

                               i=33;

                           }else if (A3.isChecked()){

                               i=99;
                           }else if(A4.isChecked()){

                               i=32;
                           }

                           whatTheQ();
                       }

                       break;

                   case 99:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;
                               totalResult = "S.G + Eis";
                               T = 32;




                           }else if(A2.isChecked()){

                               i=33;

                           }else if (A3.isChecked()){

                               i=99;
                           }else if(A4.isChecked()){

                               i=99;
                           }

                           whatTheQ();
                       }

                       break;


                   case 33:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "EiL Hoc";
                               T = 8;




                           }else if(A2.isChecked()){

                               i=34;

                           }else if (A3.isChecked()){

                               i=40;
                           }else if(A4.isChecked()){

                               i=33;
                           }

                           whatTheQ();
                       }

                       break;


                   case 34:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "EiL Hoc";
                               T = 8;




                           }else if(A2.isChecked()){

                               i=35;

                           }else if (A3.isChecked()){

                               i=34;
                           }else if(A4.isChecked()){

                               i=34;
                           }

                           whatTheQ();
                       }

                       break;


                   case 35:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "Flex Rot";
                               T = 9;




                           }else if(A2.isChecked()){

                               i=36;

                           }else if (A3.isChecked()){

                               i=73;
                           }else if(A4.isChecked()){

                               i=35;
                           }

                           whatTheQ();
                       }

                       break;


                   case 36:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "Flex Rot";
                               T = 9;




                           }else if(A2.isChecked()){

                               i=37;

                           }else if (A3.isChecked()){

                               i=36;
                           }else if(A4.isChecked()){

                               i=36;
                           }

                           whatTheQ();
                       }

                       break;



                   case 37:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "Flex Rot  הפוך";
                               T = 10;




                           }else if(A2.isChecked()){

                               i=38;

                           }else if (A3.isChecked()){

                               i=39;
                           }else if(A4.isChecked()){

                               i=37;
                           }

                           whatTheQ();
                       }

                       break;


                   case 38:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "Flex Rot הפוך";
                               T = 10;




                           }else if(A2.isChecked()){

                               i=101;
                               totalResult = "no";

                           }else if (A3.isChecked()){

                               i=38;
                           }else if(A4.isChecked()){

                               i=38;
                           }

                           whatTheQ();
                       }

                       break;


                   case 39:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;
                               totalResult = "Flex Rot  הפוך";
                               T = 10;




                           }else if(A2.isChecked()){

                               i=101;
                               totalResult = "no";

                           }else if (A3.isChecked()){

                               i=101;
                               totalResult = "no";
                           }else if(A4.isChecked()){

                               i=39;
                           }

                           whatTheQ();
                       }

                       break;


                   case 40:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "Eil + Hoc";
                               T = 8;




                           }else if(A2.isChecked()){

                               i=35;

                           }else if (A3.isChecked()){

                               i=35;
                           }else if(A4.isChecked()){

                               i=40;
                           }

                           whatTheQ();
                       }

                       break;


                   case 41:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=101;
                               totalResult = "no";




                           }else if(A2.isChecked()){

                               i=100;
                               totalResult = "Post Der +EiL +  מנוחת בטן ";
                               T = 11;
                           }else if (A3.isChecked()){

                               i=22;
                           }else if(A4.isChecked()){

                               i=22;
                           }

                           whatTheQ();
                       }

                       break;


                   case 42:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){


                               i=101;
                               totalResult = "no";




                           }else if(A2.isChecked()){

                               i=43;

                           }else if (A3.isChecked()){

                               i=42;
                           }else if(A4.isChecked()){

                               i=42;
                           }

                           whatTheQ();
                       }

                       break;

                   case 43:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "Ant Der Fil";
                               T = 12;




                           }else if(A2.isChecked()){

                               i=101;
                               totalResult = "no";

                           }else if (A3.isChecked()){

                               i=43;
                           }else if(A4.isChecked()){

                               i=43;
                           }

                           whatTheQ();
                       }

                       break;


                   case 44:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=45;




                           }else if(A2.isChecked()){

                               i=100;
                               totalResult = "EIS המשך";
                               T = 13;
                           }else if (A3.isChecked()){

                               i=44;
                           }else if(A4.isChecked()){

                               i=44;
                           }

                           whatTheQ();
                       }

                       break;


                   case 45:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=46;




                           }else if(A2.isChecked()){

                               i=101;
                               totalResult = "no";

                           }else if (A3.isChecked()){

                               i=45;
                           }else if(A4.isChecked()){

                               i=45;
                           }

                           whatTheQ();
                       }

                       break;


                   case 46:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=47;




                           }else if(A2.isChecked()){

                               i=100;
                               totalResult = "EIS תווח קטן";
                               T = 14;
                           }else if (A3.isChecked()){

                               i=46;
                           }else if(A4.isChecked()){

                               i=46;
                           }

                           whatTheQ();
                       }

                       break;


                   case 47:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "Eis תווח קטן ";
                               T = 14;




                           }else if(A2.isChecked()){

                               i=48;

                           }else if (A3.isChecked()){

                               i=47;
                           }else if(A4.isChecked()){

                               i=47;
                           }

                           whatTheQ();
                       }

                       break;


                   case 48:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "SG sust עם קיר ";
                               T = 15;




                           }else if(A2.isChecked()){

                               i=49;

                           }else if (A3.isChecked()){

                               i=48;
                           }else if(A4.isChecked()){

                               i=48;
                           }

                           whatTheQ();
                       }

                       break;


                   case 49:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=50;




                           }else if(A2.isChecked()){

                               i=100;
                               totalResult = "EIL";
                               T = 16;
                           }else if (A3.isChecked()){

                               i=49;
                           }else if(A4.isChecked()){

                               i=49;
                           }

                           whatTheQ();
                       }

                       break;


                   case 50:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "EIL  טווח קטן";
                               T = 17;




                           }else if(A2.isChecked()){

                               i=51;

                           }else if (A3.isChecked()){

                               i=50;
                           }else if(A4.isChecked()){

                               i=50;
                           }

                           whatTheQ();
                       }

                       break;


                   case 51:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=52;




                           }else if(A2.isChecked()){

                               i=53;

                           }else if (A3.isChecked()){

                               i=55;
                           }else if(A4.isChecked()){

                               i=51;
                           }

                           whatTheQ();
                       }

                       break;


                   case 52:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "EIL + HOC";
                               T = 8;




                           }else if(A2.isChecked()){

                               i=100;
                               totalResult = "EIL טווח קטן ";
                               T = 17;
                           }else if (A3.isChecked()){

                               i=52;
                           }else if(A4.isChecked()){

                               i=52;
                           }

                           whatTheQ();
                       }

                       break;


                   case 53:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "EIL + HOC";
                               T = 8;




                           }else if(A2.isChecked()){

                               i=54;

                           }else if (A3.isChecked()){

                               i=53;
                           }else if(A4.isChecked()){

                               i=53;
                           }

                           whatTheQ();
                       }

                       break;

                   case 54:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;
                               totalResult = "Flex + Rot לצד הכאב ";
                               T = 18;




                           }else if(A2.isChecked()){

                               i=56;

                           }else if (A3.isChecked()){

                               i=60;
                           }else if(A4.isChecked()){

                               i=54;
                           }

                           whatTheQ();
                       }

                       break;

                   case 55:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "EIL HOC";
                               T = 8;




                           }else if(A2.isChecked()){

                               i=54;

                           }else if (A3.isChecked()){

                               i=54;
                           }else if(A4.isChecked()){

                               i=55;
                           }

                           whatTheQ();
                       }

                       break;

                   case 56:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "Flex Rot לצד הכאב סטטי";
                               T = 19;




                           }else if(A2.isChecked()){

                               i=57;

                           }else if (A3.isChecked()){

                               i=57;
                           }else if(A4.isChecked()){

                               i=56;
                           }

                           whatTheQ();
                       }

                       break;


                   case 57:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "Flex Rot לצד הכאב הפוך";
                               T = 20;




                           }else if(A2.isChecked()){

                               i=58;

                           }else if (A3.isChecked()){

                               i=59;
                           }else if(A4.isChecked()){

                               i=57;
                           }

                           whatTheQ();
                       }

                       break;


                   case 58:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "Flex Rot לצד הכאב להישאר בסוף התווח";
                               T = 21;




                           }else if(A2.isChecked()){

                               i=101;
                               totalResult = "no";

                           }else if (A3.isChecked()){

                               i=101;
                               totalResult = "no";
                           }else if(A4.isChecked()){

                               i=58;
                           }

                           whatTheQ();
                       }

                       break;

                   case 59:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "Flex Rot לצד הכאב הפוך בתווח קטן";
                               T = 22;




                           }else if(A2.isChecked()){

                               i=101;
                               totalResult = "no";

                           }else if (A3.isChecked()){

                               i=59;
                           }else if(A4.isChecked()){

                               i=59;
                           }

                           whatTheQ();
                       }

                       break;

                   case 60:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "Flex Rot לצד הכאב בתווח קטן";
                               T = 23;




                           }else if(A2.isChecked()){

                               i=57;

                           }else if (A3.isChecked()){

                               i=60;
                           }else if(A4.isChecked()){

                               i=60;
                           }

                           whatTheQ();
                       }

                       break;


                   case 61:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=3;






                           }else if(A2.isChecked()){

                               i=4;

                           }else if (A3.isChecked()){

                               i=61;
                           }else if(A4.isChecked()){

                               i=61;
                           }

                           whatTheQ();
                       }

                       break;

                   case 62:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=72;






                           }else if(A2.isChecked()){

                               i=63;

                           }else if (A3.isChecked()){

                               i=63;
                           }else if(A4.isChecked()){

                               i=63;
                           }

                           whatTheQ();
                       }

                       break;


                   case 72:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=4;






                           }else if(A2.isChecked()){

                               i=101;

                           }else if (A3.isChecked()){

                               i=72;
                           }else if(A4.isChecked()){

                               i=72;
                           }

                           whatTheQ();
                       }

                       break;


                   case 63:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "תיקון הטייה עם הידיים";
                               T = 24;




                           }else if(A2.isChecked()){

                               i=64;

                           }else if (A3.isChecked()){

                               i=65;
                           }else if(A4.isChecked()){

                               i=63;
                           }

                           whatTheQ();
                       }

                       break;


                   case 64:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "תיקון הטייה עם הידיים תווח קטן כיפוף קטן";
                               T = 25;




                           }else if(A2.isChecked()){

                               i=66;

                           }else if (A3.isChecked()){

                               i=64;
                           }else if(A4.isChecked()){

                               i=64;
                           }

                           whatTheQ();
                       }

                       break;

                   case 65:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "תיקון הטייה עם קיר סטטי";
                               T = 26;




                           }else if(A2.isChecked()){

                               i=66;


                           }else if (A3.isChecked()){

                               i=65;
                           }else if(A4.isChecked()){

                               i=65;
                           }

                           whatTheQ();
                       }

                       break;

                   case 66:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "תיקון הטייה בעזרת קיר";
                               T = 27;




                           }else if(A2.isChecked()){

                               i=67;

                           }else if (A3.isChecked()){

                               i=71;
                           }else if(A4.isChecked()){

                               i=66;
                           }

                           whatTheQ();
                       }

                       break;

                   case 67:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "תיקון הטייה בעזרת קיר תווח קטן מעט כיפוף ";
                               T = 28;




                           }else if(A2.isChecked()){

                               i=68;

                           }else if (A3.isChecked()){

                               i=68;
                           }else if(A4.isChecked()){

                               i=67;
                           }

                           whatTheQ();
                       }

                       break;

                   case 68:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){



                               i=100;
                               totalResult = "תיקון הטיית במפתן הדלת ";
                               T = 29;






                           }else if(A2.isChecked()){

                               i=70;

                           }else if (A3.isChecked()){

                               i=69;
                           }else if(A4.isChecked()){

                               i=68;
                           }

                           whatTheQ();
                       }

                       break;

                   case 69:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "להישאר סטטי בתיקון ההטייה במפתן הדלת ";
                               T = 30;




                           }else if(A2.isChecked()){

                               i=54;

                           }else if (A3.isChecked()){

                               i=54;
                           }else if(A4.isChecked()){

                               i=69;
                           }

                           whatTheQ();
                       }

                       break;

                   case 70:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "תיקון הטייה במפתן הדלת בתווח קטן או מעט כיפוף";
                               T = 31;




                           }else if(A2.isChecked()){

                               i=54;

                           }else if (A3.isChecked()){

                               i=70;
                           }else if(A4.isChecked()){

                               i=70;
                           }

                           whatTheQ();
                       }

                       break;

                   case 71:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;

                               totalResult = "תיקון הטייה עם קיר סטטי";
                               T = 26;




                           }else if(A2.isChecked()){

                               i=68;

                           }else if (A3.isChecked()){

                               i=68;
                           }else if(A4.isChecked()){

                               i=71;
                           }

                           whatTheQ();
                       }

                       break;

                   case 73:   // ceack the answer and change the next i  after i have new i whattheQ()
                       iRew = i;

                       if (radioAnswers.getCheckedRadioButtonId() == -1)
                       {
                           // no radio buttons are checked

                           Toast.makeText(QlowbackActivity.this, "נא לסמן תשובה ", Toast.LENGTH_SHORT).show();
                           whatTheQ();
                       }
                       else
                       {
                           // one of the radio buttons is checked

                           if (A1.isChecked()){

                               i=100;
                               totalResult = "Flex Rot";
                               T = 9;




                           }else if(A2.isChecked()){

                               i=37;


                           }else if (A3.isChecked()){

                               i=37;

                           }else if(A4.isChecked()){

                               i=73;
                           }

                           whatTheQ();
                       }

                       break;







               }





            }
        });



    }

    private void initlayout() {

        ivlogo = (ImageView) findViewById(R.id.ivlogo);
        wvQ = (WebView) findViewById(R.id.wvrr);
        tvSub = (TextView) findViewById(R.id.tvSub);
        tvQ = (TextView) findViewById(R.id.tvQ);
        radioAnswers = (RadioGroup) findViewById(R.id.RdioAnswer);
        A1 = (RadioButton) findViewById(rb1);
        A2 = (RadioButton) findViewById(R.id.rb2);
        A3 = (RadioButton) findViewById(R.id.rb3);
        A4 = (RadioButton) findViewById(R.id.rb4);
        btnNext = (Button) findViewById(R.id.btnNext);
        btnRew = (Button) findViewById(R.id.btnRew);




        whatTheQ();

    }

    private void whatTheQ() {



        SharedPreferences.Editor editor = getSharedPreferences("igal", MODE_PRIVATE).edit();
        editor.putInt("T",T );

        editor.apply();



        switch (i){

            //what quetion is it now  "https://www.youtube.com/embed/0SianznASOc"

            case 0:tvQ.setText(R.string.Text1);





                linkQ = "http://www.evt.co.il/wp-content/uploads/2018/01/q1.png";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);



                A1.setText("לא");
                A2.setText("כן");
                A3.setText(" ");
                A4.setText(" ");


                radioAnswers.clearCheck();

                break;
            case  1:  tvQ.setText(R.string.text2);

                linkQ = "http://www.evt.co.il/wp-content/uploads/2018/01/q2.png";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);


                A1.setText("לא");
                A2.setText("כן בגב התחתון בלבד");
                A3.setText("כן בירך ישבן ( עם או ללא גב תחתון ) ");
                A4.setText("כן מתחת לברך ( עם או ללא גב תחתון )  ");

                radioAnswers.clearCheck();

                break;

            case  2:  tvQ.setText(R.string.text3);

                linkQ = "https://www.youtube.com/embed/f68FRUpkLCg";//https://www.youtube.com/watch?v=f68FRUpkLCg

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("לא");
                A2.setText("כן ");
                A3.setText(" ");
                A4.setText("");

                radioAnswers.clearCheck();

                break;

            case  3:  tvQ.setText("בהתייחס להטיית הכתפיים לעומת האגן, האם 2 מתןך 3 המשפטים הבאים רלוונטים לבעייה שלך?  הטיית הגוף התחילה באותה תקופה עם כאב הגב או הרגל?  אני לא מצליח עצמאית לתקן את הטיית הגוף, או לא מצליח/ה להישאר במצב ישר הרבה זמן בגלל כאב. להרגשתי, ניסיון תיקוןעצמי של הטיית הגוף גורם לשינוי כלשהו של הסימפטומים ( הקלה או החמרה ).  ");

                linkQ = "https://www.youtube.com/embed/xF2IVR9NGyw";//https://www.youtube.com/watch?v=xF2IVR9NGyw

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("מחמיר עם החזרות ");
                A2.setText("מוקל עם החזרות  ");
                A3.setText(" ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;

            case  4:  tvQ.setText(R.string.text4);

                linkQ = "https://www.youtube.com/embed/xF2IVR9NGyw";//https://www.youtube.com/watch?v=xF2IVR9NGyw

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("לא מופיע כאב");
                A2.setText("הכאב מופיע ונעלם בהתיישרות ");
                A3.setText("הכאב הולך ומחמיר  ");
                A4.setText("");

                radioAnswers.clearCheck();

                break;

            case  5:  tvQ.setText(R.string.text4kohavit);

                linkQ = "https://www.youtube.com/embed/xF2IVR9NGyw";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("מוחמר עם החזרות");
                A2.setText("מוקל עם החזרות");
                A3.setText(" ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;

            case  6:  tvQ.setText(R.string.text9);

                linkQ = "https://www.youtube.com/embed/6E16Nqtekos";//https://www.youtube.com/watch?v=iN6kMFsRXug

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("לא מופיע כאב ");
                A2.setText("מופיע כאב , אך נעלם עם ההתישרות ");
                A3.setText("הכאב מחמיר עם החזרות   ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;

            case  7:  tvQ.setText(R.string.text9);

                linkQ = "https://www.youtube.com/embed/6E16Nqtekos";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("לא מופיע כאב");
                A2.setText("מופיע כאב , אך נעלם עם ההתיישרות  ");
                A3.setText("הכאב מחמיר עם החזרות   ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;

            case  8:  tvQ.setText(R.string.text4kohavit);

                linkQ = "https://www.youtube.com/embed/xF2IVR9NGyw";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("הכאב מחמיר עם החזרות  ");
                A2.setText("הכאב מוקל עם החזרות  ");
                A3.setText("  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;
            case  9:  tvQ.setText(R.string.text10);

                linkQ = "https://www.youtube.com/embed/iN6kMFsRXug";//https://www.youtube.com/watch?v=cn6W4Eh8zak

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("לא מופיע כאב  ");
                A2.setText("מופיע כאב ונעלם בשיחרור ");
                A3.setText("הכאב מחמיר  ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;
            case  10:  tvQ.setText(R.string.goldpostsyn10);

                linkQ = "http://www.evt.co.il/wp-content/uploads/2018/01/q2.png";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("כן ");
                A2.setText("לא ");
                A3.setText("  ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;
            case  11:  tvQ.setText(R.string.text11);

                linkQ = "https://www.youtube.com/embed/cn6W4Eh8zak";//https://www.youtube.com/watch?v=2_huSL4-T00

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("לא מופיע כאב  ");
                A2.setText("מופיע כאב ונעלם עם החזרות  ");
                A3.setText("הכאב מחמיר עם החזרות   ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;
            case  12:  tvQ.setText(R.string.text10);

                linkQ = "https://www.youtube.com/embed/iN6kMFsRXug";//https://www.youtube.com/watch?v=cn6W4Eh8zak

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("לא מופיע כאב ");
                A2.setText("מופיע כאב ונעלם בשיחרור ");
                A3.setText("כאב מחמיר עם החזרות   ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;
            case  13:  tvQ.setText(R.string.text11);

                linkQ = "https://www.youtube.com/embed/cn6W4Eh8zak";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("לא מופיע כאב ");
                A2.setText("מופיע כאב ונעלם בשיחרור ");
                A3.setText("הכאב מחמיר עם החזרות   ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;
            case  14:  tvQ.setText(R.string.text11);

                linkQ = "https://www.youtube.com/embed/cn6W4Eh8zak";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("לא מופיע כאב ");
                A2.setText("מופיע כאב ונעלם בשיחרור ");
                A3.setText("הכאב מחמיר עם החזרות   ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;

            case  16:  tvQ.setText(R.string.text9kohavit);

                linkQ = "https://www.youtube.com/embed/6E16Nqtekos";//https://www.youtube.com/watch?v=6E16Nqtekos

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("כאב מוחמר עם החזרות  ");
                A2.setText("הכאב מוקל עם החזרות  ");
                A3.setText("  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;
            case  17:  tvQ.setText(R.string.text9kohavit);

                linkQ = "https://www.youtube.com/embed/6E16Nqtekos";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("כאב מוחמר עם החזרות  ");
                A2.setText("כאב מוקל עם החזרות  ");
                A3.setText("  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;
            case  18:  tvQ.setText(R.string.text10kohavit);

                linkQ = "https://www.youtube.com/embed/iN6kMFsRXug";//https://www.youtube.com/watch?v=iN6kMFsRXug

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("כאב מוחמר עם החזרות  ");
                A2.setText("כאב מוקל עם החזרות  ");
                A3.setText(" ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;
            case  19:  tvQ.setText(R.string.text10kohavit);

                linkQ = "https://www.youtube.com/embed/iN6kMFsRXug";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("כאב מוחמר עם החזרות  ");
                A2.setText("כאב מוקל עם החזרות  ");
                A3.setText(" ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;
            case  20:  tvQ.setText(R.string.text11kohavit);

                linkQ = "https://www.youtube.com/embed/cn6W4Eh8zak";//https://www.youtube.com/watch?v=cn6W4Eh8zak

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("כאב מוחמר עם החזרות  ");
                A2.setText("כאב מוקל עם החזרות  ");
                A3.setText("  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;
            case  21:  tvQ.setText(R.string.text11kohavit);

                linkQ = "https://www.youtube.com/embed/cn6W4Eh8zak";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("כאב מוחמר עם החזרות  ");
                A2.setText("כאב מוקל עם החזרות  ");
                A3.setText("  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;
            case  22:  tvQ.setText(R.string.text12);

                linkQ = "https://www.youtube.com/embed/2_huSL4-T00";//https://www.youtube.com/watch?v=a3t1ifZfD8o

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("כאב מוחמר עם החזרות  ");
                A2.setText("כאב מוקל עם החזרות  ");
                A3.setText("  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;

            case  23:  tvQ.setText(R.string.text11kohavit);

                linkQ = "https://www.youtube.com/embed/cn6W4Eh8zak";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("כאב מוחמר עם החזרות  ");
                A2.setText("כאב מוקל עם החזרות  ");
                A3.setText("  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;
            case  24:  tvQ.setText(R.string.text10kohavit);

                linkQ = "https://www.youtube.com/embed/iN6kMFsRXug";//https://www.youtube.com/watch?v=iN6kMFsRXug

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("כאב מוחמר עם החזרות  ");
                A2.setText("כאב מוקל עם החזרות  ");
                A3.setText("  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;

            case  25:  tvQ.setText(R.string.text9kohavit);

                linkQ = "https://www.youtube.com/embed/6E16Nqtekos";//https://www.youtube.com/watch?v=6E16Nqtekos

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("כאב מוחמר עם החזרות  ");
                A2.setText("כאב מוקל עם החזרות  ");
                A3.setText("  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;

            case  26:  tvQ.setText(R.string.text9kohavit);

                linkQ = "https://www.youtube.com/embed/6E16Nqtekos";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("כאב מוחמר עם החזרות  ");
                A2.setText("כאב מוקל עם החזרות  ");
                A3.setText("  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;

            case  27:  tvQ.setText(R.string.text10kohavit);

                linkQ = "https://www.youtube.com/embed/iN6kMFsRXug";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("כאב מוחמר עם החזרות  ");
                A2.setText("כאב מוקל עם החזרות  ");
                A3.setText("  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;

            case  28:  tvQ.setText(R.string.text10kohavit);

                linkQ = "https://www.youtube.com/embed/iN6kMFsRXug";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("כאב מוחמר עם החזרות  ");
                A2.setText("כאב מוקל עם החזרות  ");
                A3.setText("  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;
            case  29:  tvQ.setText(R.string.text11kohavit);

                linkQ = "https://www.youtube.com/embed/cn6W4Eh8zak";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("כאב מוחמר עם החזרות  ");
                A2.setText("כאב מוקל עם החזרות  ");
                A3.setText("  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;

            case  30:  tvQ.setText(R.string.text11kohavit);

                linkQ = "https://www.youtube.com/embed/cn6W4Eh8zak";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("כאב מוחמר עם החזרות  ");
                A2.setText("כאב מוקל עם החזרות  ");
                A3.setText("  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;

            case  31:  tvQ.setText(R.string.text6);

                linkQ = "https://www.youtube.com/embed/7iNIJapYo24";//https://www.youtube.com/watch?v=DSE1ofZOhPM

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("הכאב מחמיר עם החזרות ");
                A2.setText("הכאב מוקל בזמן החזרות  ");
                A3.setText("החזרות לא משנות כלום בכאב   ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;

            case  32:  tvQ.setText(R.string.text6kohavit3);

                linkQ = "https://www.youtube.com/embed/6NsiVzxD0jo";//https://www.youtube.com/watch?v=HY6Z9WLvMBE

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("הכאב מוקל עם החזרות  ");
                A2.setText("הכאב מחמיר עם החזרות  ");
                A3.setText(" לא משתנה עם החזרות");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;

            case  33:  tvQ.setText(R.string.text13);

                linkQ = "https://www.youtube.com/embed/q_h22wwW5Tg";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("התרגול מקל על הכאב  ");
                A2.setText("התרגול מחמיר את הכאב  ");
                A3.setText("התרגול לא משנה את הכאב  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;

            case  34:  tvQ.setText(R.string.text13kohavit2);

                linkQ = "https://www.youtube.com/embed/g8Vr4Jc5zYw";//https://www.youtube.com/watch?v=5brCfMDk_d0

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("הכאב או הסימפוטומים מוקלים  ");
                A2.setText("הכאב או הסימפטומים מוחמרים  ");
                A3.setText(" ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;
            case  35:  tvQ.setText(R.string.text8);

                linkQ = "https://www.youtube.com/embed/8wlBeb6Ax94";//https://www.youtube.com/watch?v=6E16Nqtekos

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("התרגול מקל על הכאב  ");
                A2.setText("התרגול מחמיר את הכאב  ");
                A3.setText("התרגול לא משנה את הכאב  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;

            case  36:  tvQ.setText(R.string.text8kohavit2);

                linkQ = "https://www.youtube.com/embed/cp_uYjY2Hgs";//https://www.youtube.com/watch?v=KzQn1hOmOfY

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("התרגול מקל על הכאב  ");
                A2.setText("התרגול מחמיר את הכאב  ");
                A3.setText(" ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;

            case  37:  tvQ.setText(R.string.text8kohavit);

                linkQ = "https://www.youtube.com/embed/8wlBeb6Ax94";//https://www.youtube.com/watch?v=haVQU2-WnOY

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("התרגול מקל על הכאב  ");
                A2.setText("התרגול מחמיר את הכאב  ");
                A3.setText("התרגול לא משנה את הכאב  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;

            case  38:  tvQ.setText(R.string.kotext8kohavit2);

                linkQ = "https://www.youtube.com/embed/cp_uYjY2Hgs";//https://www.youtube.com/watch?v=KzQn1hOmOfY

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("התרגול מקל על הכאב  ");
                A2.setText("התרגול מחמיר את הכאב  ");
                A3.setText(" ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;
            case  39:  tvQ.setText(R.string.kotext8kohavit3);

                linkQ = "https://www.youtube.com/embed/--orVQOfe6k";//https://www.youtube.com/watch?v=3NGj3KS_3dI

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("התרגול מקל על הכאב  ");
                A2.setText("התרגול מחמיר את הכאב  ");
                A3.setText("התרגול לא משנה את הכאב  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;
            case  40:  tvQ.setText(R.string.text13kohavit3);

                linkQ = "https://www.youtube.com/embed/DKXdPqRmlvw";//https://www.youtube.com/watch?v=240aSsm0TDU

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("התרגול מקל על הכאב  ");
                A2.setText("התרגול מחמיר את הכאב  ");
                A3.setText("התרגול לא משנה את הכאב  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;

            case  41:  tvQ.setText(R.string.text11kohavit);

                linkQ = "https://www.youtube.com/embed/cn6W4Eh8zak";//https://www.youtube.com/watch?v=cn6W4Eh8zak

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("מוחמר עם החזרות ");
                A2.setText("מוקל עם החזרות  ");
                A3.setText("  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;
            case  42:  tvQ.setText(R.string.text10kohavit);

                linkQ = "https://www.youtube.com/embed/iN6kMFsRXug";//https://www.youtube.com/watch?v=iN6kMFsRXug

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("מוחמר עם החזרות ");
                A2.setText("מוקל עם החזרות  ");
                A3.setText("  ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;
            case  43:  tvQ.setText(R.string.text11kohavit);

                linkQ = "https://www.youtube.com/embed/cn6W4Eh8zak";//https://www.youtube.com/watch?v=cn6W4Eh8zak

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("מוחמר עם החזרות ");
                A2.setText("מוקל עם החזרות  ");
                A3.setText("  ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;
            case  44:  tvQ.setText(R.string.text9kohavit);

                linkQ = "https://www.youtube.com/embed/6E16Nqtekos";//https://www.youtube.com/watch?v=6E16Nqtekos

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("מוחמר עם החזרות ");
                A2.setText("מוקל עם החזרות  ");
                A3.setText("  ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;
            case  45:  tvQ.setText(R.string.text14);

                linkQ = "https://www.youtube.com/embed/pjZbSpfIr7w";//https://www.youtube.com/watch?v=pjZbSpfIr7w

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);


                A1.setText("כן ");
                A2.setText("לא ");
                A3.setText("  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;
            case  46:  tvQ.setText(R.string.text9kohavit);

                linkQ = "https://www.youtube.com/embed/6E16Nqtekos";//https://www.youtube.com/watch?v=6E16Nqtekos

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("מוחמר עם החזרות ");
                A2.setText("מוקל עם החזרות  ");
                A3.setText("  ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;

            case  47:  tvQ.setText(R.string.text15);

                linkQ = "https://www.youtube.com/embed/mW91xtZWusc";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("כן ");
                A2.setText("לא");
                A3.setText("  ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;

            case  48:  tvQ.setText(" נא לעמוד עם הצד הגוף צמוד אל הקיר ( הצד הלא כאוב צמוד לקיר )  , רגליים צמודות כ 30 ס״מ מהקיר והיד הנגדית דוחפת את האגן לכיוון הקיר . לבצע עד 10 חזרות עם הישארות סטטית בכל חזרה 3-5 שניות . לאחר מכן לבדוק מה קורה לכאב בזמן ביצוע תרגיל הטיית הגב אחורנית ( התרגיל בסוף הסרטון )   ");

                linkQ = "https://www.youtube.com/embed/UW1lBmj7Wrk";//https://www.youtube.com/watch?v=HY6Z9WLvMBE

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("מוחמר עם החזרות ");
                A2.setText("מוקל עם החזרות  ");
                A3.setText("  ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;
            case  49:  tvQ.setText(R.string.text11kohavit);

                linkQ = "https://www.youtube.com/embed/cn6W4Eh8zak";//https://www.youtube.com/watch?v=cn6W4Eh8zak

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("מוחמר עם החזרות ");
                A2.setText("מוקל עם החזרות  ");
                A3.setText("  ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;
            case  50:  tvQ.setText(R.string.text15);

                linkQ = "https://www.youtube.com/embed/UwAjli9KCBA";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("כן  ");
                A2.setText("לא ");
                A3.setText(" ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;

            case  51:  tvQ.setText(R.string.text13);

                linkQ = "https://www.youtube.com/embed/q_h22wwW5Tg";//q_h22wwW5Tg

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("התרגול מקל על הכאב  ");
                A2.setText("התרגול מחמיר את הכאב  ");
                A3.setText("התרגול לא משנה את הכאב  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;
            case  52:  tvQ.setText(R.string.text11kohavit);

                linkQ = "https://www.youtube.com/embed/cn6W4Eh8zak";//https://www.youtube.com/watch?v=cn6W4Eh8zak

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("מוחמר עם החזרות ");
                A2.setText("מוקל עם החזרות  ");
                A3.setText("  ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;
            case  53:  tvQ.setText(R.string.text13kohavit2);

                linkQ = "https://www.youtube.com/embed/g8Vr4Jc5zYw";//g8Vr4Jc5zYw

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("מוקל עם החזרות ");
                A2.setText("מוחמר עם החזרות  ");
                A3.setText("  ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;
            case  54:  tvQ.setText(R.string.text8);

                linkQ = "https://www.youtube.com/embed/8wlBeb6Ax94";//IKItyecTGYA

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("הכאב מוקל ");
                A2.setText("התרגול לא משנה כלום בכאב ");
                A3.setText("הכאב מוחמר עם התרגול  ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;
            case  55:  tvQ.setText(R.string.text13kohavit3);

                linkQ = "https://www.youtube.com/embed/DKXdPqRmlvw";//DKXdPqRmlvw

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("הכאב מוקל ");
                A2.setText("התרגול לא משנה כלום בכאב ");
                A3.setText("הכאב מוחמר עם התרגול  ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;
            case  56:  tvQ.setText(R.string.text8kohavit3);

                linkQ = "https://www.youtube.com/embed/--orVQOfe6k";//4x0FK8BC9o4

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("הכאב מוקל ");
                A2.setText("התרגול לא משנה כלום בכאב ");
                A3.setText("הכאב מוחמר עם התרגול  ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;
            case  57:  tvQ.setText(R.string.text8kohavit);

                linkQ = "https://www.youtube.com/embed/8wlBeb6Ax94";//8wlBeb6Ax94

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("הכאב מוקל ");
                A2.setText("התרגול לא משנה כלום בכאב ");
                A3.setText("הכאב מוחמר עם התרגול  ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;

            case  58:  tvQ.setText(R.string.kotext8kohavit3);

                linkQ = "https://www.youtube.com/embed/--orVQOfe6k";//--orVQOfe6k

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("הכאב מוקל ");
                A2.setText("התרגול לא משנה כלום בכאב ");
                A3.setText("הכאב מוחמר עם התרגול  ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;

            case  59:  tvQ.setText(R.string.kotext8kohavit2);

                linkQ = "https://www.youtube.com/embed/cp_uYjY2Hgs";//cp_uYjY2Hgs

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("הכאב מוקל ");
                A2.setText("הכאב מחמיר ");
                A3.setText("  ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;

            case  60:  tvQ.setText(R.string.text8kohavit2);

                linkQ = "https://www.youtube.com/embed/cp_uYjY2Hgs";//svwOni3H_Dw

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("מוקל עם החזרות  ");
                A2.setText("הכאב מחמיר עם החזרות ");
                A3.setText("  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;

            case  61:  tvQ.setText(R.string.text2);

                linkQ = "http://www.evt.co.il/wp-content/uploads/2018/01/q2.png";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("כן ");
                A2.setText("לא ");
                A3.setText("  ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;

            case  62:  tvQ.setText(R.string.text2);

                linkQ = "http://www.evt.co.il/wp-content/uploads/2018/01/q2.png";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("לא ");
                A2.setText("כן כאב בגב תחתון בלבד ");
                A3.setText("כן מורגש כאב מעל הברך ו/או גב תחתון   ");
                A4.setText("כן מורגש כאב מתחת לברך ו/או גב תחתון ");

                radioAnswers.clearCheck();

                break;

            case  63:  tvQ.setText(R.string.text5);

                linkQ = "https://www.youtube.com/embed/9ffds0tw0-I";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("התרגול מקל על הכאב ");
                A2.setText("התרגול מחמיר את הכאב  ");
                A3.setText("התרגול לא משנה לכאב   ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;

            case  64:  tvQ.setText(R.string.text5kohavit2);

                linkQ = "https://www.youtube.com/embed/sBUDcY5duwY";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("מקל על הכאב ");
                A2.setText("מחמיר את הכאב ");
                A3.setText(" ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;

            case  65:  tvQ.setText(R.string.text5kohavit3);

                linkQ = "https://www.youtube.com/embed/E8VEy7eA6iU";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("מקל על הכאב ");
                A2.setText("מחמיר את הכאב ");
                A3.setText(" ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;

            case  66:  tvQ.setText(R.string.text6);

                linkQ = "https://www.youtube.com/embed/7iNIJapYo24";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("מקל על הכאב ");
                A2.setText("מחמיר את הכאב ");
                A3.setText(" התרגול לא משנה כלום בכאב");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;
            case  67:  tvQ.setText(R.string.text6kohavit2);

                linkQ = "https://www.youtube.com/embed/UW1lBmj7Wrk";//UW1lBmj7Wrk

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("מקל על הכאב ");
                A2.setText("מחמיר את הכאב או לא משנה כלום  ");
                A3.setText(" ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;
            case  68:  tvQ.setText(R.string.text7);

                linkQ = "https://www.youtube.com/embed/DSE1ofZOhPM";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("מקל על הכאב ");
                A2.setText("מחמיר את הכאב ");
                A3.setText(" התרגול לא משנה כלום בכאב");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;
            case  69:  tvQ.setText(R.string.text7kohavit3);

                linkQ = "https://www.youtube.com/embed/Zc2mRSsjf7k";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("מקל על הכאב ");
                A2.setText("מחמיר את הכאב  ");
                A3.setText(" לא משנה כלום בכאב ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;
            case  70:  tvQ.setText(R.string.text7kohavit2);

                linkQ = "https://www.youtube.com/embed/HuOYzp4Yt3I";//HuOYzp4Yt3I

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("מקל על הכאב ");
                A2.setText("מחמיר את הכאב  או לא משנה ");
                A3.setText(" ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;
            case  71:  tvQ.setText("נא לעמוד עם צד הגוף צמוד לקיר ( הכתף המרוחקת יותר ממרכז עמוד השידרה צמודה לקיר, הרגליים צמודות אחת לשנייה כ 30 ס״מ מהקיר),n/ היד הנגדית דוחפת את האגן לקיר לשם תיקון מוגזם של הסטייה. n/נא לבצע 10 חזרות ( או פחות במקרא של החמרת כאב ), n/אך הפעם נא להישאר במצב סטטי בסוף הטווח 3-5 שניות. n/מה קורה לכאב המרוחק ביותר ממרכז עמוד השידרה? ");

                linkQ = "https://www.youtube.com/embed/6NsiVzxD0jo";//6NsiVzxD0jo

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("מקל על הכאב ");
                A2.setText("מחמיר את הכאב  ");
                A3.setText(" לא משנה כלום בכאב ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;

            case  72:  tvQ.setText(R.string.text3);

                linkQ = "https://www.youtube.com/embed/UwAjli9KCBA";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("לא");
                A2.setText("כן ");
                A3.setText(" ");
                A4.setText("");

                radioAnswers.clearCheck();

                break;

            case  73:  tvQ.setText(R.string.text8kohavit3);

                linkQ = "https://www.youtube.com/embed/--orVQOfe6k";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("מוקל עם החזרות");
                A2.setText("מחמיר עם החזרות או לא משנה את הכאב");
                A3.setText(" ");
                A4.setText(" ");

                radioAnswers.clearCheck();

                break;

            case  80:  tvQ.setText(R.string.anrgold);

                linkQ = "http://www.evt.co.il/wp-content/uploads/2018/03/q3.jpg";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("כן ");
                A2.setText("לא ");
                A3.setText(" ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;
            case  81:  tvQ.setText(R.string.flxdysgold);

                linkQ = "http://www.evt.co.il/wp-content/uploads/2018/03/q3.jpg";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("כן ");
                A2.setText("לא ");
                A3.setText("  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;
            case  85:  tvQ.setText(R.string.text6kohavit2);

                linkQ = "https://www.youtube.com/embed/UW1lBmj7Wrk";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);

                A1.setText("מקל על הכאב ");
                A2.setText("מחמיר את הכאב או לא משנה  ");
                A3.setText("  ");
                A4.setText("  ");

                radioAnswers.clearCheck();

                break;

            case  99:  tvQ.setText("נא לעמוד עם הצד הלא כאוב אל הקיר. הכתף צמודה אל הקיר והרגליים צמודות אחת לשנייה כ- 30 ס״מ מהקיר. n/יד רחוקה מהקיר נמצאת על האגן ודוחפת אותו לכיוון הקיר עד סוף הטווח הקיים, n/לאחר מכן להצמיד את הרגל הקרובה אל הקיר ולהוסיף תנועה לאחור של הגב ( כמו בסרטון ), n/לבצע 10 חזרות ולבדוק מה קורה לכאב באיזור ירך/ישבן ");


                A1.setText("הכאב מוקל עם החזרות ");
                A2.setText("הכאב מחמיר עם החזרות ");
                A3.setText("  ");
                A4.setText("  ");

                linkQ = "https://www.youtube.com/embed/39dWr_IGGeY";

                wvQ.getSettings().setJavaScriptEnabled(true);
                wvQ.getSettings().setDisplayZoomControls(true);



                wvQ.loadUrl(linkQ);
                radioAnswers.clearCheck();

                break;

            case 100:


                editor = getSharedPreferences("igal", MODE_PRIVATE).edit();
               editor.putString("totalresult",totalResult );
                editor.putInt("t",T );

                editor.apply();

               // Intent intent = new Intent(QlowbackActivity.this,ResultsActivity.class);
              //  startActivity(intent);

                Intent intent = new Intent(QlowbackActivity.this,ResultsActivity.class);
                intent.putExtra("result",totalResult);

                startActivity(intent);





                radioAnswers.clearCheck();


                break;


            case 101:



                editor = getSharedPreferences("igal", MODE_PRIVATE).edit();
                editor.putString("totalresult","a" );

                editor.apply();


                Intent intent1 = new Intent(QlowbackActivity.this,NoResultActivity.class);
                startActivity(intent1);

                break;


            default:


                radioAnswers.clearCheck();
        }




    }
}
