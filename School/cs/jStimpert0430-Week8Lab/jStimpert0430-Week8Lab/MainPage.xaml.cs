using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Navigation;
using Microsoft.Phone.Controls;
using Microsoft.Phone.Shell;
using jStimpert0430_Week8Lab.Resources;

namespace jStimpert0430_Week8Lab
{
    public partial class MainPage : PhoneApplicationPage
    {
        int jumperPrice;
        // Constructor
        public MainPage()
        {
            InitializeComponent();

            // Sample code to localize the ApplicationBar
            //BuildLocalizedApplicationBar();
        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {
            MessageBox.Show("Current Date: " + dateSelect.Value.ToString() + "\nTotal price for jumper and time selected: " + jumperPrice);
        }

        private void CheckBox_Checked_1(object sender, RoutedEventArgs e)
        {
        }

        private void chk5Hrs_Checked(object sender, RoutedEventArgs e)
        {
            chkAllDay.IsChecked = false;
            if (jumperSelect.SelectedItem.ToString() == "Silly Slide" || jumperSelect.SelectedItem.ToString() == "Obstacle Course")
                jumperPrice = 200;
            else
                jumperPrice = 130;

        }

        private void chkAllDay_Checked(object sender, RoutedEventArgs e)
        {
            chk5Hrs.IsChecked = false;
            if (jumperSelect.SelectedItem.ToString() == "Silly Slide" || jumperSelect.SelectedItem.ToString() == "Obstacle Course")
                jumperPrice = 250;
            else
                jumperPrice = 200;
        }

        private void ApplicationBarIconButton_Click_1(object sender, EventArgs e)
        {
            Application.Current.Terminate();
        }

        // Sample code for building a localized ApplicationBar
        //private void BuildLocalizedApplicationBar()
        //{
        //    // Set the page's ApplicationBar to a new instance of ApplicationBar.
        //    ApplicationBar = new ApplicationBar();

        //    // Create a new button and set the text value to the localized string from AppResources.
        //    ApplicationBarIconButton appBarButton = new ApplicationBarIconButton(new Uri("/Assets/AppBar/appbar.add.rest.png", UriKind.Relative));
        //    appBarButton.Text = AppResources.AppBarButtonText;
        //    ApplicationBar.Buttons.Add(appBarButton);

        //    // Create a new menu item with the localized string from AppResources.
        //    ApplicationBarMenuItem appBarMenuItem = new ApplicationBarMenuItem(AppResources.AppBarMenuItemText);
        //    ApplicationBar.MenuItems.Add(appBarMenuItem);
        //}
    }
}