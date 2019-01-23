
package mountainmovers;


public class Mountainmovers {

private String Name;
    private String Day ;
    private String Hour;
    private String Mobile;
    
    
    public Mountainmovers(String  Name,String Day,String Hour,String Mobile)
    {
        this.Name= Name;
        this.Day = Day;
        this.Hour= Hour;
        this.Mobile =Mobile;
    }
    
    public String getName()
    {
        return Name;
    }
    
    public String getDay()
    {
        return Day;
    }
    
    public String getHour()
    {
        return Hour;
    }
    
    public String getMobile()
    {
        return Mobile;
    }
}
