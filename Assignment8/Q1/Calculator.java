package Q1;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Calculator extends JFrame{
	JButton butEqual;
	JLabel label1,label2, label3;
	JTextField input1, input2, textResult;
	JRadioButton plus, minus, mult, divide;
	
	double num1, num2, result;
	
	public Calculator() {
		this.setSize(600, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Calculator");
		
		JPanel basicPanel = new JPanel();
		butEqual = new JButton("=");
		ListenForButton l = new ListenForButton();
		butEqual.addActionListener(l);
		
		label1 = new JLabel("Number 1");
		basicPanel.add(label1);
		input1 = new JTextField("", 10);
		basicPanel.add(input1);
		label2 = new JLabel("Number 2");
		basicPanel.add(label2);
		input2 = new JTextField("", 10);
		basicPanel.add(input2);
		plus = new JRadioButton("Plus");
		minus = new JRadioButton("Minus");
		mult = new JRadioButton("Mult");
		divide = new JRadioButton("Divide");
		ButtonGroup operation = new ButtonGroup();
		operation.add(plus);
		operation.add(minus);
		operation.add(mult);
		operation.add(divide);
		JPanel operPanel = new JPanel();
		Border operBorder = BorderFactory.createTitledBorder("Choice");
		operPanel.setBorder(operBorder);
		operPanel.add(plus);
		operPanel.add(minus);
		operPanel.add(mult);
		operPanel.add(divide);
		plus.setSelected(true);
		basicPanel.add(operPanel);
		basicPanel.add(butEqual);
		JPanel resPanel = new JPanel();
		label3 = new JLabel("result");
		resPanel.add(label3);
		textResult = new JTextField("", 20);
		resPanel.add(textResult);
		basicPanel.add(resPanel);	
		this.add(basicPanel);
		this.setVisible(true);
	}
	
	private class ListenForButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == butEqual) {
				try {
					num1 = Double.parseDouble(input1.getText());
					num2 = Double.parseDouble(input2.getText());
				}catch(NumberFormatException excep) {
					JOptionPane.showMessageDialog(Calculator.this, "there is something wrong with your input, please check");
					textResult.setText("Error");
					return;
				}
			}
			if(plus.isSelected()) {
				result = num1 + num2;
			}else if(minus.isSelected()) {
				result =  num1 - num2;
			}else if(mult.isSelected()) {
				result = num1 * num2;
			}else {
					result = num1 / num2;
			}
			textResult.setText(Double.toString(result));
	    }
	}
	public static void main(String[] args) {
		new Calculator();
	}

}
