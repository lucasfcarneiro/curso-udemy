package com.example.tip_calculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.roundToInt

private lateinit var billValue: String
private var percentage = 0.0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBarHandler()
    }

    //add Listerner seekBar
    private fun seekBarHandler() {

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            @SuppressLint("SetTextI18n")
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {

                seekBar.let {
                    percentage = progress.toDouble()
                    textViewPorcentage.text = "${percentage.roundToInt()}%"

                }
                billValue = textInputBillValue.text.toString()
                calculateTip(percentage)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })
    }

    @SuppressLint("SetTextI18n")
    private fun calculateTip(percentage: Double) {

        if (billValue.isBlank()) {

            val emptyBill =
                Toast.makeText(applicationContext, "Digite o valor da conta", Toast.LENGTH_LONG)
            emptyBill.show()

            textViewTipValue.text = getString(R.string.valueText)
            textViewTotalValue.text = getString(R.string.valueText)
        } else {

            val tip = billValue.toDouble() * (percentage / 100)
            var total = billValue.toDouble() + tip

            textViewTipValue.text = "R$ ${tip.roundToInt()}"
            textViewTotalValue.text = "R$ ${total.roundToInt()}"
        }
    }
}







