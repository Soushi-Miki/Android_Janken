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
            //あなたの手はグーです
            Player.setImageResource(R.drawable.goo)
            val number: Int = Random.nextInt(3)

            when (number) {
                0 ->{
                    //相手の手はグーです
                    cpu.setImageResource(R.drawable.goo)
                    result.text ="引き分けです"
                    result.setTextColor(Color.parseColor("#FF64DD17"))
                }
                1 ->{
                    //相手の手はチョキです
                    cpu.setImageResource(R.drawable.choki)
                    result.text="あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))
                }
                2 ->{
                    //相手の手はパーです
                    cpu.setImageResource(R.drawable.paa)
                    result.text="あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }

            }
        }
        chokiButton.setOnClickListener{
            //あなたの手はチョキです
            Player.setImageResource(R.drawable.choki)
            val number: Int = Random.nextInt(3)

            when (number){
                0->{
                    //相手の手はグーです
                    cpu.setImageResource(R.drawable.goo)
                    result.text="あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
                1->{
                    //相手の手はチョキです
                    cpu.setImageResource(R.drawable.choki)
                    result.text="引き分けです"
                    result.setTextColor(Color.parseColor("#FF64DD17"))
                }
                2->{
                    //相手の手はパーです
                    cpu.setImageResource(R.drawable.paa)
                    result.text="あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))
                }
            }
        }
        paaButton.setOnClickListener {
            //あなたの手はパーです
            Player.setImageResource(R.drawable.paa)
            val number: Int = Random.nextInt(3)

            when (number){
                0->{
                    //相手の手はグーです
                    cpu.setImageResource(R.drawable.goo)
                    result.text="あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))
                }
                1->{
                    //相手の手はチョキです
                    cpu.setImageResource(R.drawable.choki)
                    result.text="あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
                2->{
                    //相手の手はパーです
                    cpu.setImageResource(R.drawable.paa)
                    result.text="引き分けです"
                    result.setTextColor(Color.parseColor("#FF64DD17"))
                }
            }
        }
    }
}