using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Navigation;
using Microsoft.Phone.Controls;
using Microsoft.Phone.Shell;
using jStimpert0430_Lab12.Resources;

namespace jStimpert0430_Lab12
{
    public partial class MainPage : PhoneApplicationPage
    {
        // Constructor
        public MainPage()
        {
            InitializeComponent();

            // Sample code to localize the ApplicationBar
            //BuildLocalizedApplicationBar();
        }


        private void btnUpdate_Click(object sender, RoutedEventArgs e)
        {
           // IEnumerable<ShellTile> tiles = ShellTile.ActiveTiles;
            //var tile = tiles.First();
            //var tileData = new FlipTileData()
            //{
               // Title = "Tile has been updated!",
              //  Count = 1,
            //    BackTitle = "This is the back of the tile!",
              //  BackContent = txtInString.Text,
              //  WideBackContent = txtInString.Text + "| This is the wide version!"
            //};
           // tile.Update(tileData);
           // MessageBox.Show("Flip tile updated!");
            ShellTile oTile = ShellTile.ActiveTiles.FirstOrDefault(x => x.NavigationUri.ToString().Contains("flip".ToString()));
            if (oTile != null && oTile.NavigationUri.ToString().Contains("flip"))
            {
                FlipTileData oFlipTile = new FlipTileData();
                oFlipTile.Title = "NFC Reader";
                oFlipTile.Count = 1;
                oFlipTile.BackContent = "Card Scanned: 00 00 00 00";
                oFlipTile.WideBackContent = "Card String: " + txtInString.Text;
                oTile.Update(oFlipTile);
                MessageBox.Show("Flip tile has been updated!");
            }
            else
            {
                Uri tileUri = new Uri("/MainPage.xaml?title=flip", UriKind.Relative);
                ShellTileData tileData = this.CreateFlipTileData();
                ShellTile.Create(tileUri, tileData, true);
                MessageBox.Show("No tile exists, one has been created.");
            }
        }

        private ShellTileData CreateFlipTileData()
        {
            return new FlipTileData()
            {
                Title = "NFC Reader",
                BackTitle = "NFC Reader",
                BackContent = "No new scans",
                WideBackContent = "No new scans",
                Count = 0
            };
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