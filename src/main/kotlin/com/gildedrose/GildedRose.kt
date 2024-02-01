package com.gildedrose

class GildedRose(var items: List<Item>) {
    private val BRIE = "Aged Brie"
    private val SULFURAS = "Sulfuras, Hand of Ragnaros"
    private val BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert"

    fun updateQuality() {
        items.forEach { item ->
            if (item.name != BRIE && item.name != BACKSTAGE) {
                if (item.quality > 0 && item.name != SULFURAS) {
                    item.quality -= 1
                }
            } else {
                if (item.quality < 50) {
                    item.quality += 1

                    if (item.name == BACKSTAGE) {
                        if (item.sellIn < 11 && item.quality < 50) {
                            item.quality += 1
                        }

                        if (item.sellIn < 6 && item.quality < 50) {
                            item.quality += 1
                        }
                    }
                }
            }

            if (item.name != SULFURAS) {
                item.sellIn -= 1
            }

            if (item.sellIn < 0) {
                if (item.name != BRIE) {
                    if (item.name != BACKSTAGE) {
                        if (item.quality > 0 && item.name != SULFURAS) {
                            item.quality -= 1
                        }
                    } else {
                        item.quality = 0
                    }
                } else if (item.quality < 50) {
                    item.quality += 1
                }
            }
        }
    }

}

