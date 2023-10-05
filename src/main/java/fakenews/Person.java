package fakenews;

public  class Person implements Comparable<Person>{
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public  void printName(){

    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person p) {
        return this.getName().compareTo(p.getName());
    }

//    @Override
//    public int compareTo(Person p) {
//        // this object > p - return positive
//        if(this.getAge() > p.getAge()){
//            return 1;
//        }else if(this.getAge() < p.getAge()){
//            return - 1;
//            //if less than i return a negative
//
//        }else{
//            return 0;
//        }
//
//    }
}
