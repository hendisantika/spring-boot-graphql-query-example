package com.hendisantika.springbootgraphqlqueryexample.service.datafetcher;

import com.hendisantika.springbootgraphqlqueryexample.entity.Book;
import com.hendisantika.springbootgraphqlqueryexample.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-graphql-query-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/08/18
 * Time: 21.54
 * To change this template use File | Settings | File Templates.
 */
@Component
public class BookDataFetcher implements DataFetcher<Optional<Book>> {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Optional<Book> get(DataFetchingEnvironment dataFetchingEnvironment) {

        String isn = dataFetchingEnvironment.getArgument("id");

        return bookRepository.findById(isn);
    }
}