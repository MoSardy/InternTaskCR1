package dsardy.in.interntaskcr1;

/**
 * Created by Shubham on 3/27/2017.
 */

public class ItemClass {

    private String name1,name2;
    private int value1,value2;

    public ItemClass(String titleinp) {
        this.name1=titleinp;
        this.name2 = "ABC Mutual Funds";

        value1 = 0;
        value2 = 0;

    }

    public ItemClass() {

        this.name1="XYZ Bank";
        this.name2 = "ABC Mutual Funds";

        value1 = 0;
        value2 = 0;

    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }
}
