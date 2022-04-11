package com.example.lab4


import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class QuizQuestions : AppCompatActivity(), View.OnClickListener {



    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition : Int = 0




    override fun onCreate(savedInstanceState: Bundle?) {
        val tvOptionOne: TextView = findViewById(R.id.tv_option_one)
        val tvOptionTwo: TextView = findViewById(R.id.tv_option_two)
        val tvOptionThree: TextView = findViewById(R.id.tv_option_three)
        val tvOptionFour: TextView = findViewById(R.id.tv_option_four)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        mQuestionsList  = Constants.getQuestions()
        setQuestion()

        tvOptionOne.setOnClickListener(this)
        tvOptionTwo.setOnClickListener(this)
        tvOptionThree.setOnClickListener(this)
        tvOptionFour.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        val tvOptionOne1: TextView = findViewById(R.id.tv_option_one)
        val tvOptionTwo1: TextView = findViewById(R.id.tv_option_two)
        val tvOptionThree1: TextView = findViewById(R.id.tv_option_three)
        val tvOptionFour1: TextView = findViewById(R.id.tv_option_four)

        when(v?.id){
            R.id.tv_option_one ->{
                selectOptionView(tvOptionOne1,1)
            }
            R.id.tv_option_two ->{
                selectOptionView(tvOptionTwo1,2)
            }
            R.id.tv_option_three ->{
                selectOptionView(tvOptionThree1,3)
            }
            R.id.tv_option_four ->{
                selectOptionView(tvOptionFour1,4)
            }
        }
    }


    @SuppressLint("SetTextI18n")
    private fun setQuestion(){
        val tvOptionOne2: TextView = findViewById(R.id.tv_option_one)
        val tvOptionTwo2: TextView = findViewById(R.id.tv_option_two)
        val tvOptionThree2: TextView = findViewById(R.id.tv_option_three)
        val tvOptionFour2: TextView = findViewById(R.id.tv_option_four)
        val progressbar: ProgressBar = findViewById(R.id.progressbar)
        val tvProgress: TextView = findViewById(R.id.tv_progress)
        val tvQuestion: TextView = findViewById(R.id.tv_question)
        val ivImage: ImageView = findViewById(R.id.iv_image)


        val question = mQuestionsList!![mCurrentPosition-1]

        defaultOptionView()


        progressbar.progress = mCurrentPosition
        tvProgress.text = "$mCurrentPosition"+ "/" + progressbar.max
        tvQuestion.text = question.question
        ivImage.setImageResource(question.image)
        tvOptionOne2.text = question.optionOne
        tvOptionTwo2.text = question.optionTwo
        tvOptionThree2.text = question.optionThree
        tvOptionFour2.text = question.optionFour
    }

    private fun selectOptionView(tv: TextView, selectOptionNum: Int){
        defaultOptionView()
        mSelectedOptionPosition = selectOptionNum
        tv.setTextColor(Color.parseColor("#F65E6C"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.select_option_border_bg)
    }

    private fun defaultOptionView(){
        val tvOptionOne3: TextView = findViewById(R.id.tv_option_one)
        val tvOptionTwo3: TextView = findViewById(R.id.tv_option_two)
        val tvOptionThree3: TextView = findViewById(R.id.tv_option_three)
        val tvOptionFour3: TextView = findViewById(R.id.tv_option_four)
        val options = ArrayList<TextView>()

        options.add(0, tvOptionOne3)
        options.add(1, tvOptionTwo3)
        options.add(2, tvOptionThree3)
        options.add(3, tvOptionFour3)

        for (option in options) {
            option.setTextColor(Color.parseColor("#363A43"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        }
    }



}