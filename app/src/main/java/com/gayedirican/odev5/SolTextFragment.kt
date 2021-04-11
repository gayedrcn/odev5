package com.gayedirican.odev5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_sol_text.view.*

class SolTextFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_sol_text, container, false)
        tasarim.toolbarSolText.title = "TOPLAMA İŞLEMİ"



        tasarim.buttonToplamaGecis.setOnClickListener {
            val toplamSayiBir = tasarim.toplamSayi1.text
            val toplamSayiBirInt: Int = Integer.parseInt(toplamSayiBir.toString())
            val toplamSayiIki = tasarim.toplamSayi2.text
            val toplamSayiIkiInt: Int = Integer.parseInt(toplamSayiIki.toString())
            val toplam = (toplamSayiBirInt + toplamSayiIkiInt).toString()

            val gecis = SolTextFragmentDirections.toplamEkraniGecis(toplam)
            Navigation.findNavController(it).navigate(gecis)
        }
        return tasarim
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }



}