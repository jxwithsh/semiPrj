package Store;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import Store.Store;

class ShoppingCart extends JFrame implements ActionListener {
	
	Toolkit kit = Toolkit.getDefaultToolkit();
	Dimension screenSize = kit.getScreenSize();
	Image imgi = kit.getImage(".\\src\\img\\team1.png");
	ImageIcon imgsZ;
	Font f=new Font("", Font.BOLD, 16);
	JTextField txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12,txt13;
	Videomodel model;
	
	public ShoppingCart() {
		
			txt1=new JTextField(27);
			txt2=new JTextField(27);
			txt3=new JTextField(27);
			txt4=new JTextField(27);
			txt5=new JTextField(27);
			txt6=new JTextField(27);
			txt7=new JTextField(27);
			txt8=new JTextField(27);
			txt9=new JTextField(27);
			txt10=new JTextField(27);
			txt11=new JTextField(27);
			txt12=new JTextField(27);
			txt13=new JTextField(27);
			
			txt1.setFont(f);
			txt2.setFont(f);
			txt3.setFont(f);
			txt4.setFont(f);
			txt5.setFont(f);
			txt6.setFont(f);
			txt7.setFont(f);
			txt8.setFont(f);
			txt9.setFont(f);
			txt10.setFont(f);
			txt11.setFont(f);
			txt12.setFont(f);
			txt13.setFont(f);
			
			txt1.setForeground(Color.white);
			txt2.setForeground(Color.white);
			txt3.setForeground(Color.white);
			txt4.setForeground(Color.white);
			txt5.setForeground(Color.white);
			txt6.setForeground(Color.white);
			txt7.setForeground(Color.white);
			txt8.setForeground(Color.white);
			txt9.setForeground(Color.white);
			txt10.setForeground(Color.white);
			txt11.setForeground(Color.white);
			txt12.setForeground(Color.white);
			txt13.setForeground(Color.white);
			
			txt1.setBorder(new LineBorder(Color.black, 1));
			txt2.setBorder(new LineBorder(Color.black, 1));
			txt3.setBorder(new LineBorder(Color.black, 1));
			txt4.setBorder(new LineBorder(Color.black, 1));
			txt5.setBorder(new LineBorder(Color.black, 1));
			txt6.setBorder(new LineBorder(Color.black, 1));
			txt7.setBorder(new LineBorder(Color.black, 1));
			txt8.setBorder(new LineBorder(Color.black, 1));
			txt9.setBorder(new LineBorder(Color.black, 1));
			txt10.setBorder(new LineBorder(Color.black, 1));
			txt11.setBorder(new LineBorder(Color.black, 1));
			txt12.setBorder(new LineBorder(Color.black, 1));
			txt13.setBorder(new LineBorder(Color.black, 1));
			
			
			
			
			JFrame ShoppingCartf= new JFrame();
			ShoppingCartf.setTitle("Library");
			ShoppingCartf.setSize(500, 500);
			ShoppingCartf.setLocation(1167, 379);
			ShoppingCartf.setVisible(true);
			ShoppingCartf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ShoppingCartf.setIconImage(imgi);
			
			//패널만들기
			JPanel storep0=new JPanel(new GridLayout(16, 1));
				Color storec0001=new Color(35 ,45 ,75);
				storep0.setBackground(storec0001);
				storep0.setPreferredSize(new Dimension(380, 550));
				ShoppingCartf.getContentPane().add(storep0);
				ShoppingCartf.pack();
			
				
				
				
			//로고패널
			JPanel storepZ=new JPanel();
					storep0.add(storepZ);
					storepZ.setPreferredSize(new Dimension(1, 1));
			Color storec00Z=new Color(23 ,26 ,33);
					storepZ.setBackground(storec00Z);
			JLabel storelZ=new JLabel("라이브러리",JLabel.CENTER);
					storelZ.setVerticalTextPosition(JLabel.CENTER);
					storelZ.setHorizontalTextPosition(JLabel.LEFT);
					storepZ.add(storelZ);
			Font storefZ=new Font("Dialog", Font.BOLD, 14);
					storelZ.setFont(storefZ);
			Color storecZ=new Color(255,255,255);
			Color storec0Z=new Color(35 ,45 ,75);
					storelZ.setForeground(storecZ);
					storelZ.setBackground(storec0Z);
					storelZ.setOpaque(true);
			
			//빈패널	
			JPanel storepZ1=new JPanel();
					storep0.add(storepZ1);
					storepZ1.setPreferredSize(new Dimension(1, 1));
			Color storec00Z1=new Color(35 ,45 ,75);
					storepZ1.setBackground(storec00Z1);
			JLabel storelZ1=new JLabel(" ",JLabel.CENTER);
					storelZ1.setVerticalTextPosition(JLabel.CENTER);
					storelZ1.setHorizontalTextPosition(JLabel.LEFT);
					storepZ1.add(storelZ1);
			Font storefZ1=new Font("Dialog", Font.BOLD, 14);
					storelZ1.setFont(storefZ1);
			Color storecZ1=new Color(255,255,255);
			Color storec0Z1=new Color(35 ,45 ,75);
					storelZ1.setForeground(storecZ1);
					storelZ1.setBackground(storec0Z1);
					storelZ1.setOpaque(true);
					
					
			//담기패널
			JPanel storeps1=new JPanel();
				storep0.add(storeps1);
			Color storec001=new Color(35 ,45 ,75);
				storeps1.setBackground(storec001);
				storeps1.add(txt1);
				txt1.setOpaque(false);
				
			JPanel storeps2=new JPanel();
				storep0.add(storeps2);
			Color storec002=new Color(35 ,45 ,75);
				storeps2.setBackground(storec002);
				storeps2.add(txt2);
				txt2.setOpaque(false);
				
			JPanel storeps3=new JPanel();
				storep0.add(storeps3);
			Color storec003=new Color(35 ,45 ,75);
				storeps3.setBackground(storec003);
				storeps3.add(txt3);
				txt3.setOpaque(false);
				
			JPanel storeps4=new JPanel();
				storep0.add(storeps4);
			Color storec004=new Color(35 ,45 ,75);
				storeps4.setBackground(storec004);
				storeps4.add(txt4);
				txt4.setOpaque(false);
				
			JPanel storeps5=new JPanel();
				storep0.add(storeps5);
			Color storec005=new Color(35 ,45 ,75);
				storeps5.setBackground(storec005);
				storeps5.add(txt5);
				txt5.setOpaque(false);
				
			JPanel storeps6=new JPanel();
				storep0.add(storeps6);
			Color storec006=new Color(35 ,45 ,75);
				storeps6.setBackground(storec006);
				storeps6.add(txt6);
				txt6.setOpaque(false);
				
			JPanel storeps7=new JPanel();
				storep0.add(storeps7);
			Color storec007=new Color(35 ,45 ,75);
				storeps7.setBackground(storec007);
				storeps7.add(txt7);
				txt7.setOpaque(false);
				
			JPanel storeps8=new JPanel();
				storep0.add(storeps8);
			Color storec008=new Color(35 ,45 ,75);
				storeps8.setBackground(storec008);
				storeps8.add(txt8);
				txt8.setOpaque(false);
				
			JPanel storeps9=new JPanel();
				storep0.add(storeps9);
			Color storec009=new Color(35 ,45 ,75);
				storeps9.setBackground(storec009);
				storeps9.add(txt9);
				txt9.setOpaque(false);
				
			JPanel storeps10=new JPanel();
				storep0.add(storeps10);
			Color storec0010=new Color(35 ,45 ,75);
				storeps10.setBackground(storec0010);
				storeps10.add(txt10);
				txt10.setOpaque(false);
				
			JPanel storeps11=new JPanel();
				storep0.add(storeps11);
			Color storec0011=new Color(35 ,45 ,75);
				storeps11.setBackground(storec0011);
				storeps11.add(txt11);
				txt11.setOpaque(false);
				
			JPanel storeps12=new JPanel();
				storep0.add(storeps12);
			Color storec0012=new Color(35 ,45 ,75);
				storeps12.setBackground(storec0012);
				storeps12.add(txt12);
				txt12.setOpaque(false);
				
			JPanel storeps13=new JPanel();
				storep0.add(storeps13);
			Color storec0013=new Color(35 ,45 ,75);
				storeps13.setBackground(storec0013);
				storeps13.add(txt13);
				txt13.setOpaque(false);
				
			//구매패널
			JPanel storeps14=new JPanel();
				storep0.add(storeps14);
				storeps14.setPreferredSize(new Dimension(1, 1));
			Color storec0014=new Color(35 ,45 ,75);
				storeps14.setBackground(storec0014);
//			JButton storeb14=new JButton("구매");
//				storeps14.add(storeb14);	
				
		 }
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}

