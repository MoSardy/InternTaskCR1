package dsardy.in.interntaskcr1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Shubham on 3/27/2017.
 */

public class FragmentC extends Fragment {

    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_c,container,false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        tv = (TextView)getActivity().findViewById(R.id.textViewSumResult);

    }


    public void display(int value1, int value2) {
        tv.setText(value1+"+"+value2+"="+(value1+value2));
    }
}
