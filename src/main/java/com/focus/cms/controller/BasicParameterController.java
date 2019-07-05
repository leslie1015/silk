package com.focus.cms.controller;


import com.focus.cms.annotation.ViewFolder;
import com.focus.cms.entity.BasicParameter;
import com.focus.cms.service.BasicParameterService;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>
 * 参数表 前端控制器
 * </p>
 *
 * @author wangyong
 * @since 2019-07-04
 */
@Controller
@RequestMapping("/parameter")
@ViewFolder("parameter")
public class BasicParameterController extends BasicController{

  @Resource
  private BasicParameterService basicParameterService;

  @RequestMapping(value="/getParam",method = RequestMethod.GET)
  public String getIndex(Model model,int id){

    BasicParameter parameter = basicParameterService.getById(id);

    model.addAttribute("parameter",parameter);

    return view("index");
  }

}

