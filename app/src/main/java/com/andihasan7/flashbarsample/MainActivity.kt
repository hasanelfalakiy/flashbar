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
    
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
