import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class prova3 {
    public static void main(String[] args)  {
    
        JSONParser jsonP = new JSONParser();
        double maior=0;
        double media=0;
        double menor=0;
        int vazio=0;
        int diasacimadamedia=0;
        
        try(FileReader reader = new FileReader("./src/dados.json")){
            

            Object obj = jsonP.parse(reader);
            JSONArray valorlist = (JSONArray) obj;
            int i=0;
            while (i<valorlist.size()){
                JSONObject dia = (JSONObject) valorlist.get(i);
                double teste = Double.parseDouble((String) dia.get("valor").toString());
                if(teste!=0){
                    media += teste;
                    if(teste>maior)
                        maior=teste;
                    
                    if(teste<menor || menor == 0)
                        menor=teste;
                }else{       
                    vazio++;
                }
            i++;
            }
            media = media/(valorlist.size()-vazio);
        for (i = 0; i<valorlist.size();i++){
            JSONObject dia = (JSONObject) valorlist.get(i);
            double teste = Double.parseDouble((String) dia.get("valor").toString());
                
            if(teste>media)
            diasacimadamedia++;
        }

            System.out.println("Maior valor alcançado, R$ "+ maior);
            System.out.println("Menor valor alcançado, R$ "+ menor);
            System.out.println("A média do mês ficou em R$ "+ media + " em um total de " + (valorlist.size()-vazio)+ " dias de faturamento.");
            System.out.println(diasacimadamedia+ " foram os dias de faturamento acima da média.");

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ParseException e){
            e.printStackTrace();
        }
       
    }

}