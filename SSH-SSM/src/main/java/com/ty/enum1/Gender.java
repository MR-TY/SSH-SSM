package com.ty.enum1;
/**
 * 希望保存的数据是:1,2而不是从0开始
* Copyright: Copyright (c) 2018 LanRu-Caifu
* 
* @ClassName: Gender.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: water
* @date: 2018年1月5日 上午1:19:16 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年1月5日       water           v1.0.0               修改原因
 */
public enum Gender {
	man(1,"男人"),woman(2,"女人");
	
	private Integer code;
	private String msg;
	private Gender(Integer code,String msg){
		this.code = code;
		this.msg = msg;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public static Gender getEnum(Integer code){
		switch (code) {
		case 1:
			return man;
		case 2:
			return woman;
		default:
			return man;
		}
	}
}
