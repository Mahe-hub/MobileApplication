    package com.example.midtermq2;

    import androidx.appcompat.app.AppCompatActivity;
    import androidx.fragment.app.Fragment;
    import androidx.fragment.app.FragmentManager;
    import androidx.fragment.app.FragmentTransaction;

    import android.media.MediaPlayer;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.SeekBar;
    import java.util.Timer;
    import java.util.TimerTask;


    public class MainActivity extends AppCompatActivity {
        //Define the variables
        Button audio1Btn, audio2Btn, audio3Btn;
        MediaPlayer mediaPlayer;
        firstFragment fragment1;
        SecondFragment fragment2;
        ThridFragment fragment3;
        SeekBar seekBar;
        MediaPlayer fragment3Audio;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            //define instances
            audio1Btn = (Button) findViewById(R.id.audio1);
            audio2Btn = (Button) findViewById(R.id.audio2);
            audio3Btn = (Button) findViewById(R.id.audio3);
            mediaPlayer = (MediaPlayer) MediaPlayer.create(this, R.raw.ding);
            mediaPlayer.start();
            fragment1 = new firstFragment();
            fragment2 = new SecondFragment();
            fragment3 = new ThridFragment();
            seekBar = (SeekBar) findViewById(R.id.seekbar);


        }

        private void replaceFrgments(Fragment fragment) {

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frameLayout, fragment);
            fragmentTransaction.commit();
        }

        // add methods
        public void changeFragment1(View view) {
            //define fragments

            replaceFrgments(fragment1);
            MediaPlayer fragment1Audio = MediaPlayer.create(this, R.raw.audioone);
            fragment1Audio.start();
            // call the timer
            new Timer().scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    // put the duration of audio file into seek bar
                    seekBar.setProgress(mediaPlayer.getCurrentPosition());
                }

            }, 0, 1);
        }

        public void changeFragment2(View view) {
            //define fragments
            replaceFrgments(fragment2);
            MediaPlayer fragment2Audio = MediaPlayer.create(this, R.raw.audiotwo);
            fragment2Audio.start();
            // call the timer
            new Timer().scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    // put the duration of audio file into seek bar
                    seekBar.setProgress(mediaPlayer.getCurrentPosition());
                }

            }, 0, 1);
        }


        public void changeFragment3(View view) {
            //define fragments
            replaceFrgments(fragment3);
            fragment3Audio = MediaPlayer.create(this, R.raw.audiothree);
            fragment3Audio.start();
            // call the timer
            new Timer().scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    // put the duration of audio file into seek bar
                    seekBar.setProgress(mediaPlayer.getCurrentPosition());
                }

            }, 0, 1);
        }

    }