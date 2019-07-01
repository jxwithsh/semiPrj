package Store;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Videomodel {
	Connection con;
	public Videomodel() throws Exception {
		con=DBcon.getConnection();
		}
		public void insertVideo(Video vo, int count) throws Exception {
			con.setAutoCommit(false); //자동커밋을 해제
			
			//DB에 insert 시키기
			String sql1="INSERT INTO LIBRARY(LIBRARY1,\r\n" + 
					"LIBRARY2,LIBRARY3,LIBRARY4,\r\n" + 
					"LIBRARY5,LIBRARY6,LIBRARY7,\r\n" + 
					"LIBRARY8,LIBRARY9,LIBRARY11,\r\n" + 
					"LIBRARY12,LIBRARY13,LIBRARY14)\r\n" + 
					"VALUES(SEQ_VI_CODE.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement ps1=con.prepareStatement(sql1);
			
			ps1.setString(1, vo.getNum1());
			ps1.setString(2, vo.getNum2());
			ps1.setString(3, vo.getNum3());
			ps1.setString(4, vo.getNum4());
			ps1.setString(5, vo.getNum5());
			ps1.setString(6, vo.getNum6());
			ps1.setString(7, vo.getNum7());
			ps1.setString(8, vo.getNum8());
			ps1.setString(9, vo.getNum9());
			ps1.setString(10, vo.getNum10());
			ps1.setString(11, vo.getNum11());
			ps1.setString(12, vo.getNum12());
			ps1.setString(13, vo.getNum13());
			ps1.setString(14, vo.getNum14());
			
			int r1=ps1.executeUpdate(); //sql1 실행
			
			if (r1!=1) {
				con.rollback();
				System.out.println("롤백");
			}
			con.commit();
			ps1.close();
			con.setAutoCommit(true); //자동커밋 전환
		}
public ArrayList searchVideo(int idx, String str) throws Exception {
	//검색기능
	String[] key= {"TITLE", "DIRECTOR"};
	String sql="SELECT VICODE, TITLE, GENRE, DIRECTOR, ACTOR " + 
			"FROM VINFO " + 
			"WHERE "+key[idx]+" LIKE '%"+str+"%'";
	PreparedStatement ps=con.prepareStatement(sql);
	ResultSet rs=ps.executeQuery();
	ArrayList data=new ArrayList();
	while (rs.next()) {
		ArrayList temp=new ArrayList();
		temp.add(rs.getString("VICODE"));
		temp.add(rs.getString("TITLE"));
		temp.add(rs.getString("GENRE"));
		temp.add(rs.getString("DIRECTOR"));
		temp.add(rs.getString("ACTOR"));
		data.add(temp); //arraylist에 arraylist에 추가
	}
	rs.close();
	ps.close();
	
	return data;
}
public Video selectbyPk(int no) throws Exception {
	//jtable에서 클릭한 레코드의 정보를 video 타입으로 저장
	Video vo=new Video();
	String sql="SELECT * FROM VINFO WHERE VICODE="+no;
	PreparedStatement ps=con.prepareStatement(sql);
	ResultSet rs=ps.executeQuery();
	while (rs.next()) {
		vo.setNum1(rs.getString("Library1"));
		vo.setNum2(rs.getString("Library2"));
		vo.setNum3(rs.getString("Library3"));
		vo.setNum4(rs.getString("Library4"));
		vo.setNum5(rs.getString("Library5"));
		vo.setNum6(rs.getString("Library6"));
		vo.setNum7(rs.getString("Library7"));
		vo.setNum8(rs.getString("Library8"));
		vo.setNum9(rs.getString("Library9"));
		vo.setNum10(rs.getString("Library10"));
		vo.setNum11(rs.getString("Library11"));
		vo.setNum12(rs.getString("Library12"));
		vo.setNum13(rs.getString("Library13"));
		vo.setNum14(rs.getString("Library14"));
		
	}
	rs.close();
	ps.close();
	
	return vo;
}

public void deleteVideo(Video vo) throws Exception {
	String sql = "DELETE FROM VINFO WHERE VICODE=? ";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, vo.getNum1());
	ps.setString(2, vo.getNum2());
	ps.setString(3, vo.getNum3());
	ps.setString(4, vo.getNum4());
	ps.setString(5, vo.getNum5());
	ps.setString(5, vo.getNum6());
	ps.setString(5, vo.getNum7());
	ps.setString(5, vo.getNum8());
	ps.setString(5, vo.getNum9());
	ps.setString(5, vo.getNum10());
	ps.setString(5, vo.getNum11());
	ps.setString(5, vo.getNum12());
	ps.setString(5, vo.getNum13());
	ps.setString(5, vo.getNum14());
	ps.executeUpdate();
	ps.close();
}

public void modifyVideo(Video vo) throws Exception {
	//데이터 수정 작업
	String sql="UPDATE VINFO SET TITLE=?, "
			+ "Library1=?, "
			+ "Library2=?, "
			+ "Library3=?, "
			+ "Library4=?, "
			+ "Library5=?, "
			+ "Library6=?, "
			+ "Library7=?, "
			+ "Library8=?, "
			+ "Library9=?, "
			+ "Library10=?, "
			+ "Library11=?, "
			+ "Library12=?, "
			+ "Library13=?, "
			+ "Library14=?, "
			+ "WHERE LIBRARY=?";
	
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setString(1, vo.getNum1());
	ps.setString(2, vo.getNum2());
	ps.setString(3, vo.getNum3());
	ps.setString(4, vo.getNum4());
	ps.setString(5, vo.getNum5());
	ps.setString(5, vo.getNum6());
	ps.setString(5, vo.getNum7());
	ps.setString(5, vo.getNum8());
	ps.setString(5, vo.getNum9());
	ps.setString(5, vo.getNum10());
	ps.setString(5, vo.getNum11());
	ps.setString(5, vo.getNum12());
	ps.setString(5, vo.getNum13());
	ps.setString(5, vo.getNum14());
	
	ps.executeUpdate(); //실행
	ps.close();
	}

}

