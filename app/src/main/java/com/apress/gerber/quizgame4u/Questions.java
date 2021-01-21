package com.apress.gerber.quizgame4u;

public class Questions {

    public  String mQuestions[] = {

            "What is the strongest muscle in the human body?",
            "When was Netflix Founded?",
            "When did they open the London underground?",
            "What year was the popular video game Fortnite first released?",
            "What is the hottest chilli pepper in the world?",
            "What is the biggest car manufacturer in the world?",
            "Which seaside is home to the longest pier in the UK?",
            "In what year was the first Playstation console released?",
            "Which year was the Premier League founded?",
            "What is the biggest mobile phone company in the world?",
            "What is the smallest country in the world?",
            "Where would you find the River Thames?",
            "How many players are there in a rugby league team?",
            "Which is longer, a Nautical Mile or a Mile?",
            "What was Disney’s first feature film?",
            "What year was Heinz established?",
            "What is the proper name for your funny bones?",
            "What year was the BT Tower built?",
            "When was the Shard built in London?",
            "What is the biggest commercial plane in the world?",




    };

    private String mChoices[][] = {

            {"Face Muscles", "Tongue", "Quadriceps" , "Masseter"},
            {"1997", "2009", "2015" , "2005"},
            {"1980", "1950", "1863" , "2000"},
            {"2007", "2010", "2017" , "2005"},
            {"Carolina Reaper", "Naga Viper", "Scotch Bonnet" , "Jalapeno Peppers"},
            {"Ford Motor", "Honda", "Volkswagen" , "Toyota"},
            {"Hythe Pier", "North Pier", "Southport Pier", "Southend Pier"},
            {"2000", "1990", "1994" , "2002"},
            {"1990", "1995", "1992" , "2000"},
            {"Sony", "LG", "Apple" , "Samsung"},
            {"Vatican City", "Monaco", "San Marino" , "Tuvalu"},
            {"Birmingham", "Bristol", "Edinburgh" , "London"},
            {"10", "13", "25" , "15"},
            {"2 Mile", "A Mile", "Nautical Mile" , " 1 Mile"},
            {"Ant Man", "Wreck-It Ralph", "Snow White" , "Captain Marvel"},
            {"1905", "1955", "1950" , "1869"},
            {"Optic nerve", "Ulnar nerve", "Facial nerve" , "Spinal nerve"},
            {"1970", "1955", "1964" , "1965"},
            {"2010", "2007", "2005" , "2012"},
            {"Airbus A340-600", "Boeing 777-300", "Airbus A380" , "Boeing 747-8"},



    };



    private String mCorrectAnswers[] = {"Masseter", "1997", "1863", "2017", "Carolina Reaper","Volkswagen","Southend Pier","1994","1992","Samsung","Vatican City","London","13","A Mile","Snow White","1869","Ulnar nerve","1964","2012","Airbus A380"};

    public String getQuestion(int a) {

        String question = mQuestions[a];
        return question;

    }

    public String getChoice1(int a) {


        String choices = mChoices[a] [0];
        return choices;

    }


    public String getChoice2(int a) {


        String choices = mChoices[a] [1];
        return choices;

    }

    public String getChoice3(int a) {


        String choices = mChoices[a] [2];
        return choices;

    }

    public String getChoice4(int a) {


        String choices = mChoices[a] [3];
        return choices;

    }

    public String getmCorrectAnswers(int a) {
        String answer = mCorrectAnswers[a];
        return answer;

    }
}

