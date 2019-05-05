package hotelmanagement;
public class Room {
  
    private int id;
    private String name;
    private float price;
    private String property; 
    private byte[] picture;
      

public Room(int pid, String pname, float pprice, String pAddDate, byte[] pimg)
    {
        this.id = pid;
        this.name = pname;
        this.price = pprice;
        this.picture = pimg;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public float getPrice()
    {
        return price;
    }
    
    public String getProperty()
    {
        return  property;
    }
    
    public byte[] getImage()
    {
        return picture;
    }
    
}


