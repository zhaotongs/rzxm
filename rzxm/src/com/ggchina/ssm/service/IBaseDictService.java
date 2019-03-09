package com.ggchina.ssm.service;

import com.ggchina.ssm.domain.BaseDict;

import java.util.List;



public interface IBaseDictService {

	List<BaseDict> findBaseDictByTypeCode(String string);

}
