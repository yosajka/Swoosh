package ken.com.swoosh.Controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ken.com.swoosh.Model.Player
import ken.com.swoosh.R
import ken.com.swoosh.Ultilities.EXTRA_PLAYER

import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)


        searchText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
