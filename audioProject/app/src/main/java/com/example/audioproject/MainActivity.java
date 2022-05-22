    package com.example.audioproject;

    import androidx.appcompat.app.AppCompatActivity;

    import android.media.AudioManager;
    import android.media.MediaPlayer;
    import android.os.Bundle;
    import android.util.Log;
    import android.view.View;
    import android.widget.SeekBar;

    import java.util.Timer;
    import java.util.TimerTask;

    public class MainActivity extends AppCompatActivity {
        // define instance from Mediaplayer
        MediaPlayer mediaPlayer;
        // define instance from Audio Manager class
        AudioManager audioManager;

        //define the play void method
        public void play(View view){

            mediaPlayer.start();
        }
        //define the pause void method
        public void pause(View view){
            mediaPlayer.pause();
        }


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            // Audio manger need system audio services
            audioManager =(AudioManager) getSystemService(AUDIO_SERVICE);

            // get the system max volume
            int maxVolume=audioManager.getStreamMaxVolume(audioManager.STREAM_MUSIC);
            // to change the audio dynamicly
            int currentVolume = audioManager.getStreamMaxVolume(audioManager.STREAM_MUSIC);
            mediaPlayer =MediaPlayer.create(this,R.raw.audio);
            SeekBar volumeControl = (SeekBar) findViewById(R.id.volumeControl);
            // add max volume to seek bar
            volumeControl.setMax(maxVolume);
            // change the audion dynamicly
            volumeControl.setProgress(currentVolume);

            // we will put a listner on the the seekBar
            volumeControl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                    // print the value of seekbar in logcat
                    Log.i("Info",Integer.toString(i));
                    // add volume to the Music
                    audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,i,0);
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });

            // define anthor instance of seek bar
            SeekBar scrubSeekBar= (SeekBar) findViewById(R.id.scrubSeekBar);
            // get the duration of media file and pass to seek bar
            scrubSeekBar.setMax(mediaPlayer.getDuration());

            // create listner
            scrubSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                    Log.i("Info",Integer.toString(i));

                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });

            // call the timer
            new Timer().scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    // put the duration of audio file into seek bar
                    scrubSeekBar.setProgress(mediaPlayer.getCurrentPosition());
                }
            },0,1);
            // every less than one second the run method will execute


        }
    }