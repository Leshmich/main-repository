package com.michael.my_first_app

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

const val TAG = "MainActivity"
var text: Int = 0
val massive: Array<String> = arrayOf(
    "1.Ты видел деву на скале",
    "2.В одежде белой над волнами",
    "3.Когда, бушуя в бурной мгле,",
    "4.Играло море с берегами,",
    "5.Когда луч молний озарял",
    "6.Ее всечасно блеском алым",
    "7.И ветер бился и летал",
    "8.С ее летучим покрывалом?",
    "9.Прекрасно море в бурной мгле",
    "10.И небо в блесках без лазури;",
    "11.Но верь мне: дева на скале",
    "12.Прекрасней волн, небес и бури."
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, massive[text++])

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, massive[text++])
    }


    override fun onResume() {
        super.onResume()
        Log.d(TAG, massive[text++])
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, massive[text++])
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, massive[text++])
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, massive[text++])
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, massive[text++])
    }
}
