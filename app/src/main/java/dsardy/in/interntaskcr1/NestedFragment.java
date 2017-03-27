package dsardy.in.interntaskcr1;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NestedFragment extends AppCompatActivity implements Communicator  {

    int value1, value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nested_fragment);
        value1 = 0;
        value2 = 0;

    }



    @Override
    public void respond1(int v1) {

        value1 = v1;
        updatevalue();

    }



    @Override
    public void respond2(int v2) {

        value2 = v2;
        updatevalue();


    }

    private void updatevalue() {
        FragmentManager f = getFragmentManager();
        FragmentA a = (FragmentA) f.findFragmentById(R.id.fragment3);



        a.send1(value1,value2);

    }
}
