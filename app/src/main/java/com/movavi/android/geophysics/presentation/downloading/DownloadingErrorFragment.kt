package com.movavi.android.geophysics.presentation.downloading


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.movavi.android.geophysics.R
import com.movavi.android.geophysics.core.SharedViewModel
import com.movavi.android.geophysics.databinding.FragmentDownloadErrorBinding

/**
 * Fragment for network error animation.
 */
class DownloadingErrorFragment : Fragment() {

    private lateinit var binding: FragmentDownloadErrorBinding

    private lateinit var sharedViewModel: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate view and obtain an instance of the binding class
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_download_error,
            container, false
        )

        sharedViewModel = ViewModelProviders.of(activity!!).get(SharedViewModel::class.java)

        binding.lavError.setOnClickListener {
            this.findNavController().navigate(R.id.action_downloadingErrorFragment_to_startFragment)
        }

        return binding.root
    }
}
