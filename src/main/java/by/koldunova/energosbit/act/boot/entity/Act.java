package by.koldunova.energosbit.act.boot.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Act {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private Date dateAct;
	private String numAct;
	private String department;
	private String consumer;
	private String contract;
	private String statusAct;
	private float cost;
	@OneToMany(mappedBy = "act")
	private List<MyFiles> files;
	
	public int getId() {
		return id;
	}
	public void setIdAct(int idAct) {
		this.id = id;
	}
	
	public Date getDateAct() {
		return dateAct;
	}
	public void setDateAct(Date dateAct) {
		this.dateAct = dateAct;
	}
	public String getNumAct() {
		return numAct;
	}
	public void setNumAct(String numAct) {
		this.numAct = numAct;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getConsumer() {
		return consumer;
	}
	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}
	public String getContract() {
		return contract;
	}
	public void setContract(String contract) {
		this.contract = contract;
	}
	public String getStatusAct() {
		return statusAct;
	}
	public void setStatusAct(String statusAct) {
		this.statusAct = statusAct;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public List<MyFiles> getFiles() {
		return files;
	}
	public void setFiles(List<MyFiles> files) {
		this.files = files;
	}
	
}
