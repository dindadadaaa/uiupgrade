package com.azhar.uiupgradeproject.model

import com.azhar.uiupgradeproject.data.model.ProductModel
import com.google.gson.annotations.SerializedName

data class ProductResponse(
    @SerializedName("products") var products: ArrayList<ProductModel> = arrayListOf(),
    @SerializedName("total") var total: Int? = null,
    @SerializedName("skip") var skip: Int? = null,
    @SerializedName("limit") var limit: Int? = null
)
