package learnandroid.shilpa.com.myapplication;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import learnandroid.shilpa.com.myapplication.databinding.ActivitySecondBinding;;

/**
 * Created by ssarawagi on 4/11/2017.
 */

public class SecondActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final User myUser = new User("Shilpa", "Sarawagi", 27, "Female");

        final ActivitySecondBinding secondBinding = DataBindingUtil.setContentView(this, R.layout.activity_second);
        secondBinding.setUser(myUser);

        secondBinding.updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myUser.firstname.set(secondBinding.firstnameEditText.getText().toString());
                myUser.lastname =  secondBinding.lastnameEditText.getText().toString();
            }
        });

    }
}
