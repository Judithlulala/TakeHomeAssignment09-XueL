package com.example.carsinfo;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    private TextView displayText;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference carRef = database.getReference("Car");
    private DatabaseReference carsRef = database.getReference("Cars");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayText =findViewById(R.id.displayContent);
        carRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Cars a1 = dataSnapshot.getValue(Cars.class);
                if (a1 != null){
                    displayText.setText(a1.toString());}
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(MainActivity.this, "Error loading Firebase",Toast.LENGTH_SHORT).show();

            }
        });

        }


    public void AddCar(View view) {
        carsRef.push().setValue(new Cars("Subaru",5,2019,true));
    }

    public void SetCar(View view) {
        carRef.setValue(new Cars("Toyota", 4, 2017, true));
    }
}


