package cse557;
import java.awt.*;  
class MenuExample  
{  
     MenuExample(){  
         Frame f= new Frame("Menu and MenuItem Example");  
         MenuBar mb=new MenuBar();  
         Menu menu=new Menu("CSE");  
         Menu submenu1=new Menu("Fourth year");  
         MenuItem i1=new MenuItem("First year");  
         MenuItem i2=new MenuItem("second year");  
         MenuItem i3=new MenuItem("Thired year");  
          
         MenuItem i4=new MenuItem("Section A"); 
         MenuItem i5=new MenuItem("Section B"); 
         MenuItem i6=new MenuItem("Section C"); 
         menu.add(i1);  
         menu.add(i2);  
         menu.add(i3);  
         submenu1.add(i4);  
         submenu1.add(i5);  
         submenu1.add(i6); 
         menu.add(submenu1);  
         mb.add(menu);  
         f.setMenuBar(mb);  
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true);  
}  
public static void main(String args[])  
{  
new MenuExample();  
}  
}  
 