class MainProcess{
	
    LoginView loginView;
    ShoppingCart shoppincart;
    Store store;
    // 테스트프레임창
    public void showFrameTest(){
    	
        loginView.dispose(); // 로그인창닫기
//        this.shoppincart = new ShoppingCart(); // 테스트프레임 오픈
        this.store=new Store();
    }
 
}

class LoginView extends JFrame{
    private MainProcess main;
    private ShoppingCart shoppincart;
   
    private JButton btnLogin;
    private JButton btnInit;
    private JPasswordField passText;
    private JTextField userText;
    private boolean bLoginCheck;
   
    public LoginView() {
        // setting
        setTitle("login");
        setSize(280, 150);
        setResizable(false);
        setLocation(800, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        // panel
        JPanel panel = new JPanel();
        placeLoginPanel(panel);
       
       
        // add
        add(panel);
       
        // visiible
        setVisible(true);
    }
   
    public void placeLoginPanel(JPanel panel){
    	Store store = null;
        panel.setLayout(null);     
        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);
       
        JLabel passLabel = new JLabel("Pass");
        passLabel.setBounds(10, 40, 80, 25);
        panel.add(passLabel);
       
        userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        panel.add(userText);
       
        passText = new JPasswordField(20);
        passText.setBounds(100, 40, 160, 25);
        panel.add(passText);
        passText.addActionListener(new ActionListener() {          
            @Override
            public void actionPerformed(ActionEvent e) {
                isLoginCheck();        
            }
        });
       
        btnInit = new JButton("취소");
        btnInit.setBounds(160, 80, 100, 25);
        panel.add(btnInit);
        btnInit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//            	dispose();
            	System.exit(0);
            }
        });
       
        btnLogin = new JButton("로그인");
        btnLogin.setBounds(10, 80, 100, 25);
        panel.add(btnLogin);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isLoginCheck();
            }
        });
    }
   
    public void isLoginCheck(){
        if(userText.getText().equals("1") && new String(passText.getPassword()).equals("1")){
            JOptionPane.showMessageDialog(null, "Success");
            bLoginCheck = true;
           
            // 로그인 성공이라면 매니져창 뛰우기
            if(isLogin()){
                main.showFrameTest(); // 메인창 메소드를 이용해 창뛰우기
            }                  
        }else{
            JOptionPane.showMessageDialog(null, "Faild");
        }
    }
 
   
    // mainProcess와 연동
    public void setMain(MainProcess main) {
        this.main = main;
    }
   
 
    public boolean isLogin() {     
        return bLoginCheck;
    }
 
}


