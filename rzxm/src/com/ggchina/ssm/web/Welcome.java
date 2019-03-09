package com.ggchina.ssm.web;

import com.ggchina.ssm.domain.BaseDict;
import com.ggchina.ssm.service.IBaseDictService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class Welcome {
    @Resource
    private IBaseDictService baseDictService;
    @RequestMapping("/list")
    public String listCustomer(Model model) {
//2.根据数据字典类型查询客户所属行业
        List<BaseDict> industList = baseDictService.findBaseDictByTypeCode("002");
        model.addAttribute("industryList",industList);
        return "customer";
    }
}
