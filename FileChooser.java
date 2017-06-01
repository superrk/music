package com.rking.a3;  
  
import java.awt.Font;
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import java.io.File;  
  
import javax.swing.*;  
  
  
@SuppressWarnings("serial")
public class FileChooser extends JFrame implements ActionListener{  
    JButton open=null;
    int i=0,j=44100;
    
    public static void main(String[] args) {  
        new FileChooser();  
    }  
    public FileChooser(){  
        open=new JButton("打开文件");
        this.setTitle("播放界面 ");
        this.add(open);
        this.setFocusable(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(null);
        open.setBounds(10, 10, 100, 100);
        this.setBounds(400, 20, 520, 200); 
        Font f=new Font("华文新魏",Font.PLAIN,20);
        JTextField jt=new JTextField();               
        jt.setBounds(200, 10, 100, 100);
        jt.setFont(f);
        this.add(jt);                       //起始进度
        JLabel jl=new JLabel("起始进度");
        jl.setFont(f);
        jl.setBounds(120, 10, 100, 100);
        this.add(jl);
        JTextField jt2=new JTextField();
        jt2.setFont(f);
        jt2.setBounds(400, 10, 100, 100);        
        this.add(jt2);                     //每秒采样数目
        JLabel jl2=new JLabel("采样数目");
        jl2.setFont(f);
        jl2.setBounds(320, 10, 100, 100);
        this.add(jl2);
        this.setResizable(false);
        this.setVisible(true);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        jt.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
                  i=Integer.parseInt(jt.getText());
    				System.out.println(i);
    			}
    		});
        jt2.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
                   j=Integer.parseInt(jt2.getText());
    				System.out.println(j);
    			}
    		});
        open.addActionListener(this);  
    }  
    @Override  
    public void actionPerformed(ActionEvent e) {  
        // TODO Auto-generated method stub  
        JFileChooser jfc=new JFileChooser(new File("F:\\语音文件"));  
        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );
        jfc.setMultiSelectionEnabled(true);  
        jfc.showDialog(new JLabel(), "选择");  
        File file=jfc.getSelectedFile();

        MyRecord.play(file,i,j);
        
        
        
//        if(file.isDirectory()){  
//            System.out.println("文件夹:"+file.getAbsolutePath());  
//        }else if(file.isFile()){  
//            System.out.println("文件:"+file.getAbsolutePath());  
//        }  
//        System.out.println(jfc.getSelectedFile().getName());  
          
    }  
  
} 