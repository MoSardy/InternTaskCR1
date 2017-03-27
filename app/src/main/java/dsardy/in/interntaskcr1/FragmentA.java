package dsardy.in.interntaskcr1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.zip.Inflater;

/**
 * Created by Shubham on 3/27/2017.
 */

public class FragmentA extends Fragment {

    EditText editText1;
    Communicator comm;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        comm = (Communicator) getActivity();

        editText1 = (EditText)getActivity().findViewById(R.id.editText1);
        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {



                if(!editable.toString().isEmpty()){
                int v1 = Integer.parseInt(editable.toString());
                    comm.respond1(v1);

                }else {
                    comm.respond1(0);
                }


            }
        });
    }

    public void send1(int value1, int value2) {
        FragmentManager f = getChildFragmentManager();
        FragmentB b = (FragmentB) f.findFragmentById(R.id.fragment2);

        b.send2(value1,value2);
    }
}
