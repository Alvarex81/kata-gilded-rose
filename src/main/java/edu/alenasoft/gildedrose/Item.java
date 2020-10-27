package edu.alenasoft.gildedrose;

public class Item
{

  private String name;
  private int sellIn;
  private int quality;
  private ItemBehaivor itemBehaivor;

  public Item (String name, int sellIn, int quality)
  {
    this.name = name;
    this.sellIn = sellIn;
    this.quality = quality;

    switch (name){
      case "Aged Brie":
        itemBehaivor = new AgingItemBehaivor();
        break;
      case "Sulfuras, Hand of Ragnaros":
        itemBehaivor = new LegendItemBehaivor();
        break;
      case "Backstage passes to a TAFKAL80ETC concert":
        itemBehaivor = new AgingItemBehaivor();
        break;
      case "Conjured Mana Cake":
        itemBehaivor = new ConjuredItemBehaivor();
        break;
      default:
        itemBehaivor = new RegularItemBehaivor();
        break;
    }

  }

  public String getName() {
    return this.name;
  }
  public int getSellIn() { return this.sellIn; }
  public int getQuality() {
    return this.quality;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setSellIn(int sellIn) {
    this.sellIn = sellIn;
  }
  public void setQuality(int quality) {
    this.quality = quality;
  }

  @Override
  public String toString() {
    return "Item{" + "name='" + name + '\'' + ", sellIn=" + sellIn + ", quality=" + quality + '}';
  }

  public void updateQuality () {itemBehaivor.updateQuality(this);}

  public void validateQualityRange () {
    if (this.getQuality() < 0) {this.setQuality(0);}
    if (this.getQuality() > 50) {this.setQuality(50);}
  }
}
