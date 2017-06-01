package example.com.androidsession8assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.GridView;
import android.widget.AdapterView;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //the GridView is captured from the layout with findViewById.
        GridView gridview = (GridView) findViewById(R.id.gridview);

        //Setting a custom adapter (ImageAdapter) as the source for all items to be displayed in the grid.
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You clicked Image " + position,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
