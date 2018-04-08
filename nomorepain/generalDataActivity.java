package evt.co.il.nomorepain;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class generalDataActivity extends AppCompatActivity {

    int numPart,i;//i = the random tips
    ImageView inlogo,ivChoosePart;
    TextView tvSub,tvPartName,tvTips;
    Button btnPersonal;
    Boolean ifQuationsIt = true; // true if have it asks
    ArrayList<String> TipLowBack = new ArrayList<>();
    ArrayList<String> TipNeck = new ArrayList<>();
    ArrayList<String> TipShoulder = new ArrayList<>();
    ArrayList<String> TipMarpek = new ArrayList<>();
    ArrayList<String> TipHiBack = new ArrayList<>();
    ArrayList<String> TipHand = new ArrayList<>();
    ArrayList<String> TipAss = new ArrayList<>();
    ArrayList<String> TipKnee = new ArrayList<>();
    ArrayList<String> TipLowLegs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_data);

        initData();

        initlayout();




        initevent();
    }

    private void initevent() {

        btnPersonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ifQuationsIt) {
                    Intent intent = new Intent(generalDataActivity.this, beforeQActivity.class);
                    startActivity(intent);
                } else {

                    Intent intent = new Intent(generalDataActivity.this, ResultsActivity.class);
                   // intent.putExtra("myarea", numPart);

                    startActivity(intent);
                }


            }

        });
    }

    private void initData() {

        TipLowBack.add(0,getString(R.string.lowbackTip1));
        TipLowBack.add(1,getString(R.string.lowbackTip2));
        TipLowBack.add(2,getString(R.string.lowbackTip3));
        TipLowBack.add(3,getString(R.string.lowbackTip4));
        TipLowBack.add(4,getString(R.string.lowbackTip5));
        TipLowBack.add(5,getString(R.string.lowbackTip6));
        TipLowBack.add(6,getString(R.string.lowbackTip7));

        TipNeck.add(0,getString(R.string.neckTip1));
        TipNeck.add(1,getString(R.string.neckTip2));
        TipNeck.add(2,getString(R.string.neckTip3));
        TipNeck.add(3,getString(R.string.neckTip4));
        TipNeck.add(4,getString(R.string.neckTip5));
        TipNeck.add(5,getString(R.string.neckTip6));
        TipNeck.add(6,getString(R.string.neckTip7));
        TipNeck.add(7,getString(R.string.neckTip8));
        TipNeck.add(8,getString(R.string.neckTip9));

        TipShoulder.add(0,getString(R.string.shoulderTip1));
        TipShoulder.add(1,getString(R.string.shoulderTip2));
        TipShoulder.add(2,getString(R.string.shoulderTip3));
        TipShoulder.add(3,getString(R.string.shoulderTip4));
        TipShoulder.add(4,getString(R.string.shoulderTip5));
        TipShoulder.add(5,getString(R.string.shoulderTip6));
        TipShoulder.add(6,getString(R.string.shoulderTip7));

        TipMarpek.add(0,getString(R.string.marpekTip1));
        TipMarpek.add(1,getString(R.string.marpekTip2));
        TipMarpek.add(2,getString(R.string.marpekTip3));
        TipMarpek.add(3,getString(R.string.marpekTip4));

        TipHiBack.add(0,getString(R.string.lowbackTip1));
        TipHiBack.add(1,getString(R.string.lowbackTip2));
        TipHiBack.add(2,getString(R.string.lowbackTip3));
        TipHiBack.add(3,getString(R.string.lowbackTip4));
        TipHiBack.add(4,getString(R.string.lowbackTip5));
        TipHiBack.add(5,getString(R.string.lowbackTip6));
        TipHiBack.add(6,getString(R.string.lowbackTip7));

        TipHand.add(0,getString(R.string.marpekTip1));
        TipHand.add(1,getString(R.string.marpekTip2));
        TipHand.add(2,getString(R.string.marpekTip3));
        TipHand.add(3,getString(R.string.marpekTip4));


        TipAss.add(0,getString(R.string.assTip1));
        TipAss.add(1,getString(R.string.assTip2));
        TipAss.add(2,getString(R.string.assTip3));
        TipAss.add(3,getString(R.string.assTip4));

        TipKnee.add(0,"הידעת : בניתוח ברך מניסקוס לא נמצא הבדל בין ניתוח אמיתי לניתוח פלסבו \n" +
                "( ניתוח פלסבו - הוא ניתוח דמי בוא מבצעים חתך בעור בלבד ) \n" +
                "\n" +
                "המשמעות היא כנראה המנוחה מהניתוח היא זו שעוזרת להוריד את הכאבים כנראה גם ללא ניתוח\n" +
                "\n" +
                "יחד עם זאת זה לא נכון להפסיק לגמרי פעילות עקב כאבים בברך , אלה יש לבצע פעילות מתאימה שאינה  מחמירה את הכאב \n" +
                "\n");
        TipKnee.add(1,"\n" +
                "הידעת : כשחזרנו מבדיקת ברך אסור להיבהל ממצאים ומילים כגון קרע, ניוון  או שחיקה \n" +
                "לא חייבת להיות אנטומיה מושלמת לקבלת תפקוד מושלם !!\n" +
                "\n");
        TipKnee.add(2,"\n" +
                "הידעת :  נמצא והוכח ריצה אינה גורמת לשחיקת יתר של הברכיים  -  זה מיתוס \n" +
                "\n" +
                "נמצא כי ישנם שינויים ניוונים ושחיקה באופן דומה לאנשים רצים ולאנשים שאינם רצים !!\n" +
                "\n");
        TipKnee.add(3,"\n" +
                "הידעת :   הברך מהווה צומת בין ירך וקרסול \n" +
                "לעיתים כאבי ברכיים מקורם וטיפולם יהיה בחיזוק שרירי הירך או הקרסול  \n" +
                "\n");

        TipKnee.add(4,"\n" +
                "הידעת :  כי כאב  בברכיים  ובכלל ברגלים  (  ירך , קרסול )  ממושך שאינו מטופל  עלול לגרום לצליעה בהליכה ו/או לפציעה בגב תחתון בעיקבות כך\n");
        TipKnee.add(5,"\n" +
                "כאשר יש כאבי ברכיים  - חשוב מאוד לבצע תרגילי חיזוק מתאימים אשר אינם מחמירים אצ עוצמת הכאבים \n" +
                "בזמן התרגול לא צריך להופיע כאב בכלל  ");


        TipLowLegs.add(0,"הידעת:  רוב הפציעות בקרסול מקורם בנקעים שגורמים למתיחה חזקה הנמצאת בצד החיצוני של כף הרגל \n");
        TipLowLegs.add(1,"\n" +
                "הידעת :  כי בהרבה מאוד מהמקרים נקעים בקרסול נגרמים כתוצאה מחולשה בשרירים באזור הברך או הירך  \n" +
                "\n" +
                "אשר לא עבדו כראוי על מנת למנוע את מתיחת היתר באיזור הקרסול \n");
        TipLowLegs.add(2,"\n" +
                "לאחר פציעה בקרסול אחד התרגולים הכי חשובים לחזור לתבנית הליכה תקינה   הפשיטה של כף הרגל האצבעות לכיוון הברך  זה גם החלק שהכי קשה לשפר  ");
        TipLowLegs.add(3,"\n" +
                "10% מהאוכלוסיה יסבלו בחייהם מכאבים בכפות הרגליים או העקב  ");
        TipLowLegs.add(4,"הידעת: אחד הדרכים להקלה על כאבי כפות רגליים  היא מתיחת התאומים ( אצבעות כף הרגל כלפי למעלה הברך ) \n ");
        TipLowLegs.add(5,"הידעת : אם תגע בשריר התאמים ונלחץ נוכל למצוא נקודות רגישות .\n" +
                "לחיצה על נקודות אלה סטטי מעל 30 שניות יכול בהחלט לסייע להקלה על כאבי כפות רגליים  ");


    }

    private void initlayout() {


        inlogo = (ImageView) findViewById(R.id.ivlogo);
        tvSub = (TextView) findViewById(R.id.tvSub);
        tvPartName = (TextView) findViewById(R.id.tvChooseName);
        tvTips = (TextView) findViewById(R.id.tvTip);
        btnPersonal = (Button) findViewById(R.id.btnPersonalDo);
        ivChoosePart = (ImageView) findViewById(R.id.ivCoosePart);

        numPart = getIntent().getIntExtra("t",5000);









        switch (numPart){


            case 1000:  tvPartName.setText("צוואר");

                     ivChoosePart.setImageResource(R.drawable.boodyneck);

                     btnPersonal.setText("תרגילים לצוואר");

                ifQuationsIt = false;
                tip(numPart);

                      break;

            case 2000:  tvPartName.setText("כתפיים");

                     ivChoosePart.setImageResource(R.drawable.boodysholder);
                     btnPersonal.setText("תרגילים לכתפיים");
                ifQuationsIt = false;
                tip(numPart);

                break;
            case 3000:  tvPartName.setText("גב עליון");

                     ivChoosePart.setImageResource(R.drawable.boodyupback);
                     btnPersonal.setText("תרגילים להורדת מתח בגב עליון");
                ifQuationsIt = false;
                tip(numPart);
                break;
            case 4000:  tvPartName.setText("מרפקים");

                     ivChoosePart.setImageResource(R.drawable.boodymarpek);
                     btnPersonal.setText("תרגילים למרפק");
                ifQuationsIt = false;
                tip(numPart);
                break;
            case 5000:  tvPartName.setText("גב תחתון");

                     ivChoosePart.setImageResource(R.drawable.boodydawnhandback);
                     btnPersonal.setText("תרגילים בהתאמה אישית ");
                ifQuationsIt = true;
                tip(numPart);
                break;
            case 6000:  tvPartName.setText("אגן / ירך");

                     ivChoosePart.setImageResource(R.drawable.boodydawnhandback);
                     btnPersonal.setText("תרגילים לאגן וירך ");
                ifQuationsIt = false;
                tip(numPart);
                break;
            case 7000:  tvPartName.setText("פרק כף היד");

                     ivChoosePart.setImageResource(R.drawable.boodydawnhandback);
                     btnPersonal.setText("תרגילים לכף היד");
                ifQuationsIt = false;
                tip(numPart);
                break;
            case 8000:  tvPartName.setText("ברכיים");

                     ivChoosePart.setImageResource(R.drawable.boodyknee);
                     btnPersonal.setText("תרגילים לברכיים");
                ifQuationsIt = false;
                tip(numPart);
                break;
            case 9000:  tvPartName.setText("קרסול כף הרגל ");

                     ivChoosePart.setImageResource(R.drawable.boodyfeet);
                     btnPersonal.setText("תרגילים לכף הרגל");
                ifQuationsIt = false;
                tip(numPart);
                break;

               default:
                   tvPartName.setText("גב תחתון");

                   ivChoosePart.setImageResource(R.drawable.boodydawnhandback);
                   btnPersonal.setText("תרגילים בהתאמה אישית ");
                   ifQuationsIt = true;
                   tip(numPart);


        }


    }

    private void tip(int x ) {



        switch (x){

            case 1000:

                i = (int) ((Math.random() * 10) % TipNeck.size());

                tvTips.setText(TipNeck.get(i));
                break;

            case 2000:
                i = (int) ((Math.random() * 10)% TipShoulder.size());
                tvTips.setText(TipShoulder.get(i));
                break;

            case 3000:
                i = (int) ((Math.random() * 10)% TipHiBack.size());
                tvTips.setText(TipHiBack.get(i));
                break;

            case 4000:
                i = (int) ((Math.random() * 10)% TipMarpek.size());
                tvTips.setText(TipMarpek.get(i));
                break;

            case 5000:
                i = (int) ((Math.random() * 10)% TipLowBack.size());
                tvTips.setText(TipLowBack.get(i));
                break;

            case 6000:
                i = (int) ((Math.random() * 10)% TipAss.size());
                tvTips.setText(TipAss.get(i));
                break;

            case 7000:
                i = (int) ((Math.random() * 10)% TipHand.size());
                tvTips.setText(TipHand.get(i));
                break;

            case 8000:
                i = (int) ((Math.random() * 10)% TipKnee.size());
                tvTips.setText(TipKnee.get(i));
                break;

            case 9000:
                i = (int) ((Math.random() * 10)% TipLowLegs.size());
                tvTips.setText(TipLowLegs.get(i));
                break;

            default:
                i = (int) ((Math.random() * 10)% TipLowBack.size());
                tvTips.setText(TipLowBack.get(i));
                break;



        }
    }
}
