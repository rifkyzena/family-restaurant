package familyrestaurant;
public abstract class Menu {
    protected String code;
    protected String name;
    protected int price;

    public Menu(String code, String name, int price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public abstract String getCode();

    public abstract void setCode(String code);

    public abstract String getName();

    public abstract void setName(String name);

    public abstract int getPrice();

    public abstract void setPrice(int price);
    
}
