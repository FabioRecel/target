public class prova4 {

	    
	    public static void main(String[] args) {
            double sp = 67836.43;
            double rj = 36678.66;
            double mg = 29229.88;
            double es = 27165.48;
            double outros = 19849.53;
            double total = sp + rj + mg + es + outros;

            double psp = (sp * 100)/total;
            double prj = (rj * 100)/total;
            double pmg = (mg * 100)/total;
            double pes = (es * 100)/total;
            double poutros = (outros * 100)/total;

            System.out.println("Total de vendas R$ " +String.format("%.2f", total));
            
            System.out.println("Percentual de SP = " + String.format("%.2f",psp)  + " % ");
            System.out.println("Percentual de RJ = " + String.format("%.2f",prj)  + " % ");
            System.out.println("Percentual de MG = " + String.format("%.2f",pmg)  + " % ");
            System.out.println("Percentual de ES = " + String.format("%.2f",pes)  + " % ");
            System.out.println("Percentual de outros estados = " + String.format("%.2f",poutros)  + " % ");
        
    
        }
           
	

    
}
