package com.gildedrose

class GildedRose(var items: List<Item>) {

    fun updateQuality() {
        items.forEach { item ->
            if (item.name != "Aged Brie" && item.name != "Backstage passes to a TAFKAL80ETC concert") {
                updateQualityOfSulfuras(item)
            } else {
                updateQualityIfLessThan50(item)
            }

            if (item.name != "Sulfuras, Hand of Ragnaros") {
                item.sellIn = item.sellIn - 1
            }

            if (item.sellIn < 0) {
                if (item.name != "Aged Brie") {
                    if (item.name != "Backstage passes to a TAFKAL80ETC concert") {
                        updateQualityOfSulfuras(item)
                    } else {
                        item.quality = item.quality - item.quality
                    }
                } else {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1
                    }
                }
            }
        }
    }

    private fun updateQualityIfLessThan50(item: Item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1

            if (item.name == "Backstage passes to a TAFKAL80ETC concert") {
                if (item.sellIn < 11) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1
                    }
                }

                if (item.sellIn < 6) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1
                    }
                }
            }
        }
    }

    private fun updateQualityOfSulfuras(item: Item) {
        if (item.quality > 0) {
            if (item.name != "Sulfuras, Hand of Ragnaros") {
                item.quality = item.quality - 1
            }
        }
    }

}

