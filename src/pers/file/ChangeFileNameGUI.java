package pers.file;


import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ChangeFileNameGUI extends JFrame {
	public static int start;
	public static int end;
	public static JFrame jFrame;
	public static String pathname;
	public JTextField jTextField_Path;
	public JTextField jTextField_DeletePart;
	public JButton jButton;
	public JPanel jPanel;
	public JLabel jLabel_Path;
	public JLabel jLabel_DeletePart;

	public static void main(String[] args) {
		new ChangeFileNameGUI();

	}

	public ChangeFileNameGUI() {// Swing图像界面
		jFrame = new JFrame("修改文件名称");
		jFrame.setSize(800, 600);
		// jFrame.setLayout(new FlowLayout());

		jPanel = new JPanel();
		jPanel.setLayout(null);

		jLabel_Path = new JLabel("路径:");
		jLabel_Path.setBounds(175, 150, 200, 60);
		jLabel_Path.setFont(new Font("楷体", Font.PLAIN, 40));

		jLabel_DeletePart = new JLabel("删除内容:");
		jLabel_DeletePart.setBounds(95, 250, 200, 60);
		jLabel_DeletePart.setFont(new Font("楷体", Font.PLAIN, 40));

		jTextField_Path = new JTextField(20);
		jTextField_Path.setBounds(280, 150, 350, 50);
		jTextField_Path.setFont(new Font("楷体", Font.PLAIN, 40));

		jTextField_DeletePart = new JTextField(20);
		jTextField_DeletePart.setBounds(280, 250, 350, 50);
		jTextField_DeletePart.setFont(new Font("楷体", Font.PLAIN, 40));

		jButton = new JButton("确定");
		jButton.setFont(new Font("楷体", Font.PLAIN, 40));
		jButton.setBounds(400, 400, 200, 60);
		jButton.addActionListener(new ChangeFileNameTool());//添加控制类
		
		jPanel.add(jLabel_Path);
		jPanel.add(jLabel_DeletePart);

		jPanel.add(jTextField_Path);
		jPanel.add(jTextField_DeletePart);
		jPanel.add(jButton);

		jFrame.add(jPanel);

		jFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);// 设置退出方式
		jFrame.setResizable(false); // 设置窗口不可调
		jFrame.setLocationRelativeTo(null); // 设置窗口出现位置
		jFrame.setVisible(true); // 设置窗口可视
		

	}

}
