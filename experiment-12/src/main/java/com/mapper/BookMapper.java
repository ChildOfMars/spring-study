package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.bean.Book;

@Repository
public interface BookMapper {
	@Select("select * from book where id = #{id}")
	Book selectById(int id);
	@Insert("insert into book values(#{id},#{bookName},#{author},#{price})")
	@Options(useGeneratedKeys=true,keyProperty="id",keyColumn="id")
	int insertOne(Book book);
}
