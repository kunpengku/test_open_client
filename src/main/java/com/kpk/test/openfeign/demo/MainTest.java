package com.kpk.test.openfeign.demo;

import com.kpk.test.openfeign.demo.dto.Article;
import com.kpk.test.openfeign.demo.service.OriginFeign;
import feign.Feign;
import feign.gson.GsonDecoder;
import java.util.List;

/**
 * Description
 * <p>
 * </p>
 * DATE 2018/10/30.
 *
 * @author fupeng.
 */
public class MainTest {

    public static void main(String... args) {
        OriginFeign github = Feign.builder()
                .decoder(new GsonDecoder())
                .target(OriginFeign.class, "http://localhost:3001");

        // Fetch and print a list of the contributors to this library.
        List<Article> contributors = github.articles();
        System.out.println(contributors);
    }
}
