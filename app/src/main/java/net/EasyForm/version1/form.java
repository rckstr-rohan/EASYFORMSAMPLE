package net.EasyForm.version1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import javax.annotation.Nullable;
public class form extends AppCompatActivity {
    EditText fname,mobile,email,gender, occupation,country,pincode ;
    Button btn;
    FirebaseDatabase database ;
    DatabaseReference ref;
    User user;
    FirebaseFirestore fStore;
    String userId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);
        fname = (EditText) findViewById(R.id.fname);
        mobile = (EditText) findViewById(R.id.mobile);
        email = (EditText) findViewById(R.id.email);
        gender = (EditText) findViewById(R.id.gender);
        occupation = (EditText) findViewById(R.id.occupation);
        country = (EditText) findViewById(R.id.country);
        pincode = (EditText) findViewById(R.id.pincode);
        btn = (Button) findViewById(R.id.btnInsert);

        database = FirebaseDatabase.getInstance();
        ref = database.getReference("User");
        user = new User();
        fStore = FirebaseFirestore.getInstance();
    }

        private final void getValues(){
            user.setFname(fname.getText().toString());
            user.setMobile(mobile.getText().toString());
            user.setEmail(email.getText().toString());
            user.setGender(gender.getText().toString());
            user.setOccupation(occupation.getText().toString());
            user.setCountry(country.getText().toString());
            user.setPincode(pincode.getText().toString());

        }
            public void btnInsert(View view)
            {
                ref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        getValues();
                        ref.child("user01").setValue(user);
                        Toast.makeText(form.this, "Form filled", Toast.LENGTH_LONG).show();

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
}
