public class fan
{
 String S;
 String F;
 int i;
float j;
 public fan()
 {
 }
 fan(String S,int i)
 {
  this.S=S;
  this.i=i;
  System.out.println("fan is ON:" +S+","+i);
 }
 fan(String F,float j)
 {
  this.F=F;
  this.j=j;
  System.out.println("fan is OFF:" +F+","+j);
 }
 private String Fast;
public String getFast()
{
 return Fast;
}
public void setFast(String newFast)
{
}  
 private String Medium;
public String getMedium()
{
 return Medium;
}
public void setMedium(String newMedium)
{
}  
 private String Slow; 
public String getSlow()
{
 return Slow;
}
public void setSlow(String newSlow)
{
} 
public static void main (String[]args)
{
  fan obj=new fan();
  fan obj1=new fan("yellow",10);
  fan obj2=new fan("blue",5.5f);
}
}