package androidsingh.navjyotsingh.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageDice1;
    private ImageView imageDice2;
    Random randomDice=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void rollTheDice(View view){
        imageDice1=findViewById(R.id.imageViewDiceOne);
        imageDice2=findViewById(R.id.imageViewDiceTwo);



        int randomNo2=randomDice.nextInt(6)+1;

       dice1();
       dice2();

       Toast.makeText(this,"Dice rolled!",Toast.LENGTH_SHORT).show();
    }
    public void dice1(){
        int randomNo1=randomDice.nextInt(6)+1;
        switch (randomNo1){
            case 1:
                imageDice1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageDice1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageDice1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageDice1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageDice1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageDice1.setImageResource(R.drawable.dice6);
                break;
        }

    }
    public void dice2() {
        int randomNo2 = randomDice.nextInt(6) + 1;
        switch (randomNo2) {
            case 1:
                imageDice2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageDice2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageDice2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageDice2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageDice2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageDice2.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
