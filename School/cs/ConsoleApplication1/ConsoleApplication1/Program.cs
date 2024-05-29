using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Threading;

namespace ConsoleApplication1
{
    class Program
    {
        System.ConsoleKeyInfo myKey = new ConsoleKeyInfo();
        static void Main(string[] args)
        {
            game myGame = new game(60);
            myGame.drawGameScreen();
        }


        async void testAsync()
        {
            myKey = Console.ReadKey();
        }
    }
}
