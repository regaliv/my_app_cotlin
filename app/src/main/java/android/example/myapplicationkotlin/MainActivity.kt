package android.example.myapplicationkotlin

import android.example.myapplicationkotlin.constanta.Constanta
import android.example.myapplicationkotlin.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btResult.setOnClickListener {
            val resultValue  = bindingClass.edValue.text.toString()
            bindingClass.imPhoto.visibility = View.VISIBLE

            when(resultValue){

                 Constanta.DIRECTOR ->{
                    bindingClass.tvResult.visibility = View.VISIBLE
                     val alex= "Ваша  ${Constanta.DIRECTOR_SUELDO}"
                     if(bindingClass.codeText.text.toString()==Constanta.DIRECTOR_PASSWORD) {
                         bindingClass.tvResult.text = alex
                         bindingClass.imPhoto.setImageResource(R.drawable.face_co)
                     }
                     else{
                         bindingClass.tvResult.text="Неверный пароль"
                         bindingClass.imPhoto.setImageResource(R.drawable.ic_launcher_background)
                     }
                }
                 Constanta.INGINER ->{
                    bindingClass.tvResult.visibility = View.VISIBLE
                     val fred = "Ваша ${Constanta.INGINER_SUELDO}"
                    if(bindingClass.codeText.text.toString()==Constanta.INGINER_PASSWORD) {
                        bindingClass.tvResult.text= fred
                        bindingClass.imPhoto.setImageResource(R.drawable.face)
                     }
                     else{
                        bindingClass.tvResult.text= "Неверный пароль"
                        bindingClass.imPhoto.setImageResource(R.drawable.ic_launcher_background)

                     }
                }
                else -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Нет такого работника"
                    bindingClass.imPhoto.setImageResource(R.drawable.ic_launcher_background)
                }

            }

        }
    }

}