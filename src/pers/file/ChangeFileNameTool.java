package pers.file;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

@SuppressWarnings("serial")
public class ChangeFileNameTool implements ActionListener {
	public static int start;
	public static int end;
	public static String pathname;
	public static ChangeFileNameGUI cfng=new ChangeFileNameGUI();

	public static void main(String[] args) {
		new ChangeFileNameTool();

	}

	public void delete(File file, int level, String DeletePart) {// 从0层开始循环递归处理文件
		for (int i = 0; i < level; i++) {
			System.out.print("-");

		}
		
		pathname = file.getPath();
		System.out.println(pathname);
		if (check(file.getName(), DeletePart)) {
			String first = file.getName().substring(0, start);// 取文件名称中要删除的字段的字符首，末位置
			String second = file.getName().substring(end);
			pathname = file.getParent() + "\\" + first + second;
			file.renameTo(new File(pathname)); // 修改名称
		
		}
		File newfile = new File(pathname);
		if (newfile.isDirectory()) { // 循环遍历
			File[] Files = newfile.listFiles();
			for (File file2 : Files) {
				
				delete(file2, level + 1, DeletePart);
			}
		}
	}

	public void ChangeFileName(File file, String DeletePart) {
		delete(file, 0, DeletePart);

	}

	public boolean check(String str, String s) {// 检查是否文件名字中是否存在要删除字符,并求得删除部分的下标
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				if (str.substring(i, j).equals(s)) {
					start = i;
					end = j;
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == cfng.jButton) {
			File file = new File(cfng.jTextField_Path.getText());
			String DeletePart = cfng.jTextField_DeletePart.getText();
			System.out.println(file.getName());
			ChangeFileName(file, DeletePart);
			new ChangeSuccess(cfng.jFrame); // 修改完成，弹出提示框

		}

	}

}
