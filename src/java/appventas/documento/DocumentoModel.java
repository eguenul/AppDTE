
package appventas.documento;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import appventas.include.Conexion;
import java.io.IOException;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
public class DocumentoModel {

    Connection objconexion; 

public DocumentoModel() throws SQLException, ClassNotFoundException, ParserConfigurationException, SAXException, IOException{
  Conexion auxconexion = new Conexion();
  this.objconexion = auxconexion.obtener();
    
}
    
public List<Documento> listDocuments() throws SQLException{

    String sql = "Select * from TipoDocumentos";     
    Statement stm = this.objconexion.createStatement();
    ResultSet objrecordset = stm.executeQuery(sql);
    
    List<Documento> arrayDocumento = new ArrayList<>();
    
    
while(objrecordset.next()){
    Documento objDocumento = new Documento();
    objDocumento.setCodsii(objrecordset.getInt("CodigoSii"));
    objDocumento.setNombredoc(objrecordset.getString("TipoDocumentoDes"));
    objDocumento.setIddoc(objrecordset.getInt("TipoDocumentoId"));
    
    arrayDocumento.add(objDocumento);
    
}   
      
return arrayDocumento;
}  
    
 /*
        
public int getIddocumento(String nombredoc) throws SQLException{
    String sql = "Select *  from TipoDocumentos where TipoDocumentoDes='"+nombredoc+"'";     
    Statement stm = objconexion.createStatement();
    ResultSet objrecordset = stm.executeQuery(sql);
     objrecordset.next();   
    return objrecordset.getInt("TipoDocumentoId");
}        

*/

/*
public int getIddocumento2(int codsii) throws SQLException{
    String sql = "Select *  from TipoDocumentos where CodigoSii="+String.valueOf(codsii);     
    Statement stm = objconexion.createStatement();
    ResultSet objrecordset = stm.executeQuery(sql);
     objrecordset.next();   
    return objrecordset.getInt("TipoDocumentoId");
}       
*/

        
public int getSiiCod(int iddocumento) throws SQLException{
    String sql = "Select *  from TipoDocumentos where TipoDocumentoId="+iddocumento;     
    Statement stm = objconexion.createStatement();
    ResultSet objrecordset = stm.executeQuery(sql);
     objrecordset.next();   
    return objrecordset.getInt("CodigoSii");
}        




public String getNombreDoc(int iddocumento) throws SQLException{
    String sql = "Select *  from TipoDocumentos where TipoDocumentoId="+iddocumento;     
    Statement stm = objconexion.createStatement();
    ResultSet objrecordset = stm.executeQuery(sql);
     objrecordset.next();   
    return objrecordset.getString("TipoDocumentoDes");
}        



public int searchCorrelativo(int empresaid,String nombredoc) throws SQLException{
    int numfolio;
    String sql = "Select "+nombredoc+" from Correlativo where EmpresaId="+String.valueOf(empresaid);     
    Statement stm = objconexion.createStatement();
    ResultSet objrecordset = stm.executeQuery(sql);
    objrecordset.next();   
    numfolio = objrecordset.getInt(nombredoc);
    return numfolio;
}



public void updateCorrelativo(int empresaid,String nombredoc) throws SQLException{
    
    String sql = "Update Correlativo SET "+nombredoc+"="+nombredoc+ "+1 where EmpresaId="+String.valueOf(empresaid);     
    Statement stm = objconexion.createStatement();
    stm.executeUpdate(sql);
    
}




public int getId(String codsii) throws SQLException{
    int tipodocumentoid = 0;
    String sql = "Select * from TipoDocumentos where CodigoSii="+codsii;     
    Statement stm = objconexion.createStatement();
    ResultSet objrecordset = stm.executeQuery(sql);
    while (objrecordset.next()){
        tipodocumentoid = objrecordset.getInt("TipoDocumentoId");
 }
    return tipodocumentoid;
}


public String getNombreDocCodSii(String codsii) throws SQLException{
    
    String sql = "Select * from TipoDocumentos where CodigoSii="+codsii;     
    Statement stm = objconexion.createStatement();
    ResultSet objrecordset = stm.executeQuery(sql);
    objrecordset.next();
    return objrecordset.getString("TipoDocumentoDes");
 
   
}



}
