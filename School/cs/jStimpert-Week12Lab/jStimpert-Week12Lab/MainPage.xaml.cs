using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Navigation;
using Microsoft.Phone.Controls;
using Microsoft.Phone.Shell;
using jStimpert_Week12Lab.Resources;
using Microsoft.Phone.Scheduler;

namespace jStimpert_Week12Lab
{
    public partial class MainPage : PhoneApplicationPage
    {
        // Constructor
        public MainPage()
        {
            InitializeComponent();

            // Set the data context of the listbox control to the sample data
            DataContext = App.ViewModel;

            // Sample code to localize the ApplicationBar
            //BuildLocalizedApplicationBar();
        }

        // Load data for the ViewModel Items
        protected override void OnNavigatedTo(NavigationEventArgs e)
        {
            if (!App.ViewModel.IsDataLoaded)
            {
                App.ViewModel.LoadData();
            }
        }

        private void btnAdd_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                var reminderName = Guid.NewGuid().ToString();
                var reminder = new Reminder(reminderName)
                {
                    BeginTime = DateTime.Parse(theTime.Value.ToString()).AddHours(DateTime.Parse(theTime.Value.ToString()).Hour).AddMinutes(DateTime.Parse(theTime.Value.ToString()).Minute),
                    Title = theTitle.Text.ToString(),
                    Content = theReminderContent.Text.ToString(),
                    NavigationUri = new Uri("/MainPage.xaml?wake=true", UriKind.Relative),


                };
                ScheduledActionService.Add(reminder);
                MessageBox.Show("The Reminder has been added!");
            }
            catch (Exception ex)
            {
                MessageBox.Show("Error: " + ex.Message);
            }
        }

        private void PivotItem_GotFocus_1(object sender, RoutedEventArgs e)
        {
            var reminders = ScheduledActionService.GetActions<Reminder>();
            reminderList.ItemsSource = reminders;
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