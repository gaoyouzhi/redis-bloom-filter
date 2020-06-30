package com.haochang.mapper;

import com.haochang.model.FrRoleMenu;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface FrRoleMenuMapper {
    @Delete({
        "delete from fr_role_menu",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fr_role_menu (id, role_id, ",
        "menu_id)",
        "values (#{id,jdbcType=INTEGER}, #{roleId,jdbcType=INTEGER}, ",
        "#{menuId,jdbcType=INTEGER})"
    })
    int insert(FrRoleMenu record);

    @Select({
        "select",
        "id, role_id, menu_id",
        "from fr_role_menu",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.INTEGER),
        @Result(column="menu_id", property="menuId", jdbcType=JdbcType.INTEGER)
    })
    FrRoleMenu selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, role_id, menu_id",
        "from fr_role_menu"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.INTEGER),
        @Result(column="menu_id", property="menuId", jdbcType=JdbcType.INTEGER)
    })
    List<FrRoleMenu> selectAll();

    @Update({
        "update fr_role_menu",
        "set role_id = #{roleId,jdbcType=INTEGER},",
          "menu_id = #{menuId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FrRoleMenu record);
}