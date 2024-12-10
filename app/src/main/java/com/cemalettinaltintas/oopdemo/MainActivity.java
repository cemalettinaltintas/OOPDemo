package com.cemalettinaltintas.oopdemo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Circle circle=new Circle(3);
        circle.setYaricap(4);
        System.out.println("Dairenin Alani :"+circle.getArea());

        Square square=new Square(5);
        System.out.println("Karenin Alani :"+square.getArea());

        Cylinder cylinder=new Cylinder(3,5);
        System.out.println("Silindirin Alani :"+cylinder.getArea());
        System.out.println("Silindirin Hacmi :"+cylinder.getVolume());

        Sphere sphere=new Sphere(2);
        System.out.println("Kurenin Alani :"+sphere.getArea());
        System.out.println("Kurenin Hacmi :"+sphere.getVolume());
    }
}