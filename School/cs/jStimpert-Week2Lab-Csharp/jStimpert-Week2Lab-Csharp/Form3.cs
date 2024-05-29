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
    public partial class Form3 : Form
    {
        Form opener;
        public Form3(Form parentForm)
        {
            InitializeComponent();
            opener = parentForm;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            webBrowser.Navigate(txtURL.Text);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            webBrowser.GoBack();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            webBrowser.GoForward();
        }

        private void textBox1_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Enter)
            {
                webBrowser.Navigate(txtURL.Text);
            }
        }

        private void Form3_FormClosed(object sender, FormClosedEventArgs e)
        {
            opener.Show();
            this.Hide();
        }
    }
}
