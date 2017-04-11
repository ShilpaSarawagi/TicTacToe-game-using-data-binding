package learnandroid.shilpa.com.myapplication;

import android.databinding.ObservableField;

/**
 * Created by ssarawagi on 4/11/2017.
 */

public class User {
    public final ObservableField<String> firstname = new ObservableField<>();
    public String lastname;
    public final ObservableField<Integer> age = new ObservableField<>();
    public String gender;

    public User(String firstname, String lastname, int age, String gender){
        this.firstname.set(firstname);
        this.lastname = lastname;
        this.age.set(age);
        this.gender = gender;
    }
}