

public class TestOrders {
    public static void main(String[] args){
        CoffeeKiosk coffeekiosk=new CoffeeKiosk();
        coffeekiosk.addMenuItem("Latte",5.00);
        coffeekiosk.addMenuItem("Mocha",7.00);
        coffeekiosk.addMenuItem("Coffee",3.00);
        coffeekiosk.addMenuItem("Pumpkin spice latter",6.00);
        coffeekiosk.addMenuItembyInput();
        coffeekiosk.displayMenu();
        coffeekiosk.newOrder();
        coffeekiosk.getAllOrders();

    }
}

