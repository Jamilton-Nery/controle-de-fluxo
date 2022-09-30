public class For {
    public static void main(String[] args) {
        for (int semana = 1; semana <= 4; semana++) {
            System.out.println("SEMANA" + semana);

            for (int dias =1; dias <= 7; dias++) {

                switch (dias) {
                    case 1:{
                        System.out.println(" segunda");
                        break;
                    }
                    case 2:{
                        System.out.println(" terça");
                        break;
                    }
                    case 3:{
                        System.out.println(" quarta");
                        break;
                    }
                    case 4:{
                        System.out.println(" quinta");
                        break;
                    }
                    case 5:{
                        System.out.println(" sexta");
                        break;
                    }
                    case 6:{
                        System.out.println(" sabado");
                        break;
                    }
                    case 7:{
                        System.out.println(" domingo");
                        break;
                    }
                }
            }
        }
        System.out.println("proximo mes");
    }
}

