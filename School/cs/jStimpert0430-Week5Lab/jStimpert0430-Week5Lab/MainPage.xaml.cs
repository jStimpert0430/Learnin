using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Navigation;
using Microsoft.Phone.Controls;
using Microsoft.Phone.Shell;
using jStimpert0430_Week5Lab.Resources;

namespace jStimpert0430_Week5Lab
{
    public partial class MainPage : PhoneApplicationPage
    {
        // Constructor
        public MainPage()
        {
            InitializeComponent();
            theBox.ItemsSource = new string[] { "John", "Steve", "Dave" };
            thePicker.ItemsSource = new string[] {"Toys", "Games", "Cake" };
            // Sample code to localize the ApplicationBar
            //BuildLocalizedApplicationBar();
        }

        private void PhoneApplicationPage_Loaded_1(object sender, RoutedEventArgs e)
        {
        }

        private void testButton_Click(object sender, RoutedEventArgs e)
        {
            var myMessage = new CustomMessageBox()
            {
                Caption = "Your birthday overview.",
                Message = theBox.Text + ", Your birthday is on " + theDate.Value.ToString() + " and you want some " + thePicker.SelectedItem.ToString() + "for your birthday.\n\n Your special birthday message is: " + specialMessage.Text
            };

            myMessage.Show();

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