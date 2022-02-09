class Item {
    private String name;
    private double price;
    private int position;
    private static int index=0;

    public Item(){
        this("Dummy",5.00);
    }
    public Item(String name, double price){
        this.name=name;
        this.price=price;
        this.position=index;
        index +=1;
    }


    public void getNamePrice(){
        System.out.println(position+" "+name+ " -- "+price);
    }
    
    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public int getPosition(){
        return position;
    }
}
