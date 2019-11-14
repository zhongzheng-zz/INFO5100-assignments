package Q2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StudentSystem extends JFrame{
	JButton butAdd, butView;
	JTextField inputName, inputId;
	JComboBox<String> gender;
	JLabel label1, label2, label3;
	JTable studentTable;
	StudentTable table;
	JScrollPane info;
	StudentManagerFile manager;
	
	public StudentSystem() {
		this.setTitle("Student Information System");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label1 = new JLabel("ID:");
		label2 = new JLabel("Name:");
		label3 = new JLabel("Gender:");
		inputName = new JTextField("",20);
		inputId = new JTextField("",20);
		
		gender = new JComboBox<String>();
		gender.addItem("Male");
		gender.addItem("Female");
		gender.addItem("Other");
		butAdd = new JButton("ADD");
		butView = new JButton("VIEW");
		try {
			manager = new StudentManagerFile();
			
		}
		catch(Exception e) {
			
		}
		table = new StudentTable(manager);
		studentTable = new JTable(table);
		info = new JScrollPane(studentTable);
		JPanel basicPanel = new JPanel();
		JPanel inputPanel = new JPanel();
		JPanel butPanel = new JPanel();
		basicPanel.setLayout(new BorderLayout());
		inputPanel.setLayout(new GridLayout(0,2,5,5));
		inputPanel.add(label1);
		inputPanel.add(inputId);
		inputPanel.add(label2);
		inputPanel.add(inputName);
		inputPanel.add(label3);
		inputPanel.add(gender);
		
		butPanel.add(butAdd);
		ListenForButton l = new ListenForButton();
		butAdd.addActionListener(l);
		basicPanel.add(inputPanel,BorderLayout.NORTH);
		basicPanel.add(butPanel, BorderLayout.CENTER);
		basicPanel.add(info, BorderLayout.SOUTH);
		this.add(basicPanel);
		this.setVisible(true);
	}
	
	
	
	private class ListenForButton implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == butAdd) {
				if(inputId.getText().isEmpty() || inputName.getText().isEmpty()) {
					JOptionPane.showMessageDialog(StudentSystem.this, "please input your ID or NAME");
				
				}else {
					String id = inputId.getText();
					String name = inputName.getText();
					String realgender = gender.getSelectedItem().toString();
					try {
						manager.addStudent(new Student(id, name, realgender));
						JOptionPane.showMessageDialog(StudentSystem.this, "Add Successful");
					
					}catch(Exception excep1) {
						JOptionPane.showMessageDialog(StudentSystem.this, excep1.getMessage());
					}
				}
			}
		}
		
	}
	

	public static void main(String[] args) {
		new StudentSystem();


	}

}
