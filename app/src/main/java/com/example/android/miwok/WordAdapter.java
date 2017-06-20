package com.example.android.miwok;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Lenovo on 6/13/2017.
 */

public class WordAdapter extends ArrayAdapter<Word>
{
    private int mColorResourceId;

    //Overloaded constructor
    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId)
    {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View listWordView = convertView;
        if (listWordView == null) {
            listWordView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Create a new Word object
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the Word translation
        TextView miwokTextView = (TextView) listWordView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the Word translation
        TextView defaultTextView = (TextView) listWordView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // Find the ImageView in the list_item.xml layout that matches a word
        ImageView imageView = (ImageView) listWordView.findViewById(R.id.image);

        if (currentWord.hasImage()) {

            imageView.setImageResource(currentWord.getImage());
            //Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            //Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        //Set the theme color for the list item;
        View textContainer = listWordView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listWordView;
    }
}
