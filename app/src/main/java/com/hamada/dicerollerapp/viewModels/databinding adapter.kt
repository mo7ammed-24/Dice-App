package com.hamada.dicerollerapp.util

import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.hamada.dicerollerapp.R
import com.hamada.dicerollerapp.model.data.Dice

@BindingAdapter(value =["setImageSrc"])
fun setImage(view:ImageView, diceNmber: Dice?){
    when(diceNmber){
        Dice.ONE -> view.setImageDrawable(ContextCompat.getDrawable(view.context,R.drawable.one))
        Dice.TWO -> view.setImageDrawable(ContextCompat.getDrawable(view.context,R.drawable.two))
        Dice.THREE ->view.setImageDrawable(ContextCompat.getDrawable(view.context,R.drawable.three))
        Dice.FOUR -> view.setImageDrawable(ContextCompat.getDrawable(view.context,R.drawable.four))
        Dice.FIVE -> view.setImageDrawable(ContextCompat.getDrawable(view.context,R.drawable.five))
        Dice.SIX -> view.setImageDrawable(ContextCompat.getDrawable(view.context,R.drawable.six))
    }
}