package dsardy.in.interntaskcr1;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

import static dsardy.in.interntaskcr1.RecyclerViewActivity.itemList;

/**
 * Created by Shubham on 3/27/2017.
 */

public class DataAdapter extends   RecyclerView.Adapter<DataAdapter.ViewHolder> {


    public DataAdapter() {

    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singleitem,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final DataAdapter.ViewHolder holder, int position) {

        // ItemClass itemClass = itemList.get(position);
        //holder.name2.setText(itemClass.getName2());
        //holder.value2.setText("₹ 0000.00");
        //holder.value1.setText("₹ 0000.00");

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public void additem(int i, ItemClass i1) {
        itemList.add(i1);
        notifyItemInserted(i);
        Log.e(">>>>>>."," addeed");
    }


    // view holder class

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView name1, name2, value1, value2;
        Switch s;
        LinearLayout l;



        public ViewHolder(View view) {
            super(view);

            //declare
            name2 = (TextView)view.findViewById(R.id.textViewname2);
            name1 = (TextView)view.findViewById(R.id.textViewname1);
            value1 = (TextView)view.findViewById(R.id.textViewv1);
            value2 = (TextView)view.findViewById(R.id.textView2);
            s = (Switch)view.findViewById(R.id.switch4);
            l= (LinearLayout)view.findViewById(R.id.ll);

            s.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    l.setBackgroundResource(R.drawable.itembg1);

                    if(s.isChecked()){
                        l.setBackgroundResource(R.drawable.itembg2);
                    }



                }
            });

        }


    }









}
