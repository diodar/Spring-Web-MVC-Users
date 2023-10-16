package org.example.app.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.example.app.entity.Article;
import org.example.app.service.ext.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class ArticleController {

    @Autowired
    private ArticleService service;

    @RequestMapping("/articles")
    public String viewArticles(Model model) {
        List<Article> articles = service.fetchAll();
        model.addAttribute("title", "Articles");
        model.addAttribute("article", articles);
        return "articles";
    }

    @RequestMapping("/add-article")
    public String addArticle(Model model) {
        model.addAttribute("title", "Add Article");
        return "article_add";
    }

    @RequestMapping(value = "/handle-article", method = RequestMethod.POST)
    public RedirectView handleArticle(@ModelAttribute Article article, HttpServletRequest request) {
        service.save(article);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("./articles");
        return redirectView;
    }

    @RequestMapping("/update-article/{id}")
    public String updateArticle(@PathVariable("id") Long id, Model model) {
        model.addAttribute("title","Update Article");
        Article article = service.fetchById(id);
        model.addAttribute("article", article);
        return "article_update";
    }

    @RequestMapping("/delete-article/{id}")
    public RedirectView deleteArticle(@PathVariable("id") Long id, HttpServletRequest request) {
        service.delete(id);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath() + "/articles");
        return redirectView;
    }
}