public class Store extends ShoppingCart implements ActionListener {
	
	Toolkit kit = Toolkit.getDefaultToolkit();
	Dimension screenSize = kit.getScreenSize();
	Image imgi = kit.getImage(".\\src\\img\\team1.png");
	ImageIcon imgsZ,imgs1,imgs2,imgs3,imgs4,imgs5,imgs6,imgs7,imgs8,imgs9,imgs10,imgs11,imgs12,imgs13;
	
	private void insertVideo(String fName) {//입고버튼이 눌리면
		Video vo=new Video();
		vo.setNum1(txt1.getText());
		vo.setNum2(txt2.getText());
		vo.setNum3(txt3.getText());
		vo.setNum4(txt4.getText());
		vo.setNum5(txt5.getText());
		vo.setNum6(txt6.getText());
		vo.setNum7(txt7.getText());
		vo.setNum8(txt8.getText());
		vo.setNum9(txt9.getText());
		vo.setNum10(txt10.getText());
		vo.setNum11(txt11.getText());
		vo.setNum12(txt12.getText());
		vo.setNum13(txt13.getText());
		
	
//		//이미지 vo에 세팅
//		vo.setImgfname(fName);
		int count=Integer.parseInt(txt1.getText());
			
		try {
			model.insertVideo(vo, count);
//			JOptionPane.showMessageDialog(null, "입고완료");
			//text창 내용 지우기
			txt1.setText(null);
//			tfVideoActor.setText(null);
//			tfVideoDirector.setText(null);
//			tfVideoTitle.setText(null);
//			taVideoContent.setText(null);
		} catch (Exception e1) {
//			JOptionPane.showMessageDialog(null, "입고실패");
//			e1.printStackTrace();
		}
	}
	
	
	 public void init() {
		 imgsZ = new ImageIcon(".\\src\\img\\logo.png");
		 imgs1 = new ImageIcon(".\\src\\img\\sos1.png");  //이미지 경로
		 imgs2 = new ImageIcon(".\\src\\img\\sos2.png");
		 imgs3 = new ImageIcon(".\\src\\img\\sos3.png");
		 imgs4 = new ImageIcon(".\\src\\img\\sos4.png");
		 imgs5 = new ImageIcon(".\\src\\img\\sos5.png");
		 imgs6 = new ImageIcon(".\\src\\img\\sos6.png");
		 imgs7 = new ImageIcon(".\\src\\img\\sos7.png");
		 imgs8 = new ImageIcon(".\\src\\img\\sos8.png");
		 imgs9 = new ImageIcon(".\\src\\img\\sos9.png");
		 imgs10 = new ImageIcon(".\\src\\img\\sos10.png");
		 imgs11 = new ImageIcon(".\\src\\img\\sos11.png");
		 imgs12 = new ImageIcon(".\\src\\img\\sos12.png");
		 imgs13 = new ImageIcon(".\\src\\img\\sos13.png");
	 }
	
	 
	 
