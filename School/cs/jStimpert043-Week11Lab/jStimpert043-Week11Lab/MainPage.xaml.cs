using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Navigation;
using Microsoft.Phone.Controls;
using Microsoft.Phone.Shell;
using jStimpert043_Week11Lab.Resources;
using System.Device.Location;
using Windows.Devices.Geolocation;
using System.Threading.Tasks;
using System.IO.IsolatedStorage;

namespace jStimpert043_Week11Lab
{
    public partial class MainPage : PhoneApplicationPage
    {
        bool toggle = false;
        // Constructor
        public MainPage()
        {
            InitializeComponent();

            // Sample code to localize the ApplicationBar
            //BuildLocalizedApplicationBar();
        }

        protected override void OnNavigatedTo(NavigationEventArgs e)
        {
            base.OnNavigatedTo(e);
            if (IsolatedStorageSettings.ApplicationSettings.Contains("LocationConsent"))
            {
                return;
            }
            else
            {
                MessageBoxResult result = MessageBox.Show("This app accesses your phone's location. Is that ok?", "Location", MessageBoxButton.OKCancel);
                if (result == MessageBoxResult.OK)
                {
                    IsolatedStorageSettings.ApplicationSettings["LocationConsent"] = true;
                    btnTrack.Content = "Start Location Tracking";
                    btnTrack.IsEnabled = true;
                }
                else
                {
                    IsolatedStorageSettings.ApplicationSettings["LocationConsent"] = false;
                    btnTrack.Content = "Must enable Location Consent to use this application";
                    btnTrack.IsEnabled = false;
                }
                IsolatedStorageSettings.ApplicationSettings.Save();

            }
        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {
            Geolocator geolocator = new Geolocator();
            if (toggle == false)
            {
                btnTrack.Content = "Tracking";
                toggle = true;
                geolocator.DesiredAccuracy = PositionAccuracy.High;
                geolocator.MovementThreshold = 100;
                geolocator.StatusChanged += geolocator_StatusChanged;
                geolocator.PositionChanged += geolocator_PositionChanged;

            }
            else
            {
                btnTrack.Content = "Start Location Tracking";
                toggle = false;
                geolocator.StatusChanged -= geolocator_StatusChanged;
                geolocator.PositionChanged -= geolocator_PositionChanged;
            }
        }

        private void geolocator_PositionChanged(Geolocator sender, PositionChangedEventArgs args)
        {
            lblLatitude.Text = args.Position.Coordinate.Latitude.ToString("0.00");
            lblLongitude.Text = args.Position.Coordinate.Longitude.ToString("0.00");
            lblSpeed.Text = args.Position.Coordinate.Speed.ToString();
            lblCourse.Text = args.Position.Coordinate.Heading.ToString();
            lblAltitude.Text = args.Position.Coordinate.Altitude.ToString();
        }

        private void geolocator_StatusChanged(Geolocator sender, StatusChangedEventArgs args)
        {
            string status = "";
            switch (args.Status)
            {
                case PositionStatus.Disabled:
                    status = "Location is disabled in phone settings";
                    break;
                case PositionStatus.Initializing:
                    status = "initializing";
                    break;
                case PositionStatus.NoData:
                    status = "No data";
                    break;
                case PositionStatus.Ready:
                    status = "Ready!";
                    break;
                case PositionStatus.NotAvailable:
                    status = "Not Available";
                    break;
                case PositionStatus.NotInitialized:
                    status = "Not initialized";
                    break;
            }
            lblLocationStatus.Text = status;
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