using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TasarimMimarisi
{
    class Program
    {
        static void Main(string[] args)
        {
            // ümit doğ
            //9 mayıs 11:30
            //10 mayıs 09:00 salon c
            //
            //Runnable resimRunnable=new Runnable(new Resim());
            //Yada 
            IRunnabilable resimRunnable=new Resim();
            resimRunnable.Play();
            Console.Write(Environment.NewLine);
            Console.Read();
        }
    }
}
