package com.example.botones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.example.botones.databinding.ActivitySeekbarBinding

class Seekbar : AppCompatActivity() {
    private lateinit var binding : ActivitySeekbarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySeekbarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.seekBar.setOnSeekBarChangeListener(object:
             SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seek: SeekBar?,
                progress: Int,
                fromUser: Boolean) {
                binding.tvseekBar.text = seek?.progress.toString().plus("/100")
            }
            override fun onStartTrackingTouch(seek: SeekBar) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }
        })
    }
}
