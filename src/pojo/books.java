package pojo;

public class books 
{
private  int id;
private String name ;
private String author;
private String subject;
private float price;
private String isbn;
public books()
		{}
public books(int id, String name, String author, String subject, float price, String isbn) 
{
	this.id = id;
	this.name = name;
	this.author = author;
	this.subject = subject;
	this.price = price;
	this.isbn = isbn;
}

public int getId()
{
	return id;
}

public void setId(int id) 
{
	this.id = id;
}

public String getName() 
{
	return name;
}

public void setName(String name) 
{
	this.name = name;
}

public String getAuthor() 
{
	return author;
}

public void setAuthor(String author) 
{
	this.author = author;
}

public String getSubject() 
{
	return subject;
}

public void setSubject(String subject) 
{
	this.subject = subject;
}

public float getPrice() 
{
	return price;
}

public void setPrice(float price) 
{
	this.price = price;
}

public String getIsbn() 
{
	return isbn;
}

public void setIsbn(String isbn) 
{
	this.isbn = isbn;
}


@Override
public String toString() 
{
	return "books [id=" + id + ", name=" + name + ", author=" + author + ", subject=" + subject + ", price=" + price
			+ ", isbn=" + isbn + "]";
}




}
