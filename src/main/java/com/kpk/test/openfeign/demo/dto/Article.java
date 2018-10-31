package com.kpk.test.openfeign.demo.dto;

/**
 * Description
 * <p>
 * </p>
 * DATE 2018/10/30.
 *
 * @author fupeng.
 */
public class Article {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                '}';
    }
}
