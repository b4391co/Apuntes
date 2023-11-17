package com.example;

public class Main 
{
    public static void main(String[] args) {
        /* char[] test = {'h','o','l','a',' ','q','u','e',' ','t','a','l'};
        String t = "hola que tal";
        String[] a = {"hola","tl"};
        getSentence(test);
        //System.out.println(checkWords(test, a));
        System.out.println(checkSentence(test, t)); */
    }

    public static String getSentence(char[] array){
        return new String(array);
    }

    public static boolean checkWord(char[] array, String secuencia){
        return (getSentence(array).contains(secuencia))? true: false;
    }

    public static boolean checkWords(char[] array, String[] secuencia){
        int coincide = 0;
        for (String palabras : secuencia) {
            if(getSentence(array).contains(palabras)){
                coincide++;
            }
        }
        return (coincide == secuencia.length)? true: false;
    }

    public static boolean checkSentence(char[] array, String sentence){ 
        return (sentence.equalsIgnoreCase(getSentence(array)))?true: false;
    }
}
