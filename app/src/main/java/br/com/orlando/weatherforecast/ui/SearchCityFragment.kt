package br.com.orlando.weatherforecast.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.orlando.weatherforecast.R
import br.com.orlando.weatherforecast.repository.AppRepository
import kotlinx.android.synthetic.main.fragment_search_city.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class SearchCityFragment : Fragment() {

    var appRepository = AppRepository()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search_city, container, false)


    }

    override fun onResume() {
        super.onResume()

        btnSearch.setOnClickListener{

            appRepository.getWheather(inputNameCity.text.toString())
        }
    }

}