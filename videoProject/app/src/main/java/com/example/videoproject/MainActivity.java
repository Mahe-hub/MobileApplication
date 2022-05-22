        package com.example.videoproject;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.widget.MediaController;
        import android.widget.VideoView;

        public class MainActivity extends AppCompatActivity {

            MediaController mediaController;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                // define instance from video view
                VideoView  myVideoView = (VideoView) findViewById(R.id.myvideoView);
                //set the video path
                myVideoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.lemon);
               //define the instance from Media Controller
                mediaController = new MediaController(this);
                // link between anchorView and video instance
                mediaController.setAnchorView(myVideoView);
                myVideoView.setMediaController(mediaController);

                // start the video
                myVideoView.start();
            }
        }