package evt.co.il.nomorepain;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {
    
    ImageView ivlogo,ivb;
    TextView tvSub;
    Button btnNeck,btnSholder,btnUpback,btnMarpek,btnLowback,btnagan,btnHand,btnKnee,btnFeet;
    int numBtn,totalLabel=0; // num of btnclicked
    String total = "a";
    SharedPreferences prefs;
    Boolean firstTime ;
    int x=1;



     

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initlayout();
        
        initevent();
    }

    private void initevent() {

        btnNeck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                numBtn = 1000;

                toGeneralScren(numBtn);



            }
        });
        btnSholder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numBtn = 2000;
                toGeneralScren(numBtn);

            }
        });
        btnUpback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numBtn = 3000;
                toGeneralScren(numBtn);

            }
        });
        btnMarpek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numBtn = 4000;
                toGeneralScren(numBtn);

            }
        });
        btnLowback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numBtn = 5000;
                toGeneralScren(numBtn);

            }
        });
        btnagan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numBtn = 6000;
                toGeneralScren(numBtn);

            }
        });
        btnHand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numBtn = 7000;
                toGeneralScren(numBtn);

            }
        });
        btnKnee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numBtn = 8000;
                toGeneralScren(numBtn);

            }
        });
        btnFeet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numBtn = 9000;
                toGeneralScren(numBtn);

            }
        });

        ivb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (total.equals("a")){

                    Toast.makeText(MainActivity.this,"אין לך טיפול פעיל נא לבחור איזור לטיפול",
                            Toast.LENGTH_SHORT).show();
                }else{

                    SharedPreferences.Editor editor = getSharedPreferences("igal", MODE_PRIVATE).edit();

                    editor = getSharedPreferences("igal", MODE_PRIVATE).edit();

                    editor.putInt("t",numBtn );

                    editor.apply();
                    Intent intent = new Intent(MainActivity.this,ResultsActivity.class);
                    intent.putExtra("theR", totalLabel);
                    startActivity(intent);
                }
            }
        });


    }

    private void toGeneralScren(final int numBtn) {

        SharedPreferences.Editor editor = getSharedPreferences("igal", MODE_PRIVATE).edit();
        editor.putInt("t",numBtn );

        editor.apply();

        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.layoutmassage);
        TextView txt = (TextView) dialog.findViewById(R.id.tvMsg);

        Button btnmsg = (Button) dialog.findViewById(R.id.btnMsg);

        txt.setText("משתמש יקר!\n\n" +

                "אנו שמחים שבחרת להשתמש באפליקציה שלנו.\nזוהי אפליקציית פזיותרפיה ייחודית שנועדה להביא את הטיפול עד אליך, להקל על הכאבים שלך ולחזק שרירים ( ללא כאב ) על ידי דירוג מכוון של העומס בתרגילים.\nבחלקים של השאלון המותאם אישית, מציאת התרגיל הנכון מבוססת על עיקרון של חזרות מרובות ומציאת כיוון תנועה המקל על הכאב.\n\nהשימוש באפליקציה אינו תחליף ליעוץ רפואי ובאחריות המשתמש בלבד.\n\nשימוש נעים ותהיו בריאים!");

        btnmsg.setText("Ok");

        btnmsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,generalDataActivity.class);
                intent.putExtra("t",numBtn);

                startActivity(intent);

            }
        });

        dialog.show();











    }

    private void initlayout() {

        ivlogo = (ImageView) findViewById(R.id.ivlogo);
        tvSub = (TextView) findViewById(R.id.tvSub);
        btnNeck = (Button) findViewById(R.id.btnNeck);
        btnSholder = (Button) findViewById(R.id.btnSoulder);
        btnUpback = (Button) findViewById(R.id.btnUpback);
        btnMarpek = (Button) findViewById(R.id.btnMarpek);
        btnLowback = (Button) findViewById(R.id.btnLowback);
        btnagan = (Button) findViewById(R.id.btnAss);
        btnHand = (Button) findViewById(R.id.btnHand);
        btnKnee = (Button) findViewById(R.id.btnknee);
        btnFeet = (Button) findViewById(R.id.btnFeet);
        ivb = (ImageView) findViewById(R.id.ivb);

        try {
            prefs = getSharedPreferences("igal", MODE_PRIVATE);
            total = prefs.getString("totalresult", null);
            firstTime = prefs.getBoolean("first", true);

            if (total != "a") {
                //totalTextName = prefs.getString("result", null);//"No name defined" is the default value.
                totalLabel = prefs.getInt("step", 0); //0 is the default value.


            }


            if (total.equals("a")) {

                ivb.setImageResource(R.drawable.boody);



            } else {

                ivb.setImageResource(R.drawable.boodyactive);
            }

            if(firstTime) {

                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.layoutmassage);
                TextView txt = (TextView)dialog.findViewById(R.id.tvMsg);

                Button btnmsg = (Button)dialog.findViewById(R.id.btnMsg);

                txt.setText("משתמש יקר,"+"\n\n"+"אנו שמחחים שבחרת להשתמש באפליקציה  No More Pain"+" \n"+"זוהי אפליקציית פיזיותרפיה ייחודית שנועדה להביא את הטיפול אלייך, להקל על הכאבים שלך וליצור חיזוק שרירים ללא כאב על ידי דירוג מכוון של עומסים."+"  בחלקים של שאלון מותאם אישית, מציאת התרגיל הנכון מבוסס על עקרון של חזרות מרובות ומציאת כיוון תנועה שמקל על כאב."+"\n\n"+"שימוש נעים ותהיו בריאים");


                btnmsg.setText("המשך");

                btnmsg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        SharedPreferences.Editor editor = getSharedPreferences("igal", MODE_PRIVATE).edit();

                        editor = getSharedPreferences("igal", MODE_PRIVATE).edit();
                        editor.putBoolean("first",false);

                        editor.apply();

                        Intent intent = new Intent(MainActivity.this,MainActivity.class);
                        startActivity(intent);


                    }
                });

                dialog.show();

            }else{



            }



        }catch ( Exception e){




    }




    }



}
