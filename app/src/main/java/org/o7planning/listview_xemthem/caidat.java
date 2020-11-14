package org.o7planning.listview_xemthem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class caidat extends AppCompatActivity {
    private ImageButton imageButton;
    ListView lv_cdtk, lv_tcdh, lv_cdud, lv_ttk;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean_cdtk, arr_bean_tcdh, arr_bean_cdud, arr_bean_ttk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caidat);
        lv_cdtk = (ListView) findViewById(R.id.list_cdtk);
        lv_tcdh = (ListView) findViewById(R.id.list_tcdh);
        lv_cdud = (ListView) findViewById(R.id.list_cdud);
        lv_ttk = (ListView) findViewById(R.id.list_ttk);
        imageButton = (ImageButton) findViewById(R.id.bt_caidat);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        arr_bean_cdtk = new ArrayList<ListViewBean>();
        arr_bean_cdtk.add(new ListViewBean(R.drawable.people,"Hình đại diện"));
        arr_bean_cdtk.add(new ListViewBean(R.drawable.pass,"Mật khẩu"));
        arr_bean_cdtk.add(new ListViewBean(R.drawable.profile,"Thông tin & liên hệ"));
        adapter = new ListViewBaseAdapter(arr_bean_cdtk, this);
        lv_cdtk.setAdapter(adapter);

        arr_bean_tcdh = new ArrayList<ListViewBean>();
        arr_bean_tcdh.add(new ListViewBean(R.drawable.hoan,"Hoãn xác nhận đơn hàng"));
        adapter = new ListViewBaseAdapter(arr_bean_tcdh, this);
        lv_tcdh.setAdapter(adapter);

        arr_bean_cdud = new ArrayList<ListViewBean>();
        arr_bean_cdud.add(new ListViewBean(R.drawable.diadiem,"Đổi tỉnh thành"));
        arr_bean_cdud.add(new ListViewBean(R.drawable.danhmuc,"Đổi danh mục"));
        arr_bean_cdud.add(new ListViewBean(R.drawable.ngonngu,"Đổi ngôn ngữ"));
        arr_bean_cdud.add(new ListViewBean(R.drawable.thongbao,"Cài đặt thông báo"));
        adapter = new ListViewBaseAdapter(arr_bean_cdud, this);
        lv_cdud.setAdapter(adapter);

        arr_bean_ttk = new ArrayList<ListViewBean>();
        arr_bean_ttk.add(new ListViewBean(R.drawable.thongtin,"Về Foody"));
        arr_bean_ttk.add(new ListViewBean(R.drawable.facebook,"Theo dõi chúng tôi trên Facebook"));
        arr_bean_ttk.add(new ListViewBean(R.drawable.instagram,"Theo dõi chúng tôi trên Instagram"));
        arr_bean_ttk.add(new ListViewBean(R.drawable.website,"Website"));
        arr_bean_ttk.add(new ListViewBean(R.drawable.mail,"Liên hệ"));
        adapter = new ListViewBaseAdapter(arr_bean_ttk, this);
        lv_ttk.setAdapter(adapter);


    }
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}