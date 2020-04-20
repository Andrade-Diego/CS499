using System;
using System.Collections.Generic;

using Xamarin.Forms;

namespace UKSmartParking
{
    public partial class ParkingRegulations : ContentPage
    {
        public ParkingRegulations()
        {
            InitializeComponent();
        }
        private void Parking_Regulations(object sender, EventArgs e)
        {
            var Url = "https://www.uky.edu/transportation/park/parking-permit-regulations";
            Browser.Source = Url;
        }
    }
}
