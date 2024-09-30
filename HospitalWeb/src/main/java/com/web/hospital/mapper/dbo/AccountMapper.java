package com.web.hospital.mapper.dbo;

import com.web.hospital.model.Account;
import com.web.hospital.model.AccountExample;
import com.web.hospital.model.khoa;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AccountMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.Account
	 * @mbg.generated  Sat May 11 16:28:02 ICT 2024
	 */
	long countByExample(AccountExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.Account
	 * @mbg.generated  Sat May 11 16:28:02 ICT 2024
	 */
	int deleteByExample(AccountExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.Account
	 * @mbg.generated  Sat May 11 16:28:02 ICT 2024
	 */
	int insert(Account row);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.Account
	 * @mbg.generated  Sat May 11 16:28:02 ICT 2024
	 */
	int insertSelective(Account row);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.Account
	 * @mbg.generated  Sat May 11 16:28:02 ICT 2024
	 */
	List<Account> selectByExample(AccountExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.Account
	 * @mbg.generated  Sat May 11 16:28:02 ICT 2024
	 */
	int updateByExampleSelective(@Param("row") Account row, @Param("example") AccountExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dbo.Account
	 * @mbg.generated  Sat May 11 16:28:02 ICT 2024
	 */
	int updateByExample(@Param("row") Account row, @Param("example") AccountExample example);
	Account checkLogin(@Param("username") String username , @Param("password") String password);
    Account checkuser(@Param("username") String username);
    int register(@Param ("username") String username ,@Param("password") String password ,@Param ("name") String name,@Param ("email") String email);
    List<Account> selectAllAccount();
    
    Account findbyidacc(@Param("id") int id);
    int updateacc(@Param("username") String username,@Param("password") String password,@Param("role") String role ,@Param("name") String name,@Param("id") int id);
    int deletebyidacc(@Param("id") int id);
    int addacc(@Param("username") String username,@Param("password") String password,@Param("role") String role ,@Param("name") String name);
	int changePassword(@Param("newPassword") String newPassword, @Param("username") String username);
}