    package com.example.lab4week2;

    import android.content.Intent;
    import android.net.Uri;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.EditText;
    import android.widget.MediaController;
    import android.widget.VideoView;

    import androidx.appcompat.app.ActionBar;
    import androidx.appcompat.app.AppCompatActivity;

    public class SecondActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);

            //Define Action bar
            ActionBar actionBar =getSupportActionBar();
            actionBar.setTitle("Second Activity ");

            //Define instance from video view
            VideoView videoView =(VideoView)findViewById(R.id.videoView3);


            Intent getintentValue = getIntent();
            Intent myintent;
            //Get the values from Main Activity
            String a =getintentValue.getStringExtra("Value");
            myintent = new Intent(Intent.ACTION_VIEW,Uri.parse(a));
            // set the path of videp
            videoView.setVideoPath(a);

            // define instance from Media controller
            MediaController mediaController  = new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
           //start the video
           videoView.start();
           // start the intent
           startActivity(myintent);




    }
}

