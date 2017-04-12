package learnandroid.shilpa.com.myapplication.view;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import learnandroid.shilpa.com.myapplication.R;
import learnandroid.shilpa.com.myapplication.viewmodel.User;
import learnandroid.shilpa.com.myapplication.databinding.ActivitySecondBinding;;

/**
 * Created by ssarawagi on 4/11/2017.
 */

public class SecondActivity extends Activity {

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
                myUser.lastname.set(secondBinding.lastnameEditText.getText().toString());
            }
        });

        secondBinding.nextActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, TicTacToeActivity.class);
                startActivity(intent);
            }
        });

    }
}
