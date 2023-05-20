package com.furkanadiguzel.hw2;

public class Students {

        private String Student_name;
        private String Number;
        private int image;

        public Students(String student_name, String number, int image) {
            Student_name = student_name;
            Number = number;
            this.image = image;
        }

        public String getStudent_name() {
            return Student_name;
        }

        public void setStudent_name(String company_name) {
            Student_name = company_name;
        }

        public String getNumber() {
            return Number;
        }

        public void setNumber(String number) {
            Number = number;
        }

        public int getImage() {
            return image;
        }

        public void setImage(int image) {
            this.image = image;
        }

        @Override
        public String toString() {
            return "Students{" +
                    "Company_name='" + Student_name + '\'' +
                    ", Number='" + Number + '\'' +
                    ", Image=" + image +
                    '}';
        }


}
