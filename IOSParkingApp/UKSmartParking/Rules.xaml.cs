using System;
using System.Collections.Generic;

using Xamarin.Forms;

namespace UKSmartParking
{
    public partial class Rules : ContentPage
    {
        public Rules()
        {
            InitializeComponent();
            BindingContext = this;
        }
        async void About_App(System.Object sender, System.EventArgs e)
        {
            Navigation.PushAsync(new AboutApp());
        }
        async void Campus_Map(System.Object sender, System.EventArgs e)
        {
            Navigation.PushAsync(new CampusMap());
        }
        async void Parking_Regulation(System.Object sender, System.EventArgs e)
        {
            Navigation.PushAsync(new ParkingRegulations());
        }


    }
}
