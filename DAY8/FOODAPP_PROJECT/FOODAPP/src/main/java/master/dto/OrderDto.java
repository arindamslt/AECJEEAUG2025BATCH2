package master.dto;

import java.util.Date;

public class OrderDto {
private int oid;
private Date odt;
private String fid;
private int qty;
private String uname;
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public Date getOdt() {
	return odt;
}
public void setOdt(Date odt) {
	this.odt = odt;
}
public String getFid() {
	return fid;
}
public void setFid(String fid) {
	this.fid = fid;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}


}
