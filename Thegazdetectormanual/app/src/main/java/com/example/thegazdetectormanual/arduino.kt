package com.example.thegazdetectormanual

import android.os.Bundle
import android.util.Log
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.thegazdetectormanual.Material
import com.example.thegazdetectormanual.MaterialAdapter
import com.example.thegazdetectormanual.R

class arduino : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arduino)


        val materials = listOf(
            Material("Arduino Uno", R.drawable.arduinouno, "A microcontroller board based on the ATmega328P.", "$24.99"),
            Material("MQ2 Gas Sensor", R.drawable.mq2, "Sensitive to LPG, i-butane, propane, methane, alcohol, Hydrogen, smoke.", "$5.00"),
            Material("LCD Display", R.drawable.lcd, "16x2 LCD display with I2C interface.", "$10.00"),
            Material("Buzzer", R.drawable.buzzer, "5V active buzzer for sound alerts.", "$1.50"),
            Material("LED", R.drawable.led, "5mm red LED for visual alerts.", "$0.10"),
            Material("Fan", R.drawable.fan, "Small 5V fan for ventilation.", "$3.00"),
            Material("GSM Module", R.drawable.gsm, "SIM900A GSM module for SMS and call notifications.", "$20.00"),
            Material("Power Supply", R.drawable.power, "12-15V power supply.", "$10.00"),
            Material("BreadBoard", R.drawable.breadboard, "A breadboard (sometimes called protoboard) is essentially the foundation to construct and prototype electronics. A breadboard allows for easy and quick creation of temporary electronic circuits or to carry out experiments with circuit design.", "$10.00"),
            Material("Resistor", R.drawable.resistor, "A resistor is a passive two-terminal electrical component that implements electrical resistance as a circuit element. In electronic circuits, resistors are used to reduce current flow, adjust signal levels, to divide voltages, bias active elements, and terminate transmission lines, among other uses. ", "$1.00"),

            // Add more materials as needed
        )

        try {
            val listView: ListView = findViewById(R.id.material_list_view)
            listView.adapter = MaterialAdapter(this, materials)
        } catch (e: Exception) {
            Log.e("ArduinoActivity", "Error setting adapter: ${e.message}")
        }
    }
}
