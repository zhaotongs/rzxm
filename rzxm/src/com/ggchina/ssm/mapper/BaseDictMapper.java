package com.ggchina.ssm.mapper;

import java.util.List;

import com.ggchina.ssm.domain.BaseDict;

public interface BaseDictMapper {

	List<BaseDict> findBaseDictByTypeCode(String typeCode);

}
