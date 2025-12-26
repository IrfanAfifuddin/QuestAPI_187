package com.example.questapi_187.uicontroller.route

import com.example.questapi_187.R

object DestinasiDetail {
    val route = "item_detail"
    val titleRes = R.string.detail_siswa
    const val itemIdArg = "itemId"
    val routeWithArgs = "$route/{$itemIdArg}"
}