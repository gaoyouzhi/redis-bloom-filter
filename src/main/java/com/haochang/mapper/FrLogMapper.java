package com.haochang.mapper;

import com.haochang.model.FrLog;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface FrLogMapper {
    @Delete({
        "delete from fr_log",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fr_log (id, module_id, ",
        "module_name, user_id, ",
        "user_name, content, ",
        "parameters, create_date, ",
        "ip_address, mac_address, ",
        "remark)",
        "values (#{id,jdbcType=INTEGER}, #{moduleId,jdbcType=INTEGER}, ",
        "#{moduleName,jdbcType=VARCHAR}, #{userId,jdbcType=INTEGER}, ",
        "#{userName,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR}, ",
        "#{parameters,jdbcType=VARCHAR}, #{createDate,jdbcType=TIMESTAMP}, ",
        "#{ipAddress,jdbcType=VARCHAR}, #{macAddress,jdbcType=VARCHAR}, ",
        "#{remark,jdbcType=VARCHAR})"
    })
    int insert(FrLog record);

    @Select({
        "select",
        "id, module_id, module_name, user_id, user_name, content, parameters, create_date, ",
        "ip_address, mac_address, remark",
        "from fr_log",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="module_id", property="moduleId", jdbcType=JdbcType.INTEGER),
        @Result(column="module_name", property="moduleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="parameters", property="parameters", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ip_address", property="ipAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="mac_address", property="macAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    FrLog selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, module_id, module_name, user_id, user_name, content, parameters, create_date, ",
        "ip_address, mac_address, remark",
        "from fr_log"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="module_id", property="moduleId", jdbcType=JdbcType.INTEGER),
        @Result(column="module_name", property="moduleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="parameters", property="parameters", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ip_address", property="ipAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="mac_address", property="macAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    List<FrLog> selectAll();

    @Update({
        "update fr_log",
        "set module_id = #{moduleId,jdbcType=INTEGER},",
          "module_name = #{moduleName,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "user_name = #{userName,jdbcType=VARCHAR},",
          "content = #{content,jdbcType=VARCHAR},",
          "parameters = #{parameters,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=TIMESTAMP},",
          "ip_address = #{ipAddress,jdbcType=VARCHAR},",
          "mac_address = #{macAddress,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FrLog record);
}