using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace jStimpert_Week2Lab_Csharp
{
    public partial class Form2 : Form
    {
        Form opener;
        public Form2(Form parentForm)
        {
            InitializeComponent();
            opener = parentForm;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            ColorDialog colorChoice = new ColorDialog();
            if (colorChoice.ShowDialog() == DialogResult.OK)
            {
                this.BackColor = colorChoice.Color;
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            opener.Show();
            this.Hide();
        }

        private void Form2_FormClosing(object sender, FormClosingEventArgs e)
        {
        }

        private void Form2_FormClosed(object sender, FormClosedEventArgs e)
        {
            opener.Show();
            this.Hide();
        }
    }
}
