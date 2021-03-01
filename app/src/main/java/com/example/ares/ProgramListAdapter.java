package com.example.ares;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ProgramListAdapter extends RecyclerView.Adapter<ProgramListAdapter.ViewHolder> {
    private java.util.List<String> mData;

    ProgramListAdapter(java.util.List<String> data) {
        this.mData = data;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv;

        ViewHolder(View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tvProgramName);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.program_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String program = mData.get(position);
        holder.tv.setText(program);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
