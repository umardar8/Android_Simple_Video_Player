package com.howtosuperai.video_player

import android.net.Uri
import android.net.Uri.parse
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.howtosuperai.video_player.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val videoView = findViewById<VideoView>(R.id.videoView)
        val mediaController = MediaController(this)
        val uri: Uri = parse("android.resource://$packageName/raw/video")

        mediaController.setAnchorView(videoView)

        videoView.setVideoURI(uri)
        videoView.setMediaController(mediaController)
        videoView.requestFocus()
        videoView.start()
    }
}