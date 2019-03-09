package com.ggchina.ssm.service.impl;



import javax.annotation.Resource;

import com.ggchina.ssm.domain.BaseDict;
import com.ggchina.ssm.mapper.BaseDictMapper;
import com.ggchina.ssm.service.IBaseDictService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BaseDictServiceImpl implements IBaseDictService {

	@Resource
	private BaseDictMapper baseDictMapper;

	@Override
	public List<BaseDict> findBaseDictByTypeCode(String typeCode) {
		return baseDictMapper.findBaseDictByTypeCode(typeCode);
	}
}
