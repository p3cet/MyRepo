using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace SingletonTest.Models
{
    public class Message
    {
        public static Message Instance
        {
            get
            {
                if (instance == null)
                    instance = new Message();
                return instance;
            }
        }

        public static string MessageText
        {
            get => messageText;
            set => messageText = value;
        }

        private static Message instance;
        private static string messageText;
        private Message() { }


    }
}