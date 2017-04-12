package learnandroid.shilpa.com.myapplication.viewmodel;

import android.databinding.ObservableField;

/**
 * Created by ssarawagi on 4/11/2017.
 */

public class User {
    public final ObservableField<String> firstname = new ObservableField<>();
    public final ObservableField<String> lastname = new ObservableField<>();
    public final ObservableField<Integer> age = new ObservableField<>();
    public String gender;

    public User(String firstname, String lastname, int age, String gender){
        this.firstname.set(firstname);
        this.lastname.set(lastname);
        this.age.set(age);
        this.gender = gender;
    }
}