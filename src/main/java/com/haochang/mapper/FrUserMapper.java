package com.haochang.mapper;

import com.haochang.model.FrUser;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface FrUserMapper {
    @Delete({
        "delete from fr_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fr_user (id, login_name, ",
        "user_name, password, ",
        "head_img_url, gender, ",
        "phone_number, email, ",
        "status, type, bind_type, ",
        "ip_or_mac, item1, item2, ",
        "item3, item4, item5, ",
        "create_user, create_user_name, ",
        "create_date, update_user, ",
        "update_user_name, update_date, ",
        "remark)",
        "values (#{id,jdbcType=INTEGER}, #{loginName,jdbcType=VARCHAR}, ",
        "#{userName,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{headImgUrl,jdbcType=VARCHAR}, #{gender,jdbcType=INTEGER}, ",
        "#{phoneNumber,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=INTEGER}, #{type,jdbcType=INTEGER}, #{bindType,jdbcType=INTEGER}, ",
        "#{ipOrMac,jdbcType=CHAR}, #{item1,jdbcType=VARCHAR}, #{item2,jdbcType=VARCHAR}, ",
        "#{item3,jdbcType=VARCHAR}, #{item4,jdbcType=VARCHAR}, #{item5,jdbcType=VARCHAR}, ",
        "#{createUser,jdbcType=INTEGER}, #{createUserName,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{updateUser,jdbcType=INTEGER}, ",
        "#{updateUserName,jdbcType=VARCHAR}, #{updateDate,jdbcType=TIMESTAMP}, ",
        "#{remark,jdbcType=VARCHAR})"
    })
    int insert(FrUser record);

    @Select({
        "select",
        "id, login_name, user_name, password, head_img_url, gender, phone_number, email, ",
        "status, type, bind_type, ip_or_mac, item1, item2, item3, item4, item5, create_user, ",
        "create_user_name, create_date, update_user, update_user_name, update_date, remark",
        "from fr_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="login_name", property="loginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="head_img_url", property="headImgUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.INTEGER),
        @Result(column="phone_number", property="phoneNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="bind_type", property="bindType", jdbcType=JdbcType.INTEGER),
        @Result(column="ip_or_mac", property="ipOrMac", jdbcType=JdbcType.CHAR),
        @Result(column="item1", property="item1", jdbcType=JdbcType.VARCHAR),
        @Result(column="item2", property="item2", jdbcType=JdbcType.VARCHAR),
        @Result(column="item3", property="item3", jdbcType=JdbcType.VARCHAR),
        @Result(column="item4", property="item4", jdbcType=JdbcType.VARCHAR),
        @Result(column="item5", property="item5", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.INTEGER),
        @Result(column="create_user_name", property="createUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_user", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="update_user_name", property="updateUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_date", property="updateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    FrUser selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, login_name, user_name, password, head_img_url, gender, phone_number, email, ",
        "status, type, bind_type, ip_or_mac, item1, item2, item3, item4, item5, create_user, ",
        "create_user_name, create_date, update_user, update_user_name, update_date, remark",
        "from fr_user"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="login_name", property="loginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="head_img_url", property="headImgUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.INTEGER),
        @Result(column="phone_number", property="phoneNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="bind_type", property="bindType", jdbcType=JdbcType.INTEGER),
        @Result(column="ip_or_mac", property="ipOrMac", jdbcType=JdbcType.CHAR),
        @Result(column="item1", property="item1", jdbcType=JdbcType.VARCHAR),
        @Result(column="item2", property="item2", jdbcType=JdbcType.VARCHAR),
        @Result(column="item3", property="item3", jdbcType=JdbcType.VARCHAR),
        @Result(column="item4", property="item4", jdbcType=JdbcType.VARCHAR),
        @Result(column="item5", property="item5", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.INTEGER),
        @Result(column="create_user_name", property="createUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_user", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="update_user_name", property="updateUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_date", property="updateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    List<FrUser> selectAll();

    @Update({
        "update fr_user",
        "set login_name = #{loginName,jdbcType=VARCHAR},",
          "user_name = #{userName,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "head_img_url = #{headImgUrl,jdbcType=VARCHAR},",
          "gender = #{gender,jdbcType=INTEGER},",
          "phone_number = #{phoneNumber,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "type = #{type,jdbcType=INTEGER},",
          "bind_type = #{bindType,jdbcType=INTEGER},",
          "ip_or_mac = #{ipOrMac,jdbcType=CHAR},",
          "item1 = #{item1,jdbcType=VARCHAR},",
          "item2 = #{item2,jdbcType=VARCHAR},",
          "item3 = #{item3,jdbcType=VARCHAR},",
          "item4 = #{item4,jdbcType=VARCHAR},",
          "item5 = #{item5,jdbcType=VARCHAR},",
          "create_user = #{createUser,jdbcType=INTEGER},",
          "create_user_name = #{createUserName,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_user = #{updateUser,jdbcType=INTEGER},",
          "update_user_name = #{updateUserName,jdbcType=VARCHAR},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FrUser record);

    @Select("select * from fr_user where login_name = #{loginName}")
    FrUser selectByLoginName(String loginName);
}