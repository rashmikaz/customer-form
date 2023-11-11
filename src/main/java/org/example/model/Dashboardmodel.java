package org.example.model;

import org.example.dbConnection.DBConnection;
import org.example.dto.Dashboarddto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dashboardmodel {

    public boolean saveCustomer(Dashboarddto dto) throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();//call the connection

        String sql = "INSERT INTO customer VALUES(?, ?, ?, ?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1,dto.getId());
        pstm.setString(2,dto.getName());
        pstm.setString(3, dto.getAddress());
        pstm.setString(4,dto.getSalary());

        boolean isSaved = pstm.executeUpdate() > 0;

        return isSaved;
    }

}