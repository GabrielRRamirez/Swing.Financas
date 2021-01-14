package Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class FormatadorData {

    public FormatadorData() {

    }

    public String formataDataBanco(Date data) {
        String dataFormatada = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        dataFormatada = sdf.format(data);

        //System.out.println(dataFormatada);
        return dataFormatada;
    }
    
    public String formataDataTela(Date data) {
        String dataFormatada = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        dataFormatada = sdf.format(data);

        //System.out.println(dataFormatada);
        return dataFormatada;
    }

}
