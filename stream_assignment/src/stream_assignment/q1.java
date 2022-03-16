package stream_assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Fruit {
    private String name;
    private int calories;
    private int price;
    private String color;
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public int getCalories() {
		return calories;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';


	
         
}}

public class q1 {
	         
        
    public static List<String> reverseSort(ArrayList<Fruit> fruits) {
    	ArrayList<Fruit> rsv = fruits.stream()
                .filter(p -> p.getCalories() < 100)
                .sorted(Comparator.comparingInt(Fruit::getCalories).reversed())
                .collect(Collectors.toCollection(ArrayList::new));
    	 System.out.println(rsv);
       ArrayList<String> fruitName1 = new ArrayList<>();
       for(Fruit fruit:rsv){
           fruitName1.add(fruit.getName());
       }
        System.out.println(fruitName1);
        return fruitName1;
    	   }  
                        
    	
    public static ArrayList<Fruit> sort(ArrayList<Fruit> Fruits) {
    	Fruits=Fruits.stream()
                .sorted(Comparator.comparing(Fruit::getColor))
                .collect(Collectors.toCollection(ArrayList::new));
    	 System.out.println(Fruits);
        return Fruits;
    }

    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits){
        fruits=fruits.stream()
                .filter(p->p.getColor().equals("red"))
                .sorted(Comparator.comparingInt(Fruit::getPrice))
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(fruits);
        return fruits;
    }

    public static void main(String[] args) {
    	ArrayList<Fruit> fruits=new ArrayList<>();
         fruits.add(new Fruit("Apple",80,120,"red"));
         fruits.add(new Fruit("Orange",300,80,"orange"));
         fruits.add(new Fruit("Grapes",40,60,"green"));
         fruits.add(new Fruit("Banana",120,20,"yellow"));
         fruits.add(new Fruit("Cherry",200,130,"red"));
         fruits.add(new Fruit("Strawberry",700,100,"red"));

    reverseSort(fruits);
    sort(fruits);
    filterRedSortPrice(fruits);
	}       
    
}

