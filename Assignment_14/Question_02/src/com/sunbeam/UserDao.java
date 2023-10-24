package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDao implements AutoCloseable {
	private Connection con;

	public UserDao() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() throws Exception {
		if (con != null)
			con.close();

	}

	// add USER
	public int addUser(users u) throws SQLException, ParseException {
		String sql = "INSERT into users values (default, ?,?,?,?,?,true,?)";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, u.getFirst_name());
			stmt.setString(2, u.getLast_name());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getPassword());

			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date uDate = sdf.parse(u.getDob());
			java.sql.Date sDate = new java.sql.Date(uDate.getTime());

			stmt.setDate(5, sDate);
			stmt.setString(6, u.getRole());
			int cnt = stmt.executeUpdate();
			return cnt;
		}

	}

	// Update USER
	public int updateUser(users u) throws SQLException, ParseException {
		String sql = "UPDATE users SET first_name=?,last_name=?,email=?,password=?,dob=?,status=?,role=? WHERE id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, u.getFirst_name());
			stmt.setString(2, u.getLast_name());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getPassword());

			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date uDate = sdf.parse(u.getDob());
			java.sql.Date sDate = new java.sql.Date(uDate.getTime());

			stmt.setDate(5, sDate);
			stmt.setBoolean(6, u.isStatus());
			stmt.setString(7, u.getRole());
			stmt.setInt(8, u.getId());

			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	//delete user 
	public int deleteUser(int userId) throws SQLException {
		String sql = "DELETE FROM users WHERE id = ?";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setInt(1, userId);
				int cnt = stmt.executeUpdate();
				return cnt;
		}
	}

	
	// Find ALL
	public List<users> findAll() throws SQLException {
		List<users> list = new ArrayList<>();
		String sql = "SELECT * FROM users";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String first_name = rs.getString("first_name");
					String last_name = rs.getString("last_name");
					String email = rs.getString("email");
					String password = rs.getString("password");
					java.sql.Date sDate = rs.getDate("dob");
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String bdate = sdf.format(sDate);
					boolean status = rs.getBoolean("status");
					String role = rs.getString("role");
					users c = new users(id, first_name, last_name, email, password, bdate, status, role);
					list.add(c);
				}
			}
		}
		return list;
	}

}
