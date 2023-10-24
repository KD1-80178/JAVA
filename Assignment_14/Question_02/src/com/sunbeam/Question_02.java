package com.sunbeam;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class Question_02 {


	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("enter the choice ");
			System.out.println("1.save user ");
			System.out.println("2.update user");
			System.out.println("3.find all user");
			System.out.println("4.delete the user");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				try(UserDao d=new UserDao())
				{
					System.out.println("first Name = ");
					String first_name=sc.next();
					System.out.println("last Name = ");
					String last_name=sc.next();
					System.out.println("email = ");
					String email=sc.next();
					System.out.println("password = ");
					String password=sc.next();
					System.out.println("dob = ");
					String dob=sc.next();
					System.out.println("role = ");
					String role=sc.next();
										
					users u=new users();
					u.setFirst_name(first_name);
					u.setLast_name(last_name);
					u.setEmail(email);
					u.setPassword(password);
					u.setDob(dob);
					u.setRole(role);
					int cnt=d.addUser(u);
					System.out.println("Row is inserted...."+cnt);
				}
				
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
				
			case 2:
				try(UserDao d=new UserDao())
				{
					System.out.println("enter the id to be updated");
					int id=sc.nextInt();
					System.out.println("first Name = ");
					String first_name=sc.next();
					System.out.println("last Name = ");
					String last_name=sc.next();
					System.out.println("email = ");
					String email=sc.next();
					System.out.println("password = ");
					String password=sc.next();
					System.out.println("dob = ");
					String dob=sc.next();
					System.out.println("status = ");
					boolean status=sc.nextBoolean();
					System.out.println("role = ");
					String role=sc.next();
										
					users u=new users();
					u.setId(id);
					u.setFirst_name(first_name);
					u.setLast_name(last_name);
					u.setEmail(email);
					u.setPassword(password);
					u.setDob(dob);
					u.setStatus(status);
					u.setRole(role);
					int cnt=d.updateUser(u);
					System.out.println("User updated :" +cnt);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
				
			case 3:
				try(UserDao d=new UserDao())
				{
					List<users> list= d.findAll();
					list.forEach(c-> System.out.println(c));
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
			
			
			case 4:
				try(UserDao d=new UserDao())
				{
					System.out.println("enter the id to be deleted");
					int id=sc.nextInt();
					int cnt=d.deleteUser(id);
					System.out.println("User deleted : "+cnt);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
		
		}
	}while(choice!=0);

	}
}
