
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import joinery.DataFrame;
import tech.tablesaw.api.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MIDO
 */
public class ReadMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            // Reading using Joinary
            DataFrame<Object> df = DataFrame.readCsv("F:\\Iti\\Foundation period\\Java & UML programming\\Lecs\\Day5\\tested.csv");
            List<Object> passengers = df.col("Survived");
            System.out.println("Joinary survived column"+passengers);
            // Reading using TableSaw
//            Table titanicData;
//            titanicData = Table.read().file("F:\\Iti\\Foundation period\\Java & UML programming\\Lecs\\Day5\\tested.csv");
//            System.out.println("Tablse saw data");
//            System.out.println(titanicData.summary());
        } catch (IOException ex) {
            Logger.getLogger(ReadMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
