using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Navigation;
using Microsoft.Phone.Controls;
using Microsoft.Phone.Shell;
using jStimpert0430_Week14Lab.Resources;
using System.Xml.Serialization;
using System.IO;
using System.Xml;
using System.IO.IsolatedStorage;

namespace jStimpert0430_Week14Lab
{
    public partial class MainPage : PhoneApplicationPage
    {
        // Constructor
        public MainPage()
        {
            InitializeComponent();

            // Set the data context of the listbox control to the sample data
            DataContext = App.ViewModel;
            using (var store = IsolatedStorageFile.GetUserStoreForApplication())
            {
                using (var file = store.CreateFile("myFile.xml"))
                {
                    XmlSerializer ser = new XmlSerializer(typeof(Person));
                }
            }

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


        private async void btnSave_Click(object sender, RoutedEventArgs e)
        {
            var people = new Person()
            {
                firstName = txtFirstName.Text,
                lastName = txtLastName.Text,
                dateBirth = datepickerDOB.Value.ToString(),
                phoneNumber = txtPhoneNumber.Text
            };
            var folder = Windows.Storage.ApplicationData.Current.LocalFolder;
            var file = await
                folder.CreateFileAsync("people.xml", Windows.Storage.CreationCollisionOption.ReplaceExisting);
            using (var stream = await file.OpenStreamForWriteAsync())
            {
                XmlSerializer ser = new XmlSerializer(typeof(Person));
                ser.Serialize(stream, people);
                await stream.FlushAsync();
                stream.Close();
            }

        }

        private async void btnLoad_Click(object sender, RoutedEventArgs e)
        {
            Person people = null;
            var folder = Windows.Storage.ApplicationData.Current.LocalFolder;
            using (var stream = await folder.OpenStreamForReadAsync("people.xml"))
            {
                XmlSerializer ser = new XmlSerializer(typeof(Person));
                people = (Person)ser.Deserialize(stream);
                txtFirstNamePage2.Text = people.firstName;
                txtLastNamePage2.Text = people.lastName;
                txtDateOfBirthPage2.Text = people.dateBirth;
                txtPhoneNumberPage2.Text = people.phoneNumber;
            }
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