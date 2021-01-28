package com.company;

public class Main {

    public static void main(String[] args) {
        String roles[]= {"Городничий",
                         "Аммос Федорович",
                         "Артемий Филиппович",
                         "Лука Лукич"};
        String textlines[] = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
        "Аммос Федорович: Как ревизор?",
        "Артемий Филиппович: Как ревизор?",
        "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
        "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        StringBuilder r = new StringBuilder();

        for (int j = 0; j < roles.length; j++) {
            r.append((roles[j]+":\n"));
            String[] textLines;
            for (int i = 0; i <textlines.length; i++) {
                boolean b = textlines[i].startsWith(roles[j]);
                if (textlines[i].startsWith(roles[j]+":")==true) {
                    r.append((i+1)+")"+textlines[i].replaceFirst(roles[j]+":","")+"\n");
                }
            }
            r.append("\n");
        }
        String x = r.toString();
        System.out.println(x);
    }
}
