package rohit.com.datapassingbetweenfragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SourceFragment extends Fragment implements View.OnClickListener {

    private EditText mEditTextFirstName, mEditTextLastName;
    Button mButtonSend;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_source, container, false);


      // initView method call
        iniView(rootView);

       // register listner method
        registerListner();

        return  rootView;
    }

    private void registerListner() {
        mButtonSend.setOnClickListener(this);
    }

    private void iniView(View rootView) {
        mEditTextFirstName = rootView.findViewById(R.id.editTextFirstName);
        mEditTextLastName = rootView.findViewById(R.id.editTextLastName);
        mButtonSend = rootView.findViewById(R.id.buttonSend);
    }

    @Override
    public void onClick(View v) {


        String mFirstName = mEditTextFirstName.getText().toString();
        String mLastName = mEditTextLastName.getText().toString();

        // printToast method call with two parameter firstname ane lastname
        printToast(mFirstName, mLastName);

       // passingData methodCall
        passingData(mFirstName, mLastName);



    }

    // passing data method definition
    private void passingData(String mFirstName, String mLastName) {

        Bundle bundle = new Bundle();

        bundle.putString("first_name",mFirstName);
        bundle.putString("last_name" , mLastName);

        DestinationFragment destinationFragment = new DestinationFragment();
        destinationFragment.setArguments(bundle);

        getFragmentManager().beginTransaction().replace(R.id.constraintLayout2,destinationFragment).commit();
    }

    // method definition of printToast wiht two string parameter
    private void printToast(String mFirstName, String mLastName) {

        if (mFirstName.matches("")|| mLastName.matches("")) {
            Toast.makeText(getContext(), "Please fill Your FirsName and LastName", Toast.LENGTH_SHORT).show();

        }

         else{
            Toast.makeText(getContext(),"FirstName : " + mFirstName + "  " +"LastName : " + mLastName, Toast.LENGTH_SHORT).show();
        }
    }
}
