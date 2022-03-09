package com.test;

/**
 * The type Shallow copy.
 */
public class ShallowCopy {
    
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws CloneNotSupportedException the clone not supported exception
     */
    public  void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher=new Teacher();
        teacher.setName("rieamae");
        teacher.setAge(27);
        
        Student2 student1=new Student2();
        student1.setName("Afds");
        student1.setAge(12);
        student1.setTeacher(teacher);
        
        Student2 student2= (Student2) student1.clone();
        System.out.println("拷贝后。。。。。");
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getTeacher().getName());
        System.out.println(student2.getTeacher().getAge());
    
        System.out.println("修改老师的信息后----------");
        //修改老师的信息
        teacher.setName("往来哦是");
        System.out.println(student1.getTeacher().getName());
        System.out.println(student2.getTeacher().getName());
    }
    
    /**
     * The type Teacher.
     */
    class Teacher implements Cloneable {
        private String name;
        private int age;
    
        /**
         * Gets name.
         *
         * @return the name
         */
        public String getName() {
            return name;
        }
    
        /**
         * Sets name.
         *
         * @param name the name
         */
        public void setName(String name) {
            this.name = name;
        }
    
        /**
         * Gets age.
         *
         * @return the age
         */
        public int getAge() {
            return age;
        }
    
        /**
         * Sets age.
         *
         * @param age the age
         */
        public void setAge(int age) {
            this.age = age;
        }
    }
    
    /**
     * The type Student 2.
     */
    class Student2 implements Cloneable {
        private String name;
        private int age;
        private Teacher teacher;
    
        /**
         * Gets name.
         *
         * @return the name
         */
        public String getName() {
            return name;
        }
    
        /**
         * Sets name.
         *
         * @param name the name
         */
        public void setName(String name) {
            this.name = name;
        }
    
        /**
         * Gets age.
         *
         * @return the age
         */
        public int getAge() {
            return age;
        }
    
        /**
         * Sets age.
         *
         * @param age the age
         */
        public void setAge(int age) {
            this.age = age;
        }
    
        /**
         * Gets teacher.
         *
         * @return the teacher
         */
        public Teacher getTeacher() {
            return teacher;
        }
    
        /**
         * Sets teacher.
         *
         * @param teacher the teacher
         */
        public void setTeacher(Teacher teacher) {
            this.teacher = teacher;
        }
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        return object;
    }
}
