package emAula.src.lambdastream;

import java.util.LinkedList;
import java.util.List;

public class ExewcDemoTransformString {

    public static void main(String[] args) {
        List<String> lStr = new LinkedList<String> ();
        DemoTransformString demo = new DemoTransformString();

        lStr.add("CaSA");
        lStr.add("TELA");
        lStr.add("COMputADOr");
        lStr.add("tELEFONE");
        lStr.add("ícone");

        demo.demo(lStr, s -> "-" + s + "-");
        System.out.println();

        demo.demo(lStr,
                s -> {int x = 10;
                s=s+x;
                return s;});

        System.out.println( );

    }

}
