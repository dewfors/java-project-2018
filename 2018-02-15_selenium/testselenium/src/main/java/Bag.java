/**
 * Created by zm on 26.07.2018.
 */
public class Bag {

    private String name; //1
    private String nameArt; //2
    private String kodArt; //3
    private String val; //4
    private String priceSale; //5
    private String availableForOrder; //6 Доступен для заказа
    private String priceCrossed; //7
    private String priceZakup; //8
    private String count; //9 В наличии
    private String countM; //10 В наличии Москва
    private String descrSmall; //11
    private String descr; //12
    private String label; //13
    private String status; //14
    private String type; //15 тип товара "Рюкзаки"
    private String tegs; //16
    private String nalog; //17
    private String title; //18
    private String metaKey; //19
    private String metaDescr; //20
    private String link; //21
    private String linkYoutube; //22
    private String dop; //23
    private String gender; //24
    private String countryBrend; //25
    private String size; //26
    private String volume; //27
    private String material; //28
    private String noutbook; //29
    private String weigth; //30
    private String brend; //31
    private String color; //32
    private String foto_01; //33
    private String foto_02; //34
    private String foto_03; //35
    private String foto_04; //36
    private String foto_05; //37
    private String foto_06; //38
    private String foto_07; //39
    private String foto_08; //40
    private String foto_09; //41
    private String foto_10; //42
    private String foto_11; //43
    private String foto_12; //44
    private String foto_13; //45
    private String foto_14; //46
    private String foto_15; //47
    private String foto_16; //48
    private String foto_17; //49
    private String foto_18; //50
    private String foto_19; //51


    public Bag(String name, String nameArt, String kodArt, String val, String priceSale, String availableForOrder, String priceCrossed, String priceZakup, String count, String countM, String descrSmall, String descr, String label, String status, String type, String tegs, String nalog, String title, String metaKey, String metaDescr, String link, String linkYoutube, String dop, String gender, String countryBrend, String size, String volume, String material, String noutbook, String weigth, String brend, String color, String foto_01, String foto_02, String foto_03, String foto_04, String foto_05, String foto_06, String foto_07, String foto_08, String foto_09, String foto_10, String foto_11, String foto_12, String foto_13, String foto_14, String foto_15, String foto_16, String foto_17, String foto_18, String foto_19) {

        this.name = name;
        this.nameArt = nameArt;
        this.kodArt = kodArt;
        this.val = val;
        this.priceSale = priceSale;
        this.availableForOrder = availableForOrder;
        this.priceCrossed = priceCrossed;
        this.priceZakup = priceZakup;
        this.count = count;
        this.countM = countM;
        this.descrSmall = descrSmall;
        this.descr = descr;
        this.label = label;
        this.status = status;
        this.type = type;
        this.tegs = tegs;
        this.nalog = nalog;
        this.title = title;
        this.metaKey = metaKey;
        this.metaDescr = metaDescr;
        this.link = link;
        this.linkYoutube = linkYoutube;
        this.dop = dop;
        this.gender = gender;
        this.countryBrend = countryBrend;
        this.size = size;
        this.volume = volume;
        this.material = material;
        this.noutbook = noutbook;
        this.weigth = weigth;
        this.brend = brend;
        this.color = color;
        this.foto_01 = foto_01;
        this.foto_02 = foto_02;
        this.foto_03 = foto_03;
        this.foto_04 = foto_04;
        this.foto_05 = foto_05;
        this.foto_06 = foto_06;
        this.foto_07 = foto_07;
        this.foto_08 = foto_08;
        this.foto_09 = foto_09;
        this.foto_10 = foto_10;
        this.foto_11 = foto_11;
        this.foto_12 = foto_12;
        this.foto_13 = foto_13;
        this.foto_14 = foto_14;
        this.foto_15 = foto_15;
        this.foto_16 = foto_16;
        this.foto_17 = foto_17;
        this.foto_18 = foto_18;
        this.foto_19 = foto_19;
    }


