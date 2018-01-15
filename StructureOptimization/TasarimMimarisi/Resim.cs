using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace TasarimMimarisi
{
    public class Resim : Cekim, IRunnabilable
    {
        public string RenkDagilimi { get; set; }
        public void Play()
        {
            Console.Write("Resimler Oynatılıyor.\n");
        }

        public void Stop()
        {
            Console.Write("Resimler Durduruldu.\n");
        }
    }
}