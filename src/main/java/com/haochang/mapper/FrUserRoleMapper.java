package com.haochang.mapper;

import com.haochang.model.FrUserRole;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface FrUserRoleMapper {
    @Delete({
        "delete from fr_user_role",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fr_user_role (id, user_id, ",
        "role_id)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{roleId,jdbcType=INTEGER})"
    })
    int insert(FrUserRole record);

    @Select({
        "select",
        "id, user_id, role_id",
        "from fr_user_role",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.INTEGER)
    })
    FrUserRole selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, user_id, role_id",
        "from fr_user_role"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.INTEGER)
    })
    List<FrUserRole> selectAll();

    @Update({
        "update fr_user_role",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "role_id = #{roleId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FrUserRole record);
}