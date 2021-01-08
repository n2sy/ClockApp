package nidhal.tp7.clockapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class FragmentClock extends Fragment {
    boolean digiActived = false;

    @Override
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        digiActived = args.getBoolean("Raouia");
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View v = null;
        //Toast.makeText(getContext(), ": "+digiActived, Toast.LENGTH_LONG).show();
        if(digiActived) {
            return (inflater.inflate(R.layout.frag_dig, container, false));
        }
        else {
            return (inflater.inflate(R.layout.frag_num, container, false));
        }

    }
}