	 public Store() {
		//이미지
		init();
		
		//프레임만들기
		JFrame storef= new JFrame();
		storef.setTitle("상점");
		storef.setVisible(true);
		storef.setSize(500, 500);
		storef.setLocation(512, 80);
		storef.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		storef.setIconImage(imgi);
		
		connectDB();
		//패널만들기
		JPanel storep0=new JPanel(new GridLayout(14, 3));
			Color storec0001=new Color(35 ,45 ,75);
			storep0.setBackground(storec0001);
			storep0.setPreferredSize(new Dimension(615, 850));
			storef.getContentPane().add(storep0);
			storef.pack();

		//로고패널
		JPanel storepZ=new JPanel();
			storep0.add(storepZ);
			storepZ.setPreferredSize(new Dimension(1, 1));
		Color storec00Z=new Color(23 ,26 ,33);
			storepZ.setBackground(storec00Z);
		JLabel storelZ=new JLabel(imgsZ,JLabel.CENTER);
			storelZ.setVerticalTextPosition(JLabel.CENTER);
			storelZ.setHorizontalTextPosition(JLabel.LEFT);
			storepZ.add(storelZ);
		Font storefZ=new Font("Dialog", Font.BOLD, 14);
			storelZ.setFont(storefZ);
		Color storecZ=new Color(255,255,255);
		Color storec0Z=new Color(35 ,45 ,75);
			storelZ.setForeground(storecZ);
			storelZ.setBackground(storec0Z);
			storelZ.setOpaque(true);
			
		//패널안에 패널 만들기(레이블(텍스트,이미지),버튼)
		JPanel storep1=new JPanel();
			storep0.add(storep1);
			storep1.setPreferredSize(new Dimension(1, 1));
		Color storec001=new Color(35 ,45 ,75);
			storep1.setBackground(storec001);
		JButton storeb1=new JButton("구매");
			storep1.add(storeb1);
			storeb1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		        txt1.setText(txt1.getText()+"      Total War: THREE KINGDOMS                          "+"\n");
		    System.out.println("신호");
		    insertVideo(getName(txt1)); //추가 메소드 객체 생성
		    }});
		JLabel storel01=new JLabel("      ",JLabel.CENTER);
			storep1.add(storel01);
		JLabel storel1=new JLabel("      Total War: THREE KINGDOMS                          ₩   53,820",imgs1,JLabel.CENTER);
			storel1.setVerticalTextPosition(JLabel.CENTER);
			storel1.setHorizontalTextPosition(JLabel.RIGHT);
			storep1.add(storel1);
		Font storef1=new Font("Dialog", Font.BOLD, 14);
			storel1.setFont(storef1);
		Color storec1=new Color(255,255,255);
		Color storec01=new Color(35 ,45 ,75);
			storel1.setForeground(storec1);
			storel1.setBackground(storec01);
			storel1.setOpaque(true);
					
				
		JPanel storep2=new JPanel();
			storep0.add(storep2);
			storep2.setPreferredSize(new Dimension(1, 1));
			Color storec002=new Color(35 ,45 ,75);
			storep2.setBackground(storec002);
		JButton storeb2=new JButton("구매");
			storep2.add(storeb2);
			storeb2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				        txt2.setText(txt2.getText()+"      Sekiro™: Shadows Die Twice                            "+"\n");
				    System.out.println("신호");
				    }});
		JLabel storel02=new JLabel("      ",JLabel.CENTER);
			storep2.add(storel02);
		JLabel storel2=new JLabel("      Sekiro™: Shadows Die Twice                           ₩   47,840",imgs2,JLabel.CENTER);
			storel2.setVerticalTextPosition(JLabel.CENTER);
			storel2.setHorizontalTextPosition(JLabel.RIGHT);
			storep2.add(storel2);
		Font storef2=new Font("Dialog", Font.BOLD, 14);
			storel2.setFont(storef2);
		Color storec2=new Color(255,255,255);
		Color storec02=new Color(35 ,45 ,75);
			storel2.setForeground(storec2);
			storel2.setBackground(storec02);
			storel2.setOpaque(true);
		
		JPanel storep3=new JPanel();
			storep0.add(storep3);
			storep3.setPreferredSize(new Dimension(1, 1));
			Color storec003=new Color(35 ,45 ,75);
			storep3.setBackground(storec003);
		JButton storeb3=new JButton("구매");
			storep3.add(storeb3);
			storeb3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				        txt3.setText(txt3.getText()+"      Devil May Cry 5                                                      "+"\n");
				    System.out.println("신호");
				    }});
		JLabel storel03=new JLabel("      ",JLabel.CENTER);
			storep3.add(storel03);
		JLabel storel3=new JLabel("      Devil May Cry 5                                                  ₩   41,580",imgs3,JLabel.CENTER);
			storel3.setVerticalTextPosition(JLabel.CENTER);
			storel3.setHorizontalTextPosition(JLabel.RIGHT);
			storep3.add(storel3);
		Font storef3=new Font("Dialog", Font.BOLD, 14);
			storel3.setFont(storef3);
		Color storec3=new Color(255,255,255);
		Color storec03=new Color(35 ,45 ,75);
			storel3.setForeground(storec3);
			storel3.setBackground(storec03);
			storel3.setOpaque(true);
		
		JPanel storep4=new JPanel();
			storep0.add(storep4);
			storep4.setPreferredSize(new Dimension(1, 1));
			Color storec004=new Color(35 ,45 ,75);
			storep4.setBackground(storec004);
		JButton storeb4=new JButton("구매");
			storep4.add(storeb4);
			storeb4.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				        txt4.setText(txt4.getText()+"      Football Manager 2019                                        "+"\n");
				    System.out.println("신호");
				    }});
		JLabel storel04=new JLabel("      ",JLabel.CENTER);
			storep4.add(storel04);
		JLabel storel4=new JLabel("      Football Manager 2019                                    ₩   18,360",imgs4,JLabel.CENTER);
			storel4.setVerticalTextPosition(JLabel.CENTER);
			storel4.setHorizontalTextPosition(JLabel.RIGHT);
			storep4.add(storel4);
		Font storef4=new Font("Dialog", Font.BOLD, 14);
			storel4.setFont(storef4);
		Color storec4=new Color(255,255,255);
		Color storec04=new Color(35 ,45 ,75);
			storel4.setForeground(storec4);
			storel4.setBackground(storec04);
			storel4.setOpaque(true);
		
		JPanel storep5=new JPanel();
			storep0.add(storep5);
			storep5.setPreferredSize(new Dimension(1, 1));
			Color storec005=new Color(35 ,45 ,75);
			storep5.setBackground(storec005);
		JButton storeb5=new JButton("구매");
			storep5.add(storeb5);
			storeb5.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				        txt5.setText(txt5.getText()+"     Assassin Creed® Odyssey                               "+"\n");
				    System.out.println("신호");
				    }});
		JLabel storel05=new JLabel("      ",JLabel.CENTER);
			storep5.add(storel05);
		JLabel storel5=new JLabel("      Assassin Creed® Odyssey                             ₩   32,500",imgs5,JLabel.CENTER);
			storel5.setVerticalTextPosition(JLabel.CENTER);
			storel5.setHorizontalTextPosition(JLabel.RIGHT);
			storep5.add(storel5);
		Font storef5=new Font("Dialog", Font.BOLD, 14);
			storel5.setFont(storef5);
		Color storec5=new Color(255,255,255);
		Color storec05=new Color(35 ,45 ,75);
			storel5.setForeground(storec5);
			storel5.setBackground(storec05);
			storel5.setOpaque(true);
		
		JPanel storep6=new JPanel();
			storep0.add(storep6);
			storep6.setPreferredSize(new Dimension(1, 1));
			Color storec006=new Color(35 ,45 ,75);
			storep6.setBackground(storec006);
		JButton storeb6=new JButton("구매");
			storep6.add(storeb6);
			storeb6.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				        txt6.setText(txt6.getText()+"      Shadow of the Tomb Raider                              "+"\n");
				    System.out.println("신호");
				    }});
		JLabel storel06=new JLabel("      ",JLabel.CENTER);
			storep6.add(storel06);
		JLabel storel6=new JLabel("      Shadow of the Tomb Raider                           ₩   25,760",imgs6,JLabel.CENTER);
			storel6.setVerticalTextPosition(JLabel.CENTER);
			storel6.setHorizontalTextPosition(JLabel.RIGHT);
			storep6.add(storel6);
		Font storef6=new Font("Dialog", Font.BOLD, 14);
			storel6.setFont(storef6);
		Color storec6=new Color(255,255,255);
		Color storec06=new Color(35 ,45 ,75);
			storel6.setForeground(storec6);
			storel6.setBackground(storec06);
			storel6.setOpaque(true);
		
		JPanel storep7=new JPanel();
			storep0.add(storep7);
			storep7.setPreferredSize(new Dimension(1, 1));
			Color storec007=new Color(35 ,45 ,75);
			storep7.setBackground(storec007);
		JButton storeb7=new JButton("구매");
			storep7.add(storeb7);
			storeb7.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				        txt7.setText(txt7.getText()+"      MONSTER HUNTER: WORLD                           "+"\n");
				    System.out.println("신호");
				    }});
		JLabel storel07=new JLabel("      ",JLabel.CENTER);
			storep7.add(storel07);
		JLabel storel7=new JLabel("      MONSTER HUNTER: WORLD                          ₩   31,500",imgs7,JLabel.CENTER);
			storel7.setVerticalTextPosition(JLabel.CENTER);
			storel7.setHorizontalTextPosition(JLabel.RIGHT);
			storep7.add(storel7);
		Font storef7=new Font("Dialog", Font.BOLD, 14);
			storel7.setFont(storef7);
		Color storec7=new Color(255,255,255);
		Color storec07=new Color(35 ,45 ,75);
			storel7.setForeground(storec7);
			storel7.setBackground(storec07);
			storel7.setOpaque(true);
		
		JPanel storep8=new JPanel();
			storep0.add(storep8);
			storep8.setPreferredSize(new Dimension(1, 1));
			Color storec008=new Color(35 ,45 ,75);
			storep8.setBackground(storec008);
		JButton storeb8=new JButton("구매");
			storep8.add(storeb8);
			storeb8.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				        txt8.setText(txt8.getText()+"      The Forest                                                              "+"\n");
				    System.out.println("신호");
				    }});
		JLabel storel08=new JLabel("      ",JLabel.CENTER);
			storep8.add(storel08);
		JLabel storel8=new JLabel("      The Forest                                                        ₩   12,300",imgs8,JLabel.CENTER);
			storel8.setVerticalTextPosition(JLabel.CENTER);
			storel8.setHorizontalTextPosition(JLabel.RIGHT);
			storep8.add(storel8);
		Font storef8=new Font("Dialog", Font.BOLD, 14);
			storel8.setFont(storef8);
		Color storec8=new Color(255,255,255);
		Color storec08=new Color(35 ,45 ,75);
			storel8.setForeground(storec8);
			storel8.setBackground(storec08);
			storel8.setOpaque(true);
		
		JPanel storep9=new JPanel();
			storep0.add(storep9);
			storep9.setPreferredSize(new Dimension(1, 1));
			Color storec009=new Color(35 ,45 ,75);
			storep9.setBackground(storec009);
		JButton storeb9=new JButton("구매");
			storep9.add(storeb9);
			storeb9.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				        txt9.setText(txt9.getText()+"      Far Cry® 5                                                              "+"\n");
				    System.out.println("신호");
				    }});
		JLabel storel09=new JLabel("      ",JLabel.CENTER);
			storep9.add(storel09);
		JLabel storel9=new JLabel("      Far Cry® 5                                                         ₩   21,450",imgs9,JLabel.CENTER);
			storel9.setVerticalTextPosition(JLabel.CENTER);
			storel9.setHorizontalTextPosition(JLabel.RIGHT);
			storep9.add(storel9);
		Font storef9=new Font("Dialog", Font.BOLD, 14);
			storel9.setFont(storef9);
		Color storec9=new Color(255,255,255);
		Color storec09=new Color(35 ,45 ,75);
			storel9.setForeground(storec9);
			storel9.setBackground(storec09);
			storel9.setOpaque(true);
		
		JPanel storep10=new JPanel();
			storep0.add(storep10);
			storep10.setPreferredSize(new Dimension(1, 1));
			Color storec0010=new Color(35 ,45 ,75);
			storep10.setBackground(storec0010);
		JButton storeb10=new JButton("구매");
			storep10.add(storeb10);
			storeb10.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				        txt10.setText(txt10.getText()+"      Rust                                                                         "+"\n");
				    System.out.println("신호");
				    }});
		JLabel storel010=new JLabel("      ",JLabel.CENTER);
			storep10.add(storel010);
		JLabel storel10=new JLabel("      Rust                                                                   ₩     9,000",imgs10,JLabel.CENTER);
			storel10.setVerticalTextPosition(JLabel.CENTER);
			storel10.setHorizontalTextPosition(JLabel.RIGHT);
			storep10.add(storel10);
		Font storef10=new Font("Dialog", Font.BOLD, 14);
			storel10.setFont(storef10);
		Color storec10=new Color(255,255,255);
		Color storec010=new Color(35 ,45 ,75);
			storel10.setForeground(storec10);
			storel10.setBackground(storec010);
			storel10.setOpaque(true);
			
		JPanel storep11=new JPanel();
			storep0.add(storep11);
			storep11.setPreferredSize(new Dimension(1, 1));
			Color storec0011=new Color(35 ,45 ,75);
			storep11.setBackground(storec0011);
		JButton storeb11=new JButton("구매");
			storep11.add(storeb11);
			storeb11.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				        txt11.setText(txt11.getText()+"      Lobotomy Corporation                                       "+"\n");
				    System.out.println("신호");
				    }});
		JLabel storel011=new JLabel("      ",JLabel.CENTER);
			storep11.add(storel011);
		JLabel storel11=new JLabel("      Lobotomy Corporation                                   ₩   17,420",imgs11,JLabel.CENTER);
			storel11.setVerticalTextPosition(JLabel.CENTER);
			storel11.setHorizontalTextPosition(JLabel.RIGHT);
			storep11.add(storel11);
		Font storef11=new Font("Dialog", Font.BOLD, 14);
			storel11.setFont(storef11);
		Color storec11=new Color(255,255,255);
		Color storec011=new Color(35 ,45 ,75);
			storel11.setForeground(storec11);
			storel11.setBackground(storec011);
			storel11.setOpaque(true);
			
		JPanel storep12=new JPanel();
			storep0.add(storep12);
			storep12.setPreferredSize(new Dimension(1, 1));
			Color storec0012=new Color(35 ,45 ,75);
			storep12.setBackground(storec0012);
		JButton storeb12=new JButton("구매");
			storep12.add(storeb12);
			storeb12.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				        txt12.setText(txt12.getText()+"      TEKKEN 7                                                              "+"\n");
				    System.out.println("신호");
				    }});
		JLabel storel012=new JLabel("      ",JLabel.CENTER);
			storep12.add(storel012);
		JLabel storel12=new JLabel("      TEKKEN 7                                                         ₩   21,900",imgs12,JLabel.CENTER);
			storel12.setVerticalTextPosition(JLabel.CENTER);
			storel12.setHorizontalTextPosition(JLabel.RIGHT);
			storep12.add(storel12);
		Font storef12=new Font("Dialog", Font.BOLD, 14);
			storel12.setFont(storef12);
		Color storec12=new Color(255,255,255);
		Color storec012=new Color(35 ,45 ,75);
			storel12.setForeground(storec12);
			storel12.setBackground(storec012);
			storel12.setOpaque(true);
			
		JPanel storep13=new JPanel();
			storep0.add(storep13);
			storep13.setPreferredSize(new Dimension(1, 1));
			Color storec0013=new Color(35 ,45 ,75);
			storep13.setBackground(storec0013);
		JButton storeb13=new JButton("구매");
			storep13.add(storeb13);
			storeb13.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				        txt13.setText(txt13.getText()+"      THE WITCHER 3: WILD HUNT                          "+"\n");
				    System.out.println("신호");
				    }});
		JLabel storel013=new JLabel("      ",JLabel.CENTER);
			storep13.add(storel013);
		JLabel storel13=new JLabel("      THE WITCHER 3: WILD HUNT                          ₩   16,440",imgs13,JLabel.CENTER);
			storel13.setVerticalTextPosition(JLabel.CENTER);
			storel13.setHorizontalTextPosition(JLabel.RIGHT);
			storep13.add(storel13);
		Font storef13=new Font("Dialog", Font.BOLD, 14);
			storel13.setFont(storef13);
		Color storec13=new Color(255,255,255);
		Color storec013=new Color(35 ,45 ,75);
			storel13.setForeground(storec13);
			storel13.setBackground(storec013);
			storel13.setOpaque(true);
			
	 }
	 
	 protected String getName(JTextField txt1) {

		 return null;
	}

	public void connectDB() {
			try {
//				store=new Store();
				System.out.println("비디오 연결 성공");
			} catch (Exception e) {
				System.out.println("비디오 연결 실패");
				e.printStackTrace();
			}
		}

	
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
//		Store store=new Store();
		
		 // 메인클래스 실행
        MainProcess main = new MainProcess();
        main.loginView = new LoginView(); // 로그인창 보이기
        main.loginView.setMain(main); // 로그인창에게 메인 클래스보내기
	}
}
