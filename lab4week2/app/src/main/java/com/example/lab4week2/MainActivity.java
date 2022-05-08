    package com.example.lab4week2;

    import androidx.appcompat.app.AppCompatActivity;

    import android.content.Intent;
    import android.media.AudioManager;
    import android.media.MediaPlayer;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.MediaController;
    import android.widget.SeekBar;

    import java.util.Timer;
    import java.util.TimerTask;

    public class MainActivity extends AppCompatActivity {

       public void playIntroduceBtn(View view){
           mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.intro);
           mediaPlayer.start();
           String  introducelink = "https://www.youtube.com/watch?v=tOsZJqejaic&t=1s";
           seekbarMethod(view ,mediaPlayer,myintent,introducelink);


       }

       public void playFamilyBtn(View view){
           mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.message);
           mediaPlayer.start();
           String  familyLink = "https://www.youtube.com/watch?v=cWCmMTXncx4";
           seekbarMethod(view ,mediaPlayer,myintent,familyLink);
       }

       public void playPhysicalAppearanceBtn(View view){
           mediaPlayer = MediaPlayer.create(this,R.raw.apparence);
           mediaPlayer.start();
           String PhysicalApLink = "https://www.youtube.com/watch?v=aPznvwLQZSc&t=2s";
           seekbarMethod(view ,mediaPlayer,myintent,PhysicalApLink);

       }

       public void playDailyRoutineBtn(View view){
           mediaPlayer =MediaPlayer.create(this,R.raw.routine);
           mediaPlayer.start();
           String dailyLink = "https://www.youtube.com/watch?v=LYmuvC5G-fs&t=1s";
           seekbarMethod(view ,mediaPlayer,myintent,dailyLink);
       }

       public void playPersonalityBtn(View view){
           mediaPlayer =MediaPlayer.create(getApplicationContext(),R.raw.person);
           mediaPlayer.start();
           String personalLink = "https://www.youtube.com/watch?v=6DKkNLaRuok&t=1s";
           seekbarMethod(view ,mediaPlayer,myintent,personalLink);

       }

       public void playMealsBtn(View view){
           mediaPlayer = MediaPlayer.create(this,R.raw.meals);
           mediaPlayer.start();
           String mealLink = "https://www.youtube.com/watch?v=Ux6ekUcI5ps";
           seekbarMethod(view ,mediaPlayer,myintent,mealLink);
       }

       public void seekbarMethod(View view ,MediaPlayer mymediaplayer,Intent intent,String value){
           volumeController.setMax(mediaPlayer.getDuration());
           volumeController.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
               @Override
               public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
               if (i== seekBar.getMax()){
                   intent.putExtra("Value",value);
                   startActivity(intent);
                }
               }

               @Override
               public void onStartTrackingTouch(SeekBar seekBar) {

               }

               @Override
               public void onStopTrackingTouch(SeekBar seekBar) {


               }
           });

           new Timer().scheduleAtFixedRate(new TimerTask() {
               @Override
               public void run() {
                   volumeController.setProgress(mediaPlayer.getCurrentPosition());
               }
           },0,1);


       }



            MediaPlayer mediaPlayer;
            SeekBar volumeController;
            Intent myintent;




        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //define instance from SeekBar
             volumeController = (SeekBar) findViewById(R.id.volumeController);
            // define intent instance
            myintent = new Intent(MainActivity.this,SecondActivity.class);




        }
    }