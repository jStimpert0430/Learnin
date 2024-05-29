using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace jStimpert0430_Week4Lab
{
    public partial class Form1 : Form
    {
        InputClass myNewClass = new InputClass();
        public Form1()
        {
            InitializeComponent();
        }

        private void btnSubmit_Click(object sender, EventArgs e)
        {
            myNewClass.YourName = txtName.Text;
            txtName.Text = "";
            MessageBox.Show(myNewClass.YourName);
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            lblBanner.Text = myNewClass._banner;
        }
    }
}
