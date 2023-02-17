package com.example.imageviewer.auth.data.models

import androidx.annotation.DrawableRes
import com.example.imageviewer.R

data class OnBoarding(
    @DrawableRes val image: Int,
    val topic: String,
    val desc: String
){
    companion object{
        var onboarding = arrayListOf(
            OnBoarding(
                R.drawable.on_boarding_img,
                "Welcome To Herconomy",
                "Join the largest community of women in Africa being empowered " +
                        "to succeed, network, save money and enjoy discounts."
            ),
            OnBoarding(
                R.drawable.on_boarding_img,
                "Attractive Interest Rates",
                "Earn up to 10% per annum on every Naira saved with Herconomy and " +
                        "watch your money grow."
            ),
            OnBoarding(
                R.drawable.on_boarding_img,
                "Automate Your Savings",
                "Sit back, relax and save daily, weekly, monthly or at whatever " +
                        "frequency works for you."
            )
        )
    }

}
