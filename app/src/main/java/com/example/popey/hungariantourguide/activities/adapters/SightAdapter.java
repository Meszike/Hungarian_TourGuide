package com.example.popey.hungariantourguide.activities.adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.popey.hungariantourguide.R;

import java.util.ArrayList;

public class SightAdapter extends ArrayAdapter<Sight> {

    /**
     * {@link SightAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
     * based on a data source, which is a list of {@link Sight} objects.
     */

    /**
     * Resource ID for the background color for this list of Sights
     */
    private int mColorResourceId;

    /**
     * Create a new {@link SightAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param sights          is the list of {@link Sight}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of sights.
     */
    public SightAdapter(Context context, ArrayList<Sight> sights, int colorResourceId) {
        super(context, 0, sights);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /**
         * Check if an existing view is being reused, otherwise inflate the view
         */
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.sight_list_item, parent, false);
        }
        /**
         * Get the {@link Sight} object located at this position in the list
         */
        Sight currentSight = getItem(position);
        /**
         * Find the TextView in the sight_list_item.xmlut with the ID title.
         */
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        /**
         *  Get the title from the current Sight object and set this text on
         *  the Sight TextView.
         */
        titleTextView.setText(currentSight.getTitleSight());

        /**
         *  Find the TextView in the sight_list_item.xmlut with the ID description.
         */
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);

        /**
         * Get the description from the current Sight object and set this text on
         * the Sight TextView.
         */
        descriptionTextView.setText(currentSight.getDescriptionSight());

        /**
         * Find the ImageView in the sight_list_itemlayout with the ID image.
         */
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        /**
         * Check if an image is provided for this Sight or not
         */
        if (currentSight.hasImage()) {
            /**
             *  If an image is available, display the provided image based on the resource ID
             */
            imageView.setImageResource(currentSight.getImageResourceId());

            /**
             * Make sure the view is visible
             */
            imageView.setVisibility(View.VISIBLE);
        } else {
            /**
             * Otherwise hide the ImageView (set visibility to GONE)
             */
            imageView.setVisibility(View.GONE);
        }
        /**
         * Set the theme color for the list item
         */
        View textContainer = listItemView.findViewById(R.id.text_container);

        /**
         * Find the color that the resource ID maps to
         */
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        /**
         * Set the background color of the text container View
         */
        textContainer.setBackgroundColor(color);
        /**
         * Return the whole list item layout (containing 2 TextViews) so that it can be shown in
         * the ListView.
         */
        return listItemView;
    }
}
