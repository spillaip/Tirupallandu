package vaishnavism.eclass.nityanusanthaanam.ta.tirupallandu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lvTirupallandu = (ListView) findViewById(R.id.lv_tirupallandu);
    }

}
