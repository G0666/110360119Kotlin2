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
class FirstFragment : Fragment() {

    private lateinit var viewModel: SharedViewModel

    override fun onAttach(context:Context) {
        super.onAttach(context)
        viewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 获取需要的数据
    }

    // 其他生命周期方法
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("FirstFragment","onActivityCreated")
    }
    override fun onStart() {
        super.onStart()
        Log.e("FirstFragment","onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.e("FirstFragment","onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.e("FirstFragment","onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.e("FirstFragment","onStop")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("FirstFragment","onDestroyView")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("FirstFragment","onDestroy")
    }
    override fun onDetach() {
        super.onDetach()
        Log.e("FirstFragment","onDetach")
    }
}