package com.example.livraria;

import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.livraria.dummy.DummyContent.DummyItem;
import com.example.livraria.entities.Ator;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class AtorRecyclerViewAdapter extends RecyclerView.Adapter<AtorRecyclerViewAdapter.ViewHolder> {

    private final List<Ator> mAtores;

    public AtorRecyclerViewAdapter(List<Ator> items) {
        mAtores = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_ator, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mAtor = mAtores.get(position);
        holder.mImageAtorFoto.setImageResource(R.drawable.depp);
        holder.mTextAtorNome.setText(holder.mAtor.getNomeAtor());
        holder.mTextAtorFilme.setText(holder.mAtor.getNomeFilme());
        holder.mImageAtorFotoFilme.setImageResource(R.drawable.pirata);
        holder.mTextAtorDescricaoFilme.setText(holder.mAtor.getDescricaoFilme());

        holder.mView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.e("teste", "Cliclou na lista");
            }
        });

    }

    @Override
    public int getItemCount() {
        return mAtores.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public final View mView;
        public final ImageView mImageAtorFoto;
        public final TextView mTextAtorNome;
        public final TextView mTextAtorFilme;
        public final ImageView mImageAtorFotoFilme;
        public final TextView mTextAtorDescricaoFilme;
        public final Button mButtonAtorGostei;


        public Ator mAtor;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            View mView;
            mImageAtorFoto = view.findViewById(R.id.imageAtorFoto);
            mTextAtorNome = view.findViewById(R.id.textAtorNome);
            mTextAtorFilme = view.findViewById(R.id.textAtorFilme);
            mImageAtorFotoFilme = view.findViewById(R.id.imageAtorFotoFilme);
            mTextAtorDescricaoFilme = view.findViewById(R.id.textAtorDescricaoFilme);
            mButtonAtorGostei = view.findViewById(R.id.buttonAtorGostei);
        }

        @Override
        public String toString() {
            super.toString();
            return "ViewHolder{" +
                    ", mTextAtorNome=" + mTextAtorNome.getText() +
                    ", mTextAtorFilme=" + mTextAtorFilme.getText() +
                    ", mTextAtorDescricaoFilme=" + mTextAtorDescricaoFilme.getText() +
                    ", mButtonAtorGostei=" + mButtonAtorGostei.getText() +
                    '}';
        }
    }
}