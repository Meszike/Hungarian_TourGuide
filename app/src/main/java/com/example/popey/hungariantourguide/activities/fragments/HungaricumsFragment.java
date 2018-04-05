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
public class HungaricumsFragment extends Fragment {

    public HungaricumsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sight_list, container, false);

        /**
         *  The list of sights
         */

        final ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight(R.string.paprika, R.string.paprika_description, R.drawable.paprika));
        sights.add(new Sight(R.string.palinka, R.string.palinka_description, R.drawable.palinka));
        sights.add(new Sight(R.string.unicum, R.string.unicum_description, R.drawable.unicum));
        sights.add(new Sight(R.string.tokajiaszu, R.string.tokajiaszu_description, R.drawable.tokajiaszu));
        sights.add(new Sight(R.string.libamaj, R.string.libamaj_description, R.drawable.libamaj));
        sights.add(new Sight(R.string.szalami, R.string.szalami_description, R.drawable.szalami));
        sights.add(new Sight(R.string.marcipan, R.string.marcipan_description, R.drawable.marcipan));
        sights.add(new Sight(R.string.turorudi, R.string.turorudi_description, R.drawable.turorudi));
        sights.add(new Sight(R.string.porcelan, R.string.porcelan_description, R.drawable.herend));
        sights.add(new Sight(R.string.mangalica, R.string.mangalica_description, R.drawable.mangalica));
        sights.add(new Sight(R.string.puli, R.string.puli_description, R.drawable.puli));
        sights.add(new Sight(R.string.vizsla, R.string.vizsla_description, R.drawable.vizsla));
        sights.add(new Sight(R.string.gulyas, R.string.gulyas_description, R.drawable.gulyas));
        sights.add(new Sight(R.string.bikaver, R.string.bikaver_description, R.drawable.bikaver));
        sights.add(new Sight(R.string.sausages, R.string.sausages_description, R.drawable.kolbasz));
        sights.add(new Sight(R.string.cakes, R.string.cakes_description, R.drawable.somloi));
        sights.add(new Sight(R.string.csipke, R.string.csipke_description, R.drawable.csipke));
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


