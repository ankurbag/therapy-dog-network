package com.tdn.therapydog.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.tdn.therapydog.activities.CanineDetailsActivity;
import com.tdn.therapydog.dummycontent.DummyContent;
import com.tdn.therapydog.R;
import com.tdn.therapydog.model.Dog;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HomeMapFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link HomeMapFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeMapFragment extends Fragment implements  OnMapReadyCallback, GoogleMap.OnMarkerClickListener{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    List<Dog> dogList = null;

    private OnFragmentInteractionListener mListener;

    private GoogleMap mMap;


    public HomeMapFragment() {
    }


    public static HomeMapFragment newInstance() {
        HomeMapFragment fragment = new HomeMapFragment();
        Bundle args = new Bundle();
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
        View view = inflater.inflate(R.layout.fragment_home_map, container, false);

        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    private void initViews(View view){

        dogList = DummyContent.getDogList();
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager()
                .findFragmentById(R.id.mapView);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;
        double minLat = Integer.MAX_VALUE;
        double maxLat = Integer.MIN_VALUE;
        double minLon = Integer.MAX_VALUE;
        double maxLon = Integer.MIN_VALUE;

        for (int i=0; i<dogList.size(); i++) {

            Dog dog = dogList.get(i);

            double lat = dog.getLocation().getLattitude();
            double lon = dog.getLocation().getLongitude();

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(lat, lon))
                    .title(dog.getName())).setTag(i);

            maxLat = Math.max(lat, maxLat);
            minLat = Math.min(lat, minLat);
            maxLon = Math.max(lon, maxLon);
            minLon = Math.min(lon, minLon);
        }

        double fitFactor = 1.5;
        /*googleMap.animateCamera(CameraUpdateFactory.
                newLatLngZoom(new LatLng((Math.abs(maxLat - minLat) ), (Math.abs(maxLon - minLon) )), 12.0f));*/



        googleMap.moveCamera( CameraUpdateFactory.newLatLngZoom(new LatLng(dogList.get(0).getLocation().getLattitude(),
                dogList.get(0).getLocation().getLongitude()) , 18.0f) );
       // googleMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(maxLat, maxLon)));
        googleMap.setOnMarkerClickListener(this);

    }

    @Override
    public boolean onMarkerClick(Marker marker) {

        int item = (Integer) marker.getTag();

        Intent intent = new Intent(getActivity(), CanineDetailsActivity.class);
        intent.putExtra(CanineDetailsActivity.INTENT_DOG_INDEX, item);
        startActivity(intent);


        return true;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
