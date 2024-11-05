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
import android.widget.ImageView.ScaleType
import com.andihasan7.flashbarsample.databinding.ActivityMainBinding
import com.andihasan7.flashbar.Flashbar
import com.andihasan7.flashbar.anim.FlashAnim

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
        
        binding.btnOverlay.setOnClickListener {
            var fl: Flashbar? = null
            if (fl == null) {
                fl = overlay()
            }
            fl?.show()
        }
        
        binding.btnActionPrimary.setOnClickListener {
            var fl: Flashbar? = null
            if (fl == null) {
                fl = actionPrimary()
            }
            fl?.show()
        }
        
        binding.btnPlusminus.setOnClickListener {
            var fl: Flashbar? = null
            if (fl == null) {
                fl = plusMinus()
            }
            fl?.show()
        }
        
        binding.btnIcon.setOnClickListener {
            var fl: Flashbar? = null
            if (fl == null) {
                fl = icon()
            }
            fl?.show()
        }
        
        binding.btnProgress.setOnClickListener {
            var fl: Flashbar? = null
            if (fl == null) {
                fl = progress()
            }
            fl?.show()
        }
        
        binding.btnEnterExitVertical.setOnClickListener {
            var fl: Flashbar? = null
            if (fl == null) {
                fl = enterExitVertical()
            }
            fl?.show()
        }
        
        binding.btnEnterExitHorizontal.setOnClickListener {
            var fl: Flashbar? = null
            if (fl == null) {
                fl = enterExitHorizontal()
            }
            fl?.show()
        }
        
        binding.btnAnimIcon.setOnClickListener {
            var fl: Flashbar? = null
            if (fl == null) {
                fl = animationIcon()
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
    
    private fun overlay(): Flashbar {
        return Flashbar.Builder(this)
                .gravity(Flashbar.Gravity.TOP)
                .duration(1500)
                .message("You can show flashbar with overlay.")
                .showOverlay()
                //.overlayColorRes(R.color.modal)
                //.overlayBlockable()
                .build()
    }
    
    private fun actionPrimary(): Flashbar {
        return Flashbar.Builder(this)
                .gravity(Flashbar.Gravity.TOP)
                .title("Hello World!")
                //.backgroundColorRes(R.color.colorPrimaryDark)
                .message("You can click on the primary action button.")
                .primaryActionText("TRY NOW")
                .primaryActionTextColorRes(R.color.green)
                .primaryActionTextSizeInSp(20f)
                .primaryActionTapListener(object : Flashbar.OnActionTapListener {
                        override fun onActionTapped(bar: Flashbar) {
                            bar.dismiss()
                        }
                    })
                .build()
    }
    
    private fun plusMinus(): Flashbar {
        return Flashbar.Builder(this)
                .gravity(Flashbar.Gravity.TOP)
                .title("Hello World!")
                .message("You can show either or both of the positive/negative buttons and customize them similar to the primary button.")
                //.backgroundColorRes(R.color.colorPrimaryDark)
                .positiveActionText("YES")
                .negativeActionText("NO")
                .positiveActionTextColorRes(R.color.green)
                .negativeActionTextColorRes(R.color.green)
                .positiveActionTapListener(object : Flashbar.OnActionTapListener {
                        override fun onActionTapped(bar: Flashbar) {
                            bar.dismiss()
                        }
                    })
                .negativeActionTapListener(object : Flashbar.OnActionTapListener {
                        override fun onActionTapped(bar: Flashbar) {
                            bar.dismiss()
                        }
                    })
                .build()
    }
    
    private fun icon(): Flashbar {
        return Flashbar.Builder(this)
                .gravity(Flashbar.Gravity.TOP)
                .duration(1500)
                .title("Hello World!")
                .message("You can show a default icon on the left side of the withView")
                //.backgroundColorRes(R.color.colorPrimaryDark)
                .showIcon(0.8f, ScaleType.CENTER_CROP)
                //.showIcon() default ic_info
                //.icon(R.drawable.ic_settings) you can custom icon
                //.iconColorFilterRes(R.color.colorAccent)
                .build()
    }
    
    private fun progress(): Flashbar {
        return Flashbar.Builder(this)
                .gravity(Flashbar.Gravity.TOP)
                .duration(1500)
                .title("Hello World!")
                .message("You can show the progress bar on either the left or right side of the view")
                .showProgress(Flashbar.ProgressPosition.LEFT) // RIGHT
                .progressTintRes(R.color.green)
                .build()
    }
    
    private fun enterExitVertical(): Flashbar {
        return Flashbar.Builder(this)
                .gravity(Flashbar.Gravity.TOP)
                .duration(1500)
                .title("Hello World!")
                .message("You can change the enter/exit animation vertically")
                //.backgroundColorRes(R.color.colorPrimaryDark)
                .enterAnimation(FlashAnim.with(this)
                    .animateBar()
                    .duration(750)
                    .alpha()
                    .overshoot())
                .exitAnimation(FlashAnim.with(this)
                    .animateBar()
                    .duration(400)
                    .accelerateDecelerate())
                .build()
    }
    
    private fun enterExitHorizontal(): Flashbar {
        return Flashbar.Builder(this)
                .gravity(Flashbar.Gravity.TOP)
                .duration(1500)
                .title("Hello World!")
                .message("You can change the enter/exit animation horizontally")
                .enterAnimation(FlashAnim.with(this)
                        .animateBar()
                        .duration(400)
                        .slideFromRight() // .slideFromLeft
                        .overshoot())
                .exitAnimation(FlashAnim.with(this)
                        .animateBar()
                        .duration(250)
                        .slideFromLeft() // .slideFromRight
                        .accelerate())
                .build()
    }
    
    private fun animationIcon(): Flashbar {
        return Flashbar.Builder(this)
                .gravity(Flashbar.Gravity.TOP)
                .duration(2500)
                .title("Hello World!")
                .message("You can make an icon as animation.")
                .showIcon()
                //.icon(R.drawable.ic_drop) custom icon
                .iconColorFilterRes(R.color.red)
                .iconAnimation(FlashAnim.with(this)
                        .animateIcon()
                        .pulse()
                        .alpha()
                        .duration(750)
                        .accelerate())
                .build()
    }
    
    
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
