package com.example.productapp.databinding;
import com.example.productapp.R;
import com.example.productapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailsBindingImpl extends FragmentDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatRatingBar) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.proImg.setTag(null);
        this.ratingBar.setTag(null);
        this.txtDesc.setTag(null);
        this.txtPrice.setTag(null);
        this.txtTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.product == variableId) {
            setProduct((com.example.productapp.domain.model.ProductItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProduct(@Nullable com.example.productapp.domain.model.ProductItem Product) {
        this.mProduct = Product;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.product);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String productImage = null;
        java.lang.String productTitle = null;
        double productRatingRate = 0.0;
        com.example.productapp.domain.model.ProductItem product = mProduct;
        java.lang.String productDescription = null;
        double productPrice = 0.0;
        java.lang.String javaLangStringPriceProductPrice = null;
        com.example.productapp.domain.model.Ratings productRating = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (product != null) {
                    // read product.image
                    productImage = product.getImage();
                    // read product.title
                    productTitle = product.getTitle();
                    // read product.description
                    productDescription = product.getDescription();
                    // read product.price
                    productPrice = product.getPrice();
                    // read product.rating
                    productRating = product.getRating();
                }


                // read ("Price :") + (product.price)
                javaLangStringPriceProductPrice = ("Price :") + (productPrice);
                if (productRating != null) {
                    // read product.rating.rate
                    productRatingRate = productRating.getRate();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.productapp.utils.DataBindAdapterKt.setImageUrl(this.proImg, productImage);
            com.example.productapp.utils.DataBindAdapterKt.setValueRate(this.ratingBar, productRatingRate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDesc, productDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPrice, javaLangStringPriceProductPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTitle, productTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): product
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}