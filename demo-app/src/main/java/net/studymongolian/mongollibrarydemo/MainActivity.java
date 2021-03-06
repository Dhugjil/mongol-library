package net.studymongolian.mongollibrarydemo;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements MainActivityRecyclerViewAdapter.ItemClickListener {

    MainActivityRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with
        ArrayList<String> apiDemos = new ArrayList<>();
        apiDemos.add("MongolLabel");
        apiDemos.add("MongolTextView");
        apiDemos.add("Unicode");
        apiDemos.add("Unicode <--> Menksoft");
        apiDemos.add("MongolFont");
        apiDemos.add("MongolEditText");
        apiDemos.add("Keyboards");
        apiDemos.add("MongolToast");
        apiDemos.add("MongolButton");
        apiDemos.add("MongolAlertDialog");
        apiDemos.add("Horizontal RecyclerView");
        apiDemos.add("MongolMenu");
        //apiDemos.add("Testing");

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvApiDemoList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MainActivityRecyclerViewAdapter(this, apiDemos);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

        // show the version number
        String versionName = net.studymongolian.mongollibrary.BuildConfig.VERSION_NAME;
        String labelText = "mongol-library " + versionName;
        TextView tvVersion = findViewById(R.id.version);
        tvVersion.setText(labelText);
    }

    @Override
    public void onItemClick(View view, int position) {

        Intent intent;
        switch (position) {
            case 0: // MongolLabel
                intent = new Intent(this, MongolLabelActivity.class);
                startActivity(intent);
                break;
            case 1: // MongolTextView
                intent = new Intent(this, MongolTextViewActivity.class);
                startActivity(intent);
                break;
            case 2: // Unicode
                intent = new Intent(this, UnicodeActivity.class);
                startActivity(intent);
                break;
            case 3: // Unicode <--> Menksoft
                intent = new Intent(this, ConvertCodeActivity.class);
                startActivity(intent);
                break;
            case 4: // MongolFont
                intent = new Intent(this, MongolFontActivity.class);
                startActivity(intent);
                break;
            case 5: // MongolEditText
                intent = new Intent(this, MongolEditTextActivity.class);
                startActivity(intent);
                break;
            case 6: // Keyboard
                intent = new Intent(this, MainKeyboardActivity.class);
                startActivity(intent);
                break;
            case 7: // MongolToast
                intent = new Intent(this, MongolToastActivity.class);
                startActivity(intent);
                break;
            case 8: // MongolButton
                intent = new Intent(this, MongolButtonActivity.class);
                startActivity(intent);
                break;
            case 9: // MongolAlertDialog
                intent = new Intent(this, MongolAlertDialogActivity.class);
                startActivity(intent);
                break;
            case 10: // Horizontal RecyclerView
                intent = new Intent(this, HorizontalRecyclerViewActivity.class);
                startActivity(intent);
                break;
            case 11: // MongolMenu
                intent = new Intent(this, MongolMenuActivity.class);
                startActivity(intent);
                break;
            case 12: // Testing
                intent = new Intent(this, TestingActivity.class);
                startActivity(intent);
                break;
        }
    }
}
