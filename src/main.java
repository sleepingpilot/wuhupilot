public class main 
{
    public static void main (String [] args){
        //练习1-1：创建一个圆，然后创建一个正方形
    	Circle circle1 = new Circle ();
        Square square1 = new Square();
        
         circle1.makeVisible(); //出现一个窗口，中间一个蓝色圆
         circle1.moveVertical(-90);
         circle1.moveHorizontal(-70);
       
        
    }
}