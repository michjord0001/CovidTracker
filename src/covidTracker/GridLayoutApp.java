package covidTracker;

import java.awt.*;

@SuppressWarnings("serial")
public class GridLayoutApp extends Frame {

        public GridLayoutApp() {
                 super("GridLayout");
                 this.setLayout(new GridLayout(0,3)); 
                
                 Button button1 = new Button("Rotate Left");
                 Button button2 = new Button("Forward");
                 Button button3 = new Button("Rotate Right");
                 Button button4 = new Button("Left");
                 Button button5 = new Button("Backward");
                 Button button6 = new Button("Right");
                 Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL, 50, 10, 0, 100);
                 Label label1 = new Label("Speed Down", Label.RIGHT);
                 Label label2 = new Label("Speed Up", Label.LEFT);
                 Button button7 = new Button("Send Covid-19 Distance Warning");
                 Label label3 = new Label();
                 Button button9 = new Button("SOS: Call for help");
                 
                 add(button1);
                 add(button2);
                 add(button3);
                 add(button4);
                 add(button5);
                 add(button6);
                 add(label1);
                 add(sb);
                 add(label2);
                 add(button7);
                 add(label3);
                 add(button9);
                
                this.pack();
                this.setVisible(true);
        }

        public static void main(String[] args) {
                new GridLayoutApp();
        }
}
