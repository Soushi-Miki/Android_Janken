package app.miki.mikiso.janken3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gooButton.setOnClickListener {
            Player.text="あなたの手はグーです"
            val number: Int = Random.nextInt(3)

            when (number) {
                0 ->{
                    //相手の手はグーです
                    cpu.setImageResource(R.drawable.goo)
                    result.text ="引き分けです"
                    result.setTextColor(Color.parseColor("#FF64DD17"))
                }
                1 ->{
                    cpu.setImageResource(R.drawable.choki)
                    result.text="あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))
                }
                2 ->{
                    cpu.setImageResource(R.drawable.paa)
                    result.text="あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }

            }
        }
        chokiButton.setOnClickListener{
            Player.text="あなたの手はチョキです"
            val number: Int = Random.nextInt(3)

            when (number){
                0->{
                    cpu.setImageResource(R.drawable.goo)
                    result.text="あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
                1->{
                    cpu.setImageResource(R.drawable.choki)
                    result.text="引き分けです"
                    result.setTextColor(Color.parseColor("#FF64DD17"))
                }
                2->{
                    cpu.setImageResource(R.drawable.paa)
                    result.text="あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))
                }
            }
        }
        paaButton.setOnClickListener {
            Player.text="あなたの手はパーです"
            val number: Int = Random.nextInt(3)

            when (number){
                0->{
                    cpu.setImageResource(R.drawable.goo)
                    result.text="あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))
                }
                1->{
                    cpu.setImageResource(R.drawable.choki)
                    result.text="あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
                2->{
                    cpu.setImageResource(R.drawable.paa)
                    result.text="引き分けです"
                    result.setTextColor(Color.parseColor("#FF64DD17"))
                }
            }
        }
    }
}