package com.durgesh;

interface I
{
    String start_from();
    String end_to();
    void set_coordinates(int x,int y);
}
class draw implements I
{
   int x_coordinate,y_coordinate;
   
   public String start_from()
   {
       return "class draw function start_from ("+x_coordinate+","+y_coordinate+")";
   }
   public String end_to()
   {
       return "class draw function end_to ("+x_coordinate+","+y_coordinate+")";
   }
   public void set_coordinates(int x,int y)
   {
       this.x_coordinate = x;
       this.y_coordinate = y;
   }
   public String get_coordinates()
       {
           return "("+x_coordinate +","+y_coordinate+")";
       }
}
class erase implements I
{
    int x_coordinate,y_coordinate;
    
    public String start_from()
   {
       return "class erase function start_from ("+x_coordinate+","+y_coordinate+")";
   }
    public String end_to()
   {
       return "class erase function end_to ("+x_coordinate+","+y_coordinate+")";
   }
    public void set_coordinates(int x,int y)
   {
       this.x_coordinate = x;
       this.y_coordinate = y;
   }
    public String get_coordinates()
       {
           return "("+x_coordinate +","+y_coordinate+")";
       }
}
class pointer implements I
{
   int x, y; 
   private I i=null;
   pointer(I i)
   {
       this.i = i;
   }
   public String start_from(){
       return i.start_from();
   }
   public String end_to()
   {
       return i.end_to();
   }
   public void set_coordinates(int x,int y)
   {
       this.x=x;
       this.y=y;
       
      i.set_coordinates(x,y);
   }
   public void set_I(I i)
   {
       this.i = i;
   }
}

public interface DelegationInterface {
	public static void main(String arg[])
	{
		pointer c=new pointer(new draw());
	    c.set_coordinates(1,1);
	    System.out.println(c.start_from());
	    System.out.println(c.end_to());

	    c.set_I(new erase());
	    c.set_coordinates(-1,-1);
	    System.out.println(c.start_from());
	    System.out.println(c.end_to());
	}

}
