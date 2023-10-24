package com.sunbeam;

import java.util.List;
import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("enter the choice ");
			System.out.println("1.save candidate ");
			System.out.println("2.update candidate");
			System.out.println("3.find all candidate");
			System.out.println("4.delete candidate by ID");
			System.out.println("5.increament vote by id");
			System.out.println("6.find candidate by party");
			System.out.println("7.Partywise votes");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				try(CandidateDao d=new CandidateDao())
				{
				System.out.println("Name = ");
				String name=sc.next();
				System.out.println("party = ");
				String party=sc.next();
				System.out.println("votes = ");
				int votes=sc.nextInt();
				candidates c=new candidates();
				c.setName(name);
				c.setParty(party);
				c.setVotes(votes);
				int cnt=d.saveCandidate(c);
				System.out.println("candidate added :" +cnt);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
				
			case 2:
				try(CandidateDao d=new CandidateDao())
				{
					System.out.println("enter the id to be updated");
					int id=sc.nextInt();
					System.out.println("Name = ");
					String name=sc.next();
					System.out.println("party = ");
					String party=sc.next();
					System.out.println("votes = ");
					int votes=sc.nextInt();
					candidates c=new candidates();
					c.setName(name);
					c.setParty(party);
					c.setVotes(votes);
					c.setId(id);
					int cnt=d.updateCandidate(c);
					System.out.println("candidate added :" +cnt);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
				
			case 3:
				try(CandidateDao d=new CandidateDao())
				{
					List<candidates> list= d.findAll();
					list.forEach(c-> System.out.println(c));
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
				
			case 4:
				try(CandidateDao d=new CandidateDao())
				{
					System.out.println("enter the id to be deleted");
					int id=sc.nextInt();
					int cnt=d.deleteById(id);
					System.out.println("Candidate deleted : "+cnt);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
				
			case 5:
				try(CandidateDao d=new CandidateDao())
				{
					System.out.println("enter the id ");
					int id=sc.nextInt();
					int cnt=d.incrementVote(id);
					System.out.println("vote increamented : "+cnt);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
				
			case 6:
				try(CandidateDao d=new CandidateDao())
				{
					System.out.println("enter the party");
					String party=sc.next();
					List<candidates> list=d.findByParty(party);
					list.forEach(c->System.out.println(c));
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
				
			case 7:
				try(PartyVotesDao p=new PartyVotesDao())
				{
					List<PartyVotes> list=p.getPartywiseVotes();
					System.out.println("party wise votes are = ");
					list.forEach(c->System.out.println(c));
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			default:
					break;
			}
		}while(choice!=0);
	}

}
