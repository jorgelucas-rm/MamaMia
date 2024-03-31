package com.jlrm.mamamia

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jlrm.mamamia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    var total: Float = 0.0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPrice.setOnClickListener(this)

    }

    override fun onClick(view: View) {

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

    fun onCheckboxClicked(view: View) {

        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            if (checked == view.isChecked) {
                when (view.id) {
                    R.id.buttonItem1 -> {
                        if (checked) {
                            total += 12f
                        } else {
                            total -= 12f
                        }
                    }

                    R.id.buttonItem2 -> {
                        if (checked) {
                            total += 15f
                        } else {
                            total -= 15f
                        }
                    }

                    R.id.buttonItem3 -> {
                        if (checked) {
                            total += 20f
                        } else {
                            total -= 20f
                        }
                    }

                    R.id.buttonItem4 -> {
                        if (checked) {
                            total += 22f
                        } else {
                            total -= 22f
                        }
                    }

                    R.id.buttonItem5 -> {
                        if (checked) {
                            total += 32.9f
                        } else {
                            total -= 32.9f
                        }
                    }

                    R.id.buttonItem6 -> {
                        if (checked) {
                            total += 32.9f
                        } else {
                            total -= 32.9f
                        }
                    }

                    R.id.buttonItem7 -> {
                        if (checked) {
                            total += 32.9f
                        } else {
                            total -= 32.9f
                        }
                    }

                    R.id.buttonItem8 -> {
                        if (checked) {
                            total += 32.9f
                        } else {
                            total -= 32.9f
                        }
                    }

                    R.id.buttonItem9 -> {
                        if (checked) {
                            total += 28.9f
                        } else {
                            total -= 28.9f
                        }
                    }

                    R.id.buttonItem10 -> {
                        if (checked) {
                            total += 28.9f
                        } else {
                            total -= 28.9f
                        }
                    }

                    R.id.buttonItem11 -> {
                        if (checked) {
                            total += 30.9f
                        } else {
                            total -= 30.9f
                        }

                    }

                    R.id.buttonItem12 -> {
                        if (checked) {
                            total += 30.9f
                        } else {
                            total -= 30.9f
                        }

                    }

                    R.id.buttonItem13 -> {
                        if (checked) {
                            total += 24f
                        } else {
                            total -= 24f
                        }

                    }

                    R.id.buttonItem14 -> {
                        if (checked) {
                            total += 24f
                        } else {
                            total -= 24f
                        }

                    }

                    R.id.buttonItem15 -> {
                        if (checked) {
                            total += 24f
                        } else {
                            total -= 24f
                        }

                    }

                    R.id.buttonItem16 -> {
                        if (checked) {
                            total += 28
                        } else {
                            total -= 28f
                        }

                    }

                    R.id.buttonItem17 -> {
                        if (checked) {
                            total += 27f
                        } else {
                            total -= 27f
                        }

                    }

                    R.id.buttonItem18 -> {
                        if (checked) {
                            total += 29f
                        } else {
                            total -= 29f
                        }

                    }

                    R.id.buttonItem19 -> {
                        if (checked) {
                            total += 7.9f
                        } else {
                            total -= 7.9f
                        }

                    }

                    R.id.buttonItem20 -> {
                        if (checked) {
                            total += 10.9f
                        } else {
                            total -= 10.9f
                        }

                    }

                    R.id.buttonItem21 -> {
                        if (checked) {
                            total += 6f
                        } else {
                            total -= 6f
                        }

                    }

                    R.id.buttonItem22 -> {
                        if (checked) {
                            total += 10f
                        } else {
                            total -= 10f
                        }

                    }

                    R.id.buttonItem23 -> {
                        if (checked) {
                            total += 12.9f
                        } else {
                            total -= 12.9f
                        }

                    }

                    R.id.buttonItem24 -> {
                        if (checked) {
                            total += 10f
                        } else {
                            total -= 10f
                        }

                    }

                    R.id.buttonItem25 -> {
                        if (checked) {
                            total += 12f
                        } else {
                            total -= 12f
                        }

                    }

                    R.id.buttonItem26 -> {
                        if (checked) {
                            total += 8f
                        } else {
                            total -= 8f
                        }

                    }

                    R.id.buttonItem27 -> {
                        if (checked) {
                            total += 8f
                        } else {
                            total -= 8f
                        }

                    }

                    R.id.buttonItem28 -> {
                        if (checked) {
                            total += 8f
                        } else {
                            total -= 8f
                        }

                    }

                    R.id.buttonItem29 -> {
                        if (checked) {
                            total += 8f
                        } else {
                            total -= 8f
                        }

                    }

                    R.id.buttonItem30 -> {
                        if (checked) {
                            total += 12f
                        } else {
                            total -= 12f
                        }

                    }

                    R.id.buttonItem31 -> {
                        if (checked) {
                            total += 10f
                        } else {
                            total -= 10f
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

}
