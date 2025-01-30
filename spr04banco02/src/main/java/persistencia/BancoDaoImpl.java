package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository(value = "bDao")	// Si no ponemos nombre se llamara: "bancoDaoImpl"
public class BancoDaoImpl implements BancoDao {
	
	@Autowired		// Injecta el datasource por Atributo
	@Qualifier("dataSource")	// Para el caso de que haya varios DataSource se inyecta el anotado por referencia ds
	private DataSource dataSource;

	public BancoDaoImpl() {}
	public BancoDaoImpl(DataSource ds) {
		this.dataSource=ds;
	}

	public void actualizaSaldo(long dni, double incrementoSaldo) {
		String sql = "update clientes set saldo = saldo + ? where dni = ?";

		try (Connection con = dataSource.getConnection()) {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setDouble(1, incrementoSaldo);
			ps.setLong(2, dni);
			
			int n = ps.executeUpdate();
			if (n == 1) {
				System.out.println("Se ha incrementado el saldo de " + dni
						+ " en " + incrementoSaldo + " euros");
			} else {
				System.out.println("No existe el cliente con el dni " + dni);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public DataSource getDataSource() {
		return dataSource;
	}
//	@Autowired				//Injectar el dataSource por propiedad
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}