package com.example.ch5
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.SharedViewModel

class SecondFragment : Fragment() {
    private lateinit var viewModel: SharedViewModel

    override fun onAttach(context:Context) {
        super.onAttach(context)
        viewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("SecondFragment","onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("SecondFragment","onCreateView")
        return inflater.inflate(R.layout.fragment_second, container, false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("SecondFragment","onActivityCreated")
    }
    override fun onStart() {
        super.onStart()
        Log.e("SecondFragment","onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.e("SecondFragment","onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.e("SecondFragment","onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.e("SecondFragment","onStop")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("SecondFragment","onDestroyView")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("SecondFragment","onDestroy")
    }
    override fun onDetach() {
        super.onDetach()
        Log.e("SecondFragment","onDetach")
    }
    // 其他方法不變
}
