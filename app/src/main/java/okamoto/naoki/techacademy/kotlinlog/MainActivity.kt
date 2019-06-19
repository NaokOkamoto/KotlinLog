package okamoto.naoki.techacademy.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log   // ここを追加

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("直樹",30,"自転車")
        val human2 = Human("朋樹",33,"仕事")

        human1.say()
        human1.think()

        human2.say()
        human2.think()

    }
}
