package edu.alenasoft.gildedrose;

public class LegendItemBehaivor implements ItemBehaivor {
    @Override
    public void updateQuality(Item item) {
        item.setQuality(80);
    }
}
