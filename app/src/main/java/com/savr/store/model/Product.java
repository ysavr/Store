package com.savr.store.model;

public class Product {
    private String id;
    private String namaBarang;
    private int harga;
    private long tanggalBeli;
    private int jumlahBeli;
    private String satuan;
    private String distributor;

    public Product(String id, String namaBarang, int harga, long tanggalBeli, int jumlahBeli, String satuan, String distributor) {
        this.id = id;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.tanggalBeli = tanggalBeli;
        this.jumlahBeli = jumlahBeli;
        this.satuan = satuan;
        this.distributor = distributor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public long getTanggalBeli() {
        return tanggalBeli;
    }

    public void setTanggalBeli(long tanggalBeli) {
        this.tanggalBeli = tanggalBeli;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }
}
