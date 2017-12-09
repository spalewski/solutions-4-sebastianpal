package com.company;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}
    class Jaws extends Movie {
        public Jaws() {
            super("Jaws");
        }

        @Override
        public String plot() {
            return ("A shark eats a lots of people");
        }
    }

        class IndependenceDay extends Movie {
            public IndependenceDay() {
                super("Independace day");
            }

            @Override
            public String plot() {
                return ("Aliens attemp to take over the earth");
            }
        }

        class MazeRunner extends Movie {
            public MazeRunner() {
                super("Maze Runner");
            }

            @Override
            public String plot() {
                return ("Kids try to escape the Maze");
            }
        }

        class StarWars extends Movie {
            public StarWars() {
                super("Star Wars");
            }

            @Override
            public String plot() {
                return ("Imperial forces try to take over the uniwerse");
            }
        }


        class Forgetable extends Movie {
            public Forgetable() {
                super("Forgetable");
            }
        }


        public class Main {

            public static void main(String[] args) {
                for (int i = 0; i < 11; i++) {
                    Movie movie = randomMovie();
                    System.out.println("Movie # " + i + movie.getName() + "\n" +
                            "Plot" + movie.plot() + "\n");
                }
            }

            public static Movie randomMovie() {
                int randomNumber = (int) (Math.random() * 5) + 1;
                System.out.println("Random number generated was: " + randomNumber);
                switch (randomNumber) {
                    case 1:
                        return new Jaws();
                    case 2:
                        return new IndependenceDay();
                    case 3:
                        return new MazeRunner();
                    case 4:
                        return new StarWars();
                    case 5:
                        return new Forgetable();

                }
                return null;

            }

        }




