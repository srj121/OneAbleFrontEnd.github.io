package com.time.main.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "registerInfo")
public class UserRegistration {
	

		private String userName;
		private String passWord;
		
		
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassWord() {
			return passWord;
		}
		public void setPassWord(String passWord) {
			this.passWord = passWord;
		}
		@Override
		public String toString() {
			return "UserRegistration [userName=" + userName + ", passWord=" + passWord + "]";
		}
		
		
}
