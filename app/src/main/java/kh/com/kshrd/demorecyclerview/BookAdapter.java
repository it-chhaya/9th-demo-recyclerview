package kh.com.kshrd.demorecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookViewHolder> {

    private ArrayList<Book> mDataSet;
    private Context mContext;
    private OnBookRecyclerViewListener mListener;

    public BookAdapter(Context context, ArrayList<Book> dataSet) {
        mContext = context;
        mDataSet = dataSet;
        mListener = (OnBookRecyclerViewListener) context;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(mContext)
                .inflate(R.layout.item_book_layout, parent, false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        holder.mImageViewBook.setImageResource(mDataSet.get(position).getImage());
        holder.mTextViewTitle.setText(mDataSet.get(position).getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onItemClicked(holder.getAdapterPosition());
            }
        });
        holder.mImageViewDelete.setOnClickListener(v -> {
            mListener.onDeleteItem(holder.getAdapterPosition());
        });
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

}
