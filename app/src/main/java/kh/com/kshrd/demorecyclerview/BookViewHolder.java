package kh.com.kshrd.demorecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookViewHolder extends RecyclerView.ViewHolder {

    ImageView mImageViewBook;
    TextView mTextViewTitle;
    ImageView mImageViewDelete;

    public BookViewHolder(@NonNull View itemView) {
        super(itemView);
        mImageViewBook = itemView.findViewById(R.id.image_book);
        mTextViewTitle = itemView.findViewById(R.id.text_title);
        mImageViewDelete = itemView.findViewById(R.id.image_view_delete);
    }

}
