
package android.databinding;
import learnandroid.shilpa.com.myapplication.BR;
class DataBinderMapper {
    final static int TARGET_MIN_SDK = 17;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case learnandroid.shilpa.com.myapplication.R.layout.activity_main:
                    return learnandroid.shilpa.com.myapplication.databinding.ActivityMainBinding.bind(view, bindingComponent);
                case learnandroid.shilpa.com.myapplication.R.layout.tictactoe:
                    return learnandroid.shilpa.com.myapplication.databinding.TictactoeBinding.bind(view, bindingComponent);
                case learnandroid.shilpa.com.myapplication.R.layout.activity_second:
                    return learnandroid.shilpa.com.myapplication.databinding.ActivitySecondBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 423753077: {
                if(tag.equals("layout/activity_main_0")) {
                    return learnandroid.shilpa.com.myapplication.R.layout.activity_main;
                }
                break;
            }
            case -1772524594: {
                if(tag.equals("layout/tictactoe_0")) {
                    return learnandroid.shilpa.com.myapplication.R.layout.tictactoe;
                }
                break;
            }
            case 156437168: {
                if(tag.equals("layout/activity_second_0")) {
                    return learnandroid.shilpa.com.myapplication.R.layout.activity_second;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"user"
            ,"viewModel"};
    }
}