/*
 *  This file is part of flashbar.
 *
 *  flashbar is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  flashbar is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with flashbar.  If not, see <https://www.gnu.org/licenses/>.
 */
 
package com.andihasan7.flashbarsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Typeface
import com.andihasan7.flashbarsample.databinding.ActivityMainBinding
import com.andihasan7.flashbar.Flashbar

public class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    
    private val binding: ActivityMainBinding
      get() = checkNotNull(_binding) { "Activity has been destroyed" }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate and get instance of binding
        _binding = ActivityMainBinding.inflate(layoutInflater)

        // set content view to binding's root
        setContentView(binding.root)
        
        var flashbar: Flashbar? = null

        binding.btnBasicWithoutDuration.setOnClickListener {
            if (flashbar == null) {
                flashbar = basicWithoutDuration()
            }
            flashbar?.show()
        }

        binding.btnDismiss.setOnClickListener {
            flashbar?.dismiss()
        }
        
        binding.btnBasicWithDuration.setOnClickListener {
            var fl: Flashbar? = null
            if (fl == null) {
                fl = basicWithDuration()
            }
            fl?.show()
        }
        
        binding.btnGravityTop.setOnClickListener {
            var fl: Flashbar? = null
            if (fl == null) {
                fl = gravityTop()
            }
            fl?.show()
        }
        
        binding.btnFbTitle.setOnClickListener {
            var fl: Flashbar? = null
            if (fl == null) {
                fl = title()
            }
            fl?.show()
        }
        
        binding.btnFontColor.setOnClickListener {
            var fl: Flashbar? = null
            if (fl == null) {
                fl = fontColor()
            }
            fl?.show()
        }
        
        binding.btnBackgroundColor.setOnClickListener {
            var fl: Flashbar? = null
            if (fl == null) {
                fl = backgroundColor()
            }
            fl?.show()
        }
        
        binding.btnGradient.setOnClickListener {
            var fl: Flashbar? = null
            if (fl == null) {
                fl = gradient()
            }
            fl?.show()
        }
        
        
    }
    
    private fun basicWithoutDuration(): Flashbar {
        return Flashbar.Builder(this)
                .gravity(Flashbar.Gravity.BOTTOM)
                .message("This is a basic flashbar")
                .build()
    }
    
    private fun basicWithDuration(): Flashbar {
        return Flashbar.Builder(this)
                .gravity(Flashbar.Gravity.BOTTOM)
                .duration(1500)
                .message("This is flashbar with duration")
                .build()
    }
    
    private fun gravityTop(): Flashbar {
        return Flashbar.Builder(this)
                .gravity(Flashbar.Gravity.TOP)
                .duration(1500)
                .message("This is flashbar with top gravity")
                .build()
    }
    
    private fun title(): Flashbar {
        return Flashbar.Builder(this)
                .gravity(Flashbar.Gravity.TOP)
                .duration(1500)
                .title("Hello World!")
                .message("This is flashbar with title")
                .build()
    }
    
    private fun fontColor(): Flashbar {
        return Flashbar.Builder(this)
                .gravity(Flashbar.Gravity.TOP)
                .duration(1500)
                .title("Hello World!")
                .message("This is flashbar with title and custom font and color")
                .titleColorRes(R.color.green)
                .titleSizeInSp(12f)
                //.titleAppearance(R.style.CustomTextStyle)
                .titleTypeface(Typeface.createFromAsset(getAssets(), "Sofia-Regular.otf"))
                .messageTypeface(Typeface.createFromAsset(getAssets(), "libel-suit-rg.ttf"))
                .build()
    }
    
    private fun backgroundColor(): Flashbar {
        return Flashbar.Builder(this)
                .gravity(Flashbar.Gravity.TOP)
                .duration(1500)
                .message("The background color can be changed to any color of your choice.")
                .backgroundColorRes(R.color.color_primary_dark)
                .build()
    }
    
    private fun gradient(): Flashbar {
        return Flashbar.Builder(this)
                .gravity(Flashbar.Gravity.TOP)
                .duration(1500)
                .message("You can have gradients by setting background drawable.")
                .backgroundDrawable(R.drawable.bg_gradient)
                .build()
    }
    
    
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
