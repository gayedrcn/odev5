package com.gayedirican.odev5

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_sag_text.view.*
import kotlinx.android.synthetic.main.fragment_sag_text.view.toplamSayi1
import kotlinx.android.synthetic.main.fragment_sag_text.view.toplamSayi2
import kotlinx.android.synthetic.main.fragment_sol_text.view.*

class SagTextFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val tasarim = inflater.inflate(R.layout.fragment_sag_text, container, false)
        tasarim.toolbarSagText.title = "ÇARPMA İŞLEMİ"
        tasarim.buttonCarpimaGecis.setOnClickListener {
            val toplamSayiBir = tasarim.toplamSayi1.text
            val toplamSayiBirInt: Int = Integer.parseInt(toplamSayiBir.toString())
            val toplamSayiIki = tasarim.toplamSayi2.text
            val toplamSayiIkiInt: Int = Integer.parseInt(toplamSayiIki.toString())
            val toplam = (toplamSayiBirInt * toplamSayiIkiInt).toString()
            val gecis = SagTextFragmentDirections.carpimEkraniGecis(toplam)

            Navigation.findNavController(it).navigate(gecis)

        }

        return tasarim
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }



}