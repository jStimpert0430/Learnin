using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Navigation;
using Microsoft.Phone.Controls;
using Microsoft.Phone.Shell;

namespace PhoneApp2
{
    public partial class AddCard : PhoneApplicationPage
    {
        public AddCard()
        {
            InitializeComponent();
        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {

        }

        private int Maximum(int a, int b)
        {
            if(a > b)
                return a;
            else
                return b;
        }
    }
}