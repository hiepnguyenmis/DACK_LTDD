package com.example.dack_ltdd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.dack_ltdd.Model.User;
import com.example.dack_ltdd.WebService.GetUserRequest;
import com.example.dack_ltdd.WebService.SeverRequest;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {
    EditText edPhone;

    public static boolean checkPhone=false;

    ArrayList<User> arr=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Toolbar toolbar = findViewById(R.id.toolbar);
        edPhone= findViewById(R.id.edPhone);


        setSupportActionBar(toolbar);
        getSupportActionBar().hide();


        FloatingActionButton fab =(FloatingActionButton) findViewById(R.id.fabLogin);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mobile = edPhone.getText().toString().trim();
                if(mobile.isEmpty() || mobile.length() < 10){
                    edPhone.setError("Enter a valid mobile");
                    edPhone.requestFocus();
                    return;
                }
                Intent intent= new Intent(LoginActivity.this,VerifyPhoneActivity.class);
                intent.putExtra("mobile", mobile);
                startActivity(intent);
//                else{
//                    getUserList(mobile);
//                    if(checkPhone==true){
//
//                    }else{
//                        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
//                        startActivity(intent);
//                    }
//                }
            }

        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(FirebaseAuth.getInstance().getCurrentUser()!=null){
            Intent intent= new Intent(this,MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

            startActivity(intent);

        }
    }

    public void getUserList(final String phone){
        Map<String, String> parameter = new HashMap<>();
        GetUserRequest request =new GetUserRequest(new SeverRequest.SeverRequestListener(){
            @Override
            public boolean completed(Object obj) {
                if (obj != null) {
                    //kiem tra so dien thoai co trong list
                    arr = (ArrayList<User>) obj;
                    for (int i = 0; i < arr.size(); i++) {
                        if (arr.get(i).getPhone().equals(phone)) {
                            //LAM GI DO
                            checkPhone=true;
                            return true;
                        }
                    }
                }
                else {
                    return false;
                }
                return false;
            }
        });

        request.execute(parameter);
    }

}
