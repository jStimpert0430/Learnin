using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace jStimpert0430_Week4Lab
{
    class InputClass
    {
        public string _banner;
        private string _yourName;
        public InputClass()
        {
            _banner = "Enter your Name";
        }
        public string YourName
        {
            get
            {
                return _yourName;
            }
            set
            {
                _yourName = value;
            }
        }
    }
}
