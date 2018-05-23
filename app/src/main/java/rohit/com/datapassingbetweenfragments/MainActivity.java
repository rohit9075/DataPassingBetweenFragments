package rohit.com.datapassingbetweenfragments;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // SourceFragment method call
        sourceFragment();
    }
    // Source Fragment Definition
    private void sourceFragment() {
        // Create new fragment and transaction

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        SourceFragment fragment = new SourceFragment();

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack
        fragmentTransaction.add(R.id.constraintLayout2, fragment);
        fragmentTransaction.addToBackStack(null);

        // Commit the transaction
        fragmentTransaction.commit();

        /* This is the another way to inflate the fragment */
//        getSupportFragmentManager().
//                beginTransaction().
//                addToBackStack(null).
//                add(R.id.constraintLayout2,fragment).
//                commit();
    }
}
