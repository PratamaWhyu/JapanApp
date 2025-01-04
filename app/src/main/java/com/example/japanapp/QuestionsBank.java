package com.example.japanapp;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionsBank {

    private static List<QuestionsList> hiraganaQuestion(){
        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("あ","A","I","U","E","A","");
        final QuestionsList question2 = new QuestionsList("い","A","I","U","E","I","");
        final QuestionsList question3 = new QuestionsList("う","I","U","E","O","U","");
        final QuestionsList question4 = new QuestionsList("え","I","U","E","O","E","");
        final QuestionsList question5 = new QuestionsList("か","KA","KI","KU","KE","KA","");
        final QuestionsList question6 = new QuestionsList("き","KA","KI","KU","KE","KI","");
        final QuestionsList question7 = new QuestionsList("く","KA","KI","KU","KE","Ku","");
        final QuestionsList question8 = new QuestionsList("け","KI","KU","KE","KO","KE","");
        final QuestionsList question9 = new QuestionsList("こ","KI","KU","KE","KO","KO","");
        final QuestionsList question10 = new QuestionsList("さ","SA","SI","SU","SE","SA","");
        final QuestionsList question11 = new QuestionsList("し","SA","SI","SU","SE","SI","");
        final QuestionsList question12 = new QuestionsList("す","SA","SI","SU","SE","SU","");
        final QuestionsList question13 = new QuestionsList("せ","SI","SU","SE","SO","SE","");
        final QuestionsList question14 = new QuestionsList("そ","SI","SU","SE","SO","SO","");
        final QuestionsList question15 = new QuestionsList("た","TA","CHI","TSU","TE","TA","");
        final QuestionsList question16 = new QuestionsList("ち","TA","CHI","TSU","TE","CHI","");
        final QuestionsList question17 = new QuestionsList("つ","TA","CHI","TSU","TE","TSU","");
        final QuestionsList question18 = new QuestionsList("て","CHI","TSU","TE","TO","TE","");
        final QuestionsList question19 = new QuestionsList("と","CHI","TSU","TE","TO","TO","");
        final QuestionsList question20 = new QuestionsList("な","NA","NI","NU","NE","NA","");
        final QuestionsList question21 = new QuestionsList("に","NA","NI","NU","NE","NI","");
        final QuestionsList question22 = new QuestionsList("ぬ","NA","NI","NU","NE","NU","");
        final QuestionsList question23 = new QuestionsList("ね","NA","NU","NE","NO","NE","");
        final QuestionsList question24 = new QuestionsList("の","NA","NU","NE","NO","NO","");
        final QuestionsList question25 = new QuestionsList("は","HA","HI","HU","HE","HA","");
        final QuestionsList question26 = new QuestionsList("ひ","HA","HI","HU","HE","HI","");
        final QuestionsList question27 = new QuestionsList("ふ","HA","FU","HE","HO","FU","");
        final QuestionsList question28 = new QuestionsList("へ","HA","HI","HE","HU","HE","");
        final QuestionsList question29 = new QuestionsList("ほ","HA","HI","HU","HO","HO","");
        final QuestionsList question30 = new QuestionsList("ま","MA","MI","MU","ME","MA","");
        final QuestionsList question31 = new QuestionsList("み","MA","MI","MU","ME","MI","");
        final QuestionsList question32 = new QuestionsList("む","MU","ME","MO","MA","MU","");
        final QuestionsList question33 = new QuestionsList("め","ME","MO","MA","MI","ME","");
        final QuestionsList question34 = new QuestionsList("も","MO","MA","MI","MU","MO","");
        final QuestionsList question35 = new QuestionsList("や","YA","MI","YU","HE","YA","");
        final QuestionsList question36 = new QuestionsList("ゆ","YA","HI","YU","ME","YU","");
        final QuestionsList question37 = new QuestionsList("よ","YA","NI","YU","YO","YO","");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);
        questionsLists.add(question16);
        questionsLists.add(question17);
        questionsLists.add(question18);
        questionsLists.add(question19);
        questionsLists.add(question20);
        questionsLists.add(question21);
        questionsLists.add(question22);
        questionsLists.add(question23);
        questionsLists.add(question24);
        questionsLists.add(question25);
        questionsLists.add(question26);
        questionsLists.add(question27);
        questionsLists.add(question28);
        questionsLists.add(question29);
        questionsLists.add(question30);
        questionsLists.add(question31);
        questionsLists.add(question32);
        questionsLists.add(question33);
        questionsLists.add(question34);
        questionsLists.add(question35);
        questionsLists.add(question36);
        questionsLists.add(question37);

        for (int i = 0; i < 27; i++) {
            int rando = (int) ((Math.random() * questionsLists.size()));
            questionsLists.remove(rando);
        }

        return questionsLists;
    }

    private static List<QuestionsList> katakanaQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("ア","A","I","U","E","A","");
        final QuestionsList question2 = new QuestionsList("イ","A","I","U","E","I","");
        final QuestionsList question3 = new QuestionsList("ウ","I","U","E","O","U","");
        final QuestionsList question4 = new QuestionsList("エ","I","U","E","O","E","");
        final QuestionsList question5 = new QuestionsList("カ","KA","KI","KU","KE","KA","");
        final QuestionsList question6 = new QuestionsList("キ","KA","KI","KU","KE","KI","");
        final QuestionsList question7 = new QuestionsList("ク","KA","KI","KU","KE","KU","");
        final QuestionsList question8 = new QuestionsList("ケ","KI","KU","KE","KO","KE","");
        final QuestionsList question9 = new QuestionsList("コ","KI","KU","KE","KO","KO","");
        final QuestionsList question10 = new QuestionsList("サ","SA","SI","SU","SE","SA","");
        final QuestionsList question11 = new QuestionsList("シ","SA","SI","SU","SE","SI","");
        final QuestionsList question12 = new QuestionsList("ス","SA","SI","SU","SE","SU","");
        final QuestionsList question13 = new QuestionsList("セ","SI","SU","SE","SO","SE","");
        final QuestionsList question14 = new QuestionsList("ソ","SI","SU","SE","SO","SO","");
        final QuestionsList question15 = new QuestionsList("タ","TA","CHI","TSU","TE","TA","");
        final QuestionsList question16 = new QuestionsList("チ","TA","CHI","TSU","TE","CHI","");
        final QuestionsList question17 = new QuestionsList("ツ","TA","CHI","TSU","TE","TSU","");
        final QuestionsList question18 = new QuestionsList("テ","CHI","TSU","TE","TO","TE","");
        final QuestionsList question19 = new QuestionsList("ト","CHI","TSU","TE","TO","TO","");
        final QuestionsList question20 = new QuestionsList("ナ","NA","NI","NU","NE","NA","");
        final QuestionsList question21 = new QuestionsList("ニ","NA","NI","NU","NE","NI","");
        final QuestionsList question22 = new QuestionsList("ヌ","NA","NI","NU","NE","NU","");
        final QuestionsList question23 = new QuestionsList("ネ","NA","NU","NE","NO","NE","");
        final QuestionsList question24 = new QuestionsList("ノ","NA","NU","NE","NO","NO","");
        final QuestionsList question25 = new QuestionsList("ハ","HA","HI","HU","HE","HA","");
        final QuestionsList question26 = new QuestionsList("ヒ","HA","HI","HU","HE","HI","");
        final QuestionsList question27 = new QuestionsList("フ","HA","FU","HE","HO","FU","");
        final QuestionsList question28 = new QuestionsList("へ","HA","HI","HE","HU","HE","");
        final QuestionsList question29 = new QuestionsList("ホ","HA","HI","HU","HO","HO","");
        final QuestionsList question30 = new QuestionsList("マ","MA","MI","MU","ME","MA","");
        final QuestionsList question31 = new QuestionsList("ミ","MA","MI","MU","ME","MI","");
        final QuestionsList question32 = new QuestionsList("ム","MU","ME","MO","MA","MU","");
        final QuestionsList question33 = new QuestionsList("メ","ME","MO","MA","MI","ME","");
        final QuestionsList question34 = new QuestionsList("モ","MO","MA","MI","MU","MO","");
        final QuestionsList question35 = new QuestionsList("ヤ","YA","MI","YU","HE","YA","");
        final QuestionsList question36 = new QuestionsList("ユ","YA","HI","YU","ME","YU","");
        final QuestionsList question37 = new QuestionsList("ヨ","YA","NI","YU","YO","YO","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);
        questionsLists.add(question16);
        questionsLists.add(question17);
        questionsLists.add(question18);
        questionsLists.add(question19);
        questionsLists.add(question20);
        questionsLists.add(question21);
        questionsLists.add(question22);
        questionsLists.add(question23);
        questionsLists.add(question24);
        questionsLists.add(question25);
        questionsLists.add(question26);
        questionsLists.add(question27);
        questionsLists.add(question28);
        questionsLists.add(question29);
        questionsLists.add(question30);
        questionsLists.add(question31);
        questionsLists.add(question32);
        questionsLists.add(question33);
        questionsLists.add(question34);
        questionsLists.add(question35);
        questionsLists.add(question36);
        questionsLists.add(question37);


        for (int i = 0; i < 27; i++) {
            int rando = (int) ((Math.random() * questionsLists.size()));
            questionsLists.remove(rando);
        }

        return questionsLists;
    }

    private static List<QuestionsList> kanjiQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();
        final QuestionsList question1 = new QuestionsList("一","SATU","DUA","TIGA","EMPAT","SATU","");
        final QuestionsList question2 = new QuestionsList("ニ","SATU","DUA","TIGA","EMPAT","DUA","");
        final QuestionsList question3 = new QuestionsList("三","SATU","DUA","TIGA","EMPAT","TIGA","");
        final QuestionsList question4 = new QuestionsList("四","SATU","DUA","TIGA","EMPAT","EMPAT","");
        final QuestionsList question5 = new QuestionsList("五","LIMA","ENAM","TUJUH","DELAPAN","LIMA","");
        final QuestionsList question6 = new QuestionsList("六","LIMA","ENAM","TUJUH","DELAPAN","ENAM","");
        final QuestionsList question7 = new QuestionsList("七","LIMA","ENAM","TUJUH","DELAPAN","TUJUH","");
        final QuestionsList question8 = new QuestionsList("八","LIMA","ENAM","TUJUH","DELAPAN","DELAPAN","");
        final QuestionsList question9 = new QuestionsList("九","ENAM","TUJUH","DELAPAN","SEMBILAN","SEMBILAN","");
        final QuestionsList question10 = new QuestionsList("十","TUJUH","DELAPAN","SEMBILAN","SEPULUH","SEPULUH","");
        final QuestionsList question11 = new QuestionsList("人","ORANG","POHON","BULAN","HARI","ORANG","");
        final QuestionsList question12 = new QuestionsList("日","POHON","ORANG","HARI","BULAN","HARI","");
        final QuestionsList question13 = new QuestionsList("月","BULAN","API","AIR","TANAH","BULAN","");
        final QuestionsList question14 = new QuestionsList("火","BULAN","API","BULAN","TANAH","API","");
        final QuestionsList question15 = new QuestionsList("水","BULAN","API","AIR","TANAH","AIR","");
        final QuestionsList question16 = new QuestionsList("木","BULAN","API","POHON","EMAS","POHON","");
        final QuestionsList question17 = new QuestionsList("金","EMAS","ISTIRAHAT","AIR","TANAH","EMAS","");
        final QuestionsList question18 = new QuestionsList("土","API","TANAH","ATAS","BAWAH","TANAH","");
        final QuestionsList question19 = new QuestionsList("百","SERATUS","SERIBU","SEPULUH","SATU","SERATUS","");
        final QuestionsList question20 = new QuestionsList("千","SERATUS","SERIBU","SEPULUH","SATU","SERIBU","");
        final QuestionsList question21 = new QuestionsList("円","YEN","PERGI","DATANG","MEMBACA","YEN","");
        final QuestionsList question22 = new QuestionsList("行","PERGI","DATANG","PULANG","MEMBACA","PERGI","");
        final QuestionsList question23 = new QuestionsList("来","DATANG","PERGI","PULANG","MEMBACA","DATANG","");
        final QuestionsList question24 = new QuestionsList("休","ISTIRAHAT","POHON","BUKU","PERGI","ISTIRAHAT","");
        final QuestionsList question25 = new QuestionsList("見","MEMBACA","MELIHAT","PERGI","DATANG","MELIHAT","");
        final QuestionsList question26 = new QuestionsList("今","NANTI","BULAN","SEKARANG","HARI","SEKARANG","");
        final QuestionsList question27 = new QuestionsList("大","BANYAK","SEDIKIT","KECIL","BESAR","BESAR","");
        final QuestionsList question28 = new QuestionsList("小","KECIL","BESAR","ATAS"," BAWAH","KECIL","");
        final QuestionsList question29 = new QuestionsList("上","DEPAN","BAWAH","ATAS","BAWAH","ATAS","");
        final QuestionsList question30 = new QuestionsList("本","BADAN","LIBUR","POHON","BUKU","BUKU","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);
        questionsLists.add(question16);
        questionsLists.add(question17);
        questionsLists.add(question18);
        questionsLists.add(question19);
        questionsLists.add(question20);
        questionsLists.add(question21);
        questionsLists.add(question22);
        questionsLists.add(question23);
        questionsLists.add(question24);
        questionsLists.add(question25);
        questionsLists.add(question26);
        questionsLists.add(question27);
        questionsLists.add(question28);
        questionsLists.add(question29);
        questionsLists.add(question30);

        for (int i = 0; i < 20; i++) {
            int rando = (int) ((Math.random() * questionsLists.size()));
            questionsLists.remove(rando);
        }

        return questionsLists;
    }

    private static List<QuestionsList> kosakataQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();
        final QuestionsList question1 = new QuestionsList("べんきょう","BELAJAR","SIBUK","SEKARANG","NANTI","BELAJAR","");
        final QuestionsList question2 = new QuestionsList("きょう","SEKARANG","HARI INI","BESOK","KEMARIN","HARI INI","");
        final QuestionsList question3 = new QuestionsList("あした","BESOK","SEKARANG","KEMARIN","BESOK LUSA","BESOK","");
        final QuestionsList question4 = new QuestionsList("きのう","BESOK","KEMARIN","SEKARANG","HARI INI","KEMARIN","");
        final QuestionsList question5 = new QuestionsList("あさって","HARI INI","SEKARANG","KAMARIN","BESOK LUSA","BESOK LUSA","");
        final QuestionsList question6 = new QuestionsList("おととい","DUA HARI LALU","LUSA","HARI INI","BESOK","DUA HARI LALU","");
        final QuestionsList question7 = new QuestionsList("げつようび","HARI SENIN","HARI SELASA","HARI RABU","HARI KAMIS","HARI SENIN","");
        final QuestionsList question8 = new QuestionsList("かようび","HARI SENIN","HARI SELASA","HARI RABU","HARI KAMIS","HARI SELASA","");
        final QuestionsList question9 = new QuestionsList("すいようび","HARI SENIN","HARI SELASA","HARI RABU","HARI KAMIS","HARI RABU","");
        final QuestionsList question10 = new QuestionsList("もくようび","HARI SENIN","HARI SELASA","HARI RABU","HARI KAMIS","HARI KAMIS","");
        final QuestionsList question11 = new QuestionsList("きんようび","HARI JUMAT","HARI SABTU","HARI MINGGU","HARI SENIN"," HARI JUMAT","");
        final QuestionsList question12 = new QuestionsList("どようび","HARI JUMAT","HARI SABTU","HARI MINGGU","HARI SENIN","HARI SABTU","");
        final QuestionsList question13 = new QuestionsList("にちようび","HARI JUMAT","HARI SABTU","HARI MINGGU","HARI SENIN","HARI MINGGU","");
        final QuestionsList question14 = new QuestionsList("いそがしい","SIBUK","SENGGANG","BANYAK","SEDIKIT","SIBUK","");
        final QuestionsList question15 = new QuestionsList("いつ","SEKARANG","KAPAN","NANTI","BESOK","KAPAN","");
        final QuestionsList question16 = new QuestionsList("いま","SENGGANG","SIBUK","NANTI","SEKARANG","SEKARANG","");
        final QuestionsList question17 = new QuestionsList("おかね","EMAS","ISTIRAHAT","UANG","TANAH","UANG","");
        final QuestionsList question18 = new QuestionsList("かぎ","API","TANAH","ATAS","BAWAH","KUNCI","");
        final QuestionsList question19 = new QuestionsList("からだ","BADAN","ISTIRAHAT","BUKU","POHON","BADAN","");
        final QuestionsList question20 = new QuestionsList("かわ","GUNUNG","BULAN","SUNGAI","BATU","SUNGAI","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);
        questionsLists.add(question16);
        questionsLists.add(question17);
        questionsLists.add(question18);
        questionsLists.add(question19);
        questionsLists.add(question20);

        for (int i = 0; i < 10; i++) {
            int rando = (int) ((Math.random() * questionsLists.size()));
            questionsLists.remove(rando);
        }

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "Hiragana":
                return hiraganaQuestion();
            case "Katakana":
                return katakanaQuestions();
            case "Kanji":
                return kanjiQuestions();
            default:
                return kosakataQuestions();

        }
    }
}
