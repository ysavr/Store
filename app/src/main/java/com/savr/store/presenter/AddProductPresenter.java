package com.savr.store.presenter;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.savr.store.contract.AddProductContract;
import com.savr.store.model.Product;
import com.savr.store.view.AddProductActivity;

public class AddProductPresenter implements AddProductContract.Presenter {

    private CollectionReference productReference;
    private AddProductContract.View addProductView;
    private Product product;

    public AddProductPresenter(AddProductContract.View addProductView, Product product) {
        this.productReference = FirebaseFirestore.getInstance().collection("Product");
        this.addProductView = addProductView;
        this.product = product;
        start();
    }

    @Override
    public void AddProduct(String product) {
        //this.product = product;
        String id = FirebaseFirestore.getInstance().collection("Product").document().getId();
        Log.d("productPresenter",product);

//        Product addProduct = new Product(
//                id,
//                product.getNamaBarang(),
//                product.getHarga(),
//                product.getTanggalBeli(),
//                product.getJumlahBeli(),
//                product.getSatuan(),
//                product.getDistributor()
//        );
//
//        addProductView.setLoadingIndicator(true);
//
//        productReference.document(id).set(addProduct)
//                .addOnSuccessListener(new OnSuccessListener<Void>() {
//                    @Override
//                    public void onSuccess(Void aVoid) {
//                        addProductView.setLoadingIndicator(false);
//                        addProductView.showMessage("Success Add Product");
//                    }
//                })
//                .addOnFailureListener(new OnFailureListener() {
//                    @Override
//                    public void onFailure(@NonNull Exception e) {
//                        addProductView.setLoadingIndicator(false);
//                        addProductView.showMessage(e.getMessage());
//                    }
//                });
    }

    @Override
    public void start() {
        Log.d("start","start");
    }
}
