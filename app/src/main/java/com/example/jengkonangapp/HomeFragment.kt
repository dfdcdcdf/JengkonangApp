package com.example.jengkonangapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.synnapps.carouselview.ImageListener
import kotlinx.android.synthetic.main.activity_administrasi1.view.*
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
        
    }
//btn_administration.setOnClickListener {
//            val intent = Intent(this,administrasi1::class.java)
//            startActivity(intent)
//        }

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
    /*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)

         btn_administration.setOnClickListener {
            val administration = Intent(this,administrasi1::class.java)
            startActivity(administration)
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

        carouselview.pageCount= sampleImages.size
        carouselview.setImageListener(imageListener)
    }
}
*/
}
