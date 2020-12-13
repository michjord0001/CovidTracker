package covidTracker;

import java.awt.*;

@SuppressWarnings("serial")
public class ComponentApplication extends Frame {
	
        public ComponentApplication() {
                super("Input Application");
                this.setLayout(new FlowLayout());               
                
               
                
                //String Name
                Label l = new Label("Robot Name:");
                this.add(l);
                TextField t = new TextField("Robot 1",30);
                this.add(t);
                

                Choice choice = new Choice();
                choice.addItem("Role 1");
                choice.addItem("Role 2");
                choice.addItem("Role 3");
                this.add(choice);
                
                Checkbox cb1 = new Checkbox("hasConnection");
                this.add(cb1);
                Checkbox cb2 = new Checkbox("hasPower");
                this.add(cb2);
                Checkbox cb3 = new Checkbox("hasInfection");
                this.add(cb3);
                

                
                Button b = new Button("Submit");
                this.add(b);
                
                this.pack();
                this.setVisible(true);
        }

        public static void main(String[] args) {
                new ComponentApplication();
        }
}