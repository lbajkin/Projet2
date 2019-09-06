import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercices {
    public List exercice1(List<String> liste){
        List<String> liste1 = liste.stream()
                .map((n) -> n.toUpperCase())
                .collect(Collectors.toList());
        return liste1;
    }

    public List exercice2(List<String> liste){
        List<String> liste2 = liste.stream()
                .filter((n) -> n != "INUTILE")
                .collect(Collectors.toList());
        return liste2;
    }

    public String exercice3(List<String> liste){
        String joining = liste.stream().collect(Collectors.joining(""));
        return joining;
    }


    public String exercice4(List<String> liste){
        List<String> liste4 = liste.stream()
                .map((n) -> n.toUpperCase())
                .filter((n) -> !n.equals("AAA") )
                .collect(Collectors.toList());
        String joining = liste4.stream().collect(Collectors.joining());

        return joining;
    }

    public List exercice5(List<Integer> liste){
        List<Integer> liste5 = liste.stream()
                .map((n) -> n*2)
                .collect(Collectors.toList());
        return liste5;
    }

    public Integer exercice6(List<Integer> liste){
        Integer liste6 = liste.stream()
                .reduce((acc, nouveau) -> acc*nouveau)
                .get();
        return liste6;
    }

    public List exercice7(List<Integer> liste){
        List<Integer> liste7 = liste.stream()
                .filter((n) -> n*n > 50)
                .collect(Collectors.toList());
        return liste7;
    }

    public List exercice8(List<Integer> liste){
        List<Character> liste8 = liste.stream()
                .map((n) -> (n*9))
                .map((n) -> n.toString())
                .map((n) -> n.charAt(0))
                .collect(Collectors.toList());
        return liste8;
    }

    public List exercice9(){
        List<Integer> liste9 = IntStream.iterate(1, (n) -> n+1)
                .filter((n) -> n % 21 == 0)
                .limit(10)
                .boxed()
                .collect(Collectors.toList());
        return liste9;
    }

    public List exercice10(){
        List<Integer> liste10 = IntStream.iterate(1, (n) -> n+1)
                .map((n) -> n*n)
                .limit(20)
                .boxed()
                .collect(Collectors.toList());
        return liste10;
    }
}
