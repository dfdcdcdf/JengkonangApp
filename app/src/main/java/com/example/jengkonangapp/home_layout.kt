package com.example.jengkonangapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.synnapps.carouselview.ImageListener
import kotlinx.android.synthetic.main.activity_home_layout.*

class home_layout : AppCompatActivity() {

    val sampleImages = intArrayOf(
        R.drawable.carousel1,
        R.drawable.carousel3,
        R.drawable.carousel4,
        R.drawable.carousel2
    )

    val imageListener = ImageListener { position: Int, imageView: ImageView? ->
        if (imageView != null) {
            imageView.setImageResource(sampleImages[position])
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_layout)

        btn_administration.setOnClickListener {
        val intent = Intent(this,administrasi1::class.java)
        startActivity(intent)
        }

        btn_information.setOnClickListener {
        val info = Intent(this,informasi_layout::class.java)
        startActivity(info)
        }

        btn_ronda.setOnClickListener {
        val btn_ronda = Intent(this,jadwalronda::class.java)
        startActivity(btn_ronda)
        }

        btn_blothong.setOnClickListener {
        val btn_blothong = Intent(this,lorong_blothong::class.java)
        startActivity(btn_blothong)
        }

        btn_laporan.setOnClickListener{
        val btn_laporan = Intent (this,laporan::class.java)
        startActivity(btn_laporan)
        }

        carouselview.pageCount= sampleImages.size
        carouselview.setImageListener(imageListener)
}
}


   /* override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_layout)

        val fragmentProfilt = ProfilFragment()
        val fragmentHome = HomeFragment()
        val fragmentAbout = AboutFragment()

        setFragment(fragmentHome)
        iv_menu1.setOnClickListener {
            setFragment(fragmentProfilt)

            changeIcon(iv_menu1, R.drawable.ic_profile_active)
            changeIcon(iv_menu2, R.drawable.ic_homen)
            changeIcon(iv_menu3, R.drawable.ic_aboutn)
        }

        iv_menu2.setOnClickListener {
            setFragment(fragmentHome)

            changeIcon(iv_menu1, R.drawable.ic_profilen)
            changeIcon(iv_menu2, R.drawable.ic_home_active)
            changeIcon(iv_menu3, R.drawable.ic_aboutn)
        }

        iv_menu3.setOnClickListener {
            setFragment(fragmentAbout)

            changeIcon(iv_menu1, R.drawable.ic_profilen)
            changeIcon(iv_menu2, R.drawable.ic_homen)
            changeIcon(iv_menu3, R.drawable.ic_about_active)
        }
    }

    protected fun setFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.layout_frame, fragment)
        fragmentTransaction.commit()
    }

    private fun changeIcon (imageView: ImageView,int:Int){
        imageView.setImageResource(int)
    }

}
*/

