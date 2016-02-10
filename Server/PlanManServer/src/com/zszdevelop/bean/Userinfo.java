package com.zszdevelop.bean;

public class Userinfo {
	private int sex;
	private String birthday; 
	private float high;
	private float goalRecordChest;
	private float goalRecordLoin;
	private float goalRecordLeftArm;
	private float goalRecordRightArm;
	private float goalRecordWeight;
	private String goalRecordTime;
	private BaseUser baseUser;
	
	public BaseUser getBaseUser() {
		return baseUser;
	}
	public void setBaseUser(BaseUser baseUser) {
		this.baseUser = baseUser;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public float getHigh() {
		return high;
	}
	public void setHigh(float high) {
		this.high = high;
	}
	public float getGoalRecordChest() {
		return goalRecordChest;
	}
	public void setGoalRecordChest(float goalRecordChest) {
		this.goalRecordChest = goalRecordChest;
	}
	public float getGoalRecordLoin() {
		return goalRecordLoin;
	}
	public void setGoalRecordLoin(float goalRecordLoin) {
		this.goalRecordLoin = goalRecordLoin;
	}
	public float getGoalRecordLeftArm() {
		return goalRecordLeftArm;
	}
	public void setGoalRecordLeftArm(float goalRecordLeftArm) {
		this.goalRecordLeftArm = goalRecordLeftArm;
	}
	public float getGoalRecordRightArm() {
		return goalRecordRightArm;
	}
	public void setGoalRecordRightArm(float goalRecordRightArm) {
		this.goalRecordRightArm = goalRecordRightArm;
	}
	public float getGoalRecordWeight() {
		return goalRecordWeight;
	}
	public void setGoalRecordWeight(float goalRecordWeight) {
		this.goalRecordWeight = goalRecordWeight;
	}
	public String getGoalRecordTime() {
		return String.valueOf(System.currentTimeMillis());
	}
	
	
}
