import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIJFrame extends JFrame{
    
    private JLabel item1;
    
    public GUIJFrame(){
        super("The Title Bar");
        setLayout (new FlowLayout());
        
        item1 = new JLabel("This is a sentence");
        item1.setToolTipText("This will show up when you hover");
        add(item1);
        
    
    
}
}
