import java.awt.*;
class label extends Frame
{
Label l1;
public label()
{
setLayout(new FlowLayout());
l1=new Label("AWT programing");
add(l1);
pack();
setVisible(true);
}
public static void main(String args[])
{
label obj=new label();
}
}