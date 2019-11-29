package pojo;

public class payments 
{
	private int id;
	private int userid;
	private float amount;
	private String type;
	private String transaction_time;
	private String nextpayment_duedate;

	public payments()
	{}
	

	public payments(int id, int userid, float amount, String type, String transaction_time,
			String nextpayment_duedate)
	{
		
		this.id = id;
		this.userid = userid;
		this.amount = amount;
		this.type = type;
		this.transaction_time = transaction_time;
		this.nextpayment_duedate = nextpayment_duedate;
	}


	public int getId() 
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getUserid()
	{
		return userid;
	}

	public void setUserid(int userid)
	{
		this.userid = userid;
	}

	public float getAmount() 
	{
		return amount;
	}

	public void setAmount(float amount) 
	{
		this.amount = amount;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getTransaction_time() 
	{
		return transaction_time;
	}

	public void setTransaction_time(String transaction_time)
	{
		this.transaction_time = transaction_time;
	}

	public String getNextpayment_duedate() 
	{
		return nextpayment_duedate;
	}

	public void setNextpayment_duedate(String nextpayment_duedate)
	{
		this.nextpayment_duedate = nextpayment_duedate;
	}


	@Override
	public String toString()
	{
		return "payments [id=" + id + ", userid=" + userid + ", amount=" + amount + ", type=" + type
				+ ", transaction_time=" + transaction_time + ", nextpayment_duedate=" + nextpayment_duedate + "]";
	}
	

}
