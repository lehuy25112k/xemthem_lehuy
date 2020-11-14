package org.o7planning.listview_xemthem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView_vc, lview, listView_gopy, listView_chinhsach;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean_vc, arr_bean, arr_been_gopy, array_bean_chinhsach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        listView_vc = (ListView)findViewById(R.id.list);
        lview = (ListView) findViewById(R.id.list1);
        listView_gopy = (ListView) findViewById(R.id.list2);
        listView_chinhsach = (ListView) findViewById(R.id.list3);

        //vivoucher

        listView_vc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(view.getContext(), vi_voucher.class);
                    startActivity(intent);
                }
            }
        });

        lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //payment
                if (position == 0){
                    Intent intent = new Intent(view.getContext(), payment.class);
                    startActivity(intent);

                }
                //hoadon
                if (position == 2){
                    Intent intent = new Intent(view.getContext(), activity_hoadon.class);
                    startActivity(intent);

                }

            }
        });
                // moi ban be
        listView_gopy.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(view.getContext(), moibanbe.class);
                    startActivity(intent);
                }
                //gopy
                if (position == 1){
                    Intent intent = new Intent(view.getContext(), gopy.class);
                    startActivity(intent);
                }
            }
        });

        //chinhsach
        listView_chinhsach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(view.getContext(), chinhsach.class);
                    startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(view.getContext(), caidat.class);
                    startActivity(intent);
                }
            }
        });

        arr_bean_vc = new ArrayList<ListViewBean>();
        arr_bean_vc.add(new ListViewBean(R.drawable.vi, "Voucher"));
        adapter = new ListViewBaseAdapter(arr_bean_vc, this);
        listView_vc.setAdapter(adapter);

        arr_bean = new ArrayList<ListViewBean>();
        arr_bean.add(new ListViewBean(R.drawable.payment, "Payment"));
        arr_bean.add(new ListViewBean(R.drawable.history, "Lịch sử đơn hàng"));
        arr_bean.add(new ListViewBean(R.drawable.bill, "Hóa đơn"));
        arr_bean.add(new ListViewBean(R.drawable.credit, "Reward Credits"));
        arr_bean.add(new ListViewBean(R.drawable.app, "Ứng dụng cho chủ quán"));
        adapter = new ListViewBaseAdapter(arr_bean, this);
        lview.setAdapter(adapter);

        arr_been_gopy = new ArrayList<ListViewBean>();
        arr_been_gopy.add(new ListViewBean(R.drawable.people, "Mời bạn bè"));
        arr_been_gopy.add(new ListViewBean(R.drawable.mail, "Góp ý"));
        adapter = new ListViewBaseAdapter(arr_been_gopy, this);
        listView_gopy.setAdapter(adapter);

        array_bean_chinhsach = new ArrayList<ListViewBean>();
        array_bean_chinhsach.add(new ListViewBean(R.drawable.chinhsach, "Chính sách quy định"));
        array_bean_chinhsach.add(new ListViewBean(R.drawable.setting, "Cài đặt"));
        adapter = new ListViewBaseAdapter(array_bean_chinhsach, this);
        listView_chinhsach.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



    }

}