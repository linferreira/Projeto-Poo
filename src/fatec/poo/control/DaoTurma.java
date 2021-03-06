package fatec.poo.control;

import fatec.poo.model.Turma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoTurma {

    private Connection conn;

    public DaoTurma(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_Turma(siglaTurma, descricao, dataInicio, dataTermino, periodo, qtdeVagas, cpfInstrutor, siglaCurso)"
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, turma.getSiglaTurma());
            ps.setString(2, turma.getDescricao());
            ps.setString(3, turma.getDataInicio());
            ps.setString(4, turma.getDataTermino());
            ps.setString(5, turma.getPeriodo());
            ps.setInt(6, turma.getQtdeVagas());
            ps.setString(7, null);
            ps.setString(8, turma.getCurso().getSigla());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void alterar(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tb_Turma SET descricao = ?, dataInicio = ?, dataTermino = ?, periodo = ?, qtdeVagas = ?, cpfInstrutor = ?, siglaCurso = ?"
                    + "WHERE siglaTurma = ?");
            ps.setString(1, turma.getDescricao());
            ps.setString(2, turma.getDataInicio());
            ps.setString(3, turma.getDataTermino());
            ps.setString(4, turma.getPeriodo());
            ps.setInt(5, turma.getQtdeVagas());
            if (turma.getInstrutor() != null) {
                ps.setString(6, turma.getInstrutor().getCpf());
            } else {
                ps.setString(6, null);
            }
            ps.setString(7, turma.getCurso().getSigla());
            ps.setString(8, turma.getSiglaTurma());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public Turma consultar(String siglaTurma) {
        Turma t = null;
        DaoCurso dc = new DaoCurso(conn);
        DaoInstrutor di = new DaoInstrutor(conn);
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tb_Turma WHERE siglaTurma = ?");
            ps.setString(1, siglaTurma);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                t = new Turma(siglaTurma, rs.getString("descricao"));
                t.setDataInicio(rs.getString("dataInicio"));
                t.setDataTermino(rs.getString("dataTermino"));
                t.setPeriodo(rs.getString("periodo"));
                t.setQtdeVagas(rs.getInt("qtdeVagas"));
                t.setInstrutor(di.consultar(rs.getString("cpfInstrutor")));
                t.setCurso(dc.consultar(rs.getString("siglaCurso")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (t);
    }

    public void excluir(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tb_Turma WHERE siglaTurma = ?");
            ps.setString(1, turma.getSiglaTurma());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public ArrayList<Turma> listarTurmasCurso(String siglaCurso) {
        ArrayList<Turma> turmas = new ArrayList<>();
        DaoCurso dc = new DaoCurso(conn);
        DaoInstrutor di = new DaoInstrutor(conn);
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tb_Turma WHERE siglaCurso = ?");
            ps.setString(1, siglaCurso);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Turma t = new Turma(rs.getString("siglaTurma"), rs.getString("descricao"));
                t.setDataInicio(rs.getString("dataInicio"));
                t.setDataTermino(rs.getString("dataTermino"));
                t.setPeriodo(rs.getString("periodo"));
                t.setQtdeVagas(rs.getInt("qtdeVagas"));
                t.setInstrutor(di.consultar(rs.getString("cpfInstrutor")));
                t.setCurso(dc.consultar(rs.getString("siglaCurso")));
                turmas.add(t);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (turmas);
    }
}
