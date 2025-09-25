package kr.co.sboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {

    @GetMapping("/artcle/list")
    public String list(){
        return "artcle/list";
    }

    @GetMapping("/artcle/modify")
    public String modify(){
        return "artcle/modify";
    }

    @GetMapping("/artcle/searchList")
    public String searchList(){
        return "artcle/searchList";
    }

    @GetMapping("/artcle/view")
    public String view(){
        return "artcle/view";
    }

    @GetMapping("/artcle/write")
    public String write(){
        return "artcle/writew";
    }




}
