package test;
import java.io.*;
@SuppressWarnings("serial")
public class RegBean implements Serializable {
	private String uName,pWord,fName,lName,addr,mId;
	private long phNo;
	public RegBean() {}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName=uName;
	}
	public String getupWord() {
		return pWord;
	}
	public void setpWord(String pWord) {
		this.pWord=pWord;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName=fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName=lName;
	}
	public String getaddr() {
		return addr;
	}
	public void setaddr(String addr) {
		this.addr=addr;
	}
	public String mId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId=mId;
	}
	public long getphNo() {
		return phNo;
	}
	public void setphNo(long phNo) {
		this.phNo=phNo;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public String getpWord() {
		return pWord;
	} 
	public void getpWord(String pWord) {
		this.pWord=pWord;
	}
	public String getmId() {
		return mId;
	}
	public void getmId(String mId) {
		this.mId=mId;
	}
}
