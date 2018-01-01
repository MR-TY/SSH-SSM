package com.ty.mybatise_num;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import com.ty.enum1.Politics;
import com.ty.enum1.Politics;

public class CustomerTypeEnumHandlerPolics implements TypeHandler<Politics>{
	@Override
	public Politics getResult(ResultSet arg0, String arg1) throws SQLException {
		//需要从数据库拿到枚举状态码并且返回枚举的对象
		int code = arg0.getInt(arg1);
		Politics politics = Politics.getEnum(code);
		return politics;
	}

	@Override
	public Politics getResult(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		int code = arg0.getInt(arg1);
		Politics politics = Politics.getEnum(code);
		return politics;
	}

	@Override
	public Politics getResult(CallableStatement arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		int code = arg0.getInt(arg1);
		Politics politics = Politics.getEnum(code);
		return politics;
	}
	
	//定义当前的数据如何保存
	@Override
	public void setParameter(PreparedStatement preparedStatement, int arg1, Politics arg2, JdbcType arg3) throws SQLException {
		preparedStatement.setString(arg1, arg2.getCode().toString());
	}
}
