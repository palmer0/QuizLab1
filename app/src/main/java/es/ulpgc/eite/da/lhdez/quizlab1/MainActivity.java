package es.ulpgc.eite.da.lhdez.quizlab1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  private Button nextButton, falseButton, trueButton;
  private TextView questionText, replyText;
  private String[] questionArray;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Conectar componentes del layout
    // con código Java de actividad para primera pantalla

    View cheatButton = findViewById(R.id.cheatButton);
    //cheatButton = findViewById(R.id.cheatButton);
    nextButton=findViewById(R.id.nextButton);
    falseButton=findViewById(R.id.falseButton);
    trueButton=findViewById(R.id.trueButton);

    trueButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        // codigo ejecutado cuando hagan clic en True button
      }
    });

    falseButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        // codigo ejecutado cuando hagan clic en False button
      }
    });

    questionText=findViewById(R.id.questionText);
    replyText=findViewById(R.id.replyText);

    // Inicializar contenido layout primera pantalla app
    questionArray = getResources().getStringArray(R.array.question_array);
    questionText.setText(questionArray[0]);
  }
}