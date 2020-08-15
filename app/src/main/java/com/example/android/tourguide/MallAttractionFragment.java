package com.example.android.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MallAttractionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MallAttractionFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MallAttractionFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MallAttractionFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MallAttractionFragment newInstance(String param1, String param2) {
        MallAttractionFragment fragment = new MallAttractionFragment();
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
        attractionsList.add(new AttractionItem(R.string.mall_loc1_name, R.drawable.mall, R.string.mall_loc1_location, R.string.mall_loc1_desc, 34.0722, -118.3581));

        ListView listViewAttractions = (ListView) rootView.findViewById(R.id.attraction_item_list_view);
        AttractionItemAdapter attractionItemAdapterAttractions = new AttractionItemAdapter(getContext(), attractionsList);
        listViewAttractions.setAdapter(attractionItemAdapterAttractions);

        return rootView;
    }
}