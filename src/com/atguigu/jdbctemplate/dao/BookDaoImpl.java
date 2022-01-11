package com.atguigu.jdbctemplate.dao;

import com.atguigu.jdbctemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author LYHstart
 * @create 2022-01-11 10:04
 */
@Component
public class BookDaoImpl implements BookDao
{
    //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //添加方法
    @Override
    public void addBook(Book book) {
        String sql = "INSERT INTO t_book values(?,?,?);";
        Object[] args = {book.getUserId(),book.getUserName(),book.getuStatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println("影响了"+update+"行数据");
    }

    //更新方法
    @Override
    public void updateBook(Book book) {
        String sql = "UPDATE T_BOOK SET USERNAME=?,USTATUS=? WHERE USERID = ?;";
        //一定一定注意对应sql之中的参数顺序
        Object[] args = {book.getUserName(),book.getuStatus(),book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println("影响了"+update+"行数据");
    }

    //删除
    @Override
    public void deleteBook(Book book) {
        String sql = "Delete from t_book where userid = ?;";
        int update = jdbcTemplate.update(sql, book.getUserId());
        System.out.println("影响了"+update+"行数据");
    }

    @Override
    public int selectCount() {
        String sql = "SELECT COUNT(*) FROM t_book;";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public Book findBookInfo(String id) {
        String sql = "SELECT * FROM t_book where userid = ?;";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
    }

    @Override
    public List<Book> findAllBook() {
        String sql = "select * from t_book;";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
    }

    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?,?,?);";
        System.out.println("影响了"+jdbcTemplate.batchUpdate(sql, batchArgs).length+"行数据");
    }

    @Override
    public void batchDeleteBook(List<Object[]> batchArgs) {
        String sql = "delete from t_book where userid = ?";
        System.out.println("影响了"+jdbcTemplate.batchUpdate(sql, batchArgs).length+"行数据");
    }

    @Override
    public void batchUpdateBook(List<Object[]> batchArgs) {
        String sql = "update t_book set username=?,ustatus=? where userid=?;";
        System.out.println("影响了"+jdbcTemplate.batchUpdate(sql, batchArgs).length+"行数据");
    }
}
