package Prack04;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {
        FaritellPerSon Klepka = new FaritellPerSon("Клепка ");
        FaritellPerSon Znayka = new FaritellPerSon("Знайка");
        FaritellPerSon Kybik = new FaritellPerSon("Кубик");
        FaritellPerSon Tiubik = new FaritellPerSon("Тюбик");
        FaritellPerSon Zvezdochkin = new FaritellPerSon("Звездочкин");
        FaritellPerSon Steklyashkin = new FaritellPerSon("Стекляшкин");
        FaritellPerSon Traveler = new FaritellPerSon("путешественники");
        FaritellPerSon Ponchik = new FaritellPerSon("Пончик");
        Things jumping = new Things(" прыжки. ");
        Things.Properties a = jumping.new Properties();
        a.setProperties(" эти головоломные ");
        Things mistake =new Things(" ошибку");
        Things orders = new Things(" этот приказ ");
        Things IceBottom = new Things("дно");
        Things.Properties Ice = IceBottom.new Properties();
        Ice.setProperties(" ледяное ");
        Things something = new Things("что это за предмет");
        Things something1 = new Things(" что то ");
        Things Capogi3 = new Things("это попросту сапожок от скафандра.");
        Things capogi = new Things(" сапог ");
        Status before = new Before();
        Status when = new When();
        ActionMove move = new ActionMove();
        ActionNotMove SpecialMove = new ActionNotMove();
        System.out.println(move.look1("", a.outputthing())+SpecialMove.understand(Znayka.getName())
                +move.make("",mistake.toString())+ SpecialMove.take(Aplace.Luna.toString()));
        System.out.println(move.gave("Он",Aplace.raketa.toString())+",но "+
                move.notAttention(Klepka.getName(),orders.toString())+SpecialMove.Continue());
        Time.Time1.toString();
        Znayka.OutPut(move.look2(Znayka.getName(),Aplace.way.toString())+Thing.Capogi.toString()
        +SpecialMove.throww(Ponchik.getName(),when.getStatus("", move.run())+Aplace.raketa)+".\n");
        Znayka.OutPut(SpecialMove.notunderstand(Znayka.getName(),something.toString()));
        System.out.printf(",но " + SpecialMove.ActionGenaral("подняв его, убедился, что ")+Capogi3.toString());
        System.out.println(SpecialMove.ActionGenaral("Увидев, что"));
        Znayka.OutPut(move.pick(Znayka.getName(),something1.toString()));
        System.out.println(","+Kybik.getName()+", "+Tiubik.getName()+", "+ Zvezdochkin.getName()+", "
                + Steklyashkin.getName()+" и " +Klepka.getName()+Time.Time3.toString()+
                move.run1("", " к нему."));
        Klepka.OutPut(move.Snatch(Klepka.getName(),capogi.toString()));
        System.out.println(move.fasten(Aplace.альпенштока.toString()));
        System.out.printf(move.pick1(directions.вверх.toString())+ move.run1("",directions.вперед.toString()));
        System.out.printf(move.wawe() + Thing.Plag);
        Znayka.OutPut(move.shook(Znayka.getName(),Thing.head.toString())+"\n");
        System.out.printf("Скоро " + Traveler.getName()+ Aplace.пещер.toString()+ SpecialMove.ycpex(Aplace.grot.toString()));
        System.out.println(SpecialMove.Search());
        System.out.println(move.disperse(Aplace.сосулек.toString()));
        try {
            System.out.printf("и вскоре "+SpecialMove.Result("Тюбику",Thing.Capogi2.toString()));
        } catch (bootsFoundExxeption exxeption) {
            exxeption.printStackTrace();
        }
        Znayka.OutPut(SpecialMove.hastened(Znayka.getName()+" и все остальные",directions.kwhom.toString())+"\n");
        System.out.println(move.actHiuMan("Все ",Aplace.в_тоннеле.toString()));
        System.out.println(SpecialMove.Noticing(Ice.outputthing(),directions.подуклон.toString() ));
        System.out.printf(SpecialMove.Znaykaaction(Znayka.getName(),Thing.rope2.toString()," альпинисты,"));
        System.out.printf(Time.Time2.toString());
        System.out.println(before.getStatus("Не успели они ",move.actGeneral()));
        System.out.println(move.slipped(Znayka.getName(),Aplace.Ice.toString(),directions.down.toString()));
        System.out.println(SpecialMove.actThing(Thing.rope.toString()));
    }

}
