package com.kpk.test.openfeign.demo.service;

import com.kpk.test.openfeign.demo.dto.Article;
import feign.RequestLine;
import java.util.List;

/**
 * Description
 * <p>
 * </p>
 * DATE 2018/10/31.
 *
 * @author fupeng.
 */

public interface OriginFeign {

    @RequestLine("GET /articles")
    List<Article> articles();

}
