package com.example.banjarlearn.materi

import android.content.Context
import android.media.MediaPlayer

object BacksoundManager {

    private var mediaPlayer: MediaPlayer? = null
    private var currentSound: Int = 0

    fun play(context: Context, soundResId: Int) {
        if (mediaPlayer != null && currentSound == soundResId) {
            if (mediaPlayer?.isPlaying == false) {
                mediaPlayer?.start()
            }
            return
        }

        stop()

        currentSound = soundResId
        mediaPlayer = MediaPlayer.create(context.applicationContext, soundResId)
        mediaPlayer?.isLooping = true
        mediaPlayer?.setVolume(0.45f, 0.45f)
        mediaPlayer?.start()
    }

    fun stop() {
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null
        currentSound = 0
    }
}