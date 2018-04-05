package com.example.popey.hungariantourguide.activities.fragments;

import android.content.Context;
import android.net.Uri;
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
public class NationalParksFragment extends Fragment {


    public NationalParksFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sight_list, container, false);

        /**
         * The list of sights
         */
        final ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight(R.string.hortobagy, R.string.hortobagy_description, R.drawable.hortobagy));
        sights.add(new Sight(R.string.kiskunsag, R.string.kiskunsag_description, R.drawable.kiskuns_g));
        sights.add(new Sight(R.string.bukk, R.string.bukk_description, R.drawable.bukk));
        sights.add(new Sight(R.string.ferto, R.string.ferto_description, R.drawable.fert__hans_g));
        sights.add(new Sight(R.string.aggtelek, R.string.aggtelek_description, R.drawable.aggtelek));
        sights.add(new Sight(R.string.drava, R.string.drava_description, R.drawable.duna_drava));
        sights.add(new Sight(R.string.koros, R.string.koros_description, R.drawable.koros_maros));
        sights.add(new Sight(R.string.balaton, R.string.balaton_description, R.drawable.balaton));
        sights.add(new Sight(R.string.ipoly, R.string.ipoly_description, R.drawable.duna_ipoly));
        sights.add(new Sight(R.string.orseg, R.string.orseg_description, R.drawable.orseg_village_house));

        /**
         * The SightAdapter, whose data source is a list of {@link Sight}s.
         */
        SightAdapter adapter = new SightAdapter(getActivity(), sights, R.color.categories);

        /**
         *  Find the {@link ListView} object in the view hierarchy.
         */
        ListView listView = rootView.findViewById(R.id.list);

        /**
         *  USe the PagerAdapter to display list items for each {@link Sight} in the list..
         */
        listView.setAdapter(adapter);
        return rootView;
    }
}

