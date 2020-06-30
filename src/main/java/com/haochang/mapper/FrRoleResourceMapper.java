package com.haochang.mapper;

import com.haochang.model.FrRoleResource;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface FrRoleResourceMapper {
    @Delete({
        "delete from fr_role_resource",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fr_role_resource (id, role_id, ",
        "resource_id)",
        "values (#{id,jdbcType=INTEGER}, #{roleId,jdbcType=INTEGER}, ",
        "#{resourceId,jdbcType=INTEGER})"
    })
    int insert(FrRoleResource record);

    @Select({
        "select",
        "id, role_id, resource_id",
        "from fr_role_resource",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.INTEGER),
        @Result(column="resource_id", property="resourceId", jdbcType=JdbcType.INTEGER)
    })
    FrRoleResource selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, role_id, resource_id",
        "from fr_role_resource"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.INTEGER),
        @Result(column="resource_id", property="resourceId", jdbcType=JdbcType.INTEGER)
    })
    List<FrRoleResource> selectAll();

    @Update({
        "update fr_role_resource",
        "set role_id = #{roleId,jdbcType=INTEGER},",
          "resource_id = #{resourceId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FrRoleResource record);
}