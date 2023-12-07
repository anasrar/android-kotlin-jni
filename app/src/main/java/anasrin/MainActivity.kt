package anasrin.kotlinjni

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    companion object {
        val firstCounter = Counter()
        val secondCounter = Counter()
        val nativeC = NativeC()
        val nativeCpp = NativeCpp()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstCounterValue = findViewById<TextView>(R.id.first_counter_value)

        val firstCounterDecrement = findViewById<Button>(R.id.first_counter_decrement)
        firstCounterDecrement.setOnClickListener {
            firstCounterValue.text = firstCounter.decrement().toString()
        }
        val firstCounterIncrement = findViewById<Button>(R.id.first_counter_increment)
        firstCounterIncrement.setOnClickListener {
            firstCounterValue.text = firstCounter.increment().toString()
        }

        val secondCounterValue = findViewById<TextView>(R.id.second_counter_value)

        val secondCounterDecrement = findViewById<Button>(R.id.second_counter_decrement)
        secondCounterDecrement.setOnClickListener {
            secondCounterValue.text = secondCounter.decrement().toString()
        }
        val secondCounterIncrement = findViewById<Button>(R.id.second_counter_increment)
        secondCounterIncrement.setOnClickListener {
            secondCounterValue.text = secondCounter.increment().toString()
        }

        val buttonStringC = findViewById<Button>(R.id.get_string_c)
        buttonStringC.setOnClickListener {
            Toast.makeText(this@MainActivity, nativeC.getString(), Toast.LENGTH_SHORT).show()
        }

        val buttonStringCpp = findViewById<Button>(R.id.get_string_cpp)
        buttonStringCpp.setOnClickListener {
            Toast.makeText(this@MainActivity, nativeCpp.getString(), Toast.LENGTH_SHORT).show()
        }
    }
}
