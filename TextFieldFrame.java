package textfieldtest;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame{
	private  JTextField TextField1;
	private  JTextField TextField2;
	private  JTextField TextField3;
	private  JPasswordField PasswordField;


  public TextFieldFrame(){
	super("Testando JTextField e JPasswordField");
	setLayout(new FlowLayout());
	
	TextField1= new JTextField(10);
	add(TextField1);

	TextField2=new JTextField("adicione o texto aqui");
	add(TextField2);

	TextField3=new JTextField("textfield não editável",21);
	TextField3.setEditable(false);
	add(TextField3);

	PasswordField=new JPasswordField("texto escondido");
	add(PasswordField);

	TextFieldHandler handler = new TextFieldHandler();
	TextField1.addActionListener(handler);
	TextField2.addActionListener(handler);
	TextField3.addActionListener(handler);
	PasswordField.addActionListener(handler);
}

private class TextFieldHandler implements ActionListener{

	public void actionPerfomed(ActionEvent event){

	String string="";
      
	
	if(event.getSource()==TextField1)
		string=String.format("textField1:%s",event.getActionCommand());
		
	else if(event.getSource()==TextField2)
		string=String.format("textField2:%s",event.getActionCommand());
		
	else if(event.getSource()==TextField3)
		string=String.format("textField2:%s",event.getActionCommand());
	else if(event.getSource()==PasswordField)
		string=String.format("passwordField2:%s",event.getActionCommand());
			
	JOptionPane.showMessageDialog(null,string);
	   
		}

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

            }
    }


