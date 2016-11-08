package com.medicalsystem.mapper;

import com.medicalsystem.pojo.TGuahao;
import com.medicalsystem.pojo.TGuahaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGuahaoMapper {
    int countByExample(TGuahaoExample example);

    int deleteByExample(TGuahaoExample example);

    int deleteByPrimaryKey(Long guahaoId);

    int insert(TGuahao record);

    int insertSelective(TGuahao record);

    List<TGuahao> selectByExample(TGuahaoExample example);

    TGuahao selectByPrimaryKey(Long guahaoId);

    int updateByExampleSelective(@Param("record") TGuahao record, @Param("example") TGuahaoExample example);

    int updateByExample(@Param("record") TGuahao record, @Param("example") TGuahaoExample example);

    int updateByPrimaryKeySelective(TGuahao record);

    int updateByPrimaryKey(TGuahao record);
}