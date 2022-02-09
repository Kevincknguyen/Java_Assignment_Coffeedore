import java.util.ArrayList;

class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;


    public Order(String name){
        this.name=name;
        this.ready=false;
        this.items=new ArrayList<Item>();
    }

    public void addItem(Item input){
        items.add(input);
    }
    
    public void getOrderDetails(){
        System.out.println("------------Order Details:---------------");
        System.out.println("Order name: "+name);
        System.out.println("Delivery Status: "+ready);
        for (int i=0;i<items.size();i++){
            System.out.println("Item " + i +" details");

            items.get(i).getNamePrice();
        }
        getOrderTotal();
    }

    


    public double getOrderTotal(){
        System.out.println("------------Order Total Cost:---------------");
        double sum=0;
        for (int i=0;i<items.size();i++){
            // System.out.println(items.get(i).getNamePrice());
            double test= items.get(i).getPrice();
            System.out.println("Item "+i+ " cost: "+ test);
            sum += test;
        }
        System.out.println("Your total sum:" + sum);
        return sum;
    }


}