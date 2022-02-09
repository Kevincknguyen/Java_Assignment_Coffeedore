import java.util.ArrayList;


class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk(){
        this.menu=new ArrayList<Item>();
        this.orders=new ArrayList<Order>();
    }

    public void addMenuItem(String name, double price){
        Item item= new Item(name,price);
        menu.add(item);
    }

    public void addMenuItembyInput(){
        System.out.println("Please enter name of new product");
        String name=System.console().readLine();
        System.out.println("Please enter price of new product");
        String price=System.console().readLine();
        Item item= new Item(name,Double.parseDouble(price));
        menu.add(item);
    }

    public void displayMenu(){
        for (Item item:menu){
            item.getNamePrice();
        }
    }

    public void addOrder(Order input){
        orders.add(input);
    }


    public void getAllOrders(){
        System.out.println("All orders in current queue");
        for (Order order:orders){
            order.getOrderDetails();
        }
    }
    public void newOrder(){
        System.out.println("Please enter customer name for new order:");
        String name=System.console().readLine();

        System.out.println("Welcome "+name+"...please choose available items from the menu");
        System.out.println("Please enter item menu by index one at a time. Enter q when ready to disengage");

        Order currentOrder= new Order(name);
        System.out.println("TEST"+currentOrder);
        displayMenu();
        
        String itemNumber=System.console().readLine();
        while(!itemNumber.equals("q")){
            for (Item item:menu){
                if (Integer.parseInt(itemNumber)==item.getPosition()) {
                    System.out.println("It is here");
                    item.getNamePrice();
                    currentOrder.addItem(item);
                }
            }
            itemNumber=  System.console().readLine();
        }
        System.out.println("Have a nice day");
        addOrder(currentOrder);
        System.out.println(orders);

    }
}
