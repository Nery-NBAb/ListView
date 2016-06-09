package com.holamundo.app.miprimerproyecto;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by APIXELA2015 on 09/06/2016.
 */
public class TweetAdapter extends ArrayAdapter<Tweet> {

    private LayoutInflater inflater;
    private TextView tvTitle, tvSubtitle, tvDate;

    public TweetAdapter(Activity activity, ArrayList<Tweet> articulos) {
        super(activity, R.layout.activity_tweet_detail, articulos);
        inflater = activity.getWindow().getLayoutInflater();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        Tweet tweet = getItem(position);
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_tweet_detail, parent, false);
        }
        tvTitle = (TextView) convertView.findViewById(R.id.title);
        tvTitle.setText(tweet.title);
        tvSubtitle = (TextView) convertView.findViewById(R.id.subtitle);
        tvSubtitle.setText(tweet.subtitle);

        tvDate = (TextView) convertView.findViewById(R.id.date);
        tvDate.setText(tweet.date);


        return convertView;

    }


}
