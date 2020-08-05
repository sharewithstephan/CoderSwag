package Services

import Model.Category
import Model.Product

object DataServices {


    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats= listOf(
        Product("Devslopes Graphic Beanie", "$18","hat01"),
        Product("Devslopes Hat Black", "$20","hat02"),
        Product("Devslopes Hat White", "$18","hat03"),
        Product("Devslopes Hat Snapback", "$22","hat04")

        )

    val hoodies= listOf(
        Product("Devslopes hoodie Gray","$28","hoodie01"),
        Product("Devslopes hoodie Red","$32","hoodie02"),
        Product("Devslopes Gray hoodie ","$28","hoodie03"),
        Product("Devslopes Black hoodie ","$28","hoodie04")

    )
    val shirts= listOf(
        Product("Devslopes Shirt Black","$18","shirt01"),
        Product("Devslopes Badge Light Gray Shirt","$20","shirt02"),
        Product("Devslopes Logo Shirt Red","$22","shirt03"),
        Product("Devslopes Hustle Shirt ","$22","shirt04"),
        Product("Kickflip Studios","$18","shirt05")
    )







}