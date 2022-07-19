package com.defianttech.convertme


class CustomUnits {
    val version = 1
    val units = mutableListOf<CustomUnit>()

    class CustomUnit(val id: Int, val categoryId: Int, var baseUnitId: Int, val offset: Double,
                     var multiplier: Double, var name: String)
}
