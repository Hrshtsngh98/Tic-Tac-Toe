package prevailhealth.tictactoe;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;



public class GameActivity extends AppCompatActivity {
    int player = 1;
    ImageView place00, place01, place02, place10, place11, place12, place20, place21, place22;
    public int game_array[][];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        game_array = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        place00 = (ImageView) findViewById(R.id.place00);
        place01 = (ImageView) findViewById(R.id.place01);
        place02 = (ImageView) findViewById(R.id.place02);
        place10 = (ImageView) findViewById(R.id.place10);
        place11 = (ImageView) findViewById(R.id.place11);
        place12 = (ImageView) findViewById(R.id.place12);
        place20 = (ImageView) findViewById(R.id.place20);
        place21 = (ImageView) findViewById(R.id.place21);
        place22 = (ImageView) findViewById(R.id.place22);

    }
    public void check00(View v){
        place00.setEnabled(false);
        if (player == 1) {
            game_array[0][0] = 1;
            player = 2;
            place00.setImageResource(R.drawable.x);
        } else {
            game_array[0][0] = 2;
            player = 1;
            place00.setImageResource(R.drawable.o);
        }
        check_winner();
    }
    public void check01(View v){
        place01.setEnabled(false);
        if (player == 1) {
            game_array[0][1] = 1;
            player = 2;
            place01.setImageResource(R.drawable.x);
        } else {
            game_array[0][1] = 2;
            player = 1;
            place01.setImageResource(R.drawable.o);
        }
        check_winner();
    }
    public void check02(View v){
        place02.setEnabled(false);
        if (player == 1) {
            game_array[0][2] = 1;
            player = 2;
            place02.setImageResource(R.drawable.x);
        } else {
            game_array[0][2] = 2;
            player = 1;
            place02.setImageResource(R.drawable.o);
        }
        check_winner();
    }
    public void check10(View v){
        place10.setEnabled(false);
        if (player == 1) {
            game_array[1][0] = 1;
            player = 2;
            place10.setImageResource(R.drawable.x);
        } else {
            game_array[1][0] = 2;
            player = 1;
            place10.setImageResource(R.drawable.o);
        }
        check_winner();
    }
    public void check11(View v){
        place11.setEnabled(false);
        if (player == 1) {
            game_array[1][1] = 1;
            player = 2;
            place11.setImageResource(R.drawable.x);
        } else {
            game_array[1][1] = 2;
            player = 1;
            place11.setImageResource(R.drawable.o);
        }
        check_winner();
    }
    public void check12(View v){
        place12.setEnabled(false);
        if (player == 1) {
            game_array[1][2] = 1;
            player = 2;
            place12.setImageResource(R.drawable.x);
        } else {
            game_array[1][2] = 2;
            player = 1;
            place12.setImageResource(R.drawable.o);
        }
        check_winner();
    }
    public void check20(View v){
        place20.setEnabled(false);
        if (player == 1) {
            game_array[2][0] = 1;
            player = 2;
            place20.setImageResource(R.drawable.x);
        } else {
            game_array[2][0] = 2;
            player = 1;
            place20.setImageResource(R.drawable.o);
        }
        check_winner();
    }
    public void check21(View v){
        place21.setEnabled(false);
        if (player == 1) {
            game_array[2][1] = 1;
            player = 2;
            place21.setImageResource(R.drawable.x);
        } else {
            game_array[2][1] = 2;
            player = 1;
            place21.setImageResource(R.drawable.o);
        }
        check_winner();
    }

    public void check22(View v){
        place22.setEnabled(false);
        if (player == 1) {
            game_array[2][2] = 1;
            player = 2;
            place22.setImageResource(R.drawable.x);
        } else {
            game_array[2][2] = 2;
            player = 1;
            place22.setImageResource(R.drawable.o);
        }
        check_winner();
    }

    public void check_winner()
    {
        int a,b,c,d,e,f,g,h,i;

        a = game_array[0][0];
        b = game_array[0][1];
        c = game_array[0][2];

        d = game_array[1][0];
        e = game_array[1][1];
        f = game_array[1][2];

        g = game_array[2][0];
        h = game_array[2][1];
        i = game_array[2][2];

        if (a!=0 && a == b && b == c) {
            print_arr();
            if (a == 1)
                show_winner(1);
            else
                show_winner(2);
        }
        if (d!=0 && d == e && e == f) {
            print_arr();
            if (d == 1)
                show_winner(1);
            else
                show_winner(2);
        }
        if (g!=0 && g == h && h == i) {
            print_arr();
            if (g == 1)
                show_winner(1);
            else
                show_winner(2);
        }
        if (a!=0 && a == d && d == g) {
            print_arr();
            if (a == 1)
                show_winner(1);
            else
                show_winner(2);
        }
        if (a!=0 && a == d && d == g) {
            print_arr();
            if (a == 1)
                show_winner(1);
            else
                show_winner(2);
        }
        if (b!=0 && b == e && e == h) {
            print_arr();
            if (b == 1)
                show_winner(1);
            else
                show_winner(2);
        }
        if (c!=0 && c == f && f == i) {
            if (c == 1)
                show_winner(1);
            else
                show_winner(2);
        }

        if (a!=0 && a == e && e == i) {
            print_arr();
            if (a == 1)
                show_winner(1);
            else
                show_winner(2);
        }
        if (c!=0 && c == e && e == g) {
            print_arr();
            if (c == 1)
                show_winner(1);
            else
                show_winner(2);
        }

        if(a!=0 && b!=0 && c!=0 && d!=0 && e!=0 && f!=0 && g!=0 && h!=0 &&i!=0) {
            print_arr();
            show_winner(0);
        }
    }
    public void print_arr(){
        for(int i = 0; i <3;i++){
            for (int j=0;j<3;j++){
                System.out.print(game_array[i][j]);
            }
            System.out.println();
        }
    }
    public void show_winner(int pl){
        //Log.d("show_winner","Winner is: "+pl);
        //Toast.makeText(this,"Winner is: "+pl,Toast.LENGTH_LONG).show();
        String message;
        if(pl==0)
            message="It's a tie!!";
        else
            message = "Player "+pl+" wins.";

        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){
                    case DialogInterface.BUTTON_POSITIVE:
                        System.exit(0);
                        break;

                    case DialogInterface.BUTTON_NEGATIVE:
                        Intent i = new Intent(GameActivity.this,GameActivity.class);
                        finish();
                        startActivity(i);
                        break;

                }
            }
        };
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(message).setPositiveButton("Exit", dialogClickListener)
                .setNegativeButton("Play Again", dialogClickListener).show();
    }

}