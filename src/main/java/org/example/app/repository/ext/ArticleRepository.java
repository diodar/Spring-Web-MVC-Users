package org.example.app.repository.ext;

import org.example.app.entity.Article;
import org.example.app.repository.BaseRepository;

import java.util.List;

public interface ArticleRepository extends BaseRepository<Article> {
    void save(Article article);
    List<Article> fetchAll();
    Article fetchById(Long id);
    void delete(Long id);
}
