package org.example.app.service.impl;

import jakarta.transaction.Transactional;
import org.example.app.entity.Article;
import org.example.app.repository.ext.ArticleRepository;
import org.example.app.service.ext.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleRepository repository;

    @Override
    @Transactional
    public void save(Article article) {
        repository.save(article);
    }

    @Override
    @Transactional
    public List<Article> fetchAll() {
        return repository.fetchAll();
    }

    @Override
    @Transactional
    public Article fetchById(Long id) {
        return repository.fetchById(id);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        repository.delete(id);
    }
}
