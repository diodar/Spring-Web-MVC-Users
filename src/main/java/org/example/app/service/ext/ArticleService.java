package org.example.app.service.ext;

import org.example.app.entity.Article;
import org.example.app.service.BaseService;

import java.util.List;

public interface ArticleService extends BaseService<Article> {
    void save(Article article);
    List<Article> fetchAll();
    Article fetchById(Long id);
    void delete(Long id);
}
