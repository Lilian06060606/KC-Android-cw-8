package com.example.bookworm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {
    ArrayList<Products> productslist = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Products b1 = new Products("Don't Tell Me You're Afraid","By:J.Catozzella",3.250,"Price","KD", R.drawable.lilian2,
                "Based on a remarkable true story, an unforgettable Somali girl risks her life on the migrant journey to Europe to run in the Olympic Games. ");

        Products b2 = new Products("Wonder","By:R.J. Palacio",3.000,"Price","KD", R.drawable.wonder,
                "August Pullman was born with a facial difference that, up until now, has prevented him from going to a mainstream school. Starting 5th grade at Beecher Prep, " +
                        "he wants nothing more than to be treated as an ordinary kid—but his new classmates can’t get past Auggie’s extraordinary face. Wonder, begins from Auggie’s point of view, but soon switches to include his classmates, his sister, her boyfriend, and others.  ");

        Products b3 = new Products("Hiedi","By:Johanna Spyri",4.550,"Price","KD", R.drawable.heidi ,
                "Little orphan Heidi goes to live high in the Alps with her gruff grandfather and brings happiness to all who know her on the mountain. When Heidi goes to Frankfurt to work in a wealthy household, she dreams of returning to the mountains and meadows, her friend Peter, and her beloved grandfather. \n");

        Products b4 = new Products("The Wonderful Wizard Of OZ","By:L.Frank Baum",5.250,"Price","KD", R.drawable.oz,
                "Dorothy thinks she's lost forever when a tornado whirls her and her dog, Toto, into a magical world. To get home, she must find the wonderful wizard in the Emerald City of Oz. On the way she meets the Scarecrow, the Tin Woodman and the Cowardly Lion. But the Wicked Witch of the West has her own plans for the new arrival... will Dorothy ever see Kansas again?   ");

        Products b5 = new Products("The Litlle Prince","By:A.D Saint-Exupéry",5.550,"Price","KD", R.drawable.prince,
                "Few stories are as widely read and as universally cherished by children and adults alike as The Little Prince, presented here in a stunning new translation with carefully restored artwork. The definitive edition of a worldwide classic, it will capture the hearts of readers of all ");

        productslist.add(b1);
        productslist.add(b2);
        productslist.add(b3);
        productslist.add(b4);
        productslist.add(b5);

        Productsaddapter productsaddapter = new Productsaddapter(this,0,productslist);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(productsaddapter);





    }

}
