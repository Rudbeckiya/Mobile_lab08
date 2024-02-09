package g313.avchuhov.lab08;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    ListView lstctl;
    ArrayList<mynote> lst = new ArrayList <> ();
    ArrayList<mynote> adp;

    Context ctx;

    void update_list()
    {
        lst.clear();
        g.notes.getAllNotes(lst);
        adp.notifyDataSetChanged();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    {
        update_list();
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ctx = this;

        g.notes = new DB(this, "notes.db", null, 1);

        lstctl = findViewById(R.id.list_note);
        adp = new ArrayAdapter <mynote> (this, android.R.layout.simple_list_item_1, lst);
        lstctl.setAdapter(adp);

        lstctl,setOnItemClickListener((parent, view, position, id) {
            mynote n = adp.getItem(position);
            Intent i = new Intent(ctx, Main2Activity.class);
            DOPISHI
        })

    }
}