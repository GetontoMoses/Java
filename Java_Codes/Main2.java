public class Main2 {
    public static void main(String[] args){
        String name ="Willie";
        String firstName ="William";
        String secondName= "Ruto";
        String fullName= firstName+ " "+ secondName;
        System.out.println("fullname is "+fullName);
        String fullNameUpperCase=fullName.toUpperCase();
           System.out.println("Fullname in upper case "+ fullNameUpperCase);
        String fullNameLowerCase=fullName.toLowerCase();
           System.out.println("Fullname in upper case "+ fullNameLowerCase);
                 System.out.println(secondName.substring(0, 2));
                  System.out.println("Your Name has these number of characters "+secondName.length());
        String firstLetterNameUpperCase =secondName.substring(0, 1);
        firstLetterNameUpperCase.toUpperCase();
        String firstLetterName=secondName.substring(1).toLowerCase();
        System.out.println(firstLetterNameUpperCase + firstLetterName);
        if (firstName.compareTo(name)==0){
             System.out.println(firstName+ "and" + name +"are equal");
        }
        else {
             System.out.println(firstName+ "and" + name +" are not equal");
        }
    }

    }
    
    

