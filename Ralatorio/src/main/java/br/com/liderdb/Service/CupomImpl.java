package br.com.liderdb.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import br.com.liderdb.Model.Cupom;
import net.sf.jasperreports.engine.*;

@Service
public class CupomImpl {
	
	public static final String CUPOMS = "classpath:jasper/cupoms/";
	public static final String ARQUIVOJRXML = "cupom.jrxml";
	public static final String DESTINOPDF = "C:\\Users\\Bernardo\\eclipse-workspace\\Ralatorio\\src\\main\\resources\\jasper\\relatorios\\";

	public void gerar(Cupom cupom) throws IOException {
		Map<String, Object> params = new HashMap<>();
		params.put("nome", cupom.getNome());
		params.put("desconto", cupom.getDesconto());
		params.put("data", cupom.getData());
		params.put("idade", cupom.getIdade());
		
		String caminhoAbsoluto = getCaminhoAbsoluto();
		try {
			String folderDiretorio = getDiretorioSalvar("cupoms-salvos");
			JasperReport report = JasperCompileManager.compileReport(caminhoAbsoluto);
			JasperPrint print = JasperFillManager.fillReport(report, params, new JREmptyDataSource());
			JasperExportManager.exportReportToPdfFile(print, folderDiretorio);
		} catch (JRException e) {
			throw new RuntimeException(e);
		}
	}
	
	private void criarDiretorio(String nome) {
		File dir  = new File(nome);
		if (!dir.exists()) {
			dir.mkdir();
		}
	}
	private String getDiretorioSalvar(String nome) {
		this.criarDiretorio(DESTINOPDF);
		return DESTINOPDF+nome.concat(".pdf");
	}
	
	private String getCaminhoAbsoluto() throws FileNotFoundException {
		return ResourceUtils.getFile(CUPOMS+ARQUIVOJRXML).getAbsolutePath();
	}
}