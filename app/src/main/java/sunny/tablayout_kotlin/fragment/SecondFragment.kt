package sunny.tablayout_kotlin.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import sunny.tablayout_kotlin.R


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [SecondFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_second, container, false)
    }
}// Required empty public constructor
