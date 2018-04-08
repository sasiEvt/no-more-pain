package evt.co.il.nomorepain;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class beforeQActivity extends AppCompatActivity {

    Button btnBtoQ,btnCon;
    CheckBox cbAccept;
    TextView tvRoles;
    Boolean accept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before_q);

        initlayout();

        initevent();
    }

    private void initevent() {


        btnCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(beforeQActivity.this,contactActivity.class);
                startActivity(intent);
            }
        });

        btnBtoQ.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


               accept =  cbAccept.isChecked();
               if (accept){

                   Intent intent = new Intent(beforeQActivity.this,QlowbackActivity.class);
                   startActivity(intent);
               }else{

                   Toast.makeText(beforeQActivity.this,"כדי להמשיך יש לאשר את תנאי השימוש",
                           Toast.LENGTH_SHORT).show();
               }

            }
        });
    }

    private void initlayout() {

        btnBtoQ = (Button) findViewById(R.id.btnBtoQ);
        cbAccept = (CheckBox) findViewById(R.id.cbBeforeAccept);
        tvRoles = (TextView) findViewById(R.id.tvBefore);
        btnCon = (Button) findViewById(R.id.btnCon);



    }
}
