package in.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.DynamicInsert;

@Entity
@DynamicInsert(value = true)
//@NamedNativeQuery(name="Bhai_Insert_Kro",query = "INSERT into Student2 (sid,saddress,sage,sname) values(:id,:address,:age,:name)")
public class BankAccount {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	public long Accno;
	
	public String accholdername;
	
	public String accttype;
	
	public float balance;
	
	public String address;
	
	public BankAccount()
	{
		System.out.println("inside student2.java");
	}
	
	public long getAccno() {
		return Accno;
	}

	public void setAccno(long accno) {
		Accno = accno;
	}

	public String getAccholdername() {
		return accholdername;
	}

	public void setAccholdername(String accholdername) {
		this.accholdername = accholdername;
	}

	public String getAccttype() {
		return accttype;
	}

	public void setAccttype(String accttype) {
		this.accttype = accttype;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		 return Accno+" " + accholdername+" " +accttype +" "+ balance+" "+ address;
	}


}
