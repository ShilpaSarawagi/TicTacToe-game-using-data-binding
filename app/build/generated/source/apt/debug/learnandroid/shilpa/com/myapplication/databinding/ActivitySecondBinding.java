package learnandroid.shilpa.com.myapplication.databinding;
import learnandroid.shilpa.com.myapplication.R;
import learnandroid.shilpa.com.myapplication.BR;
import android.view.View;
public class ActivitySecondBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.firstnameLabel, 5);
        sViewsWithIds.put(R.id.lastnameLabel, 6);
        sViewsWithIds.put(R.id.ageLabel, 7);
        sViewsWithIds.put(R.id.genderLabel, 8);
        sViewsWithIds.put(R.id.nextActivityButton, 9);
        sViewsWithIds.put(R.id.updateButton, 10);
        sViewsWithIds.put(R.id.lastnameEditText, 11);
        sViewsWithIds.put(R.id.firstnameEditText, 12);
    }
    // views
    public final android.widget.TextView ageLabel;
    public final android.widget.TextView ageTextView;
    public final android.widget.EditText firstnameEditText;
    public final android.widget.TextView firstnameLabel;
    public final android.widget.TextView firstnameTextView;
    public final android.widget.TextView genderLabel;
    public final android.widget.TextView genderTextView;
    public final android.widget.EditText lastnameEditText;
    public final android.widget.TextView lastnameLabel;
    public final android.widget.TextView lastnameTextView;
    private final android.widget.RelativeLayout mboundView0;
    public final android.widget.Button nextActivityButton;
    public final android.widget.Button updateButton;
    // variables
    private learnandroid.shilpa.com.myapplication.User mUser;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySecondBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 2);
        final Object[] bindings = mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds);
        this.ageLabel = (android.widget.TextView) bindings[7];
        this.ageTextView = (android.widget.TextView) bindings[3];
        this.ageTextView.setTag(null);
        this.firstnameEditText = (android.widget.EditText) bindings[12];
        this.firstnameLabel = (android.widget.TextView) bindings[5];
        this.firstnameTextView = (android.widget.TextView) bindings[1];
        this.firstnameTextView.setTag(null);
        this.genderLabel = (android.widget.TextView) bindings[8];
        this.genderTextView = (android.widget.TextView) bindings[4];
        this.genderTextView.setTag(null);
        this.lastnameEditText = (android.widget.EditText) bindings[11];
        this.lastnameLabel = (android.widget.TextView) bindings[6];
        this.lastnameTextView = (android.widget.TextView) bindings[2];
        this.lastnameTextView.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.nextActivityButton = (android.widget.Button) bindings[9];
        this.updateButton = (android.widget.Button) bindings[10];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.user :
                setUser((learnandroid.shilpa.com.myapplication.User) variable);
                return true;
        }
        return false;
    }

    public void setUser(learnandroid.shilpa.com.myapplication.User user) {
        this.mUser = user;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }
    public learnandroid.shilpa.com.myapplication.User getUser() {
        return mUser;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeAgeUser((android.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeFirstnameUse((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeAgeUser(android.databinding.ObservableField<java.lang.Integer> ageUser, int fieldId) {
        switch (fieldId) {
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
                }
                return true;
            }
        }
        return false;
    }
    private boolean onChangeFirstnameUse(android.databinding.ObservableField<java.lang.String> firstnameUser, int fieldId) {
        switch (fieldId) {
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x2L;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.databinding.ObservableField<java.lang.Integer> ageUser = null;
        java.lang.String lastnameUser = null;
        android.databinding.ObservableField<java.lang.String> firstnameUser = null;
        java.lang.String firstnameUser1 = null;
        java.lang.String genderUser = null;
        learnandroid.shilpa.com.myapplication.User user = mUser;
        java.lang.Integer ageUser1 = null;
        java.lang.String stringValueOfStringA = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (user != null) {
                        // read user.age
                        ageUser = user.age;
                    }
                    updateRegistration(0, ageUser);


                    if (ageUser != null) {
                        // read user.age.get()
                        ageUser1 = ageUser.get();
                    }


                    // read String.valueOf(user.age.get())
                    stringValueOfStringA = java.lang.String.valueOf(ageUser1);
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (user != null) {
                        // read user.lastname
                        lastnameUser = user.lastname;
                        // read user.gender
                        genderUser = user.gender;
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (user != null) {
                        // read user.firstname
                        firstnameUser = user.firstname;
                    }
                    updateRegistration(1, firstnameUser);


                    if (firstnameUser != null) {
                        // read user.firstname.get()
                        firstnameUser1 = firstnameUser.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.ageTextView, stringValueOfStringA);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.firstnameTextView, firstnameUser1);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.genderTextView, genderUser);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.lastnameTextView, lastnameUser);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivitySecondBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivitySecondBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivitySecondBinding>inflate(inflater, learnandroid.shilpa.com.myapplication.R.layout.activity_second, root, attachToRoot, bindingComponent);
    }
    public static ActivitySecondBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivitySecondBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(learnandroid.shilpa.com.myapplication.R.layout.activity_second, null, false), bindingComponent);
    }
    public static ActivitySecondBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivitySecondBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_second_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivitySecondBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): user.age
        flag 1 (0x2L): user.firstname
        flag 2 (0x3L): user
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}