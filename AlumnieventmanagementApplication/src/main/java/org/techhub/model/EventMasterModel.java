package org.techhub.model;

public class EventMasterModel 
{
	private int Eid;
	private String name;
	private String date;
	private String time;
	private String Venue;
	private int bid;
	private String subject;
	public void seteid(int Eid)
	{
		this.Eid = Eid;
	}
	public int geteid()
	{
		return Eid;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	public String getname()
	{
		return name;
	}
	public void setdate(String date)
	{
		this.date = date;
	}
	public String getdate()
	{
		return date;
	}
	public void settime(String time)
	{
		this.time = time;
	}
	public String gttime()
	{
		return time;
	}
	public void setvenue(String venue)
	{
		this.Venue = venue;
	}
	public String getvenue()
	{
		return Venue;
	}
	public void setid(int bid)
	{
		this.bid = bid;
	}
	public int getbid()
	{
		return bid;
	}
	public void setsubject(String subject)
	{
		this.subject = subject;
	}
	public String getsubject()
	{
		return subject;
	}
}