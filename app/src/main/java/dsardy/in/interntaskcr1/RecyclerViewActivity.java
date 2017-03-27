package dsardy.in.interntaskcr1;

import android.content.DialogInterface;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    DataAdapter adapter;
    public static List<ItemClass> itemList;
    FloatingActionButton floatingActionButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        floatingActionButton =(FloatingActionButton)findViewById(R.id.floatingActionButton);

        itemList = new ArrayList<>();

        recyclerView = (RecyclerView)findViewById(R.id.rview);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        adapter = new DataAdapter();
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ItemClass i = new ItemClass();

                adapter.additem(itemList.size(),i);
                adapter.notifyItemInserted(itemList.size());
                recyclerView.scrollToPosition(0);



            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

    }



}
