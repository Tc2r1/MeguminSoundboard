package com.tc2r.meguminsoundboard;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.tc2r.extras.AppRater;

public class MainActivity extends AppCompatActivity {
	private Button sbButton1;
	private Button sbButton2;
	private Button sbButton3;
	private Button sbButton4;
	private Button sbButton5;
	private Button sbButton6;
	private Button sbButton7;
	private Button sbButton8;
	private Button sbButton9;
	private Button sbButton10;
	private Button sbButton11;
	private Button sbButton12;
	private MediaPlayer mp = new MediaPlayer();

	private View.OnClickListener respondToClick = new View.OnClickListener() {
		@Override
		public void onClick(View v) {

			Context context = getApplicationContext();
			CharSequence text;

			switch (v.getId()) {
				case R.id.sb_btn1:
					mp = MediaPlayer.create(context, R.raw.explosion);
					mp.setVolume(100,100);
					mp.start();

					break;
				case R.id.sb_btn2:
					mp = MediaPlayer.create(context, R.raw.name);
					mp.start();

					break;
				case R.id.sb_btn3:
					mp = MediaPlayer.create(context, R.raw.eugh1);
					mp.start();
					break;
				case R.id.sb_btn4:
					mp = MediaPlayer.create(context, R.raw.plosion);
					mp.start();
					break;
				case R.id.sb_btn5:
					mp = MediaPlayer.create(context, R.raw.pull);
					mp.start();
					break;

				case R.id.sb_btn6:
					mp = MediaPlayer.create(context, R.raw.eugh2);
					mp.start();
					break;
				case R.id.sb_btn7:
					mp = MediaPlayer.create(context, R.raw.sion);
					mp.start();
					break;
				case R.id.sb_btn8:
					mp = MediaPlayer.create(context, R.raw.itai);
					mp.start();
					break;
				case R.id.sb_btn9:
					mp = MediaPlayer.create(context, R.raw.eugh3);
					mp.start();
					break;
				case R.id.sb_btn10:
					mp = MediaPlayer.create(context, R.raw.n);
					mp.start();
					break;
				case R.id.sb_btn11:
					mp = MediaPlayer.create(context, R.raw.yamero);
					mp.start();
					break;
				case R.id.sb_btn12:
					mp = MediaPlayer.create(context, R.raw.eugh4);
					mp.start();
					break;
			}
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		AppRater.app_launched(this);
		sbButton1 = (Button)findViewById(R.id.sb_btn1);
		sbButton2 = (Button)findViewById(R.id.sb_btn2);
		sbButton3 = (Button)findViewById(R.id.sb_btn3);
		sbButton4 = (Button)findViewById(R.id.sb_btn4);
		sbButton5 = (Button)findViewById(R.id.sb_btn5);
		sbButton6 = (Button)findViewById(R.id.sb_btn6);
		sbButton7 = (Button)findViewById(R.id.sb_btn7);
		sbButton8 = (Button)findViewById(R.id.sb_btn8);
		sbButton9 = (Button)findViewById(R.id.sb_btn9);
		sbButton10 = (Button)findViewById(R.id.sb_btn10);
		sbButton11= (Button)findViewById(R.id.sb_btn11);
		sbButton12 = (Button)findViewById(R.id.sb_btn12);

		sbButton1.setOnClickListener(respondToClick);
		sbButton2.setOnClickListener(respondToClick);
		sbButton3.setOnClickListener(respondToClick);
		sbButton4.setOnClickListener(respondToClick);
		sbButton5.setOnClickListener(respondToClick);
		sbButton6.setOnClickListener(respondToClick);
		sbButton7.setOnClickListener(respondToClick);
		sbButton8.setOnClickListener(respondToClick);
		sbButton9.setOnClickListener(respondToClick);
		sbButton10.setOnClickListener(respondToClick);
		sbButton11.setOnClickListener(respondToClick);
		sbButton12.setOnClickListener(respondToClick);
	}

}
