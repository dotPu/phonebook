package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.PhonebookService;
import vo.PhonebookVO;

@Controller
public class PhonebookController {

	@Autowired
	PhonebookService service;
	ModelAndView mv = new ModelAndView();
	
	@RequestMapping("/")
	public ModelAndView getList() {
		mv.addObject("list",service.getList());
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/insert")
	public ModelAndView insert(PhonebookVO pb) {
		mv.addObject("result",service.insert(pb));
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/find")
	public ModelAndView find(String search) {
		System.out.println(search);
		mv.addObject("findlist",service.find(search));
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/findOne")
	public ModelAndView findOne(int idx) {
		mv.addObject("phonebook",service.findOne(idx));
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/update")
	public ModelAndView update(PhonebookVO pb) {
		mv.addObject("result",service.update(pb));
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(int idx) {
		mv.addObject("result",service.delete(idx));
		mv.setViewName("index");
		return mv;
	}
	
}
