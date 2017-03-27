package dsardy.in.interntaskcr1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by Shubham on 3/27/2017.
 */

public class FragmentB extends Fragment {

    EditText editText2;
    Communicator comm;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b,container,false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        comm = (Communicator) getActivity();

        editText2 = (EditText)getActivity().findViewById(R.id.editText2);
        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {


                if(!editable.toString().isEmpty()){
                    int v2 = Integer.parseInt(editable.toString());
                    comm.respond2(v2);

                }else{
                    comm.respond2(0);
                }

            }
        });
    }

    public void send2(int value1, int value2) {

        FragmentManager f = getChildFragmentManager();
        FragmentC c = (FragmentC) f.findFragmentById(R.id.fragment);

        c.display(value1,value2);
    }
}
