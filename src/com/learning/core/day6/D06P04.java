package com.learning.core.day6;

import java.util.Comparator;
import java.util.Date;
import java.util.Objects;
import java.util.TreeSet;

class Book1 implements Comparable<Book1>
{
	private int Id;
	private String title;
	private double price;
	private Date dop;
	private String author;
	
	public Book1() 
	{
		super();
	}

	public Book1(int Id, String title, double price, Date dop, String author) 
	{
		super();
		this.Id = Id;
		this.title = title;
		this.price = price;
		this.dop = dop;
		this.author = author;
	}

	public int Id() 
	{
		return Id;
	}

	public void setBookId(int Id) 
	{
		this.Id = Id;
	}

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	public Date getdop() 
	{
		return dop;
	}

	public void setdOfPubl(Date dop) 
	{
		this.dop = dop;
	}

	public String getAuthor() 
	{
		return author;
	}

	public void setAuthor(String author) 
	{
		this.author = author;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(author, Id, dop, price, title);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book1 other = (Book1) obj;
		return Objects.equals(author, other.author) && Id == other.Id && Objects.equals(dop, other.dop)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() 
	{
		return Id + " " + title + " " + price + " "+ author+"   " 
				+ dop.getDate()+"/"+dop.getMonth()+"/"+dop.getYear();
	}
	
	@Override
	public int compareTo(Book1 o) 
	{
		return this.Id - o.Id;
	}
}
@SuppressWarnings("deprecation")
public class D06P04 
{
	public static void main(String[] args) 
	{
		TreeSet<Book1> b= new TreeSet<>((Comparator.comparing(Book1::getAuthor)));
		
		b.add(new Book1(1001,"Python Learning",715,new Date(2020,2,2),"Martic C. Brown"));
		b.add(new Book1(1002,"Modern Mainframe",295,new Date(1997,5,19),"Sharad"));
		b.add(new Book1(1003,"java Programming",523,new Date(1984,11,23),"Gilad Bracha"));
		b.add(new Book1(1004,"Read C++",295,new Date(1984,11,19),"Henry Harvin"));
		b.add(new Book1(1005,".Net Platform",3497,new Date(1984,3,6),"Mark J. Price"));
		

		for (Book1 bk : b) 
		{
            System.out.println(bk);
        }
	}

}