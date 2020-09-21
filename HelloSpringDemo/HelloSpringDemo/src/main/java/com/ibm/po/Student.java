package com.ibm.po;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
public class Student {
	private String name;
    private Address address;
    private String[] books;
    private List<String> hobbys;
    private Map<String,String> card;
    private Set<String> games;
    private String wife;
    private Properties info;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String[] getBooks() {
		return books;
	}
	public void setBooks(String[] books) {
		this.books = books;
	}
	public List<String> getHobbys() {
		return hobbys;
	}
	public void setHobbys(List<String> hobbys) {
		this.hobbys = hobbys;
	}
	public Map<String, String> getCard() {
		return card;
	}
	public void setCard(Map<String, String> card) {
		this.card = card;
	}
	public Set<String> getGames() {
		return games;
	}
	public void setGames(Set<String> games) {
		this.games = games;
	}
	public String getWife() {
		return wife;
	}
	public void setWife(String wife) {
		this.wife = wife;
	}
	public Properties getInfo() {
		return info;
	}
	public void setInfo(Properties info) {
		this.info = info;
	}
	public void show(){
        System.out.println("name="+ name
                + ",address="+ address.getAddress()
                + ",books="
       );
        
        if(books != null) {
        	for (String book:books){
                System.out.print("<<"+book+">>\t");
           }
        }
        
        System.out.println("\n爱好:"+hobbys);

        System.out.println("card:"+card);

        System.out.println("games:"+games);

        System.out.println("wife:"+wife);

        System.out.println("info:"+info);

   }
}