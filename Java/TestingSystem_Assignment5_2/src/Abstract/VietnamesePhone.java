package Abstract;

import java.util.Scanner;


public abstract class VietnamesePhone extends Phone{
	
	private Scanner scanner;
	
	public VietnamesePhone() {
		super();
		scanner = new Scanner(System.in);
	}
	
	public void insertContact(String name, String phone) {
		Contact contact = new Contact(name, phone);
		phones.add(contact);
	}
	
	public void removeContact(String name) {
		if(phones.size() == 0) {
			System.out.println("Danh sach rong!!!");
		}
		String[] nameSplit = name.split(" ");
		int length = nameSplit.length;
		int count = 0;
		for(Contact phone: phones) {
			for(int i = 0; i < length; i++) {
				if(phone.getName().contains(nameSplit[i])) {
					count++;
				}
			}
			if(count == length) {
				System.out.println("Tim thay va xoa thanh cong!");
				phones.remove(phone);
			}
			else count = 0;
		}
		System.out.println("Khong tim thay trong danh sach");
	}
	
	public void updateContact(String name, String newPhone) {
		String[] nameSplit = name.split(" ");
		int length = nameSplit.length;
		int count = 0;
		for(Contact phone: phones) {
			for(int i = 0; i < length; i++) {
				if(phone.getName().contains(nameSplit[i])) {
					count++;
				}
			}
			if(count == length) {
				System.out.println("Cap nhat thanh cong!");
				phone.setNumber(newPhone);
			}
			else count = 0;
		}
		System.out.println("Khong tim thay trong danh sach");
	}
	
	public void searchContact(String name) {
		String[] nameSplit = name.split(" ");
		int length = nameSplit.length;
		int count = 0;
		for(Contact phone: phones) {
			for(int i = 0; i < length; i++) {
				if(phone.getName().contains(nameSplit[i])) {
					count++;
				}
			}
			if(count == length) {
				System.out.println("Tim kiem thanh cong!");
				System.out.println(phone.toString());
			}
			else count = 0;
		}
		System.out.println("Khong tim thay trong danh sach");
	}
	
}
