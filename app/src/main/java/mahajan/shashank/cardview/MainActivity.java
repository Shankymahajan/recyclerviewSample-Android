package mahajan.shashank.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView personName,personAge;
    ImageView personPhoto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        personName = (TextView) findViewById(R.id.person_name);
        personAge = (TextView) findViewById(R.id.person_age);
        personPhoto = (ImageView) findViewById(R.id.person_photo);

        personName.setText("Shashank Mahajan");
        personAge.setText("21");
        personPhoto.setImageResource(R.mipmap.ic_launcher);

    }
}
