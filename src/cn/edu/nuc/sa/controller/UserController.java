package cn.edu.nuc.sa.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.nuc.sa.entity.User;
/**
 * UserController ��һ������ע��Ŀ�����
 * ����ͬʱ������������
 */
@Controller
public class UserController {
    
	
	@RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView regist(){
        return new ModelAndView("register","command",new User());
    }


    /**
    * RequestMapping ����ӳ��һ�����������ķ���
    * value="/register" ��ʾ������ register �������д���
    */
    @RequestMapping(value="/regist")
    public String Register(@ModelAttribute("form") User user, Model model) {  
    	// user:��ͼ�㴫�����Ʋ�ı�����model�����Ʋ㷵�ظ���ͼ��Ķ���
        // �� model �����һ����Ϊ "user" �� user ����
        model.addAttribute("user", user);
        // ����һ���ַ��� " success" ��Ϊ��ͼ����
        return "success";
    }
}
