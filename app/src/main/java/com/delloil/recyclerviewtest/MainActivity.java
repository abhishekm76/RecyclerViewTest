package com.delloil.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.delloil.recyclerviewtest.Adapters.RecyclerViewAdapterSimple;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

	private RecyclerView recyclerView;
	private RecyclerViewAdapterSimple simpleAdapter;
	private ArrayList<String> valueOfData;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		recyclerView=findViewById(R.id.recyclerRV);
		recyclerView.setHasFixedSize(true);
		recyclerView.setLayoutManager(new LinearLayoutManager(this));
		setValueData();
		simpleAdapter = new RecyclerViewAdapterSimple(this,valueOfData);
		recyclerView.setAdapter(simpleAdapter);


	}

	private void setValueData() {
		valueOfData = new ArrayList<>();
		valueOfData.add("onetwerwerwerwerwerwerwerwer");
		valueOfData.add("2one");
		valueOfData.add("3one");
		valueOfData.add("4one");
		valueOfData.add("5one");
		valueOfData.add("6one");
		valueOfData.add("7one");
		valueOfData.add("8one");

	}
}