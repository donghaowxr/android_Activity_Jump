package com.example.activityintenttest;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {
	String name;
	int age;
	String className;

	public Person(String name, int age, String className) {
		super();
		this.name = name;
		this.age = age;
		this.className = className;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * д��������Ϣ
	 */
	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * ���л����̣����밴��Ա����������˳����з�װ 
	 */
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(name);
		dest.writeInt(age);
		dest.writeString(className);
	}
	
	/**
	 * �����л����̣����밴�ճ�Ա������˳��
	 */
	public static final Parcelable.Creator<Person> CREATOR=new Creator<Person>() {

		@Override
		public Person createFromParcel(Parcel source) {
			return new Person(source.readString(),source.readInt(),source.readString());
		}

		@Override
		public Person[] newArray(int size) {
			return new Person[size];
		}
	};
	
}
