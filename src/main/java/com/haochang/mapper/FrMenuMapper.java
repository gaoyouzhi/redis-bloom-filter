package com.haochang.mapper;

import com.haochang.model.FrMenu;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface FrMenuMapper {
    @Delete({
        "delete from fr_menu",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fr_menu (id, node_no, ",
        "name, url, icon, ",
        "parent_id, order_no, ",
        "is_short_cut, short_cut_name, ",
        "create_user, create_user_name, ",
        "create_date, update_user, ",
        "update_user_name, update_date, ",
        "remark)",
        "values (#{id,jdbcType=INTEGER}, #{nodeNo,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR}, #{icon,jdbcType=VARCHAR}, ",
        "#{parentId,jdbcType=INTEGER}, #{orderNo,jdbcType=INTEGER}, ",
        "#{isShortCut,jdbcType=INTEGER}, #{shortCutName,jdbcType=VARCHAR}, ",
        "#{createUser,jdbcType=INTEGER}, #{createUserName,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=TIMESTAMP}, #{updateUser,jdbcType=INTEGER}, ",
        "#{updateUserName,jdbcType=VARCHAR}, #{updateDate,jdbcType=TIMESTAMP}, ",
        "#{remark,jdbcType=VARCHAR})"
    })
    int insert(FrMenu record);

    @Select({
        "select",
        "id, node_no, name, url, icon, parent_id, order_no, is_short_cut, short_cut_name, ",
        "create_user, create_user_name, create_date, update_user, update_user_name, update_date, ",
        "remark",
        "from fr_menu",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="node_no", property="nodeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.INTEGER),
        @Result(column="order_no", property="orderNo", jdbcType=JdbcType.INTEGER),
        @Result(column="is_short_cut", property="isShortCut", jdbcType=JdbcType.INTEGER),
        @Result(column="short_cut_name", property="shortCutName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.INTEGER),
        @Result(column="create_user_name", property="createUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_user", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="update_user_name", property="updateUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_date", property="updateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    FrMenu selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, node_no, name, url, icon, parent_id, order_no, is_short_cut, short_cut_name, ",
        "create_user, create_user_name, create_date, update_user, update_user_name, update_date, ",
        "remark",
        "from fr_menu"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="node_no", property="nodeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.INTEGER),
        @Result(column="order_no", property="orderNo", jdbcType=JdbcType.INTEGER),
        @Result(column="is_short_cut", property="isShortCut", jdbcType=JdbcType.INTEGER),
        @Result(column="short_cut_name", property="shortCutName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.INTEGER),
        @Result(column="create_user_name", property="createUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_user", property="updateUser", jdbcType=JdbcType.INTEGER),
        @Result(column="update_user_name", property="updateUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_date", property="updateDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    List<FrMenu> selectAll();

    @Update({
        "update fr_menu",
        "set node_no = #{nodeNo,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "icon = #{icon,jdbcType=VARCHAR},",
          "parent_id = #{parentId,jdbcType=INTEGER},",
          "order_no = #{orderNo,jdbcType=INTEGER},",
          "is_short_cut = #{isShortCut,jdbcType=INTEGER},",
          "short_cut_name = #{shortCutName,jdbcType=VARCHAR},",
          "create_user = #{createUser,jdbcType=INTEGER},",
          "create_user_name = #{createUserName,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "update_user = #{updateUser,jdbcType=INTEGER},",
          "update_user_name = #{updateUserName,jdbcType=VARCHAR},",
          "update_date = #{updateDate,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FrMenu record);
}