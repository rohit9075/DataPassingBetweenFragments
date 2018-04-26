package rohit.com.datapassingbetweenfragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DestinationFragment extends Fragment {

    private TextView mTextViewFirstName, mTextViewLastName;
    String mFirstName, mLastName;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_destination, container, false);

        mTextViewFirstName = rootView.findViewById(R.id.textViewFirstName);
        mTextViewLastName = rootView.findViewById(R.id.textViewLastName);

        // getting data method call
        gettingData();

        return rootView;

    }


    // gettingData method definition
    private void gettingData() {
        Bundle bundle = this.getArguments();

        if (bundle != null) {
            mFirstName = bundle.getString("first_name");
            mLastName = bundle.getString("last_name");

            mTextViewFirstName.setText(mFirstName);
            mTextViewLastName.setText(mLastName);
        }
    }


}
