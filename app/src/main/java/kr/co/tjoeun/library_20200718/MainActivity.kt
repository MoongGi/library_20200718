package kr.co.tjoeun.library_20200718

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        //TODO("Not yet implemented")
        goToPhotoViewBtn.setOnClickListener {
            val myIntent = Intent(mContext, ProfilePhotoActivity::class.java)
            startActivity(myIntent)
        }
    }

    override fun setValues() {
        //TODO("Not yet implemented")
        val imageUrl = "https://img4.yna.co.kr/photo/cms/2019/05/02/02/PCM20190502000402370_P2.jpg"

        Glide.with(mContext).load(imageUrl).into(profileImg)
    }
}
