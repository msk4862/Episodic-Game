package gamedevelopers.funcandi.episode.model;

/**
 * Created by msk on 04-07-2017.
 */

import android.content.Context;
import android.content.Intent;

import gamedevelopers.funcandi.episode.R;
import gamedevelopers.funcandi.episode.ui.EndActivity;

public class Story {

    String name;
    private Page[] pages;
    private String[] dialo;


    // set this to true for analysis part
    public boolean analysis=false;

    Context context;

    Intent i;

    public Story(String name, Context context) {


        this.context=context;

        i= new Intent(context.getApplicationContext(), EndActivity.class);

        this.name = name;
        pages = new Page[43];

        dialo = new String[3];

        dialo[0]=name+"!!";
        dialo[1] ="WAKE UP!!!";
        dialo[2]="Otherwise, you will miss your school bus.";

        pages[0] = new Page(2, R.drawable.episode_house,R.drawable.episode_mom1,
                dialo, new Choice("NEXT", 1), new Choice("NEXT", 1), false);

        dialo = new String[2];
        dialo[0]= "Mom....";
        dialo[1]="Good morning...";
        pages[1] = new Page(1, R.drawable.episode_house, R.drawable.episode_happyboy,
                dialo, new Choice("NEXT", 2), new Choice("NEXT", 2), false);

        dialo = new String[3];

        dialo[0]="Good Morning!!";
        dialo[1]="Now go take a shower,";
        dialo[2]="and then have your breakfast.";

        pages[2] = new Page(2, R.drawable.episode_house, R.drawable.episode_mom1,
                dialo, new Choice("NEXT", 3), new Choice("NEXT", 3), false);

        dialo = new String[1];
        dialo[0]="Ok, mom.";

        pages[3] = new Page(1, R.drawable.episode_house, R.drawable.episode_happyboy,
                dialo, new Choice("NEXT", 4), new Choice("NEXT", 4), false);


        dialo = new String[2];
        dialo[0]="  What to do? I dont want to take a shower!!";
        dialo[1]=" let's skip it...";
        pages[4] = new Page(true, 1, R.drawable.episode_bathroom, R.drawable.episode_liarboy,
                dialo, new Choice("NEXT", 5), new Choice("NEXT", 5), false);


        dialo = new String[2];
        dialo[0]="You shouldn’t do this!!!";
        dialo[1]="It’s a bad habit. You can fall sick, if you don't keep yourself clean.";
        //Buddy Constructor called
        pages[5] = new Page(1, 2, R.drawable.episode_bathroom, R.drawable.episode_buddy,
                dialo, new Choice("NEXT", 6), new Choice("NEXT", 6), false);

        dialo = new String[2];
        dialo[0]="Who are you?";
        dialo[1]="and what are you doing in my house?";
        pages[6] = new Page(1, R.drawable.episode_bathroom, R.drawable.episode_shockedboy,
                dialo, new Choice("NEXT", 7), new Choice("NEXT", 7), false);


        dialo = new String[3];
        dialo[0]="I am Funcandi Buddy, you can call me Candy";
        dialo[1]="I’m here to help you.";
        dialo[2]="and only you will be able to see me.";

        pages[7] = new Page(1,2, R.drawable.episode_bathroom, R.drawable.episode_buddy,
                dialo, new Choice("NEXT", 8), new Choice("NEXT", 8), false);


        dialo = new String[1];
        dialo[0]="What should I do now?";

        pages[8] = new Page(true, 1, R.drawable.episode_bathroom, R.drawable.episode_thinkingboy,
                dialo, new Choice("Listen to Mr. Candy and take shower.", 12), new Choice("Ignore Mr. Candy's advice and eat the breakfast.", 9), false);

        //End for analysis part
        //*******************  END  *****************




            dialo = new String[3];
            dialo[0] = "I know what is good for me...";
            dialo[1] = "I don't need your advice!!!";
            dialo[2] = "Mr. Candy!!!!";

            pages[9] = new Page(1, R.drawable.episode_bathroom, R.drawable.episode_angryboy,
                    dialo, new Choice("NEXT", 10), new Choice("NEXT", 10), false);

            dialo = new String[4];
            dialo[0] = name + "!!!!";
            dialo[1] = "Why are doing here?";
            dialo[2] = "I know you have not taken shower...";
            dialo[3] = "Go to the bathroom right now!!!!!";
            pages[10] = new Page(2, R.drawable.episode_kitchen, R.drawable.episode_angrymom,
                    dialo, new Choice("NEXT", 11), new Choice("NEXT", 11), false);

            dialo = new String[1];
            dialo[0] = "Ok mom!!!";
            pages[11] = new Page(1, R.drawable.episode_kitchen, R.drawable.episode_nervousboy, dialo, new Choice("NEXT", 12), new Choice("NEXT", 12), false);


            dialo = new String[4];
            dialo[0] = "Good boy!";
            dialo[1] = "Cleanliness is most important...";
            dialo[2] = "Your school bus is waiting outside...";
            dialo[3] = "finish your breakfast quickly!";
            pages[12] = new Page(2, R.drawable.episode_kitchen, R.drawable.episode_mom1, dialo, new Choice("NEXT", 13), new Choice("NEXT", 13), false);


            dialo = new String[3];
            dialo[0] = "Ok!!";
            dialo[1] = "I’m going mom..";
            dialo[2] = "Bye Bye….";
            pages[13] = new Page(1, R.drawable.episode_kitchen, R.drawable.episode_happyboy, dialo, new Choice("NEXT", 14), new Choice("NEXT", 14), false);

            dialo = new String[1];
            dialo[0] = "You are forgetting your maths assignment!!!";
            pages[14] = new Page(1, 2, R.drawable.episode_outside, R.drawable.episode_buddy, dialo, new Choice("NEXT", 15), new Choice("NEXT", 15), false);

            dialo = new String[1];
            dialo[0] = "Oh!!!";
            pages[15] = new Page(1, R.drawable.episode_outside, R.drawable.episode_shockedboy, dialo, new Choice("NEXT", 16), new Choice("NEXT", 16), false);


            dialo = new String[5];
            dialo[0] = "  But if I go back for it...";
            dialo[1] = "  I will miss my school bus...";
            dialo[2] = "  …and then mom will drop me to school";
            dialo[3] = "  and then my friends will make fun of me…";
            dialo[4] = "  What should I do now...?";
            pages[16] = new Page(true, 1, R.drawable.episode_outside, R.drawable.episode_thinkingboy,
                    dialo, new Choice("Get on the bus", 17), new Choice("Go back and get your assignment", 38), false);


            dialo = new String[1];
            dialo[0] = "Hey Zack!!!";
            pages[17] = new Page(1, R.drawable.episode_school, R.drawable.episode_happyboy,
                    dialo, new Choice("NEXT", 18), new Choice("NEXT", 18), false);


            dialo = new String[1];
            dialo[0] = "Hey " + name + " !!";
            pages[18] = new Page(2, R.drawable.episode_school, R.drawable.episode_friend,
                    dialo, new Choice("NEXT", 19), new Choice("NEXT", 19), false);


            dialo = new String[1];
            dialo[0] = "I forgot my maths assignment at home...";
            pages[19] = new Page(1, R.drawable.episode_school, R.drawable.episode_liarboy,
                    dialo, new Choice("NEXT", 20), new Choice("NEXT", 20), false);


            dialo = new String[2];
            dialo[0] = "No problem!!!";
            dialo[1] = "you can copy my assignment…";
            pages[20] = new Page(2, R.drawable.episode_school, R.drawable.episode_friend,
                    dialo, new Choice("NEXT", 21), new Choice("NEXT", 21), false);


            dialo = new String[2];
            dialo[0] = "Cool!!!";
            dialo[1] = "Thanks Zack!!!";
            pages[21] = new Page(1, R.drawable.episode_school, R.drawable.episode_happyboy2,
                    dialo, new Choice("NEXT", 22), new Choice("NEXT", 22), false);


            dialo = new String[2];
            dialo[0] = "Copying is not cool!";
            dialo[1] = "You wil regret it later!!";
            pages[22] = new Page(1, 2, R.drawable.episode_school, R.drawable.episode_buddy,
                    dialo, new Choice("NEXT", 23), new Choice("NEXT", 23), false);


            dialo = new String[2];
            dialo[0] = "  Hmmm...";
            dialo[1] = "  I think I should….";
            pages[23] = new Page(true, 1, R.drawable.episode_school, R.drawable.episode_thinkingboy,
                    dialo, new Choice("Copy Zack’s assignment", 25), new Choice("Say truth to teacher", 33), false);


        /*dialo = new String[2];
        dialo[0]="I said you Buddy don’t interfere in my matters!!!";
        dialo[1]="I will copy Zack’s assignment!!!";
        pages[24] = new Page(1, R.drawable.episode_school, R.drawable.episode_angryboy,
                dialo, new Choice("NEXT", 25), new Choice("NEXT", 25), false);*/


            dialo = new String[3];
            dialo[0] = "I said you Buddy don’t interfere in my matters!!!";
            dialo[1] = "I'll do what I want!!!";
            dialo[2] = "I will copy Zack’s assignment!!!";
            pages[25] = new Page(1, R.drawable.episode_school, R.drawable.episode_angryboy,
                    dialo, new Choice("NEXT", 26), new Choice("NEXT", 26), false);


            dialo = new String[1];
            dialo[0] = name + " come here!!!";
            pages[26] = new Page(2, R.drawable.episode_classroom, R.drawable.episode_angryteacher,
                    dialo, new Choice("NEXT", 27), new Choice("NEXT", 27), false);

            dialo = new String[1];
            dialo[0] = "What happened mam?...";
            pages[27] = new Page(1, R.drawable.episode_classroom, R.drawable.episode_shockedboy,
                    dialo, new Choice("NEXT", 28), new Choice("NEXT", 28), false);


            dialo = new String[2];
            dialo[0] = "Why your assignment is same as Zack’s assignment?";
            dialo[1] = "...have you copied his assignment?";
            pages[28] = new Page(2, R.drawable.episode_classroom, R.drawable.episode_angryteacher,
                    dialo, new Choice("NEXT", 29), new Choice("NEXT", 29), false);


            dialo = new String[1];
            dialo[0] = "N…N…N...No mam…..";
            pages[29] = new Page(1, R.drawable.episode_classroom, R.drawable.episode_nervousboy,
                    dialo, new Choice("NEXT", 30), new Choice("NEXT", 30), false);


            dialo = new String[2];
            dialo[0] = "…and now you are lying also!!!";
            dialo[1] = "Bring your parents with you tommorrow...";
            pages[30] = new Page(2, R.drawable.episode_classroom, R.drawable.episode_angryteacher,
                    dialo, new Choice("NEXT", 31), new Choice("NEXT", 31), false);


            dialo = new String[1];
            dialo[0] = "  Mr. Candy was right...";
            pages[31] = new Page(true, 1, R.drawable.episode_classroom, R.drawable.episode_nervousboy,
                    dialo, new Choice("NEXT", 32), new Choice("NEXT", 32), false);


            dialo = new String[1];
            dialo[0] = "  I should have listened to him....";
            pages[32] = new Page(true, 1, R.drawable.episode_classroom, R.drawable.episode_nervousboy,
                    dialo, new Choice("NEXT", 0), new Choice("NEXT", 0), true);

//----------END--------


            dialo = new String[1];
            dialo[0] = "  I think Mr. Candy is right!!!";
            pages[33] = new Page(true, 1, R.drawable.episode_school, R.drawable.episode_thinkingboy,
                    dialo, new Choice("NEXT", 34), new Choice("NEXT", 34), false);


            dialo = new String[1];
            dialo[0] = "I will tell truth to the teacher....";
            pages[34] = new Page(1, R.drawable.episode_school, R.drawable.episode_happyboy,
                    dialo, new Choice("NEXT", 35), new Choice("NEXT", 35), false);


            dialo = new String[1];
            dialo[0] = "Mam, I forgot my assignment at home...";
            pages[35] = new Page(1, R.drawable.episode_classroom, R.drawable.episode_nervousboy,
                    dialo, new Choice("NEXT", 36), new Choice("NEXT", 36), false);


            dialo = new String[1];
            dialo[0] = "No problem " + name;
            pages[36] = new Page(2, R.drawable.episode_classroom, R.drawable.episode_happyteacher,
                    dialo, new Choice("NEXT", 37), new Choice("NEXT", 37), false);


            dialo = new String[1];
            dialo[0] = "Thank you Mr. Candy...";
            pages[37] = new Page(true, 1, R.drawable.episode_classroom, R.drawable.episode_happyboy,
                    dialo, new Choice("NEXT", 0), new Choice("NEXT", 0), true);

//----------END--------

            dialo = new String[2];
            dialo[0] = "What are doing here?!!";
            dialo[1] = "Have you missed your bus?!!";
            pages[38] = new Page(2, R.drawable.episode_house, R.drawable.episode_angrymom,
                    dialo, new Choice("NEXT", 39), new Choice("NEXT", 39), false);


            dialo = new String[3];
            dialo[0] = "I forgot my assignment here...";
            dialo[1] = "Because of it...";
            dialo[2] = "I missed my school bus..";
            pages[39] = new Page(1, R.drawable.episode_house, R.drawable.episode_nervousboy,
                    dialo, new Choice("NEXT", 40), new Choice("NEXT", 40), false);


            dialo = new String[2];
            dialo[0] = "Don't worry son...";
            dialo[1] = "I'll drop you to school...";
            pages[40] = new Page(2, R.drawable.episode_house, R.drawable.episode_mom1,
                    dialo, new Choice("NEXT", 41), new Choice("NEXT", 41), false);


            dialo = new String[3];
            dialo[0] = "Phewww...";
            dialo[1] = "Nobody saw my mom...";
            dialo[2] = "and I have my assignment also with me...";
            pages[41] = new Page(1, R.drawable.episode_school, R.drawable.episode_happyboy,
                    dialo, new Choice("NEXT", 42), new Choice("NEXT", 42), false);


            dialo = new String[1];
            dialo[0] = "  Thank you Mr. Candy...!!!";
            pages[42] = new Page(true, 1, R.drawable.episode_school, R.drawable.episode_happyboy2,
                    dialo, new Choice("NEXT", 0), new Choice("NEXT", 0), true);

            //------------END-----------


    }



    public Page getPage(int pageNumber) {


        if (pageNumber >= pages.length) {
            pageNumber = 0;
        }
        return pages[pageNumber];
    }


}
