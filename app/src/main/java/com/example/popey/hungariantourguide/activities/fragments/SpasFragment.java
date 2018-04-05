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
public class SpasFragment extends Fragment {

    public SpasFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sight_list, container, false);

        /**
         * The SightAdapter, whose data source is a list of {@link Sight}s.
         */
        final ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight(R.string.gellert, R.string.gellert_description, R.drawable.gellert));
        sights.add(new Sight(R.string.szechenyi, R.string.szechenyi_description, R.drawable.szechenyi));
        sights.add(new Sight(R.string.rudas, R.string.rudas_description, R.drawable.rudas));
        sights.add(new Sight(R.string.lukacs, R.string.lukacs_description, R.drawable.lukacs));
        sights.add(new Sight(R.string.kiraly, R.string.kiraly_description, R.drawable.kiraly));
        sights.add(new Sight(R.string.velibej, R.string.velibej_description, R.drawable.velibej));
        sights.add(new Sight(R.string.heviz, R.string.heviz_description, R.drawable.heviz));
        sights.add(new Sight(R.string.sarvar, R.string.sarvar_description, R.drawable.sarvar));
        sights.add(new Sight(R.string.miskolctapolca, R.string.miskolctapolca_description, R.drawable.tapolca));
        sights.add(new Sight(R.string.egerszalok, R.string.egerszalok_description, R.drawable.egerszalok));
        /**
         *  Find the {@link ListView} object in the view hierarchy.
         */
        SightAdapter adapter = new SightAdapter(getActivity(), sights, R.color.categories);

        /**
         * Find the {@link ListView} object in the view hierarchy.
         */
        ListView listView =  rootView.findViewById(R.id.list);

        /**
         *  USe the PagerAdapter to display list items for each {@link Sight} in the list..
         */
        listView.setAdapter(adapter);
        return rootView;
    }
}

