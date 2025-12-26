package com.example.questapi_187.uicontroller.route

import com.example.questapi_187.R

object DestinasiEdit : DestinasiNavigasi {
    override val route = "item_edit"
    override val titleRes = R.string.edit_siswa
    val itemIdArg = "itemId"
    val routeWithArgs = "$route/{$itemIdArg}"
}