package Loans;
public class Loan /////////////////////// #Loan //////////////////////////
  {
    public float amount;
    public int duration;
    public float rate;
    
    public int durationY;
    public int durationM;
    public Loan()
    {
      amount = 0;
      duration = 0;
      rate = 0;
      durationY=0;
      durationM=0;
    }
    public Loan(int c, int dy, int dm) //overload
    {
      amount = c;
      durationY = dy+(dm/12);
      durationM = dm%12;
      duration = (12*(durationY))+dm;
    }
    public Loan(int c, int dm)
    {
      amount = c;
      duration = dm;
      durationY = dm/12;
      durationM = dm%12;
    }
    public void setAmount(float amount)
    {
      this.amount=amount;
    }
    public void setDuration(int dm)
    {
      duration = dm;
      durationY = dm/12;
      durationM = dm%12;
    }
    public void setDuration(int dy, int dm)
    {
      duration = (12*(dy))+dm;
      durationY = dy+(dm/12);
      durationM = dm%12;
    }
    public void setRate(float rate)
    {
      this.rate=rate;
    }
  }
