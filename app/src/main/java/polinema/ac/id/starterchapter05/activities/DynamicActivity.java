package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragment.BlueFragment;
import polinema.ac.id.starterchapter05.fragment.RedFragment;

public class DynamicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);

    }

    public void loadRedFragment(View view) {
        if (getSupportFragmentManager().findFragmentById(R.id.framelayout) instanceof RedFragment){
            return;
        }
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.framelayout, new RedFragment())
                .addToBackStack(null)
                .setCustomAnimations(R.animator.enter_from_left,R.animator.exit_from_left,R.animator.enter_from_left, R.animator.exit_from_right)
                .commit();
    }

    public void loadBlueFragment(View view) {
        if (getSupportFragmentManager().findFragmentById(R.id.framelayout) instanceof BlueFragment){
            return;
        }
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.framelayout, new BlueFragment() )
                .setCustomAnimations(R.animator.enter_from_left,R.animator.exit_from_left,R.animator.enter_from_left, R.animator.exit_from_right)
                .addToBackStack(null)
                .commit();
    }

//    private boolean isFragmentDisplayed( fragment){
//        Fragment curFragment = getSupportFragmentManager().findFragmentById(R.id.framelayout);
//        if (curFragment instanceof fragment){
//
//        }
//    }
}
