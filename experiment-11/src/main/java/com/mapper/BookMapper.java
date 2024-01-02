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
	@Select("select * from book")
	List<Book> selectAll();
	@Select("select * from book where id = #{id}")
	Book selectById(int id);
	@Insert("insert into book values(#{id},#{bookName},#{author},#{price})")
	@Options(useGeneratedKeys=true,keyProperty="id",keyColumn="id")
	int insertOne(Book book);
	@Update("update book set book_name=#{bookName},author=#{author},price=#{price} where id=#{id}")
	int updateById(Book book);
	@Update("delete from book where id=#{id}")
	int deleteById(int id);
	
	@Select("select * from book where book_name like '%${bookName}%'")
	List<Book> selectByBookName(String bookName);
}
