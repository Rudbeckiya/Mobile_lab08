package g313.avchuhov.lab08;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText txtctl;

    int nid;
    String ntxt;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtctl = findViewById(R.id.txt_content);

        Intent i = getIntent();
        nid = i.getIntExtra("note-id", 0);
        ntxt = i.getStringExtra("note-txt");

        txtctl.setText(ntxt);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        //return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        int id = item.getItemId();

        if (id == R.id.item_save)
        {
            // TODO: get text from text box, modify note, show toast "note saved" and exit
        }
        else if (id == R.id.item_delete)
        {
            // TODO: alert dialog with yes/no confirmation
            // TODO: delete note, show toast "note deleted" and exit ativity
        }
        return super.onOptionsItemSelected(item);
    }

}