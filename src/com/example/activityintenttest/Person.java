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
	 * 写入描述信息
	 */
	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 序列化过程：必须按成员变量声明的顺序进行封装 
	 */
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(name);
		dest.writeInt(age);
		dest.writeString(className);
	}
	
	/**
	 * 反序列化过程，必须按照成员变量的顺序
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
