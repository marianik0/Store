package com.example.store.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.example.store.MainActivity;
import com.example.store.R;
import com.example.store.adapters.ProductAdapter;
import com.example.store.databinding.FragmentHomeBinding;
import com.example.store.entities.Product;

import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    private ProductAdapter adapter;
    private List<Product> products;
    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        products.add(new Product("1", "футболка", 10.55F));
        products.add(new Product("2", "кофта", 10.55F));
        adapter = new ProductAdapter(getActivity(), products);
        recyclerView.setAdapter(adapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}