package ejercicioUnitTestNextDay;
import java.util.ArrayList;
import java.util.Locale;

public class DateUtils {
    private final ArrayList<String> months = new ArrayList<String>();

    public DateUtils(){
        months.add("enero");
        months.add("febrero");
        months.add("marzo");
        months.add("abril");
        months.add("mayo");
        months.add("junio");
        months.add("julio");
        months.add("agosto");
        months.add("septiembre");
        months.add("octubre");
        months.add("noviembre");
        months.add("diciembre");
}

    public String NDate(int day, String month, int year) {
        month= month.toLowerCase();
        String nextDate="";
        boolean bisiesto= isBisiesto(year);
        if (day > 31 || day < 1||year<1||!months.contains(month) || (month.equals("febrero") && day>29 )) {
            System.out.println("La fecha introducida no es valida");
        }else if(day<28 && !bisiesto && month.equals("febrero") || (day<29 && bisiesto && month.equals("febrero"))){
                nextDate= nextMonth(day, month, year);
        }else if(day<30 && (month.equals("abril") || month.equals("junio")||
                month.equals("septiembre")||month.equals("noviembre"))){

                nextDate= nextMonth(day, month, year);
        }else if(day<31 && (month.equals("enero") || month.equals("marzo")||
                month.equals("mayo")||month.equals("julio")||month.equals("agosto")
                ||month.equals("octubre"))){
                nextDate= nextMonth(day, month, year);
        }else if(month.equals(months.get(11))){
                day=1;
                month=months.get(0);
                year++;
                nextDate=day+"/"+month+"/"+year;
                System.out.println(nextDate);
        }else {
            day++;
            nextDate=day+"/"+month+"/"+year;
            System.out.println(nextDate);
        }

        return nextDate;
    }

    public String nextMonth(int day, String month, int year){
        day=1;
        int mVal= months.indexOf(month)+1;
        month=months.get(mVal);
        String nextDate=day+"/"+month+"/"+year;
        System.out.println(nextDate);
        return nextDate;
    }

    public boolean isBisiesto(int anio){

        boolean bisiesto= ((anio % 4 == 0) && (anio % 100 != 0)) || (anio % 400 == 0);
        return bisiesto;
    }

    public static void main(String[] args) {
   DateUtils date = new DateUtils();
   date.NDate(30,"abril",2001);
    }
}

