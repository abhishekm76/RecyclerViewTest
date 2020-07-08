package com.delloil.recyclerviewtest.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.delloil.recyclerviewtest.R;

import java.util.ArrayList;

public class RecyclerViewAdapterSimple extends RecyclerView.Adapter <RecyclerViewAdapterSimple.ViewHolder> {

	private Context context;
	private ArrayList<String> dataArrayList;

	public RecyclerViewAdapterSimple(Context context, ArrayList<String> dataArrayList) {
		this.context = context;
		this.dataArrayList = dataArrayList;
	}


	@NonNull
	@Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);
		ViewHolder vHolder = new ViewHolder(v);

		return vHolder;
	}

	@Override
	public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
			String valueOfData = dataArrayList.get(position);
			holder.firstText.setText(valueOfData);
			holder.thirdText.setText(valueOfData);
	}

	@Override
	public int getItemCount() {
		return dataArrayList.size();
	}

	public class ViewHolder extends RecyclerView.ViewHolder {
		public TextView firstText, secondText, thirdText;


		public ViewHolder(@NonNull View itemView) {
			super(itemView);
			firstText=itemView.findViewById(R.id.firstTV);
			secondText=itemView.findViewById(R.id.secondTV);
			thirdText=itemView.findViewById(R.id.thirdTV);
		}
	}
}
