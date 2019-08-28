package phanlamtruonghai.iscmanagement.model;

<<<<<<< HEAD
public class School {
//	private 
}
=======
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "schools")
public class School {

	private long id;
	private String schCode;
	private String schName;
	private String schAddress;
	private String schContact;
	
	public School() {
	}

	public School(String schCode, String schName, String schAddress, String schContact) {
		this.schCode = schCode;
		this.schName = schName;
		this.schAddress = schAddress;
		this.schContact = schContact;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "code", nullable = false)
	public String getSchCode() {
		return schCode;
	}

	public void setSchCode(String schCode) {
		this.schCode = schCode;
	}

	@Column(name = "name", nullable = false)
	public String getSchName() {
		return schName;
	}

	public void setSchName(String schName) {
		this.schName = schName;
	}

	@Column(name = "address", nullable = false)
	public String getSchAddress() {
		return schAddress;
	}

	public void setSchAddress(String schAddress) {
		this.schAddress = schAddress;
	}

	@Column(name = "contact", nullable = false)
	public String getSchContact() {
		return schContact;
	}

	public void setSchContact(String schContact) {
		this.schContact = schContact;
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", schCode=" + schCode + ", schName=" + schName + ", schAddress=" + schAddress
				+ ", schContact=" + schContact + "]";
	}
	
	
	
}
>>>>>>> 87c7a516e7fcf3e4e24524ff36d1915412f5ee98
