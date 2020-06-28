package date_class;

import java.util.Date;

public class Date_class {

    String day;
    String month;
    String year;

    String getFormattedData(){
        return day + "/" + month + "/" + year;
    }

    Date_class (String yearinit, String monthinit, String dayinit) {
        this.day = dayinit;
        this.month = monthinit;
        this.year = yearinit;
    }

    Date_class() {
        
    }
}
