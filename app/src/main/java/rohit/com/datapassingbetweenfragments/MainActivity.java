package rohit.com.datapassingbetweenfragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // SourceFragment method call
        sourceFragment();

        // DestinationFragment method call
        destinationFragment();


    }

    private void destinationFragment() {
        // Create new fragment and transaction

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        DestinationFragment fragment = new DestinationFragment();

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack
        fragmentTransaction.replace(R.id.constraintLayout2, fragment);
        fragmentTransaction.addToBackStack(null);

        // Commit the transaction
        fragmentTransaction.commit();
    }


    // Source Fragment Definition
    private void sourceFragment() {
        // Create new fragment and transaction

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        SourceFragment fragment = new SourceFragment();

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack
        fragmentTransaction.replace(R.id.constraintLayout, fragment);
        fragmentTransaction.addToBackStack(null);

        // Commit the transaction
        fragmentTransaction.commit();
    }
}
