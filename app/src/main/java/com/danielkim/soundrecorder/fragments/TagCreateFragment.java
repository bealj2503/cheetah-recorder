package com.danielkim.soundrecorder.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.nfc.Tag;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.danielkim.soundrecorder.DBHelper;
import com.danielkim.soundrecorder.R;
import com.danielkim.soundrecorder.adapters.TagViewerAdapter;


public class TagCreateFragment extends DialogFragment {

    private static final String LOG_TAG = "TagCreateFragment";
    FileViewerFragment fileViewerFragment;
    private TagViewerAdapter mTagViewerAdapter;
    //private Context context;
    private DBHelper mDatabase;

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private String colour;
    private String textColor;
    public TagCreateFragment() {

    }

    public static TagCreateFragment newInstance(FileViewerFragment fileViewerFragment) {
        TagCreateFragment fragment = new TagCreateFragment();
        Bundle args = new Bundle();
        fragment.setFileViewerFragment(fileViewerFragment);
        fragment.setArguments(args);
        return fragment;
    }

    /*@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //context = container.getContext();
        //mDatabase = new DBHelper(context);
        return inflater.inflate(R.layout.fragment_tag_create, container, false);
    }*/

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        LayoutInflater dialogInflater = getActivity().getLayoutInflater();
        View tagCreateView = dialogInflater.inflate(R.layout.fragment_tag_create, null);
        mDatabase = new DBHelper(getContext());
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(getActivity());
        final EditText input = (EditText) tagCreateView.findViewById(R.id.tag_entry);

        dialogBuilder.setCancelable(true);




        button1 = tagCreateView.findViewById(R.id.button);
        button2 = tagCreateView.findViewById(R.id.button2);
        button3 = tagCreateView.findViewById(R.id.button3);
        button4 = tagCreateView.findViewById(R.id.button4);
        button5 = tagCreateView.findViewById(R.id.button5);
        button6 = tagCreateView.findViewById(R.id.button6);
        button7 = tagCreateView.findViewById(R.id.button7);
        button8 = tagCreateView.findViewById(R.id.button8);
        button9 = tagCreateView.findViewById(R.id.button9);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setText("\u2713");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                colour = (String)button1.getTag();
                textColor = String.format("#%06X", 0xFFFFFF & button1.getCurrentTextColor());
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setText("");
                button2.setText("\u2713");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                colour = (String)button2.getTag();
                textColor = String.format("#%06X", 0xFFFFFF & button2.getCurrentTextColor());
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setText("");
                button2.setText("");
                button3.setText("\u2713");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                colour = (String)button3.getTag();
                textColor = String.format("#%06X", 0xFFFFFF & button3.getCurrentTextColor());
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("\u2713");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                colour = (String)button4.getTag();
                textColor = String.format("#%06X", 0xFFFFFF & button4.getCurrentTextColor());
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("\u2713");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                colour = (String)button5.getTag();
                textColor = String.format("#%06X", 0xFFFFFF & button5.getCurrentTextColor());
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("\u2713");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                colour = (String)button6.getTag();
                textColor = String.format("#%06X", 0xFFFFFF & button6.getCurrentTextColor());
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("\u2713");
                button8.setText("");
                button9.setText("");
                colour = (String)button7.getTag();
                textColor = String.format("#%06X", 0xFFFFFF & button7.getCurrentTextColor());
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("\u2713");
                button9.setText("");
                colour = (String)button8.getTag();
                textColor = String.format("#%06X", 0xFFFFFF & button8.getCurrentTextColor());
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("\u2713");
                colour = (String)button9.getTag();
                textColor = String.format("#%06X", 0xFFFFFF & button9.getCurrentTextColor());
            }
        });
        dialogBuilder.setPositiveButton(getActivity().getString(R.string.dialog_action_ok),
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        try {
                            String value = input.getText().toString().trim();
                            if(colour!=null)
                            {
                                if(mDatabase.addTag(value,colour,textColor) != -1){
                                    Toast.makeText(
                                            getContext(),
                                            "Tag Successfully added.",
                                            Toast.LENGTH_SHORT
                                    ).show();
                                }
                                else{
                                    Toast.makeText(
                                            getContext(),
                                            "Tag Already Exists.",
                                            Toast.LENGTH_SHORT
                                    ).show();
                                }
                            }
                            else{
                                if(mDatabase.addTag(value,"#FFFFFF","#000000") != -1){
                                    Toast.makeText(
                                            getContext(),
                                            "Tag Successfully added.",
                                            Toast.LENGTH_SHORT
                                    ).show();
                                }
                                else{
                                    Toast.makeText(
                                            getContext(),
                                            "Tag Already Exists.",
                                            Toast.LENGTH_SHORT
                                    ).show();
                                }

                            }


                        } catch (Exception e) {
                            Log.e(LOG_TAG, "exception", e);
                        }

                        dialog.cancel();
                    }
                });
        dialogBuilder.setNegativeButton(getActivity().getString(R.string.dialog_action_cancel),
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        dialogBuilder.setView(tagCreateView)
                .setTitle("New Tag");
        return dialogBuilder.create();
    }



    public void setFileViewerFragment(FileViewerFragment fileViewerFragment){

        this.fileViewerFragment = fileViewerFragment;
    }
}