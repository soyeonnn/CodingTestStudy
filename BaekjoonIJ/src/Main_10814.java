import java.util.*;
import java.io.*;

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}
public class Main_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Person[] people = new Person[N];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            people[i] = new Person(name, age);
        }

        Arrays.sort(people);

        for(int i=0; i<N; i++) {
            System.out.println(people[i].age + " " + people[i].name);
        }
    }
}
