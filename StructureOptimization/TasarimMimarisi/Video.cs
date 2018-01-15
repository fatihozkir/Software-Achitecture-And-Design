using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace TasarimMimarisi
{
    public class Video : Cekim, IRunnabilable
    {
        public uint Sure { get; set; }
        public float ImdbPuani { get; set; }
        public void Play()
        {
            Console.Write("Video Oynatılıyor...");
        }

        public void Stop()
        {
            Console.Write("Video Durduruldu...");
        }
    }
}