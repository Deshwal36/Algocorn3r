import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.*;
import java.util.stream.Stream;

public class ShipmentManagement {


    public static void main(String[] args) {

        List<ShippingEntry> list1=new ArrayList<>();

        Item i1=new Item(1234,25,40);
        ShippingEntry s1=new ShippingEntry(i1,2);
        Item i2=new Item(1954,50,41);
        ShippingEntry s2=new ShippingEntry(i2,5);
        Item i3=new Item(1234,75,40);
        ShippingEntry s3=new ShippingEntry(i3,5);
        Item i4=new Item(2101,10,21);
        ShippingEntry s4=new ShippingEntry(i4,2);


        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        list1.add(s4);

        ShippingList ship1=new ShippingList(list1,1);


        List<ShippingEntry> list2=new ArrayList<>();

        Item j1=new Item(1234,50,40);
        ShippingEntry t1=new ShippingEntry(j1,7);
        Item j2=new Item(1954,50,41);
        ShippingEntry t2=new ShippingEntry(j2,6);
        Item j3=new Item(1234,25,40);
        ShippingEntry t3=new ShippingEntry(j3,8);
        Item j4=new Item(310,100,95);
        ShippingEntry t4=new ShippingEntry(j4,15);


        list2.add(t1);
        list2.add(t2);
        list2.add(t3);
        list2.add(t4);

        ShippingList ship2=new ShippingList(list2,1);

        ShippingList res=mergeShippingList(ship1,ship2);

//        int k=0;
//        while(k<res.getLs().size()){
//
//            System.out.println(res.getLs().get(k).item.toString()+ " : "+res.getLs().get(k).count);
//            k++;
//        }

        Iterator<ShippingEntry> it = res.getLs().iterator();

        while (it.hasNext()) {

            ShippingEntry s=it.next();
            System.out.println(s.item.toString()+" : "+s.count);
        }


    }

    static ShippingList mergeShippingList(ShippingList s1,ShippingList s2){

        List<ShippingEntry> res=new ArrayList<>();
//
//        Iterator<ShippingEntry> i1=s1.getLs().iterator();
//        Iterator<ShippingEntry> i2=s2.getLs().iterator();
//
//        while(i1.hasNext()){
//
//            ShippingEntry en1=i1.next();
//
//            int count=en1.count;
//            //System.out.println(" Before : "+count);
//            while(i2.hasNext()){
//
//                ShippingEntry en2= i2.next();
//                if(en1.item.equals(en2.item) && en2.count!=-1){
//                    count+=en2.count;
//                    en2.setCount(-1);
//                }
//
//            }
//            //System.out.println("After : "+ count);
//
//            ShippingEntry cur=new ShippingEntry(en1.item,count);
//            res.add(cur);
//        }






        int i=0;
        while(i<s1.ls.size()){

            int count=s1.getLs().get(i).count;
            //System.out.println("count before: "+count);
            int j=0;
            while(j<s2.getLs().size()){

                if(s1.getLs().get(i).item.equals(s2.getLs().get(j).item) && s2.getLs().get(j).count!=-1){
                    count+=s2.getLs().get(j).count;
                    //l2.remove(l2.get(j));
                    s2.getLs().get(j).setCount(-1);
                    //l1.get(i).setCount(-1);
                    //System.out.println("inside :" +j);

                }

                j++;

            }

            //System.out.println("count After: "+count);

            ShippingEntry s=new ShippingEntry(s1.getLs().get(i).item,count);
            res.add(s);
            //l1.remove(l1.get(i));
            i++;

        }

        int k=0;

        while(k<s2.getLs().size() ){
            if(s2.getLs().get(k).count!=-1)
            res.add(s2.getLs().get(k));
            k++;
        }

        ShippingList sp=new ShippingList(res,3);

        return sp;

    }


}

class ShippingList{

    int cusid;
    List<ShippingEntry> ls;

    ShippingList(List<ShippingEntry> list,int cusid){

        this.ls=list;
        this.cusid=cusid;
    }

    public int getCusid() {
        return cusid;
    }

    public void setCusid(int cusid) {
        this.cusid = cusid;
    }

    public List<ShippingEntry> getLs() {
        return ls;
    }

    public void setLs(List<ShippingEntry> ls) {
        this.ls = ls;
    }
}


class ShippingEntry{

    Item item;
    int count;

    ShippingEntry(Item i,int c){

        this.item=i;
        this.count=c;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

}

class Item{

    int productCode;
    int size;
    int batchNo;

    Item(int p,int s,int b){
        this.productCode=p;
        this.size=s;
        this.batchNo=b;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(int batchNo) {
        this.batchNo = batchNo;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return productCode == item.productCode && size == item.size && batchNo == item.batchNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productCode, size, batchNo);
    }

    @Override
    public String toString() {
        return "Item{" +
                "productCode=" + productCode +
                ", size=" + size +
                ", batchNo=" + batchNo +
                '}';
    }
}
