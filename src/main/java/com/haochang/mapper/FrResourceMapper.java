package com.haochang.mapper;

import com.haochang.model.FrResource;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface FrResourceMapper {
    @Delete({
        "delete from fr_resource",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fr_resource (id, url, ",
        "name, create_user, ",
        "create_user_name, create_date, ",
        "update_user, update_user_name, ",
        "update_date, remark)",
        "values (#{id,jdbcType=INTEGER}, #{url,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{createUser,jdbcType=INTEGER}, ",
        "#{createUserName,jdbcType=VARCHAR}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{updateUser,jdbcType=INTEGER}, #{updateUserName,jdbcType=VARCHAR}, ",
        "#{updateDate,jdbcType=TIMESTAMP}, #{remark,jdbcType=VARCHAR})"
    })
    int insert(FrResource record);

    @Select({
        "select",
        "id, url, name, create_user, create_user_name, create_date, update_user, update_user_name, ",
        "update_date, remark",
        "from fr_resource",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.INTEGER),
        @Result(column="create_user_name", property="createUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_user", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="update_user_name", property="updateUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_date", property="updateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    FrResource selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, url, name, create_user, create_user_name, create_date, update_user, update_user_name, ",
        "update_date, remark",
        "from fr_resource"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.INTEGER),
        @Result(column="create_user_name", property="createUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_user", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="update_user_name", property="updateUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_date", property="updateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    List<FrResource> selectAll();

    @Update({
        "update fr_resource",
        "set url = #{url,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "create_user = #{createUser,jdbcType=INTEGER},",
          "create_user_name = #{createUserName,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_user = #{updateUser,jdbcType=INTEGER},",
          "update_user_name = #{updateUserName,jdbcType=VARCHAR},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FrResource record);
}