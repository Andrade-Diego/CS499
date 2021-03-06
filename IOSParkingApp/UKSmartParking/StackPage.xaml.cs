﻿using System;
using System.Threading.Tasks;
using System.Collections.Generic;
using System.Net.Http;
using Newtonsoft.Json;
using Xamarin.Forms;

namespace UKSmartParking
{
    public partial class StackPage : ContentPage
    {
   

        private class ServerResponse
        {
            public string picture_uri { get; set; }
            public string foo_txt_uri { get; set; }
        }

        public StackPage()
        {
            InitializeComponent();
        }

        async void Handle_Activated(System.Object sender, System.EventArgs e)
        {
            Navigation.PushAsync(new Rules());

        }

        private void Refresh_button(object sender, EventArgs e)
        {
            string runPHP = "http://127.0.0.1:8080/server.php";
            string resultContent = "";
            ServerResponse response = new ServerResponse();

            HttpClient client = new HttpClient();
            var result = client.GetAsync(runPHP).Result;
            if(result.IsSuccessStatusCode == true)
            {
                var responseContent = result.Content;
                resultContent = responseContent.ReadAsStringAsync().Result;
            }
            else
            {
                return;
            }
            Console.WriteLine(result.Content.ToString());

            response = JsonConvert.DeserializeObject<ServerResponse>(resultContent);

            string pic = response.picture_uri;
            string text = response.foo_txt_uri;
            

            Browser.Source = pic;
            textOut.Source = text;
        }

    }
}