package com.jlrm.mamamia

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.jlrm.mamamia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    private var total: Float = 0.0f
    private var check1: CheckBox= findViewById(R.id.buttonItem1)
    private var check2: CheckBox= findViewById(R.id.buttonItem2)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonPrice.setOnClickListener(this)
        onCheckboxClicked(check1,12f)
        onCheckboxClicked(check2,13f)
    }

    override fun onClick(view: View) {
        if (total == 0f) {
            Toast.makeText(
                this,
                "Você precisa escolher ao menos um produto",
                Toast.LENGTH_SHORT
            ).show()
        } else {
            //Botão Pagar
            if (view.id == R.id.buttonPrice) {
                binding.textSectionPrice2.text = "R$0,00"
                total = 0.0f

                //Entradas
                if (binding.buttonItem1.isChecked()) {
                    binding.buttonItem1.setChecked(false)
                }
                if (binding.buttonItem2.isChecked()) {
                    binding.buttonItem2.setChecked(false)
                }
                if (binding.buttonItem3.isChecked()) {
                    binding.buttonItem3.setChecked(false)
                }
                if (binding.buttonItem4.isChecked()) {
                    binding.buttonItem4.setChecked(false)
                }

                //Pratos Principais
                if (binding.buttonItem5.isChecked()) {
                    binding.buttonItem5.setChecked(false)
                }
                if (binding.buttonItem6.isChecked()) {
                    binding.buttonItem6.setChecked(false)
                }
                if (binding.buttonItem6.isChecked()) {
                    binding.buttonItem6.setChecked(false)
                }
                if (binding.buttonItem7.isChecked()) {
                    binding.buttonItem7.setChecked(false)
                }
                if (binding.buttonItem8.isChecked()) {
                    binding.buttonItem8.setChecked(false)
                }
                if (binding.buttonItem9.isChecked()) {
                    binding.buttonItem9.setChecked(false)
                }
                if (binding.buttonItem10.isChecked()) {
                    binding.buttonItem10.setChecked(false)
                }
                if (binding.buttonItem11.isChecked()) {
                    binding.buttonItem11.setChecked(false)
                }
                if (binding.buttonItem12.isChecked()) {
                    binding.buttonItem12.setChecked(false)
                }
                if (binding.buttonItem13.isChecked()) {
                    binding.buttonItem14.setChecked(false)
                }
                if (binding.buttonItem15.isChecked()) {
                    binding.buttonItem15.setChecked(false)
                }
                if (binding.buttonItem16.isChecked()) {
                    binding.buttonItem16.setChecked(false)
                }
                if (binding.buttonItem17.isChecked()) {
                    binding.buttonItem17.setChecked(false)
                }
                if (binding.buttonItem18.isChecked()) {
                    binding.buttonItem18.setChecked(false)
                }

                //Bebidas
                if (binding.buttonItem19.isChecked()) {
                    binding.buttonItem19.setChecked(false)
                }
                if (binding.buttonItem20.isChecked()) {
                    binding.buttonItem20.setChecked(false)
                }
                if (binding.buttonItem21.isChecked()) {
                    binding.buttonItem21.setChecked(false)
                }
                if (binding.buttonItem22.isChecked()) {
                    binding.buttonItem22.setChecked(false)
                }
                if (binding.buttonItem23.isChecked()) {
                    binding.buttonItem23.setChecked(false)
                }

                //Sobremesas
                if (binding.buttonItem24.isChecked()) {
                    binding.buttonItem24.setChecked(false)
                }
                if (binding.buttonItem25.isChecked()) {
                    binding.buttonItem25.setChecked(false)
                }
                if (binding.buttonItem26.isChecked()) {
                    binding.buttonItem26.setChecked(false)
                }
                if (binding.buttonItem27.isChecked()) {
                    binding.buttonItem27.setChecked(false)
                }
                if (binding.buttonItem28.isChecked()) {
                    binding.buttonItem28.setChecked(false)
                }
                if (binding.buttonItem29.isChecked()) {
                    binding.buttonItem29.setChecked(false)
                }
                if (binding.buttonItem30.isChecked()) {
                    binding.buttonItem30.setChecked(false)
                }
                if (binding.buttonItem31.isChecked()) {
                    binding.buttonItem31.setChecked(false)
                }

                Toast.makeText(
                    this,
                    "Seu pedido foi enviado para o balcão do restaurante!",
                    Toast.LENGTH_LONG
                ).show()

            }
        }
    }

    private fun onCheckboxClicked(checkbox: CheckBox, price: Float) {
            val checked: Boolean = checkbox.isChecked
            if (checked == checkbox.isChecked) {
                when (checkbox.id) {
                    R.id.buttonItem1 -> {
                        if (checked) {
                            total += price
                        } else {
                            total -= price
                        }
                    }
                }
                binding.textSectionPrice2.text = "R$${"%.2f".format(total)}"

            } else {

                total = 0.0f
                binding.textSectionPrice2.text = "R$ 0"

            }
    }

}
