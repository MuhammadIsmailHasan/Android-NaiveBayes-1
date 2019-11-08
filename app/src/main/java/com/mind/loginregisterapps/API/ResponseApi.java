package com.mind.loginregisterapps.API;

import com.google.gson.annotations.SerializedName;

public class ResponseApi{

	@SerializedName("prediksi")
	private String prediksi;

	public void setPrediksi(String prediksi){
		this.prediksi = prediksi;
	}

	public String getPrediksi(){
		return prediksi;
	}

	@Override
 	public String toString(){
		return 
			"ResponseApi{" + 
			"prediksi = '" + prediksi + '\'' + 
			"}";
		}
}