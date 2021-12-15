package com.github.paladino75.jdbcbasico.jdbcbasico.part2;

import com.github.paladino75.jdbcbasico.jdbcbasico.part3.Aluno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    // 1 NÃO ESQUECER DE BAIXAR O DRIVER PARA O BANCO DE DADOS QUE IRA UTILIZAR

    public static void main(String[] args) /*throws SQLException*/ {
       /* String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";*/

        //Connection conn = null;

        //Exception modo antigo
        /*try {

            conn = DriverManager.getConnection(urlConnection,"root","super_password");
            System.out.println("SUCESSO");

        }catch (Exception e) {

            System.out.println("FALHA");
            e.printStackTrace();

        } finally {

            conn.close();

        }*/

        //modo atual de Exception
        /*try (Connection conn = DriverManager.getConnection(urlConnection,"root","super_password");) {

            System.out.println("SUCESSO");

        }catch (Exception e) {

            System.out.println("FALHA");

        }*/


        //Abaixo conexão ao banco de dados seguindo boas práticas
        //------------------------------------------------------------------------------------------

        // Definir parâmetros para se conectar ao banco de dados MySQL.
        String driver = "mysql";
        String dataBaseAddress = "localhost";
        String dataBaseName = "digital_innovation_one";
        String user = "root";
        String password = "super_password";

        // Contrução da string de conexão.
        StringBuilder sb = new StringBuilder("jdbc:")
                .append(driver).append("://")
                .append(dataBaseAddress).append("/")
                .append(dataBaseName);

        String connectionUrl = sb.toString(); // sb.toString() == "jdbc:mysql://localhost/digital_innovation_one"

        //Carregar a classe especifica de implementação do driver na memória da JVM. (A partir da versão JDBC 4 não é mais necessário!!!)
        //Class.forName("com.mysql.jdbc.Driver");

        try(Connection conn = DriverManager.getConnection(connectionUrl,user, password)){
            System.out.println("SUCESSO ao se conectar ao banco MySQL!");
        } catch (SQLException e) {
            System.out.println("FALHA ao se conectar ao banco MySql!");
            e.printStackTrace();
        }
    }
}
