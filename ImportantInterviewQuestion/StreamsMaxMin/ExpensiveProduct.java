import java.util.*;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name=name;
        this.price=price;
    }
    @Override
    public String toString(){
        return "name: "+name+ " price: "+price;
    }
}



public class Main {
    public static void main(String[] args) {
        //Problem:Given a list of Product objects (name, price), find the most expensive product.
        List<Product> list=Arrays.asList(new Product("Pencil", 50.0),
                new Product("Pen",40.0),
                new Product("Eraser", 35.0),
                new Product("NoteBook",100.0));
        System.out.println(list.stream().max(Comparator.comparingDouble(p->p.price)).orElse(null));
        }
}
