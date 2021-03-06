package org.o7planning.listview_xemthem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class moibanbe extends AppCompatActivity {

    private ImageButton imageButton;

    ListView lv_moibanbe;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean_moibanbe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moibanbe);

        lv_moibanbe = (ListView) findViewById(R.id.list_moibanbe);
        imageButton = (ImageButton) findViewById(R.id.bt_mbb);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });



        arr_bean_moibanbe = new ArrayList<ListViewBean>();
        arr_bean_moibanbe.add(new ListViewBean(R.drawable.messenger,"Gửi qua Messenger"));
        arr_bean_moibanbe.add(new ListViewBean(R.drawable.facebook,"Gửi qua Facebook"));
        arr_bean_moibanbe.add(new ListViewBean(R.drawable.mail,"Gửi Email"));
        arr_bean_moibanbe.add(new ListViewBean(R.drawable.copy,"Sao chép địa chỉ tải ứng dụng"));
        adapter = new ListViewBaseAdapter(arr_bean_moibanbe, this);
        lv_moibanbe.setAdapter(adapter);
    }
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}