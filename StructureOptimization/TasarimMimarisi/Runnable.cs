using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TasarimMimarisi
{
    public class Runnable:IRunnabilable
    {
        private IRunnabilable _runnable;
        public Runnable(IRunnabilable runnable)
        {
            _runnable = runnable;
        }
        public void Play()
        {
            _runnable.Play();
        }

        public void Stop()
        {
            _runnable.Play();
        }
    }
}
