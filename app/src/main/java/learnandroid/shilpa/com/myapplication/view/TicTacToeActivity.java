package learnandroid.shilpa.com.myapplication.view;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import learnandroid.shilpa.com.myapplication.R;
import learnandroid.shilpa.com.myapplication.databinding.TictactoeBinding;
import learnandroid.shilpa.com.myapplication.viewmodel.TicTacToeViewModel;

public class TicTacToeActivity extends Activity {

    TicTacToeViewModel viewModel = new TicTacToeViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TictactoeBinding binding = DataBindingUtil.setContentView(this, R.layout.tictactoe);
        binding.setViewModel(viewModel); // setViewModel is the function created by capitalising the first letter of variable name viewModel used in the layout
        viewModel.onCreate();
    }

    @Override
    protected void onPause() {
        super.onPause();
        viewModel.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        viewModel.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        viewModel.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_tictactoe, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_reset:
                viewModel.onResetSelected();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
