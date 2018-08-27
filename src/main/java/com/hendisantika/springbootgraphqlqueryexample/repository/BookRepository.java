package com.hendisantika.springbootgraphqlqueryexample.repository;

import com.hendisantika.springbootgraphqlqueryexample.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-graphql-query-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/08/18
 * Time: 21.51
 * To change this template use File | Settings | File Templates.
 */
public interface BookRepository extends JpaRepository<Book, String> {
}