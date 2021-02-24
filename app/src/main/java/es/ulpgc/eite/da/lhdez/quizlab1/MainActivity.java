package es.ulpgc.eite.da.lhdez.quizlab1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  private Button nextButton, falseButton, trueButton, cheatButton;
  private TextView questionText, replyText;
  private String[] questionArray;
  private int[] replyArray;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    initLayoutData();
    linkLayoutComponents();
    initLayoutContent();

  }


  private void initLayoutData() {
    questionArray = getResources().getStringArray(R.array.question_array);
    replyArray = getResources().getIntArray(R.array.reply_array);
  }

  private void linkLayoutComponents() {
    // Conectar componentes del layout
    // con código Java de actividad para primera pantalla

    //View cheatButton = findViewById(R.id.cheatButton);
    cheatButton = findViewById(R.id.cheatButton);
    nextButton=findViewById(R.id.nextButton);
    falseButton=findViewById(R.id.falseButton);
    trueButton=findViewById(R.id.trueButton);

    questionText=findViewById(R.id.questionText);
    replyText=findViewById(R.id.replyText);



    trueButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        // codigo ejecutado cuando hagan clic en True button

        if(replyArray[0] == 1) {
          replyText.setText(R.string.correct_text);
        }
      }
    });

    falseButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        // codigo ejecutado cuando hagan clic en False button
        if(replyArray[0] == 1) {
          replyText.setText(R.string.incorrect_text);
        }
      }
    });
  }

  private void initLayoutContent() {
    // Inicializar contenido layout primera pantalla app

    questionText.setText(questionArray[0]);
  }

}