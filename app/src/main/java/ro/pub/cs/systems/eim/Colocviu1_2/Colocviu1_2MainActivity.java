package ro.pub.cs.systems.eim.Colocviu1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Colocviu1_2MainActivity extends AppCompatActivity {

    private EditText nextTerm;
    private TextView allTerms;
    private Button addButton, computeButton;
    private ButtonClickListener buttonClickListener = new ButtonClickListener();

    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch(view.getId()) {
                case R.id.add_button:
                    if (nextTerm.getText().toString() != "" && TextUtils.isDigitsOnly(nextTerm.getText().toString())) {
                        if (allTerms.getText().toString() == "") {
                            allTerms.setText(nextTerm.getText().toString());
                        } else{
                            allTerms.setText(allTerms.getText().toString() + " + " + nextTerm.getText().toString());
                        }
                    }
                    nextTerm.setText("");
                    break;
                case R.id.compute_button:
                    break;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_2_main);

        nextTerm = (EditText)findViewById(R.id.next_term);
        allTerms = (TextView)findViewById(R.id.all_terms);
        addButton = (Button)findViewById(R.id.add_button);
        computeButton = (Button)findViewById(R.id.compute_button);

        addButton.setOnClickListener(buttonClickListener);
        computeButton.setOnClickListener(buttonClickListener);
    }
}
