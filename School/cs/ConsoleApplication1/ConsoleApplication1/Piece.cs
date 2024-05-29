using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Drawing;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Piece
    { 
        private int[,] shapeMap;

        public Piece()
        {
            shapeMap = new int[4, 2];
        }

        public void getSize(){
            int size = shapeMap.Length;
            Console.WriteLine(size);
        }

    }
}
