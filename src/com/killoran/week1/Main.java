package com.killoran.week1;


import java.util.*;



        class Contacts{
            private String name;
            private String email;

            public Contacts(String name, String email) {
                this.name = name;
                this.email = email;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            @Override
            public String toString() {
                return "Contacts{" +
                        "name='" + name + '\'' +
                        ", email='" + email + '\'' +
                        '}';
            }
        }

        class Business extends Contacts{
            private String phone;

            public Business(String name, String email, String phone) {
                super(name, email);
                this.phone = phone;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            @Override
            public String toString() {
                return "Business{" +
                        "name='" + getName() + '\'' +
                        ", email='" + getEmail() + '\'' +
                        ", phone='" + phone + '\'' +
                        '}';
            }
        }
        public class Main {

            public static void main(String[] args) {

                Contacts c1 = new Contacts("ho-wae", "ho2303@gmail.com");
                System.out.println(c1.toString());

                Business b1 = new Business("Johnny bravo", "tapir580@gmail.com","614-233-9621");
                System.out.println(b1.toString());
            }
        }
