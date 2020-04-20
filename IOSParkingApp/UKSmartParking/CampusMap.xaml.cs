using System;
using System.Collections.Generic;

using Xamarin.Forms;

namespace UKSmartParking
{
    public partial class CampusMap : ContentPage
    {
        public CampusMap()
        {
            InitializeComponent();
        }

        private void Button_Clicked(object sender, EventArgs e)
        {
            var Url = "https://maps.uky.edu/campusmap/";
            Browser.Source = Url;
        }
    }
}
