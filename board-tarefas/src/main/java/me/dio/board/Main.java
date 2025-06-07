package me.dio.board;

import java.sql.SQLException;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import me.dio.board.persistence.migrations.MigrationStrategy;
import me.dio.board.ui.MainMenu;

import static me.dio.board.persistence.config.ConnectionConfig.getConnection;


//@SpringBootApplication
public class Main {

	public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

	
}
