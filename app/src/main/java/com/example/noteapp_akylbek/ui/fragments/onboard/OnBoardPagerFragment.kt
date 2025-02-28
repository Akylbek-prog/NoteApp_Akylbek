package com.example.noteapp_akylbek.ui.fragments.onboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.airbnb.lottie.LottieAnimationView
import com.example.noteapp_akylbek.R
import com.example.noteapp_akylbek.databinding.FragmentOnBoardPagerBinding

class OnBoardPagerFragment : Fragment() {

    companion object{
        const val ARG_ONBOARD_POSITION = "onBoardPosition"
    }

    private lateinit var binding: FragmentOnBoardPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoardPagerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() = with(binding) {
        when(requireArguments().getInt(ARG_ONBOARD_POSITION)){
            0 ->{
                txtTitle.text = "Удобство"
                txtBody.text = "Создавайте заметки в два клика! Записывайте мысли, идеи и важные задачи мгновенно."
                lottieAnimation.setAnimation(R.raw.animation1)
            }
            1 ->{
                txtTitle.text = "Организация"
                txtBody.text = "Организуйте заметки по папкам и тегам. Легко находите нужную информацию в любое время."
                lottieAnimation.setAnimation(R.raw.animation2)
            }
            2 ->{
                txtTitle.text = "Синхронизация"
                txtBody.text = "Синхронизация на всех устройствах. Доступ к записям в любое время и в любом месте."
                lottieAnimation.setAnimation(R.raw.animation3)
            }
        }
        lottieAnimation.playAnimation()
    }
}