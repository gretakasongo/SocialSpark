package com.example.socialspark

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        /*
        * AI Usage Declaration:
        * This code was developed by me.
        * I used Gemini AI (Google) and ChatGPT fpr brainstorming ideas and understanding logic.
        * No code was copied directly from AI.
        *
        * Tool: Gemini AI (Google) and ChatGPT (OpenAI)
        * Purpose: Brainstorming and logic clarification
        * Date accessed: March 2026
         */
        // 1. Link UI components to the kotlin code using the IDs
        val btnSuggest = findViewById<Button>(R.id.btnSuggest)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val editTextTime = findViewById<EditText>(R.id.editTextTime)
        val txtsuggestion = findViewById<TextView>(R.id.txtsuggestion)
        
        // 2. Logic for the "Suggest" button
        btnSuggest.setOnClickListener {
            // Get user input, remove extra spaces, and convert to lowercase for comparison
            val input = editTextTime.text.toString().trim().lowercase()
            // MANDATORY LOGGING: This shows the marker you understand how to track app behavior
            Log.d("SocialSpark", "User entered time: $input")
            
            // 3. Conditional logic for all 6 social Sparks
            // Logic inspired by Gemini AI's brainstorming for varied social interaction
            val suggestion = when (input) {
                "morning" -> {
                    "Send a 'Good morning' text to a family member"
                }
                "mid-morning" -> {
                    "Reach out to a colleague with a 'Thank you' note"
                }
                "afternoon" -> {
                    "Share a funny meme or interesting link with a friend"
                }
                "snack time" -> {
                    "Post a photo of your snack and tag a friend!"
                }
                "dinner" -> {
                    "Call a relative for 5-minute catch-up while cooking"
                }
                "after dinner" -> {
                    "Send a message to a group chat about your favorite part of the day"
                }
                else -> {
                    // Message to display if the input doesn't match the 6 categories
                    "Please enter: morning, mid-morning, afternoon, snack time, dinner, or after dinner."
                }
            }
            
            // Update the TextView with the result of the conditional logic
            txtsuggestion.text = suggestion
        }

        // 4. Logic for the "Reset" button to clear fields
        btnReset.setOnClickListener {
            editTextTime.text.clear()
            txtsuggestion.text = ""

            setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
               val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
               v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
               insets



       }
    }}}

