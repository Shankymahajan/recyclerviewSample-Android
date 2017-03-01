package mahajan.shashank.cardview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.List;

/**
 * Created by shashank on 10/2/17.
 */

public class RecyclerViewActivity extends Activity  {


    private List<Person> persons ;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
