package io.welfareteam.api.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

//@Entity
public class Board {

	@Id
	private Long id;

	@Basic
	private String name;

	@ManyToMany
	@JoinColumn(name = "team_id")
	private List<Team> teams;
	
	public Board() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

}
