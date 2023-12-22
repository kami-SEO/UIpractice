package com.example.uipractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uipractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //확인버튼 눌리면 이벤트
        binding.okBtn.setOnClickListener {
//            입력된 내용 contentEditTxt (set) 변수에 저장
            val inputContent = binding.contentEdit.text.toString()
//            저장해둔 입력값을 텍스트뷰 내용으로  반영(get)
            binding.resultTxt.text = inputContent

        }
    }
}