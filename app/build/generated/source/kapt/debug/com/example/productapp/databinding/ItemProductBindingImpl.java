package com.example.productapp.databinding;
import com.example.productapp.R;
import com.example.productapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemProductBindingImpl extends ItemProductBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemProductBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemProductBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.ProImg.setTag(null);
        this.layClick.setTag(null);
        this.titleText.setTag(null);
        this.txtDesc.setTag(null);
        this.txtUrl.setTag(null);
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
        java.lang.String javaLangStringProductPrice = null;
        com.example.productapp.domain.model.ProductItem product = mProduct;
        java.lang.String productDescription = null;
        double productPrice = 0.0;

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
                }


                // read ("") + (product.price)
                javaLangStringProductPrice = ("") + (productPrice);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.productapp.utils.DataBindAdapterKt.setImageUrl(this.ProImg, productImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleText, productTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDesc, productDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtUrl, javaLangStringProductPrice);
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