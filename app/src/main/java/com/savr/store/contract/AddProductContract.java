package com.savr.store.contract;

import com.savr.store.BasePresenter;
import com.savr.store.BaseView;
import com.savr.store.model.Product;

public interface AddProductContract {

    interface View extends BaseView<Presenter> {

        void setLoadingIndicator(boolean active);

        void showMessage(String message);
    }

    interface Presenter extends BasePresenter {

        void AddProduct(String product);

    }
}
