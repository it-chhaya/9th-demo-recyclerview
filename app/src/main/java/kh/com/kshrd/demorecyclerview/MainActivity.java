package kh.com.kshrd.demorecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnBookRecyclerViewListener {

    private RecyclerView mBookRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private BookAdapter mBookAdpater;
    private ArrayList<Book> mDateSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // init recycler view
        mBookRecyclerView = findViewById(R.id.recycler_view_book);

        // init layout manager
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        // set layout manager
        mBookRecyclerView.setLayoutManager(mLayoutManager);

        // create our dataset
        mDateSet = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            mDateSet.add(new Book(i + 1, R.drawable.cover, "Book-" + (i + 1)));
        }

        // init adapter
        mBookAdpater = new BookAdapter(this, mDateSet);

        // set adapter
        mBookRecyclerView.setAdapter(mBookAdpater);

    }

    @Override
    public void onItemClicked(int position) {
        // TODO
        Log.i("TAG", "onItemClicked: " + mDateSet.get(position));
    }

    @Override
    public void onDeleteItem(int position) {
        mDateSet.remove(position);
        mBookAdpater.notifyItemRemoved(position);
    }
}