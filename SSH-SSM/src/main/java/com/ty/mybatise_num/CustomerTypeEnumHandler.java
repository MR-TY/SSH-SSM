package com.ty.mybatise_num;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import com.ty.enum1.Gender;

/**
 * 实现typeHandler的接口
* Copyright: Copyright (c) 2018 LanRu-Caifu
* 
* @ClassName: CustomerTypeEnumHandler.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: water
* @date: 2018年1月5日 上午1:23:50 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年1月5日       water           v1.0.0               修改原因
 */
public class CustomerTypeEnumHandler implements TypeHandler<Gender>{

	@Override
	public Gender getResult(ResultSet arg0, String arg1) throws SQLException {
		//需要从数据库拿到枚举状态码并且返回枚举的对象
		int code = arg0.getInt(arg1);
		Gender gender = Gender.getEnum(code);
		return gender;
	}

	@Override
	public Gender getResult(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		int code = arg0.getInt(arg1);
		Gender gender = Gender.getEnum(code);
		return gender;
	}

	@Override
	public Gender getResult(CallableStatement arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		int code = arg0.getInt(arg1);
		Gender gender = Gender.getEnum(code);
		return gender;
	}
	
	//定义当前的数据如何保存,保存的类型是什么
	@Override
	public void setParameter(PreparedStatement preparedStatement, int arg1, Gender arg2, JdbcType arg3) throws SQLException {
		preparedStatement.setString(arg1, arg2.getCode().toString());
	}
	
}
