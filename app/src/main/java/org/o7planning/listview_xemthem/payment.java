package org.o7planning.listview_xemthem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class payment extends AppCompatActivity {

    private ImageButton imageButton;

    ListView lv_payment;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean_payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        lv_payment = (ListView) findViewById(R.id.list_payment);

        imageButton = (ImageButton) findViewById(R.id.bt_payment);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        arr_bean_payment = new ArrayList<ListViewBean>();
        arr_bean_payment.add(new ListViewBean(R.drawable.pay,"Ví AirPay"));
        arr_bean_payment.add(new ListViewBean(R.drawable.money,"Tiền mặt"));
        arr_bean_payment.add(new ListViewBean(R.drawable.credit,"Thẻ tín dụng/ Ghi nợ"));
        arr_bean_payment.add(new ListViewBean(R.drawable.nowcredits,"Now Credits"));
        arr_bean_payment.add(new ListViewBean(R.drawable.atm,"ATM/ Internet Banking"));
        adapter = new ListViewBaseAdapter(arr_bean_payment, this);
        lv_payment.setAdapter(adapter);

    }
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}