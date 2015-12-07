package br.com.service.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="device")
public class Device implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String deviceGCMId;
	private String deviceName;
	
	public String getDeviceGCMId() {
		return deviceGCMId;
	}
	public void setDeviceGCMId(String deviceGCMId) {
		this.deviceGCMId = deviceGCMId;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	
	
}
