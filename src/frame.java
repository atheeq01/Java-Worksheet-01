import javax.swing.*;

public class frame {
    public static void main(String[] args){
        JFrame window= new JFrame();
        window.setSize(300,200);
        window.setLocation(50,100);
        window.setVisible(true);
        window.setTitle("My First Frame");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
