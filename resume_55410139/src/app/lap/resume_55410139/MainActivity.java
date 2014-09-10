package app.lap.resume_55410139;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity  implements OnClickListener{
	private Button btn1,btn2;
    private TextView txt01,txt02,txt03,txt04,txt05,txt06,txt07,txt08;
    private String show1,show2,show3,show4,show5,show6,show7,show8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewMatching();
    }
    private void ViewMatching() {
    	btn1 = (Button) findViewById(R.id.btnedt);
    	btn2 = (Button) findViewById(R.id.btnimg);
    	btn1.setOnClickListener(this);
    	btn2.setOnClickListener(this);
    	txt01 = (TextView) findViewById(R.id.txtv1);
    	txt02 = (TextView) findViewById(R.id.txtv2);
    	txt03 = (TextView) findViewById(R.id.txtv3);
    	txt04 = (TextView) findViewById(R.id.txtv4);
    	txt05 = (TextView) findViewById(R.id.txtv5);
    	txt06 = (TextView) findViewById(R.id.txtv6);
    	txt07 = (TextView) findViewById(R.id.txtv7);
    	txt08 = (TextView) findViewById(R.id.txtv8);
    	txt01.setText("20");
    	txt02.setText("173 cm");
    	txt03.setText("70 kg");
    	txt04.setText("Male");
    	txt05.setText("Buddhism");
    	txt06.setText("Play Football");
    	txt07.setText("45/106");
    	txt08.setText("No");;
    	show1 = getIntent().getStringExtra("txt01");
    	show2 = getIntent().getStringExtra("txt02");
    	show3 = getIntent().getStringExtra("txt03");
    	show4 = getIntent().getStringExtra("txt04");
    	show5 = getIntent().getStringExtra("txt05");
    	show6 = getIntent().getStringExtra("txt06");
    	show7 = getIntent().getStringExtra("txt07");
    	show8 = getIntent().getStringExtra("txt08");
    	txt01.setText(show1);
    	txt02.setText(show2);
    	txt03.setText(show3);
    	txt04.setText(show4);
    	txt05.setText(show5);
    	txt06.setText(show6);
    	txt07.setText(show7);
    	txt08.setText(show8);
    	}

    public void onClick(View v) {
    switch (v.getId()) {
    case R.id.btnedt:
    Intent i = new Intent(getApplicationContext(), edit_sorakit.class);
    startActivity(i);
    break;
    case R.id.btnimg:
    Intent j = new Intent(getApplicationContext(), ImageActivity.class);
    startActivity(j);
    break;
    default:
    break;
    }
    }
}
