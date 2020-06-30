package com.haochang.mapper;

import com.haochang.model.FrMenuPrivilege;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface FrMenuPrivilegeMapper {
    @Delete({
        "delete from fr_menu_privilege",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fr_menu_privilege (id, menu_id, ",
        "name, node_no, url, ",
        "value, type, create_user, ",
        "create_user_name, create_date, ",
        "update_user, update_user_name, ",
        "update_date, remark)",
        "values (#{id,jdbcType=INTEGER}, #{menuId,jdbcType=INTEGER}, ",
        "#{name,jdbcType=VARCHAR}, #{nodeNo,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR}, ",
        "#{value,jdbcType=INTEGER}, #{type,jdbcType=INTEGER}, #{createUser,jdbcType=INTEGER}, ",
        "#{createUserName,jdbcType=VARCHAR}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{updateUser,jdbcType=INTEGER}, #{updateUserName,jdbcType=VARCHAR}, ",
        "#{updateDate,jdbcType=TIMESTAMP}, #{remark,jdbcType=VARCHAR})"
    })
    int insert(FrMenuPrivilege record);

    @Select({
        "select",
        "id, menu_id, name, node_no, url, value, type, create_user, create_user_name, ",
        "create_date, update_user, update_user_name, update_date, remark",
        "from fr_menu_privilege",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="menu_id", property="menuId", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="node_no", property="nodeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="value", property="value", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.INTEGER),
        @Result(column="create_user_name", property="createUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_user", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="update_user_name", property="updateUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_date", property="updateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    FrMenuPrivilege selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, menu_id, name, node_no, url, value, type, create_user, create_user_name, ",
        "create_date, update_user, update_user_name, update_date, remark",
        "from fr_menu_privilege"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="menu_id", property="menuId", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="node_no", property="nodeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="value", property="value", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.INTEGER),
        @Result(column="create_user_name", property="createUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_user", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="update_user_name", property="updateUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_date", property="updateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    List<FrMenuPrivilege> selectAll();

    @Update({
        "update fr_menu_privilege",
        "set menu_id = #{menuId,jdbcType=INTEGER},",
          "name = #{name,jdbcType=VARCHAR},",
          "node_no = #{nodeNo,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "value = #{value,jdbcType=INTEGER},",
          "type = #{type,jdbcType=INTEGER},",
          "create_user = #{createUser,jdbcType=INTEGER},",
          "create_user_name = #{createUserName,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_user = #{updateUser,jdbcType=INTEGER},",
          "update_user_name = #{updateUserName,jdbcType=VARCHAR},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FrMenuPrivilege record);
}