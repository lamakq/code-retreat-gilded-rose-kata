package com.gildedrose;

public class AgedBrie extends InventoryItem {
    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    public void adjustDailyQuality() {
        InventoryItem.incrementQualityBySingleStep(this);
    }
}