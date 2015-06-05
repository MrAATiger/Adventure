package text.adventure.game.creatures.player;

import java.util.List;

import text.adventure.game.items.Item;

public class Inventar {

	private static final int MAX_STACKS = 99;
	
	private int maxWeight;
	private int currentWeight;
	
	private List<InventoryItem> items;
	
	public Inventar(int maxWeight){
		this.maxWeight = maxWeight;
	}
	
	public List<InventoryItem> getItems(){
		return items;
	}
	
	public boolean containsItem(Item item){
		for(InventoryItem value:items){
			if(value.item.equals(item)){
				return true;
			}
		}
		
		return false;
	}

	/**
	 * 
	 * @param item
	 * @param forceRemove
	 * @return null wenn das item nicht gefunden wurde
	 * @throws NotRemoveAbleItem falls das Item nicht entfernt werden darf
	 */
	public Item removeItem(Item item, boolean forceRemove) throws NotRemoveAbleItem{
		
		for(int a = (items.size() - 1); a >= 0;a--){
			InventoryItem value = items.get(a);
			if(value.item.equals(item)){
				if(!value.removeAble && ! forceRemove){
					throw new NotRemoveAbleItem();
				}
				
				this.currentWeight -= value.item.getWeight();
				
				if(value.amount > 1){
					value.amount--;
				} else {
					this.items.remove(value);
				}
				
				return value.item;
			}
		}
		
		return null;
	}
	/**
	 * 
	 * @param item
	 * @param removeAble
	 * @return false wenn das Item zu schwer ist
	 */
	public boolean addItem(Item item, boolean removeAble){
	
		if((this.currentWeight + item.getWeight()) > maxWeight){
			return false;
		}
		
		this.currentWeight += item.getWeight();
		
		if(!removeAble){
			items.add(new InventoryItem(item, false));			
			return true;
		}
		
		for(InventoryItem value: items){
			if(value.item.equals(item)){
				
				if(value.amount < MAX_STACKS){
					value.amount++;
					return true;
				} 
				
			}
		}
		
		items.add(new InventoryItem(item, true));
		
		return true;
	}
	
	public class InventoryItem{

		public Item item;
		public int amount;
		public boolean removeAble;
		
		public InventoryItem(Item item, boolean removeAble) {
			this.item = item;
			this.amount = 1;
			this.removeAble = removeAble;
		}
		
	}
	
	public class NotRemoveAbleItem extends Exception {

		private static final long serialVersionUID = 7075872504886920197L;

	}
	
}
