package com.test.question;

import java.util.Calendar;

public class Q097 {
	public static void main(String[] args) {
		Refrigerator r = new Refrigerator();

		Item item1 = new Item();
		item1.setName("김치");
		item1.setExpiration("2024-01-30");
		r.add(item1);//냉장고에 넣기

		Item item2 = new Item();
		item2.setName("깍두기");
		item2.setExpiration("2024-01-23");
		r.add(item2);//냉장고에 넣기

		Item item3 = new Item();
		item3.setName("멸치볶음");
		item3.setExpiration("2024-01-25");
		r.add(item3);//냉장고에 넣기

		Item item4 = r.get("깍두기");//냉장고에서 꺼내기
		System.out.printf("%s의 유통기한 : %s\n", item4.getName(), item4.getExpiration());

		System.out.printf("냉장고 안의 총 아이템 개수 : %d개\n", r.count());

		r.listItem();
	}
}
class Refrigerator {
	private Item[] items = new Item[100];
	private int item_count = 0;

	public void add(Item item) {
		items[item_count++] = item;
		System.out.printf("\'%s\'를 냉장고에 넣었습니다.\n",item.getName());
	}
	
	public Item get(String name) {
		System.out.println();
		Item outItem = new Item();
		for(int i=0; i<item_count; i++) {
			if(items[i].getName().equals(name)) {
				outItem = items[i];
				items[i] = items[item_count-1];
				items[item_count-1] = null;
				item_count--;
			}
		}
		return outItem;
	}
	
	public int count() {
		return item_count;
	}

	public void listItem() {
		System.out.println();
		System.out.println("[냉장고 아이템 목록]");
		for(int i=0; i<item_count; i++) {
			System.out.printf("%s(%s)\n",items[i].getName(), items[i].getExpiration());
		}
	}
}

class Item {
	private String name;
	private Calendar expiration;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpiration() {
		String tmp = String.format("%d-%02d-%02d",
				expiration.get(Calendar.YEAR),
				expiration.get(Calendar.MONTH),
				expiration.get(Calendar.DAY_OF_MONTH));
		return tmp;
	}
	public void setExpiration(String expiration) {
		this.expiration = Calendar.getInstance();
		String[] list = expiration.split("-");
		int receiveYear = Integer.parseInt(list[0]);
		int receiveMonth = Integer.parseInt(list[1]);
		int receiveDay = Integer.parseInt(list[2]);
		this.expiration.set(receiveYear,receiveMonth,receiveDay);
	}
}