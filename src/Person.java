public class Person {
    /*
    添加属性
     */
    private String name;
    private  char gender;
    private int weight;
    private int height;
    private int faceofValue;
    /*
    添加方法
     */
    private String getName() {
        return name;
    }
    private void setName(String name) {
        this.name=name;
    }
    private char getGender() {
        return gender;
    }
    private void setGender(char gender) {
        this.gender=gender;
    }
    private int getWeight() {
        return weight;
    }
    private void setWeight(int weight) {
        this.weight=weight;
    }
    private int getHeight() {
        return height;
    }
    private void setHeight(int height) {
        this.height=height;
    }
    private int getFaceofValue() {
        return faceofValue;
    }
    private void setFaceofValue(int faceofValue) {
        this.faceofValue=faceofValue;
    }
    /*
    实例化对象
     */
        public static void main(String[] args) {
            Person boy = new Person();
            boy.setName("baby");
            boy.setGender('男');
            boy.setWeight(1999);
            boy.setWeight(2000);
            boy.setFaceofValue(0);

            /*
            输出
             */
            String name="name:"+boy.getName()+",";
            String gender="gender:"+boy.getGender()+",";
            String weight="weight:"+boy.getWeight()+",";
            String height="height:"+boy.getHeight()+",";
            String faceofValue="faceofValue:"+boy.getFaceofValue()+",";
            System.out.println(name);
            System.out.println(gender);
            System.out.println(weight);
            System.out.println(weight);
            System.out.println(faceofValue);

        }
    }

