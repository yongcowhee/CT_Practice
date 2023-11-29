import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Person> personList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Person p = new Person(Integer.parseInt(st.nextToken()), st.nextToken());
            personList.add(p);
        }

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.age - p2.age;
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(personList.get(i).age + " " + personList.get(i).name);
        }
    }
}