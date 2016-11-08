package com.medicalsystem.mapper;

import com.medicalsystem.pojo.TPatient;
import com.medicalsystem.pojo.TPatientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPatientMapper {
    int countByExample(TPatientExample example);

    int deleteByExample(TPatientExample example);

    int deleteByPrimaryKey(Long patientId);

    int insert(TPatient record);

    int insertSelective(TPatient record);

    List<TPatient> selectByExample(TPatientExample example);

    TPatient selectByPrimaryKey(Long patientId);

    int updateByExampleSelective(@Param("record") TPatient record, @Param("example") TPatientExample example);

    int updateByExample(@Param("record") TPatient record, @Param("example") TPatientExample example);

    int updateByPrimaryKeySelective(TPatient record);

    int updateByPrimaryKey(TPatient record);
}