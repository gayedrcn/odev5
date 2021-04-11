package com.gayedirican.odev5

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavArgs
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_sol_text.*
import kotlinx.android.synthetic.main.fragment_sol_text.view.*
import kotlinx.android.synthetic.main.fragment_toplam_sonuc.view.*


class ToplamSonucFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val tasarim = inflater.inflate(R.layout.fragment_toplam_sonuc, container, false)
        tasarim.toolbarToplam.title ="TOPLAM"
        val bundle:ToplamSonucFragmentArgs by navArgs()
        val gelenAd = bundle.ad
        tasarim.textToplam.text = "Toplam Sonucu: $gelenAd"
        Toast.makeText(requireContext(), gelenAd,Toast.LENGTH_SHORT).show()

        return tasarim
    }

}