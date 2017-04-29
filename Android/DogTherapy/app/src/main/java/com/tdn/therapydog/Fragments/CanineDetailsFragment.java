package com.tdn.therapydog.fragments;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tdn.therapydog.dummycontent.DummyContent;
import com.tdn.therapydog.model.Dog;

import java.io.IOException;
import java.io.InputStream;

import com.tdn.therapydog.R;
/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CanineDetailsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CanineDetailsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CanineDetailsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;

    private OnFragmentInteractionListener mListener;

    public CanineDetailsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Index.
     * @return A new instance of fragment CanineDetailsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CanineDetailsFragment newInstance(String param1) {
        CanineDetailsFragment fragment = new CanineDetailsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_canine_details, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initViews(view);
    }

    private void initViews(View view){

        Dog dog = DummyContent.getDogList().get(Integer.parseInt(mParam1));

        TextView textView = (TextView) view.findViewById(R.id.nameValue);
        textView.setText(dog.getName());

        textView = (TextView) view.findViewById(R.id.ageValue);
        textView.setText(""+dog.getAge());

        textView = (TextView) view.findViewById(R.id.breedValue);
        textView.setText(dog.getBreed());

        textView = (TextView) view.findViewById(R.id.descriptionValue);
        textView.setText(dog.getDescription());

        ImageView imageView = (ImageView) view.findViewById(R.id.canineImage);

        if(!TextUtils.isEmpty(dog.getImage())) {
            try {
                // get input stream
                InputStream ims = getActivity().getAssets().open(dog.getImage());
                // load image as Drawable
                Drawable d = Drawable.createFromStream(ims, null);
                // set image to ImageView
                imageView.setImageDrawable(d);
            } catch (IOException ex) {
                return;
            }
        }


        view.findViewById(R.id.getDogButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
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

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
