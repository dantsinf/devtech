package emAula.src.lambdastream;

public class CheckOlder_60 implements CheckPerson {
     public boolean test(Person p){
         return p.age() >= 60;
     }
}
