package com.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.databindingexample.databinding.ActivityMainBinding;
import com.databindingexample.databinding.DataBindingLayoutBinding;
import com.databindingexample.model.User;

public class MainActivity extends AppCompatActivity {
    public static final String TAG=MainActivity.class.getSimpleName();
    private ActivityMainBinding binding;
    private DataBindingLayoutBinding layoutBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        User user=new User();
        user.setName("Pratik Vyas");
        binding.setUser(user);
        binding.setActivity(this);

    }


    public void onButtonClick(String email){
        Log.v(TAG,"Email : "+binding.getUser().getEmail());
        Log.v(TAG,"Email : "+email);
        Toast.makeText(this,email,Toast.LENGTH_SHORT).show();
    }
}
