using SingletonTest.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace SingletonTest.Controllers
{
    public class MessageController : Controller
    {
        // GET: Message
        public string Index()
        {
            Message CurrentMessage = Message.Instance;
            return "Message initialized!";
        }

        public string ViewMessage()
        {
            return Message.MessageText;
        }

        public string SetMessage(string text)
        {
            Message.MessageText = text;
            return "Message set to: " + Message.MessageText;
        }
    }
}