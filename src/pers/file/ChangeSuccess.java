package pers.file;

import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ChangeSuccess extends JDialog {
	public static JDialog dialogChengGong = new JDialog(ChangeFileNameGUI.jFrame, "成功", true);
	public ChangeSuccess(JFrame jFrame) {

		dialogChengGong.setSize(300, 150);
		Panel panel = new Panel();
		panel.setLayout(null);

		JLabel jLabel = new JLabel("成功修改");
		jLabel.setFont(new Font("楷体", Font.PLAIN, 30));
		jLabel.setBounds(80, 0, 200, 60);

		
		JButton jButton=new JButton("确定");
		jButton.setBounds(110, 60, 60, 30);
		
		panel.add(jLabel);
		panel.add(jButton);
		jButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dialogChengGong.dispose();
			}
		});
		
		
		dialogChengGong.add(panel);
		dialogChengGong.setLocationRelativeTo(null);
		dialogChengGong.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		dialogChengGong.setVisible(true);
	}
	public static void main(String[] args) {
		new ChangeSuccess(ChangeFileNameGUI.jFrame);
	}
	
}
