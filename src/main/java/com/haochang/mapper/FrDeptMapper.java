package com.haochang.mapper;

import com.haochang.model.FrDept;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface FrDeptMapper {
    @Delete({
        "delete from fr_dept",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fr_dept (id, name, ",
        "node_no, parent_node_no, ",
        "create_user, create_user_name, ",
        "create_date, update_user, ",
        "update_user_name, update_date, ",
        "remark, order_no)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{nodeNo,jdbcType=VARCHAR}, #{parentNodeNo,jdbcType=VARCHAR}, ",
        "#{createUser,jdbcType=INTEGER}, #{createUserName,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{updateUser,jdbcType=INTEGER}, ",
        "#{updateUserName,jdbcType=VARCHAR}, #{updateDate,jdbcType=TIMESTAMP}, ",
        "#{remark,jdbcType=VARCHAR}, #{orderNo,jdbcType=INTEGER})"
    })
    int insert(FrDept record);

    @Select({
        "select",
        "id, name, node_no, parent_node_no, create_user, create_user_name, create_date, ",
        "update_user, update_user_name, update_date, remark, order_no",
        "from fr_dept",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="node_no", property="nodeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_node_no", property="parentNodeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.INTEGER),
        @Result(column="create_user_name", property="createUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_user", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="update_user_name", property="updateUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_date", property="updateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_no", property="orderNo", jdbcType=JdbcType.INTEGER)
    })
    FrDept selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, name, node_no, parent_node_no, create_user, create_user_name, create_date, ",
        "update_user, update_user_name, update_date, remark, order_no",
        "from fr_dept"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="node_no", property="nodeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_node_no", property="parentNodeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.INTEGER),
        @Result(column="create_user_name", property="createUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_user", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="update_user_name", property="updateUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_date", property="updateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="order_no", property="orderNo", jdbcType=JdbcType.INTEGER)
    })
    List<FrDept> selectAll();

    @Update({
        "update fr_dept",
        "set name = #{name,jdbcType=VARCHAR},",
          "node_no = #{nodeNo,jdbcType=VARCHAR},",
          "parent_node_no = #{parentNodeNo,jdbcType=VARCHAR},",
          "create_user = #{createUser,jdbcType=INTEGER},",
          "create_user_name = #{createUserName,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_user = #{updateUser,jdbcType=INTEGER},",
          "update_user_name = #{updateUserName,jdbcType=VARCHAR},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "order_no = #{orderNo,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FrDept record);
}