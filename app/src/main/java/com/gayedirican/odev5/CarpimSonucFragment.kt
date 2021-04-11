package com.gayedirican.odev5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_carpim_sonuc.view.*
import kotlinx.android.synthetic.main.fragment_toplam_sonuc.view.*
import kotlinx.android.synthetic.main.fragment_toplam_sonuc.view.textToplam


class CarpimSonucFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val tasarim = inflater.inflate(R.layout.fragment_carpim_sonuc, container, false)
        tasarim.toolbarCarpim.title = "ÇARPIM SONUÇ"
        val bundle:CarpimSonucFragmentArgs by navArgs()
        val gelenAd = bundle.ad
        tasarim.textToplam.text = "Çarpım Sonucu: $gelenAd"
        Toast.makeText(requireContext(), gelenAd, Toast.LENGTH_SHORT).show()

        return tasarim
    }


}