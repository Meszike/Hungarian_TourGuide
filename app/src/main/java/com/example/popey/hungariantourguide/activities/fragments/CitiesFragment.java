package com.example.popey.hungariantourguide.activities.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.popey.hungariantourguide.R;
import com.example.popey.hungariantourguide.activities.adapters.Sight;
import com.example.popey.hungariantourguide.activities.adapters.SightAdapter;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of Sights.
 */
public class CitiesFragment extends Fragment {

    public CitiesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sight_list, container, false);
        /**
         *  The list of sights
         */
        final ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight(R.string.budapest, R.string.budapest_description, R.drawable.budapest1));
        sights.add(new Sight(R.string.gödöllő, R.string.gödöllő_description, R.drawable.godollo));
        sights.add(new Sight(R.string.vác, R.string.vác_description, R.drawable.vac));
        sights.add(new Sight(R.string.sopron, R.string.sopron_description, R.drawable.sopron));
        sights.add(new Sight(R.string.eger, R.string.eger_description, R.drawable.eger));
        sights.add(new Sight(R.string.debrecen, R.string.debrecen_description, R.drawable.debrecen));
        sights.add(new Sight(R.string.szentendre, R.string.szentendre_description, R.drawable.szentendre));
        sights.add(new Sight(R.string.visegrád, R.string.visegrád_description, R.drawable.visegrad));
        sights.add(new Sight(R.string.pécs, R.string.pécs_description, R.drawable.pecs));
        sights.add(new Sight(R.string.tokaj, R.string.tokaj_description, R.drawable.tokaj));

        /**
         *  The SightAdapter, whose data source is a list of {@link Sight}s.
         */
        SightAdapter adapter = new SightAdapter(getActivity(), sights, R.color.categories);

        /**
         * Find the {@link ListView} object in the view hierarchy.
         */
        ListView listView = rootView.findViewById(R.id.list);

        /**
         *  USe the PagerAdapter to display list items for each {@link Sight} in the list..
         */
        listView.setAdapter(adapter);
        return rootView;
    }
}


