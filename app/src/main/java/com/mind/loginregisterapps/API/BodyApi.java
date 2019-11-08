package com.mind.loginregisterapps.API;

import com.google.gson.annotations.SerializedName;

public class BodyApi{

	@SerializedName("fitur_3")
	private String fitur3;

	@SerializedName("fitur_1")
	private String fitur1;

	@SerializedName("fitur_2")
	private String fitur2;

	public void setFitur3(String fitur3){
		this.fitur3 = fitur3;
	}

	public String getFitur3(){
		return fitur3;
	}

	public void setFitur1(String fitur1){
		this.fitur1 = fitur1;
	}

	public String getFitur1(){
		return fitur1;
	}

	public void setFitur2(String fitur2){
		this.fitur2 = fitur2;
	}

	public String getFitur2(){
		return fitur2;
	}

	@Override
 	public String toString(){
		return 
			"BodyApi{" + 
			"fitur_3 = '" + fitur3 + '\'' + 
			",fitur_1 = '" + fitur1 + '\'' + 
			",fitur_2 = '" + fitur2 + '\'' + 
			"}";
		}
}