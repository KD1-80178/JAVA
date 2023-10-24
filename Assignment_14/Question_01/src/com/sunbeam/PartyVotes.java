package com.sunbeam;

public class PartyVotes
{

	private String party;
	private String votes;
	
	public PartyVotes() {
		
	}

	public PartyVotes(String party, String votes) {
		super();
		this.party = party;
		this.votes = votes;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public String getVotes() {
		return votes;
	}

	public void setVotes(String votes) {
		this.votes = votes;
	}

	@Override
	public String toString() {
		return "PartyVotes [party=" + party + ", votes=" + votes + "]";
	}
	
	
	
}
