package com.sunbeam;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateDao implements AutoCloseable 
{
	private Connection con;

	public CandidateDao() throws SQLException {
		con=DbUtil.getConnection();
	}
	
	@Override
	public void close() {
		try
		{
			if(con!=null)
				con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public  int saveCandidate(candidates c) throws SQLException 
	{
		String sql="INSERT INTO candidates values(default,?,?,? )";
		try(PreparedStatement stmt=con.prepareStatement(sql))
		{
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getVotes());
			int cnt=stmt.executeUpdate();
			return cnt;
		}
	}
	
	public int updateCandidate(candidates c) throws SQLException
	{
		String sql="UPDATE candidates SET name=?,party=?,votes=? WHERE id=?";
		try(PreparedStatement stmt=con.prepareStatement(sql))
		{
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getVotes());
			stmt.setInt(4, c.getId());
			int cnt=stmt.executeUpdate();
			return cnt;
		}
	}
		
	public List<candidates> findAll() throws SQLException 
	{
		List<candidates> list=new ArrayList<>();
		String sql="SELECT * FROM candidates";
		try(PreparedStatement stmt=con.prepareStatement(sql))
		{
			try(ResultSet rs=stmt.executeQuery())
			{
				while(rs.next())
				{
					int id=rs.getInt("id");
					String name=rs.getString("name");
					String party=rs.getString("party");
					int votes=rs.getInt("votes");
					candidates c=new candidates(id,name,party,votes);
					list.add(c);
				}
			}
		}
		return list;
	}
	
	
	public int deleteById(int id) throws SQLException
	{
		String sql="DELETE from candidates WHERE id=?";
		try(PreparedStatement stmt=con.prepareStatement(sql))
		{
			stmt.setInt(1, id);
			int cnt=stmt.executeUpdate();
			return cnt;
		}
	}
	
	public int incrementVote(int candidateId) throws SQLException {
		String sql = "UPDATE candidates SET votes=votes+1 WHERE id=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, candidateId);
			int cnt = stmt.executeUpdate();
			return cnt; 
		} 
	}
	
	public List<candidates> findByParty(String givenParty) throws SQLException {
		List<candidates> list = new ArrayList<>();
		String sql = "SELECT * FROM candidates WHERE party=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, givenParty);
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					candidates c = new candidates(id, name, party, votes);
					list.add(c);
				}
			} 
		} 
		return list;
	}
}
