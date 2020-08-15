package com.example.android.tourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.gms.maps.OnMapReadyCallback;

import org.w3c.dom.Text;

import java.util.List;

public class AttractionItemAdapter extends ArrayAdapter<AttractionItem> {


    public AttractionItemAdapter(@NonNull Context context, @NonNull List<AttractionItem> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.attraction_item, parent, false);
        }

        final AttractionItem currentAttraction = getItem(position);

        TextView textViewPlaceName = (TextView) convertView.findViewById(R.id.place_name);
        textViewPlaceName.setText(currentAttraction.getPlaceName());

        ImageView imageViewPlaceImage = (ImageView) convertView.findViewById(R.id.place_image);
        imageViewPlaceImage.setImageResource(currentAttraction.getPlaceImageId());

        TextView textViewPlaceLocation = (TextView) convertView.findViewById(R.id.place_location);
        textViewPlaceLocation.setText(currentAttraction.getPlaceLocation());

        TextView textViewPlaceDescription = (TextView) convertView.findViewById(R.id.place_description);
        textViewPlaceDescription.setText(currentAttraction.getPlaceDescription());

        final ImageView imageViewLocation = (ImageView) convertView.findViewById(R.id.place_on_map);
        imageViewLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:" + currentAttraction.getLatitude() + "," + currentAttraction.getLongitude()));
                intent.setPackage("com.google.android.apps.maps");
                imageViewLocation.getContext().startActivity(intent);

            }
        });

        return convertView;
    }


}
