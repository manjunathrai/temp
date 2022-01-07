package com.te.hibernate_project;

import javax.persistence.*;

@Entity
public class MyPlayList
{
	@Id
	private int id;
	private String song_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSong_name() {
		return song_name;
	}
	public void setSong_name(String song_name) {
		this.song_name = song_name;
	}
	@Override
	public String toString() {
		return   id + "    " + song_name ;
	}
	
}
