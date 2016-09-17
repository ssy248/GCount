package com.example.serenayuan.gogreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by serenayuan on 9/5/16.
 */
public class GCAdapter extends BaseAdapter {

    Context mContext;
    int totalpoints;
    ArrayList<Green> mGreens;
    LayoutInflater mInflater;
    public GCAdapter(Context c, ArrayList<Green> greens) {
        mContext= c;
        mGreens = greens;
        mInflater = (LayoutInflater) mContext.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);}

    public int getCount() {
        return mGreens.size();
    }

    public View getView(View convertView, ViewGroup parent) {
        View row = convertView;

        return(row);
    }


    public int addGreen(item, no) {

        for (Green green : mGreens) {
            if (green.mName.equals(item)) {
                // add to count of this item
                green.count = green.count +no;
                //add to total points
                totalpoints = totalpoints+no*green.mPrice;
            }
        }
    }
}
