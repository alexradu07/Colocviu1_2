package ro.pub.cs.systems.eim.Colocviu1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Colocviu1_2SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_2_main);

        Intent intent = getIntent();
        if (intent != null && intent.getExtras().containsKey("All terms")) {
            String allTerms = intent.getStringExtra("All terms");
            String[] allTermsArr = allTerms.split(" \\+ ");
            Integer sum = 0;
            for (int i = 0; i < allTermsArr.length; i++) {
                sum += Integer.valueOf(allTermsArr[i]);
            }
            Intent resultIntent = new Intent();
            resultIntent.putExtra("Sum", sum);
            setResult(RESULT_OK, resultIntent);
            finish();
        }
    }
}
