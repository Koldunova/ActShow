package by.energosbit.acts.boots.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ActFiles")
public class MyFiles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFile;
	@ManyToOne
	@JoinColumn(name = "idAct")
	private Act act;
	private String fileName;
	private byte[] file;
	
	
	public int getIdFile() {
		return idFile;
	}
	public void setIdFile(int idFile) {
		this.idFile = idFile;
	}
	public Act getAct() {
		return act;
	}
	public void setAct(Act act) {
		this.act = act;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public byte[] getFile() {
		return file;
	}
	public void setFile(byte[] file) {
		this.file = file;
	}
	
	
}
