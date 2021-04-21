package gao.internfinder.backend.controllers;


import gao.internfinder.backend.dto.ToDoLisst;
import gao.internfinder.backend.dto.user;
import gao.internfinder.backend.Service.ExcelService;
import org.jxls.common.Context;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;

@RestController
@SessionAttributes({"todos"})
@RequestMapping(value = "/cv")
public class CV_createdController {

    @Autowired
    ExcelService excelService;

    @ModelAttribute("todos")
    public ToDoLisst createCommand() {
        return new ToDoLisst();
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public user showForm(Model model, @ModelAttribute("todos") ToDoLisst todos) {

        if (!todos.isEmpty()) {
            return todos.peekLast();
        } else {
            user toDoItem= new user();
            return toDoItem;
        }
    }
//    @RequestMapping(value = "/forms", method = RequestMethod.POST)
//    public void create( @RequestBody ToDoItem todo, @ModelAttribute("todos") ToDoLisst todos, RedirectAttributes attributes) {
//        //todo.setCreateDate("ádasd");
//        //todo.setDescription("ádasfdfd");
//        todos.add(todo);
//
//    }
    @RequestMapping(value = "/forms", method = RequestMethod.POST)
    public void createcv(@RequestBody user user, @ModelAttribute("todos") ToDoLisst todos, RedirectAttributes attributes) {
        //todo.setCreateDate("ádasd");
        //todo.setDescription("ádasfdfd");
        todos.add(user);
    }
    @RequestMapping("test_cv")
    public void testc(HttpServletResponse response,@ModelAttribute("todos") ToDoLisst todos){
        //Map<String, Object> param =new HashMap();
       // param.put("user",todos);
        Context context = new Context();
        context.putVar("contextuser",todos);
        excelService.getExcel("template-hoanganh_demo.xlsx", System.currentTimeMillis()+".xlsx",context,response);
    }

}
