package com.savr.store.view;

import android.app.ProgressDialog;
import android.os.Bundle;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.firestore.FirebaseFirestore;
import com.savr.store.R;
import com.savr.store.contract.AddProductContract;
import com.savr.store.model.Product;
import com.savr.store.presenter.AddProductPresenter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class AddProductActivity extends AppCompatActivity implements AddProductContract.View {

    private AddProductContract.Presenter presenter;
    TextInputEditText namaBarang, jumlahBarang, hargaBarang, tanggalBeli, distributor, satuan;
    LinearLayout tambahBarang;
    private ProgressDialog progressDialog;
    private Product product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Tambah Barang");
        setSupportActionBar(toolbar);

        namaBarang = findViewById(R.id.nama_barang);
        hargaBarang = findViewById(R.id.harga_barang);
        jumlahBarang = findViewById(R.id.jumlah_beli);
        tanggalBeli = findViewById(R.id.tanggal_beli);
        satuan = findViewById(R.id.satuan_beli);
        distributor = findViewById(R.id.distributor);
        tambahBarang = findViewById(R.id.button_tambah_barang);
        progressDialog = new ProgressDialog(AddProductActivity.this);

        handleClick();

        new AddProductPresenter(this, product);

    }

    private void handleClick(){

        tambahBarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = namaBarang.getText().toString();
                int harga = 13;
                long tanggal = 123123123;
                int jumlah = 123;

                final Product product = new Product(
                        "id",
                        nama,
                        harga,
                        tanggal,
                        jumlah,
                        satuan.getText().toString(),
                        distributor.getText().toString()
                );
                Log.d("productid",product.getId());
                Log.d("productname",product.getNamaBarang());
                Log.d("productharga",String.valueOf(product.getHarga()));
                Log.d("producttangga",String.valueOf(product.getTanggalBeli()));
                Log.d("productjumlah",String.valueOf(product.getJumlahBeli()));
                Log.d("productsatuan",product.getSatuan());
                Log.d("productdistri",product.getDistributor());
                if (namaBarang.getText().toString()!=null) {
                    presenter.AddProduct(namaBarang.getText().toString());
                }else {
                    Log.d("productdistri","null");
                }
            }
        });
    }

    @Override
    public void setLoadingIndicator(boolean active) {
        if (active){
            tambahBarang.setVisibility(View.INVISIBLE);
            progressDialog.dismiss();
        }else {
            tambahBarang.setVisibility(View.VISIBLE);
            progressDialog.setMessage("Please wait...");
            progressDialog.show();
        }
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void setPresenter(AddProductContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
