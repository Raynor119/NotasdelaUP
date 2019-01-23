package com.pixels.cc;

public class capmm
{
	private String Cantidad,Num;
	
	public capmm(){
		
	}
	public capmm(String cantidad,String num){
		this.Cantidad= cantidad;
		this.Num=num;
	}
	public String getCantidad(){
		return Cantidad;
	}
	public void setCantidad(String cantidad){
		Cantidad=cantidad;
	}
	public String getNum(){
		return Num;
	}
	public void setNum(String num){
		Num=num;
	}
}

