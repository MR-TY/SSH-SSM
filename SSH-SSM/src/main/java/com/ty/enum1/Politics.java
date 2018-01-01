package com.ty.enum1;

public enum Politics {
	CROWD(1,"群众"),PPMEMBER(2,"预备党员"),PMEMBER(3,"党员");
	private Integer code;
	private String msg;
	private Politics(Integer code,String msg){
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
	public static Politics getEnum(Integer code){
		switch (code) {
		case 1:
			return CROWD;
		case 2:
			return PPMEMBER;
		case 3:
			return PMEMBER;
		default:
			return CROWD;
		}
	}
}
