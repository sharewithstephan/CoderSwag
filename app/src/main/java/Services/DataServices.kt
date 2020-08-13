package Services

import Model.Category
import Model.Product

object DataServices {


    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),

                Category("SHIRTS", "shirtimage"),
    Category("HOODIES","hoodieimage"),
    Category("HATS","hatimage"),
    Category("DIGITAL","digitalgoodsimage")
    )

    val hats= listOf(
        Product("Devslopes Graphic Beanie", "$18","hat1"),
        Product("Devslopes Hat Black", "$20","hat2"),
        Product("Devslopes Hat White", "$18","hat3"),
        Product("Devslopes Hat Snapback", "$22","hat4")

        )

    val hoodies= listOf(
        Product("Devslopes hoodie Gray","$28","hoodie1"),
        Product("Devslopes hoodie Red","$32","hoodie2"),
        Product("Devslopes Gray hoodie ","$28","hoodie3"),
        Product("Devslopes Black hoodie ","$28","hoodie4")

    )
    val shirts= listOf(
        Product("Devslopes Shirt Black","$18","shirt1"),
        Product("Devslopes Badge Light Gray Shirt","$20","shirt2"),
        Product("Devslopes Logo Shirt Red","$22","shirt3"),
        Product("Devslopes Hustle Shirt ","$22","shirt4"),
        Product("Kickflip Studios","$18","shirt5")
    )


    val digitalGood= listOf<Product>()

    fun getProducts(category:String):List<Product>
    {
        when(category)
        {
            "SHIRTS"-> return shirts
            "HOODIES"-> return hoodies
            "HATS"-> return hats
            else-> return digitalGood
        }

    }






}