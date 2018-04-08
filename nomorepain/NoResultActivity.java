package evt.co.il.nomorepain;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NoResultActivity extends AppCompatActivity {

    //התשובות שענית אינן הגיוניות או אינן מתאימות לתבניות של בעייה מכנית בעמוד השידרה.  הכאב יכול להיות מושלך ממקומות אחרים בגוף.  באפשרותך לחזור על שאלון הגב התחתון ולוודא שהינך עונה בדייקנות על השאלות . במידה והינך מקבל תשובה זו שוב , ניתן לבצע תרגול כללי לגב תחתון / ירך / ברך והיוועץ עם רופא בהקדם
TextView tvNoR;
Button btnR101,btnMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_result);

        tvNoR = (TextView) findViewById(R.id.tvNor);
        btnR101 = (Button) findViewById(R.id.btnr101);
        btnMenu = (Button) findViewById(R.id.btnRMenu);

        tvNoR.setText("התשובות שענית אינן מתאימות לתבניות המצביעות על איזור הגב/עמוד השידרה.\nיכול להיות שהכאב מושלך ממפרק אחר.\nבאפשרותך לחזור על שאלון גב תחתון על מנת לוודא כי ענית בהתאם לתחושתך ,במידה והתשובה לא משתנה בדוק אפשרות במפרק הירך או הברך ( יש סיכוי שאחד מהם הוא מקור המשליך את הכאב )\nובכל מקרא מומלץ להיוועץ עם רופא לשלילת ממצא שאינו תנועתי. ");

        initevent();
    }

    private void initevent() {

        btnR101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Dialog dialog = new Dialog(NoResultActivity.this);
                dialog.setContentView(R.layout.layoutmassage);
                TextView txt = (TextView)dialog.findViewById(R.id.tvMsg);

                Button btnmsg = (Button)dialog.findViewById(R.id.btnMsg);

                txt.setText("משתמש יקר!\n" +

                        "חשוב לדעת ששיטת האבחון בשאלון מבוססת על ביצוע חזרות מרובות של תנועה ולפעמים 10 חזרות לא מספיקות על מנת להחליט האם התנועה מחמירה/מקלה/לא משנה את הכאבים. אם במהלך השאלון הרגשת שהיו לך שאלות כאלו, יש לבצע את התנועה הספציפית במשך 2-3 ימים, 10 חזרות בכל 2-3 שעות, ולאחר מכן לענות שוב על השאלון.");

                btnmsg.setText("לתחילת השאלון");

                btnmsg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent = new Intent(NoResultActivity.this,QlowbackActivity.class);
                        startActivity(intent);

                    }
                });

                dialog.show();


            }
        });

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog = new Dialog(NoResultActivity.this);
                dialog.setContentView(R.layout.layoutmassage);
                TextView txt = (TextView)dialog.findViewById(R.id.tvMsg);

                Button btnmsg = (Button)dialog.findViewById(R.id.btnMsg);

                txt.setText("משתמש יקר!\n" +

                        "חשוב לדעת ששיטת האבחון בשאלון מבוססת על ביצוע חזרות מרובות של תנועה ולפעמים 10 חזרות לא מספיקות על מנת להחליט האם התנועה מחמירה/מקלה/לא משנה את הכאבים. אם במהלך השאלון הרגשת שהיו לך שאלות כאלו, יש לבצע את התנועה הספציפית במשך 2-3 ימים, 10 חזרות בכל 2-3 שעות, ולאחר מכן לענות שוב על השאלון.");

                btnmsg.setText("למסך ההתחלה");

                btnmsg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent = new Intent(NoResultActivity.this,MainActivity.class);
                        startActivity(intent);

                    }
                });

                dialog.show();


            }
        });
    }
}
