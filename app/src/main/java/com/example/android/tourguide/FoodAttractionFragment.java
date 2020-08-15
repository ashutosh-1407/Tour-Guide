package com.example.android.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FoodAttractionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodAttractionFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FoodAttractionFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FoodAttractionFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FoodAttractionFragment newInstance(String param1, String param2) {
        FoodAttractionFragment fragment = new FoodAttractionFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.attraction_item_list, container, false);

        ArrayList<AttractionItem> attractionsList = new ArrayList<AttractionItem>();
        attractionsList.add(new AttractionItem(R.string.food_loc1_name, R.drawable.manas, R.string.food_loc1_location, R.string.food_loc1_desc, 34.0288, -118.2918));
        attractionsList.add(new AttractionItem(R.string.food_loc2_name, R.drawable.cafe, R.string.food_loc2_location, R.string.food_loc2_desc, 27.2038, 77.5011));

        ListView listViewAttractions = (ListView) rootView.findViewById(R.id.attraction_item_list_view);
        AttractionItemAdapter attractionItemAdapterAttractions = new AttractionItemAdapter(getContext(), attractionsList);
        listViewAttractions.setAdapter(attractionItemAdapterAttractions);

        return rootView;
    }
}