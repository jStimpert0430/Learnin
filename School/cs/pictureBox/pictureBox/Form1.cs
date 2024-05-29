using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace pictureBox
{
    public partial class Form1 : Form
    {
        private Font fnt = new Font("Arial", 10);

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
           // pictureBox1.Dock = DockStyle.Fill;
            pictureBox1.BackColor = Color.Black;
            //this.Controls.Add(pictureBox1);
        }

        private void Form1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void pictureBox1_Paint(object sender, System.Windows.Forms.PaintEventArgs e)
        {
        }

        private void pictureBox1_Paint_1(object sender, PaintEventArgs e)
        {
            // Create a local version of the graphics object for the PictureBox.
            Graphics g = e.Graphics;

            // Draw a string on the PictureBox.
            g.DrawString("This is a diagonal line drawn on the control",
                fnt, System.Drawing.Brushes.Blue, new Point(0, 0));
            // Draw a line in the PictureBox.
            g.DrawLine(System.Drawing.Pens.Red, pictureBox1.Left, pictureBox1.Top,
                pictureBox1.Right, pictureBox1.Bottom);
        }
    }
}
