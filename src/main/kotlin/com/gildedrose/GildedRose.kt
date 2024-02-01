package com.gildedrose

class GildedRose(var items: List<Item>) {

    private val brie = "Aged Brie"
    private val sulfuras = "Sulfuras, Hand of Ragnaros"
    private val backstage = "Backstage passes to a TAFKAL80ETC concert"
    private val specialItems = listOf(brie, sulfuras, backstage)


    fun updateQuality() {
        items.forEach { item ->

            when (item.name) {
                brie -> increaseQuality(item)
                backstage -> increaseQualityForBackstage(item)
                sulfuras -> increaseQuality(item)
                else -> decreaseQuality(item)
            }


            //SELL IN

            if (item.name != sulfuras) {
                item.sellIn -= 1
            }

            if (item.sellIn < 0) {
                if (item.name != brie) {
                    if (item.name != backstage) {
                        if (item.quality > 0 && item.name != sulfuras) {
                            decreaseQuality(item)
                        }
                    } else {
                        item.quality = 0
                    }
                } else if (item.quality < 50) {
                    increaseQuality(item)
                }
            }
        }
    }

    private fun decreaseQuality(item: Item) {
        if (item.quality > 0) {
            item.quality -= 1
        }
    }

    private fun increaseQualityForBackstage(item: Item) {
            increaseQuality(item)
            if (item.sellIn < 11) {
                increaseQuality(item)
            }
            if (item.sellIn < 6) {
                increaseQuality(item)
            }
    }

    private fun increaseQuality(item: Item) {
        if (item.quality < 50) {
            item.quality += 1
        }

}
}

