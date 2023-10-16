package org.example.app.repository.impl;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.example.app.entity.Article;
import org.example.app.repository.ext.ArticleRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArticleRepositoryImpl implements ArticleRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Article article) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.merge(article);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Article> fetchAll() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Article> cq = cb.createQuery(Article.class);
        Root<Article> root = cq.from(Article.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public Article fetchById(Long id) {
        Session currentSession = sessionFactory.getCurrentSession();
        return currentSession.get(Article.class, id);
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Article article = session.byId(Article.class).load(id);
        session.remove(article);
    }
}
