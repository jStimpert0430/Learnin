﻿#pragma checksum "C:\Users\Bunta\Desktop\Desktop\school\Csharp\jStimpert0430-Week8Lab\jStimpert0430-Week8Lab\MainPage.xaml" "{406ea660-64cf-4c82-b6f0-42d48172a799}" "82AF30EEECD0D6C1527BB2F69A123E55"
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.42000
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

using Microsoft.Phone.Controls;
using System;
using System.Windows;
using System.Windows.Automation;
using System.Windows.Automation.Peers;
using System.Windows.Automation.Provider;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Interop;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Imaging;
using System.Windows.Resources;
using System.Windows.Shapes;
using System.Windows.Threading;


namespace jStimpert0430_Week8Lab {
    
    
    public partial class MainPage : Microsoft.Phone.Controls.PhoneApplicationPage {
        
        internal System.Windows.Controls.Grid LayoutRoot;
        
        internal System.Windows.Controls.StackPanel TitlePanel;
        
        internal System.Windows.Controls.Grid ContentPanel;
        
        internal Microsoft.Phone.Controls.DatePicker dateSelect;
        
        internal System.Windows.Controls.CheckBox chk5Hrs;
        
        internal System.Windows.Controls.CheckBox chkAllDay;
        
        internal System.Windows.Controls.Button btnConfirm;
        
        internal Microsoft.Phone.Controls.ListPicker jumperSelect;
        
        private bool _contentLoaded;
        
        /// <summary>
        /// InitializeComponent
        /// </summary>
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        public void InitializeComponent() {
            if (_contentLoaded) {
                return;
            }
            _contentLoaded = true;
            System.Windows.Application.LoadComponent(this, new System.Uri("/jStimpert0430-Week8Lab;component/MainPage.xaml", System.UriKind.Relative));
            this.LayoutRoot = ((System.Windows.Controls.Grid)(this.FindName("LayoutRoot")));
            this.TitlePanel = ((System.Windows.Controls.StackPanel)(this.FindName("TitlePanel")));
            this.ContentPanel = ((System.Windows.Controls.Grid)(this.FindName("ContentPanel")));
            this.dateSelect = ((Microsoft.Phone.Controls.DatePicker)(this.FindName("dateSelect")));
            this.chk5Hrs = ((System.Windows.Controls.CheckBox)(this.FindName("chk5Hrs")));
            this.chkAllDay = ((System.Windows.Controls.CheckBox)(this.FindName("chkAllDay")));
            this.btnConfirm = ((System.Windows.Controls.Button)(this.FindName("btnConfirm")));
            this.jumperSelect = ((Microsoft.Phone.Controls.ListPicker)(this.FindName("jumperSelect")));
        }
    }
}

