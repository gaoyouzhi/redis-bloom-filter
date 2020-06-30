package com.haochang.mapper;

import com.haochang.model.FrUserDept;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface FrUserDeptMapper {
    @Delete({
        "delete from fr_user_dept",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fr_user_dept (id, user_id, ",
        "dept_id)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{deptId,jdbcType=INTEGER})"
    })
    int insert(FrUserDept record);

    @Select({
        "select",
        "id, user_id, dept_id",
        "from fr_user_dept",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="dept_id", property="deptId", jdbcType=JdbcType.INTEGER)
    })
    FrUserDept selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, user_id, dept_id",
        "from fr_user_dept"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="dept_id", property="deptId", jdbcType=JdbcType.INTEGER)
    })
    List<FrUserDept> selectAll();

    @Update({
        "update fr_user_dept",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "dept_id = #{deptId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FrUserDept record);
}