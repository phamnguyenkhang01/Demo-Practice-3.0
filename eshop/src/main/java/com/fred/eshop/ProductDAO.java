package com.fred.eshop;

import java.sql.SQLException;
import java.util.List;

public interface ProductDAO {
    // CRUD
    void create(Product product) throws SQLException;
    Product read(int id) throws SQLException;
    List<Product> readAll() throws SQLException;
    int update(Product product) throws SQLException;
    int delete(int id) throws SQLException;
}
