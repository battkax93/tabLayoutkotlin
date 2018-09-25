package sunny.tablayout_kotlin.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import retrofit2.Retrofit
import sunny.tablayout_kotlin.R
import sunny.tablayout_kotlin.data.remote.ApiUtils
import sunny.tablayout_kotlin.data.remote.RetrofitClient
import sunny.tablayout_kotlin.data.remote.SOServices


class FirstFragment : Fragment() {

    val mSOs: SOServices? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val halo = inflater!!.inflate(R.layout.fragment_first, container, false)
        RetrofitClient.
//        mSOs = ApiUtils

                return halo
    }


}// Required empty public constructor
