package ejercicio3;

public class Exchange {

    Converter converter;
    public Exchange(Converter objetoMock){
        converter =  objetoMock;
    }

    public String cambiarMoneda(int cantidad,String moneda1, String moneda2){
        String msg;
        if((moneda1.equals("dolar")||moneda1.equals("boliviano")||moneda1.equals("euro")) &&
                (moneda2.equals("dolar")||moneda2.equals("boliviano")||moneda2.equals("euro")))
        {
            Double d = converter.convertirMoneda(moneda1,moneda2)*cantidad;
            double val = Math.round(d*100.0)/100.0;
            msg="La cantidad convertida fue de : "+ val+ " "+moneda2;
        }else {
            msg="La moneda no es valida";
        }
        return msg;
    }

}


