package conexoes;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Br
 */
public class ConexaoMySql {

    private boolean status = false;
    private String mensagem = "";   //variavel que vai informar o status da conexao
    private static Connection con;  //variavel para conexao
    private Statement statement;
    private ResultSet resultSet;

    final private String driver = "org.firebirdsql.jdbc.FBDriver";
    String CHARSET = "?encoding=ISO8859_1";
    String SERVIDOR = "localhost";
    String PORTA = "3050";
    String nomeDoBanco = "dbvendasrenan";
    String USUARIO = "sysdba";
    String SENHA = "masterkey";

    public ConexaoMySql() {
    }

    public ConexaoMySql(String pServidor, String pNomeDoBanco, String pUsuario, String pSenha) {
        this.SERVIDOR = pServidor;
        this.nomeDoBanco = pNomeDoBanco;
        this.USUARIO = pUsuario;
        this.SENHA = pSenha;
    }

    /**
     * Abre uma conexao com o banco
     *
     * @return Connection
     */
    public Connection conectar() {

//        String ENDERECO_DB = System.getProperty("user.dir") + File.separator + "DBVENDASRENAN.FDB"; versão correta porem não funciona pois não está na mesma pasta do projeto
        String ENDERECO_DB = "D:\\VendasRenan\\src\\dbvendasrenan\\DBVENDASRENAN.FDB";
        try {
            if (con == null) {
                Class.forName(driver);
                con = DriverManager.getConnection("jdbc:firebirdsql:" + SERVIDOR + "/" + PORTA + ":" + ENDERECO_DB + CHARSET, USUARIO, SENHA);
//                JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso");
            }
        } catch (ClassNotFoundException Fonte) {
            JOptionPane.showMessageDialog(null, "Driver não localizado", "Erro", 0);
        } catch (SQLException Fonte) {
            JOptionPane.showMessageDialog(null, "ERRO AO CONCECTAR COM SERVIDOR FIREBIRD", "ATENÇÃO", (2));
        }
        return this.getCon();
    }

    /**
     * Executa consultas SQL
     *
     * @param pSQL
     * @return int
     */
    public boolean executarSQL(String pSQL) {
        try {
            //createStatement de con para criar o Statement
            this.setStatement(getCon().createStatement());

            // Definido o Statement, executamos a query no banco de dados
            this.setResultSet(getStatement().executeQuery(pSQL));

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean executarUpdateDeleteSQL(String pSQL) {
        try {

            //createStatement de con para criar o Statement
            this.setStatement(getCon().createStatement());

            // Definido o Statement, executamos a query no banco de dados
            getStatement().executeUpdate(pSQL);

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * Executa insert SQL
     *
     * @param pSQL
     * @return boolean
     */
    public int insertSQL(String pGen, String pSQL) {
        int status = 0;
        try {
            //createStatement de con para criar o Statement
            this.setStatement(getCon().createStatement());

            // Definido o Statement, executamos a query no banco de dados
            this.getStatement().executeUpdate(pSQL);
//            switch (JOptionPane.showConfirmDialog(null, "Deseja excluir venda selecionada?", "EXCLUSÃO DE VENDA", JOptionPane.YES_NO_OPTION)) {
//                    case 0:
//                        controllerVendas.excluirVendasController(codigoVenda);
//                        this.carregarVendas();
//                        break;
//
//                    case 1:
//                        JOptionPane.showMessageDialog(this, "Erro ao excluir a venda!", "ERRO", JOptionPane.ERROR_MESSAGE);
//                        break;
//                }
            //consulta o ultimo id inserido
            this.setResultSet(this.getStatement().executeQuery("SELECT GEN_ID("+pGen+", 0) FROM RDB$DATABASE;"));

            //recupera o ultimo id inserido
            while (this.resultSet.next()) {
                status = this.resultSet.getInt(1);
            }

            //retorna o ultimo id inserido
            return status;
        } catch (SQLException ex) {
            ex.printStackTrace();
                return status;
        }
    }

    /**
     * encerra a conexão corrente
     *
     * @return boolean
     */
    public boolean fecharConexao() {
        try {
            if ((this.getResultSet() != null) && (this.statement != null)) {
                this.getResultSet().close();
                this.statement.close();
            }
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return this.status;
    }

    /**
     * @return the mensagem
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * @return the statement
     */
    public Statement getStatement() {
        return statement;
    }

    /**
     * @return the resultSet
     */
    public ResultSet getResultSet() {
        return resultSet;
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    /**
     * @return the con
     */
    public static Connection getCon() {
        return con;
    }

    /**
     * @param con the con to set
     */
    public void setCon(Connection con) {
        this.con = con;
    }

    /**
     * @param statement the statement to set
     */
    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    /**
     * @param resultSet the resultSet to set
     */
    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    /**
     * @return the servidor
     */
    public String getServidor() {
        return SERVIDOR;
    }

    /**
     * @param servidor the servidor to set
     */
    public void setServidor(String servidor) {
        this.SERVIDOR = SERVIDOR;
    }

    /**
     * @return the nomeDoBanco
     */
    public String getNomeDoBanco() {
        return nomeDoBanco;
    }

    /**
     * @param nomeDoBanco the nomeDoBanco to set
     */
    public void setNomeDoBanco(String nomeDoBanco) {
        this.nomeDoBanco = nomeDoBanco;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return USUARIO;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.USUARIO = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return SENHA;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.SENHA = senha;
    }

}
