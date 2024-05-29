using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Threading;

namespace ConsoleApplication1
{
    class game
    {
        private int score;
        private int targetFPS;
        private int delay;

        public game(int newTargetFPS)
        {
            delay = 1000 / newTargetFPS;
        }


        public void refreshScreen()
        {
            Console.Clear();
            Console.WriteLine("I'm doing something!");
            Console.WriteLine("--------------------");
            Console.WriteLine("|                  |");
            Console.WriteLine("|     This is      |");
            Console.WriteLine("|        a         |");
            Console.WriteLine("|     textbox      |");
            Console.WriteLine("|                  |");
            Console.WriteLine("--------------------");
            Console.WriteLine("The current buffer width is: " + Console.BufferWidth + " the current buffer height is: " + Console.BufferHeight);
        }


        public int drawGameScreen()
        {
            Console.ForegroundColor = ConsoleColor.White;
            Console.BackgroundColor = ConsoleColor.Black;
            Console.Clear();

            Random r = new Random();
            Piece myPiece = new Piece();
            int count = 0;
            refreshScreen();
            while (true)
            {
                //if (count % 10 == 0 ){
                //ConsoleColor foreColor = (ConsoleColor)r.Next(0, 16);
               // ConsoleColor backColor = (ConsoleColor)r.Next(0, 16);
                //if (foreColor == ConsoleColor.Black)
                   // foreColor = (ConsoleColor)r.Next(0, 16);
               // Console.BackgroundColor = backColor;
                //Console.ForegroundColor = foreColor;

               // Console.Clear();
               // Console.WriteLine("I'm doing something!");
               // Console.WriteLine("--------------------");
              //  Console.WriteLine("|                  |");
              //  Console.WriteLine("|     This is      |");
               // Console.WriteLine("|        a         |");
              //  Console.WriteLine("|     textbox      |");
             //   Console.WriteLine("|                  |");
             //   Console.WriteLine("--------------------");
              //  Console.WriteLine("The current buffer width is: " + Console.BufferWidth + " the current buffer height is: " + Console.BufferHeight);
                //Console.SetCursorPosition(9, 4);
                //}
                count++;
                if (Console.KeyAvailable)
                {
                    ConsoleKeyInfo key = Console.ReadKey();
                    if (key.Key == ConsoleKey.RightArrow)
                        Console.ForegroundColor = (ConsoleColor)r.Next(0, 16);
                    else if (key.Key == ConsoleKey.LeftArrow)
                        Console.BackgroundColor = (ConsoleColor)r.Next(0, 16);
                    refreshScreen();
                   // if (key.Key == ConsoleKey.LeftArrow)
                  //  {
                       // Console.ForegroundColor = (ConsoleColor)r.Next(0, 16);
                  //  }
                   // else if (key.Key == ConsoleKey.RightArrow)
                     //   break;
                }
                //Thread.Sleep(delay);
            }
            return 0;
        }
    }
}