    @Override
    public String toString() {
        return "BagAsgard{" +
                "name='" + name + '\'' +
                ", nameArt='" + nameArt + '\'' +
                ", kodArt='" + kodArt + '\'' +
                ", val='" + val + '\'' +
                ", priceSale='" + priceSale + '\'' +
                ", availableForOrder='" + availableForOrder + '\'' +
                ", priceCrossed='" + priceCrossed + '\'' +
                ", priceZakup='" + priceZakup + '\'' +
                ", count='" + count + '\'' +
                ", countM='" + countM + '\'' +
                ", descrSmall='" + descrSmall + '\'' +
                ", descr='" + descr + '\'' +
                ", label='" + label + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", tegs='" + tegs + '\'' +
                ", nalog='" + nalog + '\'' +
                ", title='" + title + '\'' +
                ", metaKey='" + metaKey + '\'' +
                ", metaDescr='" + metaDescr + '\'' +
                ", link='" + link + '\'' +
                ", linkYoutube='" + linkYoutube + '\'' +
                ", dop='" + dop + '\'' +
                ", gender='" + gender + '\'' +
                ", countryBrend='" + countryBrend + '\'' +
                ", size='" + size + '\'' +
                ", volume='" + volume + '\'' +
                ", material='" + material + '\'' +
                ", noutbook='" + noutbook + '\'' +
                ", weigth='" + weigth + '\'' +
                ", brend='" + brend + '\'' +
                ", color='" + color + '\'' +
                ", foto_01='" + foto_01 + '\'' +
                ", foto_02='" + foto_02 + '\'' +
                ", foto_03='" + foto_03 + '\'' +
                ", foto_04='" + foto_04 + '\'' +
                ", foto_05='" + foto_05 + '\'' +
                ", foto_06='" + foto_06 + '\'' +
                ", foto_07='" + foto_07 + '\'' +
                ", foto_08='" + foto_08 + '\'' +
                ", foto_09='" + foto_09 + '\'' +
                ", foto_10='" + foto_10 + '\'' +
                ", foto_11='" + foto_11 + '\'' +
                ", foto_12='" + foto_12 + '\'' +
                ", foto_13='" + foto_13 + '\'' +
                ", foto_14='" + foto_14 + '\'' +
                ", foto_15='" + foto_15 + '\'' +
                ", foto_16='" + foto_16 + '\'' +
                ", foto_17='" + foto_17 + '\'' +
                ", foto_18='" + foto_18 + '\'' +
                ", foto_19='" + foto_19 + '\'' +
                '}';
    }

    public String toCSV(){
        return "" +
                name + ";" +
                nameArt + ";" +
                kodArt + ";" +
                val + ";" +
                priceSale + ";" +
                availableForOrder + ";" +
                priceCrossed + ";" +
                priceZakup + ";" +
                count + ";" +
                countM + ";" +
                descrSmall + ";" +
                descr + ";" +
                label + ";" +
                status + ";" +
                type + ";" +
                tegs + ";" +
                nalog + ";" +
                title + ";" +
                metaKey + ";" +
                metaDescr + ";" +
                link + ";" +
                linkYoutube + ";" +
                dop + ";" +
                gender + ";" +
                countryBrend + ";" +
                size + ";" +
                volume + ";" +
                material + ";" +
                noutbook + ";" +
                weigth + ";" +
                brend + ";" +
                color + ";" +
                foto_01 + ";" +
                foto_02 + ";" +
                foto_03 + ";" +
                foto_04 + ";" +
                foto_05 + ";" +
                foto_06 + ";" +
                foto_07 + ";" +
                foto_08 + ";" +
                foto_09 + ";" +
                foto_10 + ";" +
                foto_11 + ";" +
                foto_12 + ";" +
                foto_13 + ";" +
                foto_14 + ";" +
                foto_15 + ";" +
                foto_16 + ";" +
                foto_17 + ";" +
                foto_18 + ";" +
                foto_19
                ;
    }



